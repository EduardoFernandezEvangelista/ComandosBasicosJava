# ☕ Java — Conditionals, Loops and Operators

Part of the **JavaBasicCommands** project, bringing together the main **flow control features and operators of the Java language**.

The material is organized as a practical reference: essential concepts, syntax, quick-reference tables, and examples small enough to be tested quickly.

---

## Contents

| Category                  | Main features                          |                                |        |
| ------------------------- | -------------------------------------- | ------------------------------ | ------ |
| **Arithmetic operators**  | `+`, `-`, `*`, `/`, `%`                |                                |        |
| **Increment / decrement** | `++`, `--`                             |                                |        |
| **Assignment**            | `=`, `+=`, `-=`, `*=`, `/=`, `%=`      |                                |        |
| **Relational**            | `==`, `!=`, `>`, `<`, `>=`, `<=`       |                                |        |
| **Logical**               | `&&`, `                                |                                | `, `!` |
| **Bitwise**               | `&`, `                                 | `, `^`, `~`, `<<`, `>>`, `>>>` |        |
| **Conditionals**          | `if`, `else if`, `else`, `switch`      |                                |        |
| **Modern switch**         | `->`, `switch expression`, `yield`     |                                |        |
| **Compact conditional**   | ternary operator `? :`                 |                                |        |
| **Loops**                 | `while`, `do while`, `for`, `for-each` |                                |        |
| **Loop control**          | `break`, `continue`                    |                                |        |
| **Labels**                | `break label`, `continue label`        |                                |        |

---

# Operators

Operators are used to perform calculations, comparisons, assignments, and logical operations.

## Arithmetic operators

| Operator | Function       |  Example | Result |
| -------- | -------------- | -------: | -----: |
| `+`      | Addition       | `10 + 3` |   `13` |
| `-`      | Subtraction    | `10 - 3` |    `7` |
| `*`      | Multiplication | `10 * 3` |   `30` |
| `/`      | Division       | `10 / 3` |    `3` |
| `%`      | Remainder      | `10 % 3` |    `1` |

> In an integer division, the result is also an integer.

```java
int resultado = 10 / 3;
System.out.println(resultado); // 3
```

To obtain decimal places:

```java
double resultado = 10.0 / 3;
System.out.println(resultado); // 3.333...
```

The `%` operator is very useful for checking even and odd numbers:

```java
if (numero % 2 == 0) {
    System.out.println("Even");
}
```

---

## Increment and decrement

| Operator | Function      |
| -------- | ------------- |
| `++`     | adds `1`      |
| `--`     | subtracts `1` |

```java
int contador = 0;

contador++;
contador--;

System.out.println(contador);
```

There are also **pre** and **post** forms:

```java
int a = 5;

int x = ++a; // increments before
int y = a++; // increments after
```

---

## Assignment operators

Besides simple assignment, Java has shortened forms:

| Operator | Equivalent  |
| -------- | ----------- |
| `=`      | `a = b`     |
| `+=`     | `a = a + b` |
| `-=`     | `a = a - b` |
| `*=`     | `a = a * b` |
| `/=`     | `a = a / b` |
| `%=`     | `a = a % b` |

Example:

```java
int saldo = 100;

saldo += 50;
saldo -= 20;

System.out.println(saldo); // 130
```

---

# Relational operators

Used to compare values. The result is always `true` or `false`.

| Operator | Meaning          |
| -------- | ---------------- |
| `==`     | equal            |
| `!=`     | different        |
| `>`      | greater than     |
| `<`      | less than        |
| `>=`     | greater or equal |
| `<=`     | less or equal    |

```java
int idade = 20;

System.out.println(idade >= 18); // true
System.out.println(idade == 20); // true
```

### `==` with objects

For primitive types, `==` compares values.

For objects, such as `String`, you should normally compare the content:

```java
String nome = "Java";

if ("Java".equals(nome)) {
    System.out.println("Correct name");
}
```

Avoid using `==` to compare the content of a `String`.

---

# Logical operators

They allow you to combine conditions.

| Operator | Name | Rule                        |    |                                     |
| -------- | ---- | --------------------------- | -- | ----------------------------------- |
| `&&`     | AND  | all conditions must be true |    |                                     |
| `        |      | `                           | OR | at least one condition must be true |
| `!`      | NOT  | reverses the result         |    |                                     |

```java
int idade = 20;
boolean possuiCarteira = true;

if (idade >= 18 && possuiCarteira) {
    System.out.println("Can drive");
}
```

### Short-circuit

`&&` and `||` use short-circuit evaluation.

```java
if (objeto != null && objeto.isValido()) {
    // ...
}
```

If `objeto != null` is false, the second condition will not be evaluated.

---

# Bitwise operators

They work directly with the binary representation of numbers.

| Operator | Operation            |    |
| -------- | -------------------- | -- |
| `&`      | AND                  |    |
| `        | `                    | OR |
| `^`      | XOR                  |    |
| `~`      | complement           |    |
| `<<`     | left shift           |    |
| `>>`     | signed right shift   |    |
| `>>>`    | unsigned right shift |    |

Example:

```java
int a = 5; // 0101
int b = 3; // 0011

System.out.println(a & b); // 1
System.out.println(a | b); // 7
System.out.println(a ^ b); // 6
```

The `&` and `|` operators can also be used with `boolean`, but they do not have the same short-circuit behavior as `&&` and `||`.

---

# Conditional structures

## `if`

Use `if` when an action depends on a condition.

```java
if (idade >= 18) {
    System.out.println("Adult");
}
```

---

## `if / else`

When there are two possible paths:

```java
if (saldo >= valor) {
    System.out.println("Purchase authorized");
} else {
    System.out.println("Insufficient balance");
}
```

---

## `else if`

For multiple conditions:

```java
if (nota >= 9) {
    System.out.println("Excellent");
} else if (nota >= 7) {
    System.out.println("Approved");
} else if (nota >= 5) {
    System.out.println("Recovery");
} else {
    System.out.println("Failed");
}
```

The first true condition stops the sequence.

---

## Nested `if`

An `if` can exist inside another:

```java
if (idade >= 18) {

    if (possuiCarteira) {
        System.out.println("Can drive");
    }

}
```

When the logic can be expressed in a simple way, it is often better to combine the conditions:

```java
if (idade >= 18 && possuiCarteira) {
    System.out.println("Can drive");
}
```

---

# `switch`

It is a good option when the decision depends on **specific values**.

### Traditional form

```java
switch (opcao) {

    case 1:
        System.out.println("Register");
        break;

    case 2:
        System.out.println("Search");
        break;

    case 3:
        System.out.println("Delete");
        break;

    default:
        System.out.println("Invalid option");
}
```

In the traditional `switch`, `break` prevents execution from continuing to the next `case`.

---

## Modern `switch`

The syntax with `->` is more direct and prevents accidental `fall-through`:

```java
switch (opcao) {

    case 1 -> System.out.println("Register");
    case 2 -> System.out.println("Search");
    case 3 -> System.out.println("Delete");
    default -> System.out.println("Invalid option");
}
```

---

## `switch expression`

`switch` can also produce a value:

```java
String resultado = switch (numero) {

    case 1 -> "One";
    case 2 -> "Two";
    case 3 -> "Three";
    default -> "Unknown";
};
```

---

## `yield`

When a `case` has multiple instructions, `yield` allows the block to produce a value:

```java
String resultado = switch (numero) {

    case 1 -> "One";

    case 2 -> {
        System.out.println("Processing...");
        yield "Two";
    }

    default -> "Other";
};
```

---

# Ternary operator

Recommended for simple decisions that need to produce a value.

```java
String status =
        idade >= 18
        ? "Adult"
        : "Minor";
```

It is basically equivalent to:

```java
String status;

if (idade >= 18) {
    status = "Adult";
} else {
    status = "Minor";
}
```

> If the ternary operator becomes difficult to read, prefer `if/else`.

---

# Loop structures

## `while`

Runs while the condition is true.

```java
int contador = 0;

while (contador < 5) {

    System.out.println(contador);

    contador++;
}
```

Use it mainly when the number of repetitions depends on a condition that can change during execution.

---

## `while (true)`

Creates a continuous loop, normally ended with `break`.

```java
while (true) {

    System.out.println("Running...");

    if (condicaoDeSaida) {
        break;
    }
}
```

It is very common in menus and interactive systems.

---

## `do while`

Runs the block at least once.

```java
int opcao;

do {

    System.out.println("1 - Continue");
    System.out.println("0 - Exit");

    opcao = scanner.nextInt();

} while (opcao != 0);
```

Main difference:

| Structure  | When it checks   |
| ---------- | ---------------- |
| `while`    | before execution |
| `do while` | after execution  |

---

# `for`

Ideal when the loop has well-defined initialization, condition, and update.

```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```

Structure:

```text
for (initialization; condition; update)
```

Classic example:

```java
for (int i = 1; i <= 10; i++) {
    System.out.println("5 x " + i + " = " + (5 * i));
}
```

---

# `for-each`

Mainly used to iterate through arrays and collections when the index is not needed.

```java
String[] nomes = {
    "Ana",
    "João",
    "Maria"
};

for (String nome : nomes) {
    System.out.println(nome);
}
```

Comparison:

| Need                          | Structure  |
| ----------------------------- | ---------- |
| Need the index                | `for`      |
| Need to iterate over elements | `for-each` |
| Manual control of increment   | `for`      |
| Simple collection reading     | `for-each` |

---

# `break`

Immediately ends the current loop or `switch`.

```java
for (int i = 0; i < 10; i++) {

    if (i == 5) {
        break;
    }

    System.out.println(i);
}
```

Output:

```text
0
1
2
3
4
```

---

# `continue`

Skips the current iteration and continues with the next one.

```java
for (int i = 1; i <= 10; i++) {

    if (i % 2 != 0) {
        continue;
    }

    System.out.println(i);
}
```

Output:

```text
2
4
6
8
10
```

---

# Labels

Labels allow you to identify loops, mainly in nested structures.

```java
externo:
for (int i = 0; i < 3; i++) {

    for (int j = 0; j < 3; j++) {

        if (i == 1 && j == 1) {
            break externo;
        }

        System.out.println(i + " - " + j);
    }
}
```

It is also possible to use:

```java
continue externo;
```

> Labels are useful in specific cases, but they should be used carefully to avoid making the flow harder to understand.

---

# Which structure should you use?

| Situation                                      | Common choice |
| ---------------------------------------------- | ------------- |
| A simple condition                             | `if`          |
| Two possible paths                             | `if / else`   |
| Multiple conditions                            | `else if`     |
| Multiple specific values                       | `switch`      |
| Simple decision producing a value              | `?:`          |
| Loop with a defined amount/controller          | `for`         |
| Condition-based loop                           | `while`       |
| Must execute at least once                     | `do while`    |
| Iterate through array/collection without index | `for-each`    |
| End a loop                                     | `break`       |
| Skip an iteration                              | `continue`    |

---

# Quick comparison

### Conditionals

| `if`               | `switch`                            |        |        |
| ------------------ | ----------------------------------- | ------ | ------ |
| Complex conditions | Specific values                     |        |        |
| Ranges             | Defined cases                       |        |        |
| `&&`, `            |                                     | `, `!` | `case` |
| More flexibility   | More organized for multiple options |        |        |

### Loops

| `for`                               | `while`            | `do while`             |
| ----------------------------------- | ------------------ | ---------------------- |
| Controlled repetition               | Dynamic condition  | Executes at least once |
| Indexes/counters                    | Menus/conditions   | Input and validation   |
| Initialization + condition + update | Condition at start | Condition at the end   |

---

# Common mistakes

| Problem                              | Correct                     |
| ------------------------------------ | --------------------------- |
| `if (idade = 18)`                    | `if (idade == 18)`          |
| `10 / 3` expecting `3.33`            | `10.0 / 3`                  |
| Comparing `String` with `==`         | `"Java".equals(nome)`       |
| Dividing by zero                     | Validate the divisor        |
| Loop without an update               | Update the control variable |
| Using `continue` to exit the loop    | Use `break`                 |
| Traditional `switch` without `break` | Add `break` when necessary  |
| Many nested `if` statements          | Simplify or extract methods |

---

# Project structure

Inside **JavaBasicCommands**, this content is organized as follows:

```text
JavaBasicCommands/
│
├── Condicionais_Repeticoes_Operadores/
│   │
│   ├── Condicionais/
│   │   └── Examples of conditional structures
│   │
│   ├── Operadores/
│   │   └── Examples of operators
│   │
│   ├── Repeticao/
│   │   └── Examples of loop structures
│   │
│   ├── CondicionaisRepeticoesOperadore.md
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
│   └── VariaveisJava.java
│
├── README.md
└── READMEbr.md
```

The practical examples from this content are organized in the following folders:

* **Condicionais**: examples of conditional structures;
* **Operadores**: examples of Java language operators;
* **Repeticao**: examples of loop structures.

The Portuguese and English files allow you to consult the same content in different languages, while the directories separate the examples by subject.

---

# Running the examples

You need to have a **JDK** configured.

Check:

```bash
java -version
```

```bash
javac -version
```

To compile an example:

```bash
javac Main.java
```

To run:

```bash
java Main
```

You can also run the files directly using an IDE compatible with Java.

---

# About

This directory is part of **JavaBasicCommands**, a study project focused on practicing the fundamentals of the Java language through small, organized, and progressive examples.

**Author:** Eduardo Fernandez Evangelista

**GitHub:** `EduardoFernandezEvangelista`

---

<div align="center">

### ☕ JavaBasicCommands

</div>
