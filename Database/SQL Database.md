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

SQL Data Types
Each column in a database table is required to have a name and a data type.
An SQL developer must decide what type of data that will be stored inside each column when creating a table. The data type is a guideline for SQL to understand what type of data is expected inside of each column, and it also identifies how SQL will interact with the stored data.
