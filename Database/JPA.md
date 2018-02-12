What is JPA?
Java Persistence API is a collection of classes and methods to persistently store the vast amounts of data into a database which is provided by the Oracle Corporation.

Where to use JPA?
To reduce the burden of writing codes for relational object management, a programmer follows the ‘JPA Provider’ framework, which allows easy interaction with database instance. Here the required framework is taken over by JPA.

Units	                Description
EntityManagerFactory	This is a factory class of EntityManager. It creates and manages multiple EntityManager instances.
EntityManager	        It is an Interface, it manages the persistence operations on objects. It works like factory for Query instance.
Entity	                Entities are the persistence objects, stores as records in the database.
EntityTransaction	    It has one-to-one relationship with EntityManager. For each EntityManager, operations are maintained by EntityTransaction class.
Persistence	            This class contain static methods to obtain EntityManagerFactory instance.
Query	                This interface is implemented by each JPA vendor to obtain relational objects that meet the criteria.

Phase1
The first phase, named as the Object data phase contains POJO classes, service interfaces and classes. It is the main business component layer, which has business logic operations and attributes.
For example let us take an employee database as schema- Employee POJO class contain attributes such as ID, name, salary, and designation. And methods like setter and getter methods of those attributes.
Employee DAO/Service classes contains service methods such as create employee, find employee, and delete employee.

Phase 2
The second phase named as mapping or persistence phase which contains JPA provider, mapping file (ORM.xml), JPA Loader, and Object Grid.
JPA Provider : The vendor product which contains JPA flavor (javax.persistence). For example Eclipselink, Toplink, Hibernate, etc.
Mapping file : The mapping file (ORM.xml) contains mapping configuration between the data in a POJO class and data in a relational database.
JPA Loader : The JPA loader works like cache memory, which can load the relational grid data. It works like a copy of database to interact with service classes for POJO data (Attributes of POJO class).
Object Grid : The Object grid is a temporary location which can store the copy of relational data, i.e. like a cache memory. All queries against the database is first effected on the data in the object grid. Only after it is committed, it effects the main database.

Phase 3
The third phase is the Relational data phase. It contains the relational data which is logically connected to the business component. As discussed above, only when the business component commit the data, it is stored into the database physically. Until then the modified data is stored in a cache memory as a grid format. Same is the process for obtaining data.
The mechanism of the programmatic interaction of above three phases is called as object relational mapping.

JPQL is Java Persistence Query Language defined in JPA specification. It is used to create queries against entities to store in a relational database. JPQL is developed based on SQL syntax. But it won’t affect the database directly.
JPQL can retrieve information or data using SELECT clause, can do bulk updates using UPDATE clause and DELETE clause. EntityManager.createQuery() API will support for querying language.

A @NamedQuery annotation is defined as a query with a predefined unchangeable query string. Instead of dynamic queries, usage of named queries may improve code organization by separating the JPQL query strings from POJO. It also passes the query parameters rather than embedding literals dynamically into the query string and results in more efficient queries.

Eager and Lazy Loading
The main concept of JPA is to make a duplicate copy of the database in cache memory. While transacting with the database, first it will effect on duplicate data and only when it is committed using entity manager, the changes are effected into the database.
There are two ways of fetching records from the database - eager fetch and lazy fetch.
Eager fetch
Fetching the whole record while finding the record using Primary Key.
Lazy fetch
It checks for the availability of notifies it with primary key if it exists. Then later if you call any of the getter method of that entity then it fetches the whole.
But lazy fetch is possible when you try to fetch the record for the first time. That way, a copy of the whole record is already stored in cache memory. Performance wise, lazy fetch is preferable.

Inheritance is the core concept of object oriented language, therefore we can use inheritance relationships or strategies between entities. JPA support three types of inheritance strategies such as SINGLE_TABLE, JOINED_TABLE, and TABLE_PER_CONCRETE_CLASS.