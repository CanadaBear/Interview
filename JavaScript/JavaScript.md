JavaScript is one of the 3 languages all web developers must learn:
1. HTML to define the content of web pages
2. CSS to specify the layout of web pages
3. JavaScript to program the behavior of web pages

JavaScript can be implemented using JavaScript statements that are placed within the <script>... </script>.
You can place the <script> tags, containing your JavaScript, anywhere within your web page, but it is normally recommended that you should keep it within the <head> tags. 

JavaScript allows you to work with three primitive data types −
Numbers, eg. 123, 120.50 etc.
Strings of text e.g. "This text string" etc.
Boolean e.g. true or false.
null. undefined

Global Variables − A global variable has global scope which means it can be defined anywhere in your JavaScript code.
Local Variables − A local variable will be visible only within a function.

JavaScript is an Object Oriented Programming (OOP) language. A programming language can be called object-oriented if it provides four basic capabilities to developers −
Encapsulation − the capability to store related information, whether data or methods, together in an object.
Aggregation − the capability to store one object inside another object.
Inheritance − the capability of a class to rely upon another class (or number of classes) for some of its properties and methods.
Polymorphism − the capability to write one function or method that works in a variety of different ways.

Every web page resides inside a browser window which can be considered as an object.
A Document object represents the HTML document that is displayed in that window. The Document object has various properties that refer to other objects which allow access to and modification of document content.
The way a document content is accessed and modified is called the Document Object Model, or DOM. The Objects are organized in a hierarchy. This hierarchical structure applies to the organization of objects in a Web document.
Window object − Top of the hierarchy. It is the outmost element of the object hierarchy.
Document object − Each HTML document that gets loaded into a window becomes a document object. The document contains the contents of the page.
Form object − Everything enclosed in the <form>...</form> tags sets the form object.
Form control elements − The form object contains all the elements defined for that object such as text fields, buttons, radio buttons, and checkboxes.

What are Cookies ?
Web Browsers and Servers use HTTP protocol to communicate and HTTP is a stateless protocol. But for a commercial website, it is required to maintain session information among different pages. For example, one user registration ends after completing many pages. But how to maintain users' session information across all the web pages. In many situations, using cookies is the most efficient method of remembering and tracking preferences, purchases, commissions, and other information required for better visitor experience or site statistics.

Cookies are a plain text data record of 5 variable-length fields −
Expires − The date the cookie will expire. If this is blank, the cookie will expire when the visitor quits the browser.
Domain − The domain name of your site.
Path − The path to the directory or web page that set the cookie. This may be blank if you want to retrieve the cookie from any directory or page.
Secure − If this field contains the word "secure", then the cookie may only be retrieved with a secure server. If this field is blank, no such restriction exists.
Name=Value − Cookies are set and retrieved in the form of key-value pairs

A regular expression is an object that describes a pattern of characters.
The JavaScript RegExp class represents regular expressions, and both String and RegExp define methods that use regular expressions to perform powerful pattern-matching and search-and-replace functions on text.
A regular expression could be defined with the RegExp () constructor, as follows −
var pattern = new RegExp(pattern, attributes); or var pattern = /pattern/attributes;
Here is the description of the parameters −
pattern − A string that specifies the pattern of the regular expression or another regular expression.
attributes − An optional string containing any of the "g", "i", and "m" attributes that specify global, case-insensitive, and multiline matches, respectively.

