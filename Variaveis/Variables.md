# ☕ Java - Variables and Data Types

Study repository dedicated to learning and practicing different **variables, data types, and declaration methods used in the Java programming language**.

This project contains practical examples and explanations about primitive types, reference types, Wrapper classes, local variables, instance variables, static variables, parameters, constants, access modifiers, `enum`, interfaces, and reference variables.

All example codes in this project are Java source files with the `.java` extension.

The project has an **educational purpose**, serving as study, practice, and reference material during the continuous learning process of Java.

---

## 🎯 Introduction

Variables are one of the fundamental concepts in programming. In Java, there are different ways to declare and use variables, depending on the type of data stored, where the variable is declared, and how it will be used.

This project covers concepts such as:

* Primitive types;
* Reference types;
* Wrapper classes;
* Local variables;
* Instance variables;
* Static variables;
* Parameter variables;
* `final` variables;
* `static` variables;
* `static final` constants;
* Access modifiers;
* Reference variables;
* `enum`;
* Variables declared in interfaces;
* Type inference using `var`;
* Classes and objects;
* Constructors;
* Methods;
* `this` reference;
* `null` values.

The goal is not only to understand **which types of variables exist**, but also **where they can be used, what their scope is, and how they work inside the structure of a Java application**.

---

## 🎯 Goals

The main goals of this project are:

* Understand the concept of a variable;
* Learn about Java primitive types;
* Learn about the main reference types;
* Understand the difference between primitive types and objects;
* Learn about Wrapper classes;
* Understand autoboxing and unboxing;
* Work with `String`;
* Work with arrays;
* Understand the concept of `null`;
* Learn about local variables;
* Learn about instance variables;
* Learn about static variables;
* Understand parameter variables;
* Use `final`;
* Use `static`;
* Understand constants;
* Learn about access modifiers;
* Work with `enum`;
* Understand variables declared in interfaces;
* Understand reference variables;
* Practice classes and objects;
* Understand constructors;
* Use `this`;
* Build a foundation for Object-Oriented Programming.

---

# 📖 Data Types in Java

Java uses **static typing**, which means that the type of a variable is known at compile time.

In general, the types used in Java can be divided into:

```text
Types in Java
│
├── Primitive Types
│
└── Reference Types
    │
    ├── Classes
    ├── Strings
    ├── Arrays
    ├── Enums
    └── Objects
```

---

## 🔹 Primitive Types

Primitive types are the basic data types of the Java language.

Java has **8 primitive types**:

| Type      |          Size | Description                          | Example                       |
| --------- | ------------: | ------------------------------------ | ----------------------------- |
| `byte`    |        8 bits | Small integer                        | `byte age = 18;`              |
| `short`   |       16 bits | Integer                              | `short number = 1000;`        |
| `int`     |       32 bits | Integer                              | `int age = 18;`               |
| `long`    |       64 bits | Large integer                        | `long population = 1000000L;` |
| `float`   |       32 bits | Decimal number                       | `float height = 1.75f;`       |
| `double`  |       64 bits | Decimal number with higher precision | `double price = 19.99;`       |
| `char`    |       16 bits | A Unicode character                  | `char letter = 'A';`          |
| `boolean` | JVM-dependent | True or false                        | `boolean active = true;`      |

> **Note:** although `boolean` is sometimes described as using "1 bit", the Java language specification does not define a storage size of exactly 1 bit for `boolean`. The exact storage size depends on the JVM implementation.

### Example

```java
byte Byte = 0;
short Short = 0;
int Int = 0;
long Long = 0L;

float Float = 0.0f;
double Double = 0.0;

char Char = '#';

boolean Boolean = false;
```

---

# 🔹 `byte`

The `byte` type is an integer type with **8 bits**.

Its range is:

```text
-128 to 127
```

Example:

```java
byte age = 18;
byte temperature = 25;
```

It is useful when working with small integer values.

---

# 🔹 `short`

The `short` type is an integer type with **16 bits**.

Its range is:

```text
-32,768 to 32,767
```

Example:

```java
short quantity = 1000;
```

Although it exists, `short` is less commonly used than `int` in regular applications.

---

# 🔹 `int`

The `int` type is one of the most commonly used integer types in Java programs.

It has **32 bits**.

Example:

```java
int age = 20;
int quantity = 100;
int result = 10 + 20;
```

---

# 🔹 `long`

The `long` type has **64 bits** and can store larger integer values.

Example:

```java
long population = 200000000L;
```

The `L` suffix indicates that the literal is a `long`.

---

# 🔹 `float`

The `float` type represents floating-point numbers using **32 bits**.

Example:

```java
float height = 1.75f;
float temperature = 25.5f;
```

The `f` is used to indicate that the literal should be treated as a `float`.

---

# 🔹 `double`

The `double` type represents floating-point numbers using **64 bits**.

Example:

```java
double price = 19.99;
double average = 8.75;
```

By default, decimal values such as `19.99` are treated as `double`.

---

# 🔹 `char`

The `char` type represents **a single Unicode character**.

Example:

```java
char letter = 'A';
char symbol = '#';
char number = '1';
```

It is important to understand the difference:

```java
char letter = 'A';
String word = "A";
```

`char` uses single quotes and represents one character.

`String` uses double quotes and represents a sequence of characters.

---

# 🔹 `boolean`

The `boolean` type represents only two states:

```text
true
false
```

Example:

```java
boolean connected = true;
boolean approved = false;
```

It is commonly used in conditions:

```java
if (approved) {
    System.out.println("Student approved!");
}
```

---

# 🧩 Reference Types

In addition to primitive types, Java also has **reference types**.

They can represent objects, arrays, strings, enums, and instances of classes.

Examples:

```java
String name = "Eduardo";

int[] numbers = {1, 2, 3, 4, 5};

Person person = new Person("John", 30);
```

A reference variable does not directly store the object in the same way that a primitive variable stores its value. Instead, it stores a reference to an object.

---

# 📝 `String`

`String` is a class used to represent sequences of characters.

Example:

```java
String name = "Eduardo";
String message = "Hello, world!";
```

Unlike `char`, a `String` can store multiple characters.

```java
char letter = 'A';

String word = "Java";
```

---

# 📦 Arrays

Arrays allow multiple values of the same type to be stored.

Example:

```java
int[] numbers = {1, 2, 3, 4, 5};
```

We can also create arrays of other types:

```java
String[] names = {
    "Eduardo",
    "John",
    "Maria"
};
```

Elements can be accessed using their indexes:

```java
System.out.println(numbers[0]);
```

The index starts at `0`.

---

# 📦 Wrapper Classes

Wrapper classes represent primitive types as **objects**.

| Primitive | Wrapper     |
| --------- | ----------- |
| `byte`    | `Byte`      |
| `short`   | `Short`     |
| `int`     | `Integer`   |
| `long`    | `Long`      |
| `float`   | `Float`     |
| `double`  | `Double`    |
| `char`    | `Character` |
| `boolean` | `Boolean`   |

Example:

```java
Integer age = 20;
Double height = 1.75;
Boolean active = true;
Character letter = 'A';
```

Java automatically handles conversions between primitives and their corresponding Wrapper classes in many situations.

---

## 🔄 Autoboxing

Autoboxing happens when a primitive value is automatically converted into its Wrapper type.

```java
int number = 10;

Integer value = number;
```

Java performs the conversion automatically.

---

## 🔄 Unboxing

Unboxing is the opposite process.

```java
Integer value = 10;

int number = value;
```

Java automatically converts the `Integer` object into an `int`.

---

# ⚠️ `null`

Primitive types cannot receive `null`.

This causes an error:

```java
int number = null;
```

A reference variable, however, can receive `null`:

```java
String name = null;

Person person = null;

int[] numbers = null;
```

`null` means that the reference variable **is not pointing to an object**.

It is important to understand the difference:

```java
String name = null;
```

and:

```java
String name = "";
```

In the first case, there is no reference to a `String` object.

In the second case, there is a `String` object containing an empty value.

---

# 📍 Local Variables

Local variables are declared inside methods, constructors, or blocks.

Example:

```java
public static void main(String[] args) {

    int age = 18;

    System.out.println(age);
}
```

The variable `age` can only be used inside the scope where it was declared.

---

# 🏠 Instance Variables

Instance variables are declared inside a class, but outside methods, constructors, or blocks.

Example:

```java
class Person {

    String name;
    int age;
}
```

Each object of the `Person` class has its own instance variables.

```java
Person person1 = new Person();
Person person2 = new Person();

person1.name = "John";
person2.name = "Maria";
```

Each object has its own `name`.

---

# 🌐 `static` Variables

A `static` variable belongs to the **class**, not to a specific instance.

Example:

```java
class Person {

    static int numberOfPeople = 0;
}
```

The variable can be accessed through the class:

```java
Person.numberOfPeople++;
```

Because it belongs to the class, there is one shared variable between the instances.

---

# 🔒 `final` Variables

A variable declared as `final` cannot receive a new value after it has been initialized.

Example:

```java
final int age = 18;
```

The following code causes an error:

```java
age = 20;
```

`final` is used when we want to prevent a variable or reference from receiving a new assignment.

---

# ⭐ `static final`

The combination of `static final` is commonly used to represent **constants**.

Example:

```java
static final double PI = 3.14159;
```

The variable:

* Belongs to the class;
* Cannot receive a new assignment.

By convention, constants in Java normally use uppercase names:

```java
static final int MAX_USERS = 100;
```

---

# 🧩 Parameter Variables

Parameters are variables declared in a method's signature.

Example:

```java
public void introduce(String name, int age) {

    System.out.println(
        "Name: " + name +
        " | Age: " + age
    );
}
```

In this example:

```text
name → parameter
age  → parameter
```

When the method is called:

```java
introduce("Eduardo", 18);
```

The values `"Eduardo"` and `18` are passed to the parameters.

---

# 🔐 Access Modifiers

Java provides modifiers that control access to members of a class.

| Modifier    | Access                                                                          |
| ----------- | ------------------------------------------------------------------------------- |
| `public`    | Accessible from anywhere                                                        |
| `private`   | Accessible only inside the class                                                |
| `protected` | Accessible within the same package and in subclasses, according to access rules |
| No modifier | Accessible within the same package                                              |

Example:

```java
class Person {

    private String name;

    public int age;

    protected String city;

    String country;
}
```

These modifiers are especially important for the concept of **encapsulation**.

---

# 🏷️ `enum`

An `enum` allows us to represent a fixed set of constants.

Example:

```java
enum WeekDay {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
```

We can use the `enum` like this:

```java
WeekDay day = WeekDay.MONDAY;
```

This is useful when working with values that have a limited number of possible options.

---

# 🔌 Variables in Interfaces

Variables declared inside interfaces are implicitly:

```text
public static final
```

Example:

```java
interface Configuration {

    int MAX_USERS = 100;
}
```

Conceptually, this is equivalent to:

```java
interface Configuration {

    public static final int MAX_USERS = 100;
}
```

Because of this, these variables work as constants associated with the interface.

---

# 🧠 `var`

The `var` keyword allows the compiler to **infer the type of a local variable from the value used during initialization**.

Example:

```java
var number = 10;
var name = "Java";
var active = true;
```

The compiler identifies:

```text
number → int
name   → String
active → boolean
```

It is important to remember that `var` **does not mean that the variable can change its type**.

This is still invalid:

```java
var number = 10;

number = "Java";
```

Also, `var` is used for local variables and must be initialized:

```java
var number = 10;
```

We cannot do:

```java
var number;
```

---

# 👤 Classes and Objects

Variables become even more important when we start working with **Object-Oriented Programming**.

A class can have:

* Attributes;
* Methods;
* Constructors.

Example:

```java
public class Person {

    String name;
    int age;

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public void introduce() {

        System.out.println(
            "Hello, my name is " +
            name +
            " and I am " +
            age +
            " years old."
        );
    }
}
```

---

# 🏗️ Constructor

A constructor is used when creating an object.

```java
Person person = new Person("John", 30);
```

At this moment, the constructor receives the values:

```java
public Person(String name, int age) {

    this.name = name;
    this.age = age;
}
```

---

# 🔎 `this`

The `this` keyword represents the current instance of the class.

In the example:

```java
public Person(String name, int age) {

    this.name = name;
    this.age = age;
}
```

We have:

```text
this.name
    ↓
class attribute

name
    ↓
constructor parameter
```

The `this` keyword helps distinguish the class attribute from the parameter with the same name.

---

# 🔗 Reference Variables

A reference variable can store a reference to an object.

Example:

```java
Person person = new Person("John", 30);
```

In this case:

```text
person
   │
   ▼
┌─────────────────────┐
│     Person Object   │
│                     │
│ name = "John"       │
│ age = 30            │
└─────────────────────┘
```

We can also have:

```java
Person person = null;
```

In this case, the variable does not contain a reference to an object.

---

# 🧪 Complete Example

The example below combines some of the concepts presented in this project:

```java
public class Person {

    // Instance variables
    private String name;
    private int age;

    // Static variable
    static int numberOfPeople = 0;

    // Constant
    static final String TYPE = "PERSON";

    // Constructor
    public Person(String name, int age) {

        this.name = name;
        this.age = age;

        numberOfPeople++;
    }

    // Method
    public void introduce() {

        System.out.println(
            "Name: " + name
        );

        System.out.println(
            "Age: " + age
        );
    }
}
```

Usage:

```java
public class Main {

    public static void main(String[] args) {

        // Local variable
        int number = 10;

        // Reference variable
        Person person = new Person(
            "Eduardo",
            18
        );

        person.introduce();

        System.out.println(
            "Total people: " +
            Person.numberOfPeople
        );
    }
}
```

This example combines different concepts:

* Local variable;
* Instance variables;
* `private`;
* `static`;
* `static final`;
* Constructor;
* `this`;
* Object;
* Reference variable;
* Method.

---

# 📊 Comparison of Main Types

| Category  | Example         | Can be `null`? | Associated with an object? |
| --------- | --------------- | -------------: | -------------------------: |
| Primitive | `int age`       |              ❌ |                          ❌ |
| Wrapper   | `Integer age`   |              ✅ |                          ✅ |
| String    | `String name`   |              ✅ |                          ✅ |
| Array     | `int[] numbers` |              ✅ |                          ✅ |
| Object    | `Person person` |              ✅ |                          ✅ |
| Enum      | `WeekDay day`   |              ✅ |                          ✅ |

---

# 🧭 Variable Scope

The **scope** determines where a variable can be accessed.

Example:

```java
public class Example {

    // Class scope
    int attribute = 10;

    public void method() {

        // Local scope
        int local = 20;

        System.out.println(attribute);
        System.out.println(local);
    }
}
```

In a simplified way:

```text
Class
│
├── Instance Variable
│
└── Method
    │
    └── Local Variable
```

Understanding scope is essential to avoid errors and organize code correctly.

---

# 🧠 Related Concepts

The study of variables also provides a foundation for several other Java concepts:

* Static typing;
* Type conversion;
* Casting;
* Autoboxing;
* Unboxing;
* Scope;
* Access modifiers;
* Encapsulation;
* Classes;
* Objects;
* Constructors;
* Methods;
* Object-Oriented Programming;
* Collections;
* Databases;
* APIs.

---

# 📈 Study Progress

This project represents one step in the continuous learning process of Java.

Variable concepts provide a foundation for more structured topics:

```text
Data Types
      ↓
Variables
      ↓
Operators
      ↓
Conditional Structures
      ↓
Loops
      ↓
Methods
      ↓
Arrays and Strings
      ↓
Classes and Objects
      ↓
Encapsulation
      ↓
Inheritance
      ↓
Polymorphism
      ↓
Database
      ↓
APIs
      ↓
More Complete Applications
```

Learning is continuous. Concepts that have already been studied continue to be practiced and improved through new exercises and projects.

---

# 📁 Suggested Structure

A possible organization for this content is:

```text
Java-Variables/
│
├── src/
│
│   ├── primitives/
│   │   ├── Byte.java
│   │   ├── Short.java
│   │   ├── Int.java
│   │   ├── Long.java
│   │   ├── Float.java
│   │   ├── Double.java
│   │   ├── Char.java
│   │   └── Boolean.java
│
│   ├── non_primitives/
│   │   ├── String.java
│   │   └── Arrays.java
│
│   ├── wrappers/
│   │   └── Wrapper.java
│
│   ├── scope/
│   │   ├── Local.java
│   │   ├── Instance.java
│   │   ├── Static.java
│   │   └── Parameter.java
│
│   ├── modifiers/
│   │   ├── Final.java
│   │   ├── StaticFinal.java
│   │   └── Access.java
│
│   ├── enum/
│   │   └── WeekDay.java
│
│   ├── interfaces/
│   │   └── InterfaceVariables.java
│
│   ├── objects/
│   │   ├── Person.java
│   │   └── Main.java
│
│   └── exercises/
│
└── README.md
```

> The structure above is only a suggestion and can be adapted to the actual organization of the project. All example codes are Java source files with the `.java` extension.

---

# ⚙️ Technologies Used

* **Java**
* **JDK**

The specific versions used may vary depending on the study environment.

---

# 💻 Requirements

To run the examples, you need:

* JDK installed;
* A Java-compatible IDE or terminal;
* A configured Java environment.

Check the installation using:

```bash
java -version
```

And:

```bash
javac -version
```

---

# ▶️ How to Run

All example codes are Java source files with the `.java` extension.

### Terminal

Compile the file:

```bash
javac FileName.java
```

Then run it:

```bash
java FileName
```

Example:

```bash
javac Main.java
java Main
```

### IDE

The examples can also be executed directly through a Java-compatible IDE.

Find the `.java` file containing:

```java
public static void main(String[] args)
```

and use the **Run** option.

---

# 📝 Suggested Exercises

Some exercises that can be used to practice the concepts from this project:

### 🔹 Basic Level

* Create variables of each primitive type;
* Display the values in the console;
* Work with mathematical operations;
* Create `String` variables;
* Create arrays;
* Work with `char` and `boolean`.

### 🔹 Types and Conversions

* Convert `int` to `double`;
* Work with casting;
* Practice autoboxing;
* Practice unboxing;
* Compare primitive types and Wrapper classes.

### 🔹 Scope

* Create local variables;
* Create instance variables;
* Create `static` variables;
* Work with parameters;
* Observe differences between scopes.

### 🔹 Object-Oriented Programming

* Create a `Person` class;
* Create objects;
* Create attributes;
* Create methods;
* Create constructors;
* Use `this`;
* Apply `private`;
* Create getters and setters.

---

## 👨‍💻 Author

**Eduardo Fernandez Evangelista**

**GitHub:** [EduardoFernandezEvangelista](https://github.com/EduardoFernandezEvangelista)

---

## 📄 License

This project does not currently have a specific license.

**License:** ``

---

<div align="center">

☕ **Java • Variables • Data Types • OOP**

📚 Study • Practice • Development • Progress

</div>
