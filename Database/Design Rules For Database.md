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