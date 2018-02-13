The SQL CREATE DATABASE Statement
The CREATE DATABASE statement is used to create a new SQL database.
For example: CREATE DATABASE databasename;
Tip: Make sure you have admin privilege before creating any database. Once a database is created, you can check it in the list of databases with the following SQL command: SHOW DATABASES;

The SQL DROP DATABASE Statement
The DROP DATABASE statement is used to drop an existing SQL database.
For exampel: DROP DATABASE databasename;
Note: Be careful before dropping a database. Deleting a database will result in loss of complete information stored in the database!

The SQL CREATE TABLE Statement
The CREATE TABLE statement is used to create a new table in a database.
For example: CREATE TABLE table_name (
    			column1 datatype,
    			column2 datatype,
    			column3 datatype,
  				....
			);
The column parameters specify the names of the columns of the table.
The datatype parameter specifies the type of data the column can hold (e.g. varchar, integer, date, etc.).

Create Table Using Another Table
A copy of an existing table can be created using a combination of the CREATE TABLE statement and the SELECT statement.
The new table gets the same column definitions. All columns or specific columns can be selected.
If you create a new table using an existing table, the new table will be filled with the existing values from the old table.
CREATE TABLE new_table_name AS SELECT column1, column2,... FROM existing_table_name WHERE ....;

The SQL DROP TABLE Statement
The DROP TABLE statement is used to drop an existing table in a database.
DROP TABLE table_name;

SQL ALTER TABLE Statement
The ALTER TABLE statement is used to add, delete, or modify columns in an existing table.
The ALTER TABLE statement is also used to add and drop various constraints on an existing table.

SQL Create Constraints
Constraints can be specified when the table is created with the CREATE TABLE statement, or after the table is created with the ALTER TABLE statement.
CREATE TABLE table_name (
    column1 datatype constraint,
    column2 datatype constraint,
    column3 datatype constraint,
    ....
);
Constraints are used to limit the type of data that can go into a table. This ensures the accuracy and reliability of the data in the table. If there is any violation between the constraint and the data action, the action is aborted.
Constraints can be column level or table level. Column level constraints apply to a column, and table level constraints apply to the whole table.
The following constraints are commonly used in SQL:
NOT NULL - Ensures that a column cannot have a NULL value
UNIQUE - Ensures that all values in a column are different
PRIMARY KEY - A combination of a NOT NULL and UNIQUE. Uniquely identifies each row in a table
FOREIGN KEY - Uniquely identifies a row/record in another table, A FOREIGN KEY is a field (or collection of fields) in one table that refers to the PRIMARY KEY in another table.
CHECK - Ensures that all values in a column satisfies a specific condition
DEFAULT - Sets a default value for a column when no value is specified
INDEX - Used to create and retrieve data from the database very quickly
Auto-increment - allows a unique number to be generated automatically when a new record is inserted into a table.

Data type								Description
CHARACTER(n)							Character string. Fixed-length n
VARCHAR(n) or CHARACTER VARYING(n)		Character string. Variable length. Maximum length n
BINARY(n)								Binary string. Fixed-length n
BOOLEAN	Stores							TRUE or FALSE values
VARBINARY(n) or BINARY VARYING(n)		Binary string. Variable length. Maximum length n
INTEGER(p)								Integer numerical (no decimal). Precision p
SMALLINT								Integer numerical (no decimal). Precision 5
Integer 								Integer numerical (no decimal). Precision 10
BIGINT									Integer numerical (no decimal). Precision 19
DECIMAL(p,s)							Exact numerical, precision p, scale s. Example: decimal(5,2) is a number that has 3 digits before the decimal and 2 digits after the decimal
NUMERIC(p,s)							Exact numerical, precision p, scale s. (Same as DECIMAL)
FLOAT(p)								Approximate numerical, mantissa precision p. A floating number in base 10 exponential notation. The size argument for this type consists of a single number specifying the minimum precision
DOUBLE PRECISION						Approximate numerical, mantissa precision 16
DATE									Stores year, month, and day values
TIME									Stores hour, minute, and second values
TIMESTAMP								Stores year, month, day, hour, minute, and second values
INTERVAL								Composed of a number of integer fields, representing a period of time, depending on the type of interval
ARRAY									A set-length and ordered collection of elements
MULTISET								A variable-length and unordered collection of elements
XML										Stores XML data

SQL CREATE VIEW Statement
In SQL, a view is a virtual table based on the result-set of an SQL statement.
A view contains rows and columns, just like a real table. The fields in a view are fields from one or more real tables in the database.
You can add SQL functions, WHERE, and JOIN statements to a view and present the data as if the data were coming from one single table.
CREATE VIEW view_name AS SELECT column1, column2, ... FROM table_name WHERE condition;

SQL Injection
SQL injection is a code injection technique that might destroy your database.
SQL injection is one of the most common web hacking techniques.
SQL injection is the placement of malicious code in SQL statements, via web page input.

Use SQL Parameters for Protection
To protect a web site from SQL injection, you can use SQL parameters.
SQL parameters are values that are added to an SQL query at execution time, in a controlled manner.
txtUserId = getRequestString("UserId");
txtSQL = "SELECT * FROM Users WHERE UserId = @0";
db.Execute(txtSQL,txtUserId);
Note that parameters are represented in the SQL statement by a @ marker.
The SQL engine checks each parameter to ensure that it is correct for its column and are treated literally, and not as part of the SQL to be executed.

Although different kinds of databases are available, the relational database is the most common. Data in a relational database is stored in tables, which consist of rows and columns. A set of table definitions is referred to as a schema. Most tables have keys. One of the keys is usually designated the primary key. A table can be linked to another table using foreign key. A foreign key is a key value taken form the other table (usually from a primary key). When every foreign key value in one table exists as a key in the table it references, the database has referential integrity.
Relational Database Design Process
Step 1: Define the Purpose of the Database (Requirement Analysis)
Step 2: Gather Data, Organize in tables and Specify the Primary Keys
Step 3: Create Relationships among Tables
Step 4: Refine & Normalize the Design

First Normal Form (1NF): A table is 1NF if every cell contains a single value, not a list of values. This properties is known as atomic.
Second Normal Form (2NF): A table is 2NF, if it is 1NF and every non-key column is fully dependent on the primary key.
Third Normal Form (3NF): A table is 3NF, if it is 2NF and the non-key columns are independent of each other’s.
Entity Integrity Rule: The primary key cannot contain NULL. Otherwise, it cannot uniquely identify the row.
Referential Integrity Rule: Each foreign key value must be matched to a primary key value in the table referenced (or parent table).

Databases Transactions
A transaction groups a set of related database manipulation together into single unit. If any operation within the transaction fails, the entire transaction fails, and any changes made by the transaction are abandoned (roll back). Conversely, if all the operations succeed, then all the changes are committed together as a group.
The four properties (ACID) of a traction are as follows:
Atomicity- the database system guarantees that either all operations within the transaction succeed or else they all fail.
Consistency- the transaction must ensure that the database is in a correct, consistent state at the start and the end of the transaction.
Isolation- all the changes to the database within a transaction are isolated from all other queries and transactions until the transaction is committed.
Durability- when committed, changes made in a transaction are permanent.