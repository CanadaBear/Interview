What is JPA?
Java Persistence API is a collection of classes and methods to persistently store the vast amounts of data into a database.

When to use JPA?
To reduce the burden of writing codes for relational object management, a programmer follows the ‘JPA Provider’ framework, which allows easy interaction with database instance. 

Framework by JPA.
EntityManagerFactory	This is a factory class of EntityManager. It creates and manages multiple EntityManager instances.
EntityManager	        It is an Interface, it manages the persistence operations on objects. It works like factory for Query instance.
Entity	                Entities are the persistence objects, stores as records in the database.
EntityTransaction	    It has one-to-one relationship with EntityManager. For each EntityManager, operations are maintained by EntityTransaction class.
Persistence	            This class contain static methods to obtain EntityManagerFactory instance.
Query	                This interface is implemented by each JPA vendor to obtain relational objects that meet the criteria.

JPA work process
Phase1 
The first phase, named as the Object data phase contains POJO classes, service interfaces and classes. It is the main business component layer, which has business logic operations and attributes.
For example, Employee POJO class contain attributes such as ID, name, salary, and designation. And methods like setter and getter methods of those attributes. Employee DAO/Service classes contains service methods such as create employee, find employee, and delete employee.
Phase 2
The second phase named as mapping or persistence phase which contains JPA provider, mapping file (ORM.xml), JPA Loader, and Object Grid.
Phase 3
The third phase is the Relational data phase. It contains the relational data which is logically connected to the business component. As discussed above, only when the business component commit the data, it is stored into the database physically. Until then the modified data is stored in a cache memory as a grid format.

JPQL
JPQL is Java Persistence Query Language defined in JPA specification. It is used to create queries against entities to store in a relational database. JPQL is developed based on SQL syntax. But it won’t affect the database directly. JPQL can retrieve information or data using SELECT clause, can do bulk updates using UPDATE clause and DELETE clause. EntityManager.createQuery() API will support for querying language.
A @NamedQuery annotation is defined as a query with a predefined unchangeable query string. Instead of dynamic queries, usage of named queries may improve code organization by separating the JPQL query strings from POJO. It also passes the query parameters rather than embedding literals dynamically into the query string and results in more efficient queries.

Inheritance
Inheritance is the core concept of object oriented language, therefore we can use inheritance relationships or strategies between entities. JPA support three types of inheritance strategies such as SINGLE_TABLE, JOINED_TABLE, and TABLE_PER_CONCRETE_CLASS.

Spring JPA

Repository?
The central interface in Spring Data repository abstraction is Repository.
public interface CrudRepository<T, ID extends Serializable> extends Repository<T, ID> {
	//....more functionality omitted.
}
On top of the CrudRepository there is a PagingAndSortingRepository abstraction that adds additional methods to ease paginated access to entities:
public interface PagingAndSortingRepository<T, ID extends Serializable> extends CrudRepository<T, ID> {
	//....more functionality omitted.
}

Why using spring data repository?
The goal of Spring Data repository abstraction is to significantly reduce the amount of boilerplate code required to implement data access layers for various persistence stores.

Query methods
1. Declare an interface extending Repository or one of its subinterfaces and type it to the domain class and ID type that it will handle.
Typically, your repository interface will extend Repository, CrudRepository or PagingAndSortingRepository. Alternatively, if you do not want to extend Spring Data interfaces, you can also annotate your repository interface with @RepositoryDefinition. Extending CrudRepository exposes a complete set of methods to manipulate your entities. If you prefer to be selective about the methods being exposed, simply copy the ones you want to expose from CrudRepository into your domain repository.

2. Declare query methods on the interface.
The following strategies are available for the repository infrastructure to resolve the query. You can configure the strategy at the namespace through the query-lookup-strategy attribute in case of XML configuration or via the queryLookupStrategy attribute of the Enable${store}Repositories annotation in case of Java config. Some strategies may not be supported for particular datastores.
CREATE attempts to construct a store-specific query from the query method name. The general approach is to remove a given set of well-known prefixes from the method name and parse the rest of the method. Read more about query construction in Query creation.
USE_DECLARED_QUERY tries to find a declared query and will throw an exception in case it can’t find one. The query can be defined by an annotation somewhere or declared by other means. Consult the documentation of the specific store to find available options for that store. If the repository infrastructure does not find a declared query for the method at bootstrap time, it fails.
CREATE_IF_NOT_FOUND (default) combines CREATE and USE_DECLARED_QUERY. It looks up a declared query first, and if no declared query is found, it creates a custom method name-based query. This is the default lookup strategy and thus will be used if you do not configure anything explicitly. It allows quick query definition by method names but also custom-tuning of these queries by introducing declared queries as needed.

3. Set up Spring to create proxy instances for those interfaces. Either via JavaConfig or via XML configuration

4. Get the repository instance injected and use it.

JPA Repositories
The JPA module of Spring Data contains a custom namespace that allows defining repository beans. It also contains certain features and element attributes that are special to JPA. Generally the JPA repositories can be set up using the repositories element.

Manually query
The JPA module supports defining a query manually as String or have it being derived from the method name.
Although getting a query derived from the method name is quite convenient, one might face the situation in which either the method name parser does not support the keyword one wants to use or the method name would get unnecessarily ugly. So you can either use JPA named queries through a naming convention (see Using JPA NamedQueries for more information) or rather annotate your query method with @Query (see Using @Query for details).

Stored procedures
The JPA 2.1 specification introduced support for calling stored procedures via the JPA criteria query API. We Introduced the @Procedure annotation for declaring stored procedure metadata on a repository method.

Transaction
CRUD methods on repository instances are transactional by default. For reading operations the transaction configuration readOnly flag is set to true, all others are configured with a plain @Transactional so that default transaction configuration applies. 

Locking
To specify the lock mode to be used the @Lock annotation can be used on query methods