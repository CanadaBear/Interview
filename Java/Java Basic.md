Java is ---
1. Object Oriented, Everything is an object in Java. Java supports the following fundamental concepts--Polymorphism, Inheritance, Encapsulation, Abstraction, Classes, Objects, Instance, Method, Message Parsing.
2. Platfrom Independent, aka build once, run everywhere. When java is compiled, it is not compiled into platform specific machine, rather into platform independent byte code. JVM converts bytecode to executable instructions based on different operating system. 
3. Simple, well that is compared with C++.
4. Secure, JVM enables virus-free system. 
5. Architecture-neutral, build once run everywhere.
6. Portable 
7. Robust
8. Multithreaded
9. Interpreted, Java interpreter can execute java bytecode directly on any machine.
11. High Performance
12. Dynamic 

Primitive Data Types
1. byte
Byte data type is an 8-bit signed two's complement integer, Minimum value is -128 (-2^7) and Maximum value is 127 (inclusive)(2^7 -1), Default value is 0. Byte data type is used to save space in large arrays, mainly in place of integers, since a byte is four times smaller than an integer. Example: byte a = 100, byte b = -50
<<<<<<< HEAD
2. short
Short data type is a 16-bit signed two's complement integer, Minimum value is -32,768 (-2^15), Maximum value is 32,767 (inclusive) (2^15 -1), Default value is 0. Short data type can also be used to save memory as byte data type. A short is 2 times smaller than an integer. Example: short s = 10000, short r = -20000
3. int
Int data type is a 32-bit signed two's complement integer. Minimum value is - 2,147,483,648 (-2^31), Maximum value is 2,147,483,647(inclusive) (2^31 -1). The default value is 0. Integer is generally used as the default data type for integral values unless there is a concern about memory. Example: int a = 100000, int b = -200000
4. long
Long data type is a 64-bit signed two's complement integer, Minimum value is -9,223,372,036,854,775,808(-2^63), Maximum value is 9,223,372,036,854,775,807 (inclusive)(2^63 -1), Default value is 0L. Example: long a = 100000L, long b = -200000L
5. float
Float data type is a single-precision 32-bit IEEE 754 floating point, Float is mainly used to save memory in large arrays of floating point numbers, Default value is 0.0f. Float data type is never used for precise values such as currency. Example: float f1 = 234.5f
6. double
Double data type is a double-precision 64-bit IEEE 754 floating point, Default value is 0.0d. Example: double d1 = 123.4
7. boolean
Boolean data type represents one bit of information, Default value is false. Example: boolean one = true
8. char
Char data type is a single 16-bit Unicode character, Minimum value is '\u0000' (or 0), Maximum value is '\uffff' (or 65,535 inclusive). Example: char letterA = 'A'
However, in development, we come across situations where we need to use objects instead of primitive data types. In order to achieve this, Java provides wrapper classes. All the wrapper classes (Integer, Long, Byte, Double, Float, Short) are subclasses of the abstract class Number. The object of the wrapper class contains or wraps its respective primitive data type. Converting primitive data types into object is called boxing, and this is taken care by the compiler. Therefore, while using a wrapper class you just need to pass the value of the primitive data type to the constructor of the Wrapper class. On the other hand, Converting object into primitive data types is called unboxing. 
=======

2. short
Short data type is a 16-bit signed two's complement integer, Minimum value is -32,768 (-2^15), Maximum value is 32,767 (inclusive) (2^15 -1), Default value is 0. Short data type can also be used to save memory as byte data type. A short is 2 times smaller than an integer. Example: short s = 10000, short r = -20000

3. int
Int data type is a 32-bit signed two's complement integer. Minimum value is - 2,147,483,648 (-2^31), Maximum value is 2,147,483,647(inclusive) (2^31 -1). The default value is 0. Integer is generally used as the default data type for integral values unless there is a concern about memory. Example: int a = 100000, int b = -200000

4. long
Long data type is a 64-bit signed two's complement integer, Minimum value is -9,223,372,036,854,775,808(-2^63), Maximum value is 9,223,372,036,854,775,807 (inclusive)(2^63 -1), Default value is 0L. Example: long a = 100000L, long b = -200000L

5. float
Float data type is a single-precision 32-bit IEEE 754 floating point, Float is mainly used to save memory in large arrays of floating point numbers, Default value is 0.0f. Float data type is never used for precise values such as currency. Example: float f1 = 234.5f

6. double
Double data type is a double-precision 64-bit IEEE 754 floating point, Default value is 0.0d. Example: double d1 = 123.4

7. boolean
Boolean data type represents one bit of information, Default value is false. Example: boolean one = true

8. char
Char data type is a single 16-bit Unicode character, Minimum value is '\u0000' (or 0), Maximum value is '\uffff' (or 65,535 inclusive). Example: char letterA = 'A'
>>>>>>> 89576b7d3b8ed865d2c838d26439394b7c61a159

There are three kinds of variables in Java −
1. Local variables, Local variables are declared in methods, constructors, or blocks. 
Local variables are implemented at stack level internally.
<<<<<<< HEAD
2. Instance variables, Instance variables are declared in a class, but outside a method, constructor or any block. When a space is allocated for an object in the heap, a slot for each instance variable value is created.
3. Class/Static variables, Class variables also known as static variables are declared with the static keyword in a class, but outside a method, constructor or a block. There would only be one copy of each class variable per class, regardless of how many objects are created from it. Static variables are stored in the static memory(PermGen space of heap memory). Static variables are created when the program starts and destroyed when the program stops.

Java provides a number of non-access modifiers to achieve many other functionality.
1. The static modifier for creating class methods and variables.
2. The final modifier for finalizing the implementations of classes, methods, and variables.
3. The abstract modifier for creating abstract classes and methods.
4. The synchronized and volatile modifiers, which are used for threads

Java provides a number of access modifiers to set access levels for classes, variables, methods and constructors. The four access levels are −
1. Visible to the package, the default. No modifiers are needed.
2. Visible to the class only (private).
3. Visible to the world (public).
4. Visible to the package and all subclasses (protected).
=======

2. Instance variables, Instance variables are declared in a class, but outside a method, constructor or any block. When a space is allocated for an object in the heap, a slot for each instance variable value is created.

3. Class/Static variables, Class variables also known as static variables are declared with the static keyword in a class, but outside a method, constructor or a block. There would only be one copy of each class variable per class, regardless of how many objects are created from it. Static variables are stored in the static memory. 

Java provides a number of access modifiers to set access levels for classes, variables, methods and constructors. The four access levels are −
Visible to the package, the default. No modifiers are needed.
Visible to the class only (private).
Visible to the world (public).
Visible to the package and all subclasses (protected).
>>>>>>> 89576b7d3b8ed865d2c838d26439394b7c61a159

Java provides a rich set of operators to manipulate variables. We can divide all the Java operators into the following groups---
Arithmetic Operators
Relational Operators
Bitwise Operators
Logical Operators, && Called Logical AND operator. || Called Logical OR Operator. ! Called Logical NOT Operator. 
Assignment Operators
<<<<<<< HEAD
Misc Operators, Conditional Operator ( ? : ), (Object reference variable) instanceof  (class/interface type)

Strings 
Strings, which are widely used in Java programming, are a sequence of characters. In Java programming language, strings are treated as objects. Strings are immutable, you cannot modify its value once creating it. That have serval reasons like security, class loading. And also compare two strings using equals() rather than == because strings are objects.  

Exception
Java has three kinds of exception----
1. Checked exceptions − A checked exception is an exception that occurs at the compile time, these are also called as compile time exceptions.
2. Unchecked exceptions − An unchecked exception is an exception that occurs at the time of execution. These are also called as Runtime Exceptions.
3. Errors − These are not exceptions at all, but problems that arise beyond the control of the user or the programmer.

Files and I/O 
A stream can be defined as a sequence of data. There are two kinds of Streams −
1. InPutStream − The InputStream is used to read data from a source. Like FileInputStream, ByteArrayInputStream.... 
2. OutPutStream − The OutputStream is used for writing data to a destination. Like FileOutputStream, ByteArrayOutputStream.... 

The Constructors
A constructor initializes an object when it is created. It has the same name as its class and is syntactically similar to a method. However, constructors have no explicit return type. Typically, you will use a constructor to give initial values to the instance variables defined by the class, or to perform any other startup procedures required to create a fully formed object. All classes have constructors, whether you define one or not, because Java automatically provides a default constructor that initializes all member variables to zero. However, once you define your own constructor, the default constructor is no longer used. Java does not support destructors, if a resource needs to be closed as sonn as you have finished using it, you need to manage ti manually. Supply a close method that does the neccessary clean-up. 

In Java, the new keyword is used to create new objects. There are three steps when creating an object from a class −
Declaration − A variable declaration with a variable name with an object type.
Instantiation − The 'new' keyword is used to create the object.
Initialization − The 'new' keyword is followed by a call to a constructor. This call initializes the new object.
=======
Misc Operators, Conditional Operator ( ? : ), (Object reference variable) instanceof  (class/interface type)
>>>>>>> 89576b7d3b8ed865d2c838d26439394b7c61a159
