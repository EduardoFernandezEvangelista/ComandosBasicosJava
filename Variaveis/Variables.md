# ☕ Java — Variables and Data Types

> Reference material about **variables and data types in Java**, with practical examples and notes about declaration, storage, scope, and the use of values.

This content is part of the Java basic commands study sequence and keeps the practical examples in the `VariaveisJava.java` file.

---

# Covered Topics

This material brings together the main aspects related to the use of data in Java, from **primitive types** to **reference types, Wrapper classes, constants, `enum`, `var`, and variables related to classes and objects**.

| Topic               | Content                                                  |
| ------------------- | -------------------------------------------------------- |
| Primitive Types     | Characteristics and use of the 8 primitive types         |
| Reference Types     | References to objects, arrays, `String`, and other types |
| `String`            | Text representation and manipulation                     |
| Arrays              | Storing multiple values                                  |
| Wrapper             | Representing primitive types as objects                  |
| Autoboxing          | Automatic conversion from primitive to Wrapper           |
| Unboxing            | Automatic conversion from Wrapper to primitive           |
| `null`              | Absence of a reference to an object                      |
| Local Variables     | Scope inside methods and blocks                          |
| Instance Variables  | Data that belongs to objects                             |
| `static`            | Data associated with the class                           |
| `final`             | Values that cannot receive a new assignment              |
| `static final`      | Declaration of constants                                 |
| Parameters          | Values received by methods                               |
| Access Modifiers    | Control of visibility                                    |
| `enum`              | Representation of a fixed set of values                  |
| Interfaces          | Variables declared in interfaces                         |
| `var`               | Type inference for local variables                       |
| Classes and Objects | Attributes, methods, and constructors                    |
| `this`              | Reference to the current instance                        |
| Scope               | Region where a variable can be accessed                  |

---

# Data Types in Java

Java uses **static typing**, which means that the type of a variable is defined at compile time.

In general, Java types are organized into:

```text
Java Types
│
├── Primitive Types
│
└── Reference Types
    │
    ├── Classes
    ├── String
    ├── Arrays
    ├── Enums
    └── Objects
```

---

## Primitive Types

Java has **8 primitive types**:

| Type      | Size          | Description                          | Example                       |
| --------- | ------------- | ------------------------------------ | ----------------------------- |
| `byte`    | 8 bits        | Small integer                        | `byte age = 18;`              |
| `short`   | 16 bits       | Integer                              | `short number = 1000;`        |
| `int`     | 32 bits       | Integer                              | `int age = 18;`               |
| `long`    | 64 bits       | Large integer                        | `long population = 1000000L;` |
| `float`   | 32 bits       | Decimal number                       | `float height = 1.75f;`       |
| `double`  | 64 bits       | Decimal number with higher precision | `double price = 19.99;`       |
| `char`    | 16 bits       | A Unicode character                  | `char letter = 'A';`          |
| `boolean` | JVM-dependent | True or false                        | `boolean active = true;`      |

> **Note:** The Java specification does not define `boolean` as having exactly 1 bit of storage. Its representation depends on the JVM implementation.

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

# Range of Numeric Types

| Type     |                  Minimum |                 Maximum |
| -------- | -----------------------: | ----------------------: |
| `byte`   |                   `-128` |                   `127` |
| `short`  |                `-32,768` |                `32,767` |
| `int`    |                   `-2³¹` |               `2³¹ - 1` |
| `long`   |                   `-2⁶³` |               `2⁶³ - 1` |
| `float`  |  Approximately `-3.4E38` |  Approximately `3.4E38` |
| `double` | Approximately `-1.7E308` | Approximately `1.7E308` |

---

# `byte`

An integer type with an **8-bit** representation.

```text
-128 to 127
```

It is suitable for small integer values.

---

# `short`

An integer type with a **16-bit** representation.

```text
-32,768 to 32,767
```

Although it is part of the language, it is less commonly used than `int`.

---

# `int`

An integer type with a **32-bit** representation and one of the most commonly used options for integer values.

```java
int age = 20;
int quantity = 100;
int result = 10 + 20;
```

---

# `long`

An integer type with a **64-bit** representation, used for larger integer values.

```java
long population = 200000000L;
```

The `L` suffix identifies the literal as a `long`.

---

# `float`

A decimal type with a **32-bit** representation.

```java
float height = 1.75f;
float temperature = 25.5f;
```

The `f` suffix indicates that the literal should be treated as a `float`.

---

# `double`

A decimal type with a **64-bit** representation.

```java
double price = 19.99;
double average = 8.75;
```

Decimal literals are considered `double` by default.

---

# `char`

Represents a single Unicode character.

### `char` vs `String`

| Type     | Example | Representation           |
| -------- | ------- | ------------------------ |
| `char`   | `'A'`   | A single character       |
| `String` | `"A"`   | A sequence of characters |

---

# `boolean`

Represents two states:

```text
true
false
```

Example:

```java
boolean connected = true;
boolean approved = false;
```

It is used in conditional expressions:

```java
if (approved) {
    System.out.println("Student approved!");
}
```

---

# Reference Types

Reference types represent values related to **objects**.

Examples:

```java
String name = "Eduardo";

int[] numbers = {1, 2, 3};

Person person = new Person("John", 30);
```

Unlike a primitive type, a reference variable stores a reference to an object.

---

## Main Reference Types

| Type     | Example                         |
| -------- | ------------------------------- |
| `String` | `String name = "Java";`         |
| Array    | `int[] numbers = {1, 2, 3};`    |
| Class    | `Person person = new Person();` |
| `enum`   | `Day day = Day.MONDAY;`         |
| Wrapper  | `Integer age = 18;`             |

---

# `String`

`String` represents a sequence of characters.

```java
String name = "Eduardo";
String message = "Hello, world!";
```

It is different from `char`:

```java
char letter = 'A';

String word = "Java";
```

| Type     | Quotes | Quantity                 |
| -------- | ------ | ------------------------ |
| `char`   | `' '`  | One character            |
| `String` | `" "`  | A sequence of characters |

---

# Arrays

Arrays store multiple values of the same type.

```java
int[] numbers = {1, 2, 3, 4, 5};
```

They can also store references:

```java
String[] names = {
    "Eduardo",
    "John",
    "Maria"
};
```

Indexes start at `0`:

```java
System.out.println(numbers[0]);
```

---

# Wrapper Classes

Wrapper classes represent primitive types as objects.

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

---

## Autoboxing and Unboxing

| Process        | Conversion          |
| -------------- | ------------------- |
| **Autoboxing** | Primitive → Wrapper |
| **Unboxing**   | Wrapper → Primitive |

### Autoboxing

```java
int number = 10;

Integer value = number;
```

### Unboxing

```java
Integer value = 10;

int number = value;
```

Java performs these conversions automatically in several situations.

---

# `null`

`null` represents the absence of a reference to an object.

Primitive types cannot receive `null`, while reference types can.

### `null` vs Empty Value

```java
String name = null;
```

```java
String name = "";
```

| Value  | Meaning                              |
| ------ | ------------------------------------ |
| `null` | There is no reference to an object   |
| `""`   | There is a `String`, but it is empty |

---

# Variable Scope

Scope determines **where a variable can be accessed**.

| Type      | Declaration Location | Scope                      |
| --------- | -------------------- | -------------------------- |
| Local     | Method or block      | Inside that method/block   |
| Instance  | Class                | Associated with the object |
| `static`  | Class                | Associated with the class  |
| Parameter | Method               | During method execution    |

---

# Local Variables

They are declared inside methods, constructors, or blocks.

```java
public static void main(String[] args) {

    int age = 18;

    System.out.println(age);
}
```

The `age` variable can only be accessed inside the scope where it was declared.

---

# Instance Variables

They are declared inside a class, but outside methods, constructors, or blocks.

```java
class Person {

    String name;
    int age;
}
```

Each object has its own values:

```java
Person person1 = new Person();
Person person2 = new Person();

person1.name = "John";
person2.name = "Maria";
```

| Object    | `name`    |
| --------- | --------- |
| `person1` | `"John"`  |
| `person2` | `"Maria"` |

---

# `static` Variables

A `static` variable belongs to the class instead of belonging individually to each object.

```java
class Person {

    static int numberOfPeople = 0;
}
```

Access:

```java
Person.numberOfPeople++;
```

| Type              | Belongs to |
| ----------------- | ---------- |
| Instance variable | Object     |
| `static` variable | Class      |

---

# `final`

A `final` variable cannot receive a new assignment after it has been initialized.

```java
final int age = 18;
```

The following attempt is invalid:

```java
age = 20;
```

---

# `static final`

The combination `static final` is used to represent constants.

```java
static final double PI = 3.14159;
```

Another example:

```java
static final int MAX_USERS = 100;
```

| Keyword        | Characteristic                     |
| -------------- | ---------------------------------- |
| `static`       | Associated with the class          |
| `final`        | Cannot receive a new assignment    |
| `static final` | Constant associated with the class |

By convention, constants use uppercase names.

---

# Parameter Variables

Parameters are variables declared in the signature of a method.

```java
public void introduce(String name, int age) {

    System.out.println(name);
    System.out.println(age);
}
```

In this example:

| Element | Function  |
| ------- | --------- |
| `name`  | Parameter |
| `age`   | Parameter |

When calling:

```java
introduce("Eduardo", 18);
```

The provided values are the **arguments** of the method call.

---

# Access Modifiers

Access modifiers control access to members of a class.

| Modifier    | Access                                                                   |
| ----------- | ------------------------------------------------------------------------ |
| `public`    | Any class that has access to the type                                    |
| `private`   | Only inside the class itself                                             |
| `protected` | The class itself, same package, and subclasses according to access rules |
| No modifier | Inside the same package                                                  |

Example:

```java
class Person {

    private String name;

    public int age;

    protected String city;

    String country;
}
```

---

# `enum`

`enum` represents a fixed set of constants.

```java
enum DayOfWeek {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
```

Usage:

```java
DayOfWeek day = DayOfWeek.MONDAY;
```

It is useful when there is a limited set of possible values.

---

# Variables in Interfaces

Variables declared directly inside interfaces are implicitly:

```text
public static final
```

Example:

```java
interface Configuration {

    int MAX_USERS = 100;
}
```

Conceptually:

```java
interface Configuration {

    public static final int MAX_USERS = 100;
}
```

---

# `var`

`var` allows the compiler to infer the type of a **local variable** during initialization.

```java
var number = 10;
var name = "Java";
var active = true;
```

The compiler identifies:

| Variable | Inferred Type |
| -------- | ------------- |
| `number` | `int`         |
| `name`   | `String`      |
| `active` | `boolean`     |

`var` does not make the variable dynamically typed:

```java
var number = 10;

number = "Java";
```

The code above is invalid.

The variable must also be initialized when it is declared:

```java
var number = 10;
```

This is not allowed:

```java
var number;
```

---

# Classes and Objects

Variables can also represent attributes of objects.

```java
public class Person {

    String name;
    int age;

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }
}
```

Creating the object:

```java
Person person = new Person("John", 30);
```

In this example:

| Element           | Represents                        |
| ----------------- | --------------------------------- |
| `Person`          | Class                             |
| `person`          | Reference variable                |
| `name`            | Attribute                         |
| `age`             | Attribute                         |
| `new Person(...)` | Object creation                   |
| `this`            | Reference to the current instance |

---

# `this`

`this` represents the current instance of the class.

```java
public Person(String name, int age) {

    this.name = name;
    this.age = age;
}
```

In this case:

```text
this.name
    ↓
class attribute

name
    ↓
parameter
```

---

# Reference Variables

A reference variable can point to an object.

```java
Person person = new Person("John", 30);
```

Simplified representation:

```text
person
   │
   ▼
┌──────────────────┐
│   Person Object  │
│                  │
│ name = "John"    │
│ age = 30         │
└──────────────────┘
```

It can also not point to any object:

```java
Person person = null;
```

---

# Primitives vs References

| Characteristic     | Primitive                  | Reference                            |
| ------------------ | -------------------------- | ------------------------------------ |
| Example            | `int`                      | `Integer`                            |
| Represents         | Basic value                | Reference to an object               |
| Can receive `null` | ❌                          | ✅                                    |
| Has methods        | ❌                          | ✅                                    |
| Examples           | `int`, `double`, `boolean` | `String`, arrays, classes, `Integer` |

---

# Variable Summary

| Type           | Example                      | Associated With                |
| -------------- | ---------------------------- | ------------------------------ |
| Local          | `int age = 18;`              | Method/block                   |
| Instance       | `String name;`               | Object                         |
| `static`       | `static int total;`          | Class                          |
| `final`        | `final int MAX = 10;`        | Value without a new assignment |
| `static final` | `static final int MAX = 10;` | Class constant                 |
| Parameter      | `void method(int age)`       | Method                         |
| Reference      | `Person person;`             | Object                         |
| `enum`         | `Day.MONDAY`                 | Set of constants               |
| Interface      | `int MAX = 100;`             | Interface constant             |
| `var`          | `var number = 10;`           | Locally inferred type          |

---

# Material Organization

The contents of this study are organized together with the other Java fundamentals:

```text
JavaBasicCommands/
│
├── Condicionais_Repeticoes_Operadores/
│   ├── Condicionais/
│   │   └── CondicionaisJava.java
│   ├── Operadores/
│   │   └── OperadoresJava.java
│   ├── Repeticao/
│   │   └── RepeticaoJava.java
│   ├── CondicionaisRepeticoesOperadores.md
│   └── ConditionalStructuresLoopsOperators.md
│
├── Entrada_Saida/
│   ├── EntradaSaida.md
│   ├── EntradaSaidaJava.java
│   └── InputOutput.md
│
├── Metodos/
│   ├── Methods.md
│   ├── Metodos.md
│   └── MetodosJava.java
│
├── Variaveis/
│   ├── Variables.md
│   ├── Variaveis.md
│   ├── VariaveisJava.java
│   ├── README.md
│   └── READMEbr.md
```

The practical examples related to variables, data types, scope, references, Wrapper classes, `null`, `static`, `final`, `enum`, and `var` are concentrated in:

```text
Variaveis/VariaveisJava.java
```

The Markdown files contain the conceptual documentation, while the `.java` files contain the executable examples for each topic.

---

<div align="center">

☕ **Java — Variables and Data Types**

</div>
