What is SQL?
SQL stands for Structured Query Language
SQL lets you access and manipulate databases
SQL is an ANSI (American National Standards Institute) standard

What Can SQL do?
SQL can execute queries against a database
SQL can retrieve data from a database
SQL can insert records in a database
SQL can update records in a database
SQL can delete records from a database
SQL can create new databases
SQL can create new tables in a database
SQL can create stored procedures in a database
SQL can create views in a database
SQL can set permissions on tables, procedures, and views

Semicolon after SQL Statements?
Some database systems require a semicolon at the end of each SQL statement.
Semicolon is the standard way to separate each SQL statement in database systems that allow more than one SQL statement to be executed in the same call to the server.

Some of The Most Important SQL Commands
SELECT - extracts data from a database
UPDATE - updates data in a database
DELETE - deletes data from a database
INSERT INTO - inserts new data into a database
CREATE DATABASE - creates a new database
ALTER DATABASE - modifies a database
CREATE TABLE - creates a new table
ALTER TABLE - modifies a table
DROP TABLE - deletes a table
CREATE INDEX - creates an index (search key)
DROP INDEX - deletes an index

The SQL SELECT Statement
The SELECT statement is used to select data from a database. The data returned is stored in a result table, called the result-set.
For example: SELECT column1, column2, ... FROM table_name;

The SQL SELECT DISTINCT Statement
The SELECT DISTINCT statement is used to return only distinct (different) values.
Inside a table, a column often contains many duplicate values; and sometimes you only want to list the different (distinct) values.
For example: SELECT DISTINCT column1, column2, ... FROM table_name; SELECT COUNT(DISTINCT Country) FROM Customers;

The SQL WHERE Clause
The WHERE clause is used to filter records.
The WHERE clause is used to extract only those records that fulfill a specified condition.
For example: SELECT column1, column2, ... FROM table_name WHERE condition;

The following operators can be used in the WHERE clause:
Operator	Description
=	         Equal
<>	       Not equal. Note: In some versions of SQL this operator may be written as !=
>	         Greater than
<	         Less than
>=	       Greater than or equal
<=	       Less than or equal
BETWEEN	   Between an inclusive range
LIKE	     Search for a pattern
IN	       To specify multiple possible values for a column

The SQL AND, OR and NOT Operators
The WHERE clause can be combined with AND, OR, and NOT operators.
The AND and OR operators are used to filter records based on more than one condition:
The AND operator displays a record if all the conditions separated by AND is TRUE.
The OR operator displays a record if any of the conditions separated by OR is TRUE.
The NOT operator displays a record if the condition(s) is NOT TRUE.

The SQL ORDER BY Keyword
The ORDER BY keyword is used to sort the result-set in ascending or descending order.
The ORDER BY keyword sorts the records in ascending order by default. To sort the records in descending order, use the DESC keyword.
For example: SELECT column1, column2, ... FROM table_name ORDER BY column1, column2, ... ASC|DESC;

The SQL INSERT INTO Statement
The INSERT INTO statement is used to insert new records in a table.
For example: INSERT INTO table_name (column1, column2, column3, ...) VALUES (value1, value2, value3, ...);

What is a NULL Value?
A field with a NULL value is a field with no value.
If a field in a table is optional, it is possible to insert a new record or update a record without adding a value to this field. Then, the field will be saved with a NULL value.
It is not possible to test for NULL values with comparison operators, such as =, <, or <>.
We will have to use the IS NULL and IS NOT NULL operators instead.
For example: SELECT column_names FROM table_name WHERE column_name IS NULL;

The SQL UPDATE Statement
The UPDATE statement is used to modify the existing records in a table.
For example: UPDATE table_name SET column1 = value1, column2 = value2, ... WHERE condition;

The SQL DELETE Statement
The DELETE statement is used to delete existing records in a table.
For example: DELETE FROM table_name WHERE condition;
It is possible to delete all rows in a table without deleting the table. This means that the table structure, attributes, and indexes will be intact:
DELETE FROM table_name; or DELETE * FROM table_name;

The SQL SELECT TOP Clause
The SELECT TOP clause is used to specify the number of records to return.
The SELECT TOP clause is useful on large tables with thousands of records. Returning a large number of records can impact on performance.
Note: Not all database systems support the SELECT TOP clause. MySQL supports the LIMIT clause to select a limited number of records, while Oracle uses ROWNUM.

The SQL MIN() and MAX() Functions
The MIN() function returns the smallest value of the selected column.
The MAX() function returns the largest value of the selected column.
For example: SELECT MIN(column_name) FROM table_name WHERE condition;
For example: SELECT MAX(column_name) FROM table_name WHERE condition;

The SQL COUNT(), AVG() and SUM() Functions
The COUNT() function returns the number of rows that matches a specified criteria.
The AVG() function returns the average value of a numeric column.
The SUM() function returns the total sum of a numeric column.

The SQL LIKE Operator
The LIKE operator is used in a WHERE clause to search for a specified pattern in a column.
There are two wildcards used in conjunction with the LIKE operator:
% - The percent sign represents zero, one, or multiple characters
_ - The underscore represents a single character
Note: MS Access uses a question mark (?) instead of the underscore (_).
In MS Access and SQL Server you can also use:
[charlist] - Defines sets and ranges of characters to match
[^charlist] or [!charlist] - Defines sets and ranges of characters NOT to match
The wildcards can also be used in combinations!

The SQL IN Operator
The IN operator allows you to specify multiple values in a WHERE clause.
The IN operator is a shorthand for multiple OR conditions.
For example: SELECT column_name(s) FROM table_name WHERE column_name IN (SELECT STATEMENT);

The SQL BETWEEN Operator
The BETWEEN operator selects values within a given range. The values can be numbers, text, or dates.
The BETWEEN operator is inclusive: begin and end values are included. 
For example: SELECT column_name(s) FROM table_name WHERE column_name BETWEEN value1 AND value2;

SQL Aliases
SQL aliases are used to give a table, or a column in a table, a temporary name.
Aliases are often used to make column names more readable.
An alias only exists for the duration of the query.
For example: SELECT column_name AS alias_name FROM table_name;
Aliases can be useful when:
There are more than one table involved in a query
Functions are used in the query
Column names are big or not very readable
Two or more columns are combined together

SQL JOIN
A JOIN clause is used to combine rows from two or more tables, based on a related column between them.
Different Types of SQL JOINs
Here are the different types of the JOINs in SQL:
(INNER) JOIN: Returns records that have matching values in both tables
For example: SELECT column_name(s) FROM table1 INNER JOIN table2 ON table1.column_name = table2.column_name;
LEFT (OUTER) JOIN: Return all records from the left table, and the matched records from the right table
For example: SELECT column_name(s) FROM table1 LEFT JOIN table2 ON table1.column_name = table2.column_name;
RIGHT (OUTER) JOIN: Return all records from the right table, and the matched records from the left table
For example: SELECT column_name(s) FROM table1 RIGHT JOIN table2 ON table1.column_name = table2.column_name;
FULL (OUTER) JOIN: Return all records when there is a match in either left or right table
For example: SELECT column_name(s) FROM table1 FULL OUTER JOIN table2 ON table1.column_name = table2.column_name;

The SQL UNION Operator
The UNION operator is used to combine the result-set of two or more SELECT statements.
Each SELECT statement within UNION must have the same number of columns
The columns must also have similar data types
The columns in each SELECT statement must also be in the same order

The SQL GROUP BY Statement
The GROUP BY statement is often used with aggregate functions (COUNT, MAX, MIN, SUM, AVG) to group the result-set by one or more columns.

The SQL HAVING Clause
The HAVING clause was added to SQL because the WHERE keyword could not be used with aggregate functions.

The SQL EXISTS Operator
The EXISTS operator is used to test for the existence of any record in a subquery.
The EXISTS operator returns true if the subquery returns one or more records.
For example SELECT column_name(s) FROM table_name WHERE EXISTS (SELECT column_name FROM table_name WHERE condition);

The ANY and ALL operators are used with a WHERE or HAVING clause.
The ANY operator returns true if any of the subquery values meet the condition.
The ALL operator returns true if all of the subquery values meet the condition.
For example: SELECT column_name(s) FROM table_name WHERE column_name operator ANY (SELECT column_name FROM table_name WHERE condition);

The SQL SELECT INTO Statement
The SELECT INTO statement copies data from one table into a new table.
For example: SELECT column1, column2, column3, ...INTO newtable [IN externaldb] FROM oldtable WHERE condition;

The SQL INSERT INTO SELECT Statement
The INSERT INTO SELECT statement copies data from one table and inserts it into another table.
INSERT INTO SELECT requires that data types in source and target tables match
The existing records in the target table are unaffected
For example INSERT INTO table2 SELECT * FROM table1 WHERE condition;

SQL Comments
Comments are used to explain sections of SQL statements, or to prevent execution of SQL statements.
