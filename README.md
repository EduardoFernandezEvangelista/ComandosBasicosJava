# Java - Basic Commands

Study repository created to practice the **Java** programming language, bringing together examples, small programs, exercises, and projects related to programming fundamentals and software development.

The project has an **educational purpose only**, serving as a study, practice, and reference material during the learning process of Java and related development concepts.

---

## 📚 About the Project

This repository was created to track my progress while learning the **Java** programming language, starting with the basic concepts and gradually moving toward more structured software development concepts.

The fundamentals presented in this repository have already been studied and developed. Concepts related to Object-Oriented Programming, databases, APIs, and system integration are also part of my learning journey, but they continue to be improved through studies, exercises, and projects.

Here you can find examples, exercises, and projects related to:

* Java fundamentals;
* Programming logic;
* Conditional statements;
* Loops and repetition structures;
* Methods and functions;
* Arrays and Strings;
* Object-Oriented Programming;
* Classes and objects;
* Encapsulation;
* Inheritance;
* Polymorphism;
* Application modeling and organization;
* Databases;
* API development;
* System integration;
* Other concepts related to the development of my programming skills.

> **Note:** Content marked as "in development" has already been studied and developed, but it continues to be improved and applied in new projects.

---

## 🎯 Goals

The main goals of this project are:

* Learn and practice Java syntax;
* Develop programming logic;
* Understand the main data types;
* Work with input and output;
* Practice conditional statements;
* Practice repetition structures;
* Develop and use methods;
* Work with parameters and return values;
* Manipulate arrays and strings;
* Understand the fundamentals of Object-Oriented Programming;
* Learn how to create and organize classes and objects;
* Understand encapsulation, inheritance, and polymorphism;
* Develop applications using Java;
* Study database integration;
* Understand the fundamentals of API development;
* Practice integration between different systems;
* Improve knowledge that has already been developed;
* Track the progress of my studies;
* Create a knowledge base for future projects.

---

## 📖 Topics Studied

### ☕ Java Fundamentals

| Concept                | Description                                 |
| ---------------------- | ------------------------------------------- |
| Variables              | Data storage and manipulation               |
| Data Types             | Representation of different types of values |
| `Scanner`              | Input through the keyboard                  |
| `System.out.println()` | Displaying information in the console       |
| Mathematical Operators | Performing arithmetic operations            |
| Relational Operators   | Comparing values                            |
| Logical Operators      | Combining conditions                        |
| Type Conversion        | Converting between different data types     |
| Strings                | Text manipulation                           |
| Arrays                 | Storing multiple values                     |

### 🔀 Control Structures

| Concept         | Description                       |
| --------------- | --------------------------------- |
| `if / else`     | Conditional structures            |
| `else if`       | Working with multiple conditions  |
| `switch / case` | Selecting between different cases |
| `for`           | Repetition structure              |
| `while`         | Repetition based on a condition   |
| `while (true)`  | Creating continuous loops         |
| `break`         | Stopping loops or cases           |
| `continue`      | Skipping a specific iteration     |

### 🧩 Methods and Code Organization

| Concept          | Description                         |
| ---------------- | ----------------------------------- |
| Methods          | Code organization and reuse         |
| Parameters       | Passing values to methods           |
| `return`         | Returning values                    |
| Classes          | Structural organization of the code |
| Access Modifiers | Controlling access to class members |

### 🏗️ Object-Oriented Programming

The concepts of **Object-Oriented Programming (OOP)** have already been studied and developed. They continue to be improved through practice and the creation of more structured applications.

| Concept                     | Description                                                          |
| --------------------------- | -------------------------------------------------------------------- |
| Object-Oriented Programming | Organizing software using objects and their responsibilities         |
| Classes                     | Structures used to define objects                                    |
| Objects                     | Instances of classes                                                 |
| Attributes                  | Characteristics and data of objects                                  |
| Methods                     | Behaviors defined by classes                                         |
| Constructors                | Used to initialize objects                                           |
| `this`                      | Reference to the current object                                      |
| Encapsulation               | Controlling access to data and behaviors                             |
| Inheritance                 | Reusing and extending existing structures                            |
| Polymorphism                | Allowing different behaviors through the same interface or structure |

### 🗄️ Database

Database concepts have already been studied and developed, but they continue to be improved, especially when integrating databases with Java applications.

| Concept                     | Description                                           |
| --------------------------- | ----------------------------------------------------- |
| Database                    | Structured storage of information                     |
| MySQL                       | Database management system used in the studies        |
| SQL                         | Language used to manipulate data                      |
| CRUD                        | Create, Read, Update, and Delete operations           |
| Java + Database Integration | Communication between Java applications and databases |

### 🌐 APIs

API development concepts have already been studied and developed. They continue to be improved through practice, system integration, and the creation of more complete applications.

| Concept            | Description                                              |
| ------------------ | -------------------------------------------------------- |
| APIs               | Communication between different applications and systems |
| REST APIs          | Communication model based on resources and HTTP requests |
| HTTP               | Protocol used for client-server communication            |
| Requests           | Communication between applications                       |
| Responses          | Data returned by an API                                  |
| System Integration | Communication between different applications             |

> The content may be modified, expanded, or reorganized as the studies continue to evolve.

---

## 🧠 Concept Examples

### Input

The `Scanner` class allows the program to receive information typed by the user through the keyboard.

```java
Scanner scanner = new Scanner(System.in);

System.out.print("Enter your name: ");
String name = scanner.nextLine();

System.out.println("Hello, " + name);
```

In this example:

* `Scanner` captures keyboard input;
* `nextLine()` receives a text line;
* The value is stored in the `name` variable;
* `System.out.println()` displays the information.

---

### `if / else`

The `if` and `else` structures allow different parts of the code to run depending on a condition.

```java
if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}
```

---

### `else if`

The `else if` structure allows the program to work with multiple conditions.

```java
if (grade >= 9) {
    System.out.println("Excellent");
} else if (grade >= 7) {
    System.out.println("Good");
} else {
    System.out.println("Needs improvement");
}
```

---

### `switch / case`

The `switch` structure allows the program to select an option from different possibilities.

```java
switch (option) {
    case 1:
        System.out.println("Option 1");
        break;

    case 2:
        System.out.println("Option 2");
        break;

    default:
        System.out.println("Invalid option");
}
```

---

### `for`

The `for` loop can be used to execute a block of code several times.

```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```

---

### `while`

The `while` loop executes a block of code while a condition is true.

```java
while (counter < 10) {
    System.out.println(counter);
    counter++;
}
```

---

### `while (true)`

The `while (true)` structure creates a continuous loop that can be stopped using `break`.

```java
while (true) {
    System.out.println("Running...");

    if (condition) {
        break;
    }
}
```

---

### Method

Methods help organize code into reusable blocks.

```java
public static int sum(int a, int b) {
    return a + b;
}
```

This method receives two parameters and returns the result of their sum.

---

## 🏗️ Object-Oriented Programming

The concepts of **Object-Oriented Programming (OOP)** have already been studied and developed. They continue to be improved through exercises, projects, and more structured applications.

### Class

A class is a structure that defines the characteristics and behaviors of certain objects.

```java
class Person {

    String name;
    int age;

    void introduce() {
        System.out.println(
            "Hello, my name is " + name
        );
    }
}
```

### Object

An object can be created from a class.

```java
Person person = new Person();

person.name = "Eduardo";
person.age = 18;

person.introduce();
```

### Encapsulation

Encapsulation allows us to control access to an object's data.

```java
class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

### Inheritance

Inheritance allows a class to reuse characteristics from another class.

```java
class Animal {

    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Woof!");
    }
}
```

### Polymorphism

Polymorphism allows different implementations to be used through the same structure.

```java
Animal animal = new Dog();

animal.makeSound();
```

These concepts are already part of the knowledge developed in this repository and continue to be improved through new projects and challenges.

---

## 🗄️ Database

Database knowledge has already been studied and developed. It continues to be improved to create better integration between Java applications and stored information.

Some of the studied concepts include:

* MySQL;
* SQL;
* Tables;
* Records;
* Queries;
* Data insertion;
* Data updates;
* Data deletion;
* CRUD;
* Java and database integration.

Conceptual SQL query example:

```sql
SELECT * FROM users;
```

Java and database integration continues to be improved through the development of more complete and organized applications.

---

## 🌐 APIs

API concepts have already been studied and developed, but they continue to be improved through the creation of services, application integration, and different communication resources.

Some of the studied concepts include:

* REST APIs;
* HTTP requests;
* `GET` methods;
* `POST` methods;
* `PUT` methods;
* `DELETE` methods;
* HTTP responses;
* JSON;
* Application integration;
* API development using Java and Spring Boot.

Conceptual request example:

```text
Client
   │
   │ GET /users
   ▼
API
   │
   │ Request data
   ▼
Database
   │
   │ Return data
   ▼
API
   │
   │ JSON response
   ▼
Client
```

---

## 📁 Project Structure

A possible organization for the studies is:

```text
Java-Basic-Commands/
│
├── src/
│   ├── fundamentals/
│   ├── input_data/
│   ├── variables/
│   ├── operators/
│   ├── conditionals/
│   ├── switch_case/
│   ├── loops/
│   ├── methods/
│   ├── arrays/
│   ├── strings/
│
│   ├── oop/
│   │   ├── classes_objects/
│   │   ├── encapsulation/
│   │   ├── inheritance/
│   │   └── polymorphism/
│
│   ├── database/
│   ├── apis/
│   └── exercises/
│
└── README.md
```

The structure above is only a **suggestion for organization**.

The final structure can be adapted as the project grows and new topics are added.

---

## ⚙️ Technologies Used

The studies in this project may involve:

* **Java**
* **JDK**
* **MySQL**
* **Spring Boot**
* **SQL**
* **Git and GitHub**

The specific versions of the technologies are not defined in this README.

---

## 💻 Requirements

To run the Java examples, you need:

* JDK installed;
* A Java-compatible IDE or terminal;
* Environment variables configured when necessary.

To check the Java version:

```bash
java -version
```

To check the Java compiler:

```bash
javac -version
```

For examples that use databases, the corresponding database environment must also be configured.

---

## ▶️ How to Run

### Using the Terminal

Navigate to the folder containing the Java file:

```bash
cd path/to/project
```

Compile the program:

```bash
javac FileName.java
```

Run the program:

```bash
java FileName
```

Example:

```bash
javac Main.java
java Main
```

### Using an IDE

The programs can also be executed through a Java-compatible IDE.

In general:

1. Open the project;
2. Find the class containing the `main` method;
3. Open the file;
4. Run the program using the **Run** option;
5. Check the result in the console.

---

## 📝 Exercise Examples

During the studies, exercises may include:

* Calculator;
* Age verification;
* Even and odd numbers;
* Multiplication table;
* Counting using loops;
* Finding the smallest and largest number;
* Grade average;
* Menus using `switch`;
* Data input;
* Array manipulation;
* String manipulation;
* Creating classes;
* Creating objects;
* Encapsulation exercises;
* Inheritance exercises;
* Polymorphism exercises;
* Database exercises;
* API exercises.

> These examples represent possible exercises and do not necessarily mean that all of them are currently available in the repository.

---

## 📈 Study Progress

This project follows a continuous progression through programming concepts. The fundamentals have already been developed, while Object-Oriented Programming, databases, APIs, and system integration continue to be improved.

```text
Fundamentals
     ↓
Programming Logic
     ↓
Java Basics
     ↓
Conditional Structures
     ↓
Loops
     ↓
Methods and Arrays
     ↓
Object-Oriented Programming
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
System Integration
     ↓
More Complete Projects
```

This progression represents knowledge that has already been developed and topics that continue to be improved through practice and the creation of new projects.

---

## 🚀 Roadmap

### ✅ Developed Fundamentals

* [x] Basic Java structure
* [x] Variables
* [x] Data types
* [x] Input and output
* [x] Operators
* [x] Conditional structures
* [x] Loops
* [x] Methods
* [x] Arrays
* [x] Strings

### 🔄 Developed and Being Improved

* [x] Object-Oriented Programming
* [x] Classes and objects
* [x] Constructors
* [x] Encapsulation
* [x] Inheritance
* [x] Polymorphism
* [x] Application organization
* [x] MySQL
* [x] SQL
* [x] CRUD
* [x] Spring Boot
* [x] REST APIs

> The topics in this section have already been studied and developed. The "being improved" status means that these skills continue to be practiced, expanded, and applied in new projects.

### 🎯 Next Improvement Goals

* [ ] Deepen Object-Oriented Programming knowledge
* [ ] Develop applications using Java
* [ ] Improve database integration
* [ ] Develop more complete REST APIs
* [ ] Work with system integration
* [ ] Create more complex projects
* [ ] Apply software development best practices
* [ ] Improve application organization and architecture

> The roadmap is updated as the studies progress and the knowledge is improved.

---

## 📚 Next Topics

The next topics represent areas for further study and expansion of the knowledge already developed:

* Object-Oriented Programming;
* Classes and objects;
* Encapsulation;
* Inheritance;
* Polymorphism;
* Interfaces;
* Collections;
* Exception handling;
* File manipulation;
* Databases;
* SQL;
* CRUD;
* REST APIs;
* Spring Boot;
* System integration.

These topics are already part of the direction of the studies and will continue to be explored and applied as new projects are developed.

---

## 👨‍💻 Author

**Author:** Eduardo Fernandez Evangelista

**GitHub:** [EduardoFernandezEvangelista](https://github.com/EduardoFernandezEvangelista)

---

## 📄 License

This project does not currently have a specific license.

**License:** ``

---

<div align="center">

📚 **Project developed for study, practice, and continuous improvement in Java.**

☕ Java • 🧩 OOP • 🗄️ Database • 🌐 APIs

**Learn → Practice → Improve → Develop → Evolve**

</div>
