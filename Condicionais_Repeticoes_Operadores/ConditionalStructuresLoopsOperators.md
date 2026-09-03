# ☕ Java — Conditional Structures, Loops and Operators

Repository dedicated to learning and practicing the main **conditional structures, loop structures and operators of the Java language**.

The goal of this material is to present concepts progressively, using explanations, syntax, simple examples, practical examples, comparisons and observations about common mistakes.

This content was developed for **educational purposes**, functioning as study material, review and consultation during your learning journey in the Java language.

---

# 🎯 About the project

Conditional structures and loop structures are fundamental to control the behavior of a program.

They allow an application to:

* Make decisions;
* Perform calculations;
* Compare values;
* Execute certain code sections only when needed;
* Repeat operations;
* Interrupt repetitions;
* Skip certain iterations;
* Work with multiple execution paths;
* Organize business rules;
* Control menus;
* Validate data;
* Traverse collections;
* Create more complex algorithms.

This material also covers the main operators used within these structures.

---

# 🗂️ Code Organization

The example codes for this material are organized in the following folders:

* **Operadores** — Contains all arithmetic, relational, logical and bitwise operator examples in `.java` files
* **Condicionais** — Contains all conditional structure examples (`if`, `else`, `switch`, ternary operator, etc.) in `.java` files
* **Repeticao** — Contains all loop structure examples (`while`, `do while`, `for`, `for-each`, etc.) in `.java` files

Each example is implemented as a separate `.java` file for easy understanding and testing.

---

# 🎯 Objectives

The main objectives of this study are:

* Understand arithmetic operators;
* Use addition, subtraction, multiplication, division and modulo;
* Understand increment and decrement;
* Understand relational operators;
* Understand logical operators;
* Know bitwise operators;
* Learn to use `if`;
* Work with `else`;
* Create multiple conditions with `else if`;
* Work with nested `if`;
* Understand `switch`;
* Use `case`;
* Use `default`;
* Understand `break`;
* Learn the modern syntax of `switch` with `->`;
* Work with `switch expression`;
* Understand `yield`;
* Use the ternary operator;
* Create repetitions with `while`;
* Understand continuous loops with `while (true)`;
* Use `do while`;
* Create repetitions with `for`;
* Traverse collections with `for-each`;
* Use `continue`;
* Know labels;
* Use `break` with labels;
* Use `continue` with labels;
* Understand when to use each structure.

---

# 🧠 Overview

We can organize the content as follows:

```text
Flow Control and Operators in Java
│
├── Operators
│   │
│   ├── Arithmetic
│   │   ├── +
│   │   ├── -
│   │   ├── *
│   │   ├── /
│   │   └── %
│   │
│   ├── Relational
│   │   ├── ==
│   │   ├── !=
│   │   ├── >
│   │   ├── <
│   │   ├── >=
│   │   └── <=
│   │
│   ├── Logical
│   │   ├── &&
│   │   ├── ||
│   │   └── !
│   │
│   └── Bitwise
│       ├── &
│       ├── |
│       ├── ^
│       └── ~
│
├── Conditionals
│   │
│   ├── if
│   ├── else
│   ├── else if
│   ├── nested if
│   ├── switch
│   ├── switch ->
│   ├── switch expression
│   └── ternary operator
│
└── Loops
    │
    ├── while
    ├── while (true)
    ├── do while
    ├── for
    ├── for-each
    ├── break
    ├── continue
    └── labels
```

---

# ➕ Arithmetic Operators

Arithmetic operators are used to perform mathematical calculations in Java.

The main arithmetic operators are:

```text
+
-
*
/
%
```

They can be used with numeric types, such as:

```java
int
long
float
double
```

---

## 🔹 Operator `+` — Addition

### What is it?

The `+` operator performs the sum of two values.

### Syntax

```java
valor1 + valor2
```

### Simple example

```java
int numero1 = 10;
int numero2 = 5;

int resultado = numero1 + numero2;

System.out.println(resultado);
```

Result:

```text
15
```

### Example with decimal numbers

```java
double preco = 19.90;
double frete = 5.00;

double total = preco + frete;

System.out.println(total);
```

### String Concatenation

The `+` operator can also concatenate text.

```java
String nome = "Java";
String mensagem = "Estudando " + nome;

System.out.println(mensagem);
```

Result:

```text
Estudando Java
```

When one part of the expression is a `String`, the `+` operator performs concatenation.

```java
int idade = 20;

System.out.println("Idade: " + idade);
```

Result:

```text
Idade: 20
```

---

## 🔹 Operator `-` — Subtraction

### What is it?

The `-` operator performs the subtraction of values.

### Syntax

```java
valor1 - valor2
```

### Example

```java
int saldo = 100;
int compra = 35;

int restante = saldo - compra;

System.out.println(restante);
```

Result:

```text
65
```

### Practical example

```java
int estoque = 50;
int produtosVendidos = 12;

estoque = estoque - produtosVendidos;

System.out.println("Estoque restante: " + estoque);
```

---

## 🔹 Operator `*` — Multiplication

### What is it?

The `*` operator performs multiplication of values.

### Syntax

```java
valor1 * valor2
```

### Example

```java
int largura = 10;
int altura = 5;

int area = largura * altura;

System.out.println(area);
```

Result:

```text
50
```

### Practical example

```java
double preco = 25.50;
int quantidade = 3;

double total = preco * quantidade;

System.out.println("Total: " + total);
```

---

## 🔹 Operator `/` — Division

### What is it?

The `/` operator performs division between values.

### Syntax

```java
valor1 / valor2
```

### Integer division

When both values are integers, the result will also be an integer.

```java
int resultado = 10 / 3;

System.out.println(resultado);
```

Result:

```text
3
```

The decimal part is discarded.

### Decimal division

To obtain a decimal result, at least one of the values must be decimal.

```java
double resultado = 10.0 / 3;

System.out.println(resultado);
```

Approximate result:

```text
3.3333333333333335
```

It is also possible to use type conversion:

```java
int numero1 = 10;
int numero2 = 3;

double resultado = (double) numero1 / numero2;

System.out.println(resultado);
```

### ⚠️ Division by zero

It is not allowed to divide an integer by zero:

```java
int resultado = 10 / 0;
```

This causes:

```text
ArithmeticException
```

With floating point values, the behavior may result in `Infinity` or `NaN`.

---

## 🔹 Operator `%` — Modulo

### What is it?

The `%` operator returns the remainder of integer division.

### Syntax

```java
valor1 % valor2
```

### Example

```java
int resto = 10 % 3;

System.out.println(resto);
```

Result:

```text
1
```

Because:

```text
10 ÷ 3 = 3
remainder = 1
```

### Check if a number is even

```java
int numero = 8;

if (numero % 2 == 0) {
    System.out.println("Even number");
}
```

### Check if a number is odd

```java
int numero = 7;

if (numero % 2 != 0) {
    System.out.println("Odd number");
}
```

### Practical example

```java
int totalSegundos = 3675;

int horas = totalSegundos / 3600;
int restante = totalSegundos % 3600;

int minutos = restante / 60;
int segundos = restante % 60;

System.out.println(
    horas + "h " +
    minutos + "min " +
    segundos + "s"
);
```

---

# 🔼 Increment and Decrement

In addition to basic arithmetic operators, Java has operators to increase or decrease by one unit.

---

## 🔹 Operator `++`

Increases the value by `1`.

```java
int contador = 0;

contador++;

System.out.println(contador);
```

Result:

```text
1
```

It can also be written as:

```java
contador = contador + 1;
```

### Pre-increment

```java
int numero = 5;

int resultado = ++numero;

System.out.println(numero);
System.out.println(resultado);
```

Result:

```text
6
6
```

### Post-increment

```java
int numero = 5;

int resultado = numero++;

System.out.println(numero);
System.out.println(resultado);
```

Result:

```text
6
5
```

In post-increment, the current value is used first and incremented after.

---

## 🔹 Operator `--`

Decreases the value by `1`.

```java
int contador = 5;

contador--;

System.out.println(contador);
```

Result:

```text
4
```

It can also be written as:

```java
contador = contador - 1;
```

### Pre-decrement

```java
int numero = 5;

int resultado = --numero;

System.out.println(numero);
System.out.println(resultado);
```

Result:

```text
4
4
```

### Post-decrement

```java
int numero = 5;

int resultado = numero--;

System.out.println(numero);
System.out.println(resultado);
```

Result:

```text
4
5
```

---

# 📊 Summary of arithmetic operators

| Operator | Name          | Example    | Result      |
| -------- | ------------- | ---------- | ----------- |
| `+`      | Addition      | `10 + 5`   | `15`        |
| `-`      | Subtraction   | `10 - 5`   | `5`         |
| `*`      | Multiplication| `10 * 5`   | `50`        |
| `/`      | Division      | `10 / 5`   | `2`         |
| `%`      | Modulo        | `10 % 3`   | `1`         |
| `++`     | Increment     | `numero++` | Adds `1`    |
| `--`     | Decrement     | `numero--` | Subtracts `1` |

---

# 🧮 Precedence of arithmetic operators

When an expression has multiple operators, Java follows an order of precedence.

The basic order is:

```text
1. Parentheses
2. Multiplication, division and modulo
3. Addition and subtraction
```

### Example

```java
int resultado = 2 + 3 * 4;

System.out.println(resultado);
```

Result:

```text
14
```

Multiplication is performed first:

```text
2 + (3 * 4)
2 + 12
14
```

### Using parentheses

```java
int resultado = (2 + 3) * 4;

System.out.println(resultado);
```

Result:

```text
20
```

Parentheses change the execution order.

---

# 🔎 Relational Operators

Relational operators are used to **compare values**.

The result of a comparison will always be a boolean value:

```text
true
or
false
```

---

## 🔹 Operator `==`

### What is it?

The `==` operator checks for equality.

### What is it for?

It allows you to check if two values are equal.

### Syntax

```java
valor1 == valor2
```

### Simple example

```java
int numero = 10;

System.out.println(numero == 10);
```

Result:

```text
true
```

### Practical example

```java
int senhaDigitada = 1234;
int senhaCorreta = 1234;

if (senhaDigitada == senhaCorreta) {
    System.out.println("Correct password");
}
```

### ⚠️ Attention with `String`

To compare the content of Strings, we normally use `.equals()`.

Avoid:

```java
String nome = "Java";

if (nome == "Java") {
    System.out.println("Equal");
}
```

Prefer:

```java
if (nome.equals("Java")) {
    System.out.println("Equal");
}
```

`==` compares references when applied to objects.

---

## 🔹 Operator `!=`

### What is it?

Represents **different from**.

### Syntax

```java
valor1 != valor2
```

### Example

```java
int idade = 20;

if (idade != 18) {
    System.out.println("Age is not 18");
}
```

---

## 🔹 Operator `>`

Represents **greater than**.

```java
int idade = 20;

if (idade > 18) {
    System.out.println("Greater than 18");
}
```

---

## 🔹 Operator `<`

Represents **less than**.

```java
int idade = 16;

if (idade < 18) {
    System.out.println("Minor");
}
```

---

## 🔹 Operator `>=`

Represents **greater than or equal**.

```java
int idade = 18;

if (idade >= 18) {
    System.out.println("Adult");
}
```

---

## 🔹 Operator `<=`

Represents **less than or equal**.

```java
int temperatura = 0;

if (temperatura <= 0) {
    System.out.println("Temperature equal to or below zero");
}
```

---

# 📊 Summary of relational operators

| Operator | Meaning        |
| -------- | -------------- |
| `==`     | Equal          |
| `!=`     | Different      |
| `>`      | Greater        |
| `<`      | Less           |
| `>=`     | Greater or equal |
| `<=`     | Less or equal  |

---

# 🧩 Logical Operators

Logical operators allow you to combine boolean conditions.

The main ones are:

```text
&&
||
!
```

---

# 🔹 Operator `&&` — AND

### What is it?

Represents the logical operator **AND**.

All conditions must be true.

### Syntax

```java
condicao1 && condicao2
```

### Example

```java
int idade = 20;
boolean possuiCarteira = true;

if (idade >= 18 && possuiCarteira) {
    System.out.println("Can drive");
}
```

### How it works

```text
true && true   → true
true && false  → false
false && true  → false
false && false → false
```

---

# 🔹 Operator `||` — OR

Represents the logical operator **OR**.

Only one condition needs to be true.

```java
boolean administrador = false;
boolean moderador = true;

if (administrador || moderador) {
    System.out.println("Access granted");
}
```

Table:

```text
true  || true  → true
true  || false → true
false || true  → true
false || false → false
```

---

# 🔹 Operator `!` — NOT

The `!` operator performs logical negation.

```java
boolean conectado = false;

if (!conectado) {
    System.out.println("User disconnected");
}
```

We have:

```text
!true  → false
!false → true
```

---

# ⚡ Short-circuit

`&&` and `||` have **short-circuit** behavior.

Example:

```java
if (idade >= 18 && possuiCarteira()) {
    // ...
}
```

If:

```java
idade >= 18
```

is `false`, Java does not need to evaluate the second condition.

The same happens with `||`.

If the first condition is already `true`, the result of the expression is already determined.

---

# ⚙️ Bitwise Operators

Java also has operators that work directly with bits.

They are:

```text
&
|
^
~
```

These operators are different from the short-circuit logical operators `&&` and `||`.

---

# 🔹 Operator `&` — Bitwise AND

Performs the **AND bit by bit** operation.

Example:

```java
int a = 5;
int b = 3;

int resultado = a & b;

System.out.println(resultado);
```

Representation:

```text
5 = 0101
3 = 0011
---------
    0001
```

Result:

```text
1
```

---

# 🔹 Operator `|` — Bitwise OR

Performs **OR bit by bit**.

```java
int a = 5;
int b = 3;

int resultado = a | b;
```

Representation:

```text
0101
0011
----
0111
```

Result:

```text
7
```

---

# 🔹 Operator `^` — XOR

Represents **exclusive OR**.

The result is `1` when the bits are different.

```java
int a = 5;
int b = 3;

int resultado = a ^ b;
```

```text
0101
0011
----
0110
```

Result:

```text
6
```

---

# 🔹 Operator `~` — Complement

Inverts the bits of a number.

```java
int numero = 5;

int resultado = ~numero;

System.out.println(resultado);
```

In Java:

```text
~5 = -6
```

This happens due to the binary representation of signed integers.

---

# ⚠️ `&` and `|` with booleans

`&` and `|` can also work with boolean values.

Example:

```java
boolean a = true;
boolean b = false;

System.out.println(a & b);
System.out.println(a | b);
```

However, unlike `&&` and `||`, they **do not perform short-circuit**.

---

# 🔀 `if`

```text
┌───────────────────────────────┐
│ IF                            │
├───────────────────────────────┤
│ What is it? Conditional       │
│ What is it for? Make decision │
│ When to use? Simple condition │
└───────────────────────────────┘
```

## What is it?

`if` is a conditional structure used to execute a block of code only when a condition is true.

### Syntax

```java
if (condicao) {
    // código
}
```

### Simple example

```java
int idade = 20;

if (idade >= 18) {
    System.out.println("Adult");
}
```

### Flow

```text
Condition
   │
   ▼
Is it true?
   │
 ┌─┴─┐
 │   │
Yes No
 │
 ▼
Execute
```

### Practical example

```java
double saldo = 500;
double compra = 300;

if (saldo >= compra) {
    System.out.println("Purchase authorized");
}
```

### Common mistake

```java
if (idade = 18)
```

This is incorrect.

For comparison:

```java
if (idade == 18)
```

---

# 🔀 `else`

`else` represents the path executed when the `if` condition is false.

### Syntax

```java
if (condicao) {
    // true
} else {
    // false
}
```

### Example

```java
int idade = 16;

if (idade >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}
```

### When to use?

When there are two main paths:

```text
true
or
false
```

---

# 🔀 `else if`

`else if` allows you to create multiple checks.

### Syntax

```java
if (condicao1) {

} else if (condicao2) {

} else {

}
```

### Simple example

```java
double nota = 8;

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

### Flow

```text
Condition 1
   │
   ├── true → execute
   │
   ▼
Condition 2
   │
   ├── true → execute
   │
   ▼
Condition 3
   │
   ├── true → execute
   │
   ▼
else
```

---

# 🧱 Nested `if`

A nested `if` occurs when there is an `if` inside another `if`.

### Example

```java
int idade = 20;
boolean possuiCarteira = true;

if (idade >= 18) {

    if (possuiCarteira) {
        System.out.println("Can drive");
    } else {
        System.out.println("Needs license");
    }

} else {
    System.out.println("Minor");
}
```

### When to use?

Can be useful when one condition depends on another.

### Comparison

This:

```java
if (idade >= 18) {
    if (possuiCarteira) {
        System.out.println("Can drive");
    }
}
```

can often be simplified to:

```java
if (idade >= 18 && possuiCarteira) {
    System.out.println("Can drive");
}
```

### ⚠️ Common mistake

Creating many levels of nested `if` can hurt readability.

---

# 🎛️ `switch`

`switch` allows you to choose a path based on the value of an expression.

### Traditional syntax

```java
switch (valor) {

    case valor1:
        // código
        break;

    case valor2:
        // código
        break;

    default:
        // código
}
```

### Example

```java
int opcao = 2;

switch (opcao) {

    case 1:
        System.out.println("Register");
        break;

    case 2:
        System.out.println("Consult");
        break;

    case 3:
        System.out.println("Delete");
        break;

    default:
        System.out.println("Invalid option");
}
```

---

# 📌 `case`

Each `case` represents a possible value.

```java
case 1:
    System.out.println("Option 1");
    break;
```

The `switch` compares the received value with each `case`.

---

# 📌 `default`

`default` is executed when no `case` matches the received value.

```java
default:
    System.out.println("Invalid option");
```

It works similarly to `else`.

---

# 🛑 `break`

Inside the traditional `switch`, `break` ends the execution of the corresponding block.

Example:

```java
case 1:
    System.out.println("Register");
    break;
```

Without `break`, **fall-through** can occur:

```java
int valor = 1;

switch (valor) {

    case 1:
        System.out.println("One");

    case 2:
        System.out.println("Two");
}
```

Result:

```text
One
Two
```

This happens because execution continues to the next `case`.

---

# ➡️ `switch` with `->`

Modern versions of Java allow using `->`.

### Example

```java
int opcao = 2;

switch (opcao) {

    case 1 -> System.out.println("Register");

    case 2 -> System.out.println("Consult");

    case 3 -> System.out.println("Delete");

    default -> System.out.println("Invalid option");
}
```

### Advantages

* More compact;
* Avoids accidental fall-through;
* Does not require `break` for each case.

---

# 🧠 `switch expression`

Modern `switch` can also return a value.

### Example

```java
int numero = 2;

String resultado = switch (numero) {

    case 1 -> "One";

    case 2 -> "Two";

    case 3 -> "Three";

    default -> "Unknown";
};

System.out.println(resultado);
```

Result:

```text
Two
```

### Comparison

Traditional form:

```java
String resultado;

switch (numero) {

    case 1:
        resultado = "One";
        break;

    case 2:
        resultado = "Two";
        break;

    default:
        resultado = "Unknown";
}
```

Modern form:

```java
String resultado = switch (numero) {
    case 1 -> "One";
    case 2 -> "Two";
    default -> "Unknown";
};
```

---

# 📤 `yield`

`yield` is used inside certain blocks of a `switch expression` to return a value.

### Example

```java
int numero = 2;

String resultado = switch (numero) {

    case 1 -> "One";

    case 2 -> {
        System.out.println("Processing...");
        yield "Two";
    }

    default -> "Other";
};
```

### Why use it?

When the `case` needs to execute more than one instruction before producing the result.

Example:

```java
int nota = 8;

String status = switch (nota) {

    case 10 -> "Perfect";

    case 8, 9 -> {
        System.out.println("Great performance");
        yield "Approved";
    }

    default -> "Check result";
};
```

---

# ❓ Ternary Operator `? :`

The ternary operator allows you to make a simple decision in a single expression.

### Syntax

```java
condicao ? valorSeTrue : valorSeFalse
```

### Example

```java
int idade = 20;

String resultado =
        idade >= 18
        ? "Adult"
        : "Minor";
```

### Equivalent with `if`

```java
String resultado;

if (idade >= 18) {
    resultado = "Adult";
} else {
    resultado = "Minor";
}
```

### When to use?

When the condition is small and simple.

### Avoid

Excessively complex ternaries:

```java
String resultado =
    idade >= 18
    ? nota >= 7
        ? "A"
        : "B"
    : "C";
```

This can hurt readability.

---

# 🔁 `while`

`while` repeats a block while a condition is true.

### Syntax

```java
while (condicao) {
    // código
}
```

### Example

```java
int contador = 0;

while (contador < 5) {

    System.out.println(contador);

    contador++;
}
```

Result:

```text
0
1
2
3
4
```

### Flow

```text
Check condition
      │
      ▼
   true?
   │    │
 Yes   No
 │      │
 ▼      ▼
Execute End
 │
 └────────→ back
```

### Common mistake

Forgetting to change the condition variable:

```java
int contador = 0;

while (contador < 5) {
    System.out.println(contador);
}
```

This generates an infinite loop.

---

# ♾️ `while (true)`

`while (true)` creates a continuous loop.

### Example

```java
while (true) {
    System.out.println("Running...");
}
```

This code will continue indefinitely.

We normally use a condition with `break`.

```java
int numero = 0;

while (true) {

    numero++;

    System.out.println(numero);

    if (numero == 5) {
        break;
    }
}
```

Result:

```text
1
2
3
4
5
```

### Practical example — menu

```java
Scanner scanner = new Scanner(System.in);

while (true) {

    System.out.println("1 - Register");
    System.out.println("2 - Consult");
    System.out.println("0 - Exit");

    int opcao = scanner.nextInt();

    if (opcao == 0) {
        break;
    }

    System.out.println(
        "Chosen option: " + opcao
    );
}
```

---

# 🔄 `do while`

`do while` executes the block **at least once** before checking the condition.

### Syntax

```java
do {

    // código

} while (condicao);
```

### Example

```java
int numero = 0;

do {

    System.out.println(numero);

    numero++;

} while (numero < 5);
```

### Difference from `while`

`while`:

```text
Check
   ↓
Execute
```

`do while`:

```text
Execute
   ↓
Check
```

### Important example

```java
int numero = 10;

do {
    System.out.println(numero);
} while (numero < 5);
```

Even with the condition being false, the program prints:

```text
10
```

because the block executes before the check.

---

# 🔂 `for`

`for` is used mainly when we know the structure of the repetition.

### Syntax

```java
for (inicializacao; condicao; incremento) {

}
```

### Example

```java
for (int i = 0; i < 5; i++) {

    System.out.println(i);
}
```

### Parts

```text
int i = 0
   ↓
Initialization

i < 5
   ↓
Condition

i++
   ↓
Update
```

### Flow

```text
Initialization
     ↓
Condition
     ↓
Code
     ↓
Update
     ↓
Condition again
```

---

# 🧮 Practical example — multiplication table

```java
int numero = 5;

for (int i = 1; i <= 10; i++) {

    System.out.println(
        numero + " x " +
        i + " = " +
        (numero * i)
    );
}
```

Result:

```text
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
...
5 x 10 = 50
```

---

# 📦 `for-each`

`for-each` is used mainly to traverse arrays and collections.

### Syntax

```java
for (Tipo elemento : colecao) {

}
```

### Example with array

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

### Flow

```text
Array
 │
 ├── Ana
 ├── João
 └── Maria
      ↓
Each element
      ↓
Variable name
```

### Comparison

Traditional `for`:

```java
for (int i = 0; i < nomes.length; i++) {

    System.out.println(
        nomes[i]
    );
}
```

`for-each`:

```java
for (String nome : nomes) {

    System.out.println(nome);
}
```

### When to use?

Use when you need to traverse all elements and don't directly need the index.

---

# ⏭️ `continue`

`continue` interrupts the current iteration and moves to the next one.

### Example

```java
for (int i = 1; i <= 5; i++) {

    if (i == 3) {
        continue;
    }

    System.out.println(i);
}
```

Result:

```text
1
2
4
5
```

The number `3` is skipped.

---

# 🧪 Practical example

Display only even numbers:

```java
for (int i = 1; i <= 10; i++) {

    if (i % 2 != 0) {
        continue;
    }

    System.out.println(i);
}
```

Result:

```text
2
4
6
8
10
```

---

# 🏷️ Labels

Java allows naming certain structures using **labels**.

### Syntax

```java
nomeDoLabel:
for (...) {

}
```

Example:

```java
externo:
for (int i = 0; i < 3; i++) {

    for (int j = 0; j < 3; j++) {

        System.out.println(
            i + " - " + j
        );
    }
}
```

In this case:

```text
externo:
```

is a label.

Labels are especially useful with nested loops.

---

# 🛑 `break` with label

`break` normally exits only the closest loop.

Example:

```java
for (int i = 0; i < 3; i++) {

    for (int j = 0; j < 3; j++) {

        if (j == 1) {
            break;
        }

        System.out.println(
            i + " " + j
        );
    }
}
```

The `break` exits only the second `for`.

---

## With label

```java
externo:
for (int i = 0; i < 3; i++) {

    for (int j = 0; j < 3; j++) {

        if (i == 1 && j == 1) {

            break externo;
        }

        System.out.println(
            i + " " + j
        );
    }
}
```

When:

```java
break externo;
```

is executed, the loop marked as:

```java
externo:
```

is exited.

### Flow

```text
Outer loop
   │
   └── Inner loop
          │
          └── break externo
                    │
                    ▼
             exit everything
```

---

# ⏭️ `continue` with label

`continue` can also work with labels.

Example:

```java
externo:
for (int i = 0; i < 3; i++) {

    for (int j = 0; j < 3; j++) {

        if (j == 1) {

            continue externo;
        }

        System.out.println(
            i + " " + j
        );
    }
}
```

When:

```java
continue externo;
```

is executed, execution continues to the **next iteration of the loop identified by the label**.

---

# ⚠️ Labels should be used carefully

Although valid, labels can make algorithms harder to understand.

Use when they really improve control of nested loops.

Avoid turning the code into a collection of jumps that are hard to follow.

---

# 📊 Comparisons

## `if` vs `switch`

| Characteristic                     | `if`             | `switch`                |
| ---------------------------------- | ---------------- | ----------------------- |
| Complex conditions                 | ✅                | Limited                 |
| Ranges                             | ✅                | ❌ directly              |
| Comparison of specific values      | ✅                | ✅                       |
| Multiple options                   | Can get long     | Very suitable           |
| Operators `&&` / `                 | ` ✅              | Not in the same way     |
| Return value directly              | No               | ✅ with switch expression |

---

# `while` vs `do while`

| Characteristic             | `while` | `do while` |
| -------------------------- | ------- | ---------- |
| Checks before              | ✅       | ❌          |
| Executes at least once     | ❌       | ✅          |
| Condition at beginning     | ✅       | ❌          |
| Condition at end           | ❌       | ✅          |

---

# `for` vs `while`

| Situation                           | Better common option |
| ---------------------------------- | ------------------- |
| Known quantity of repetitions      | `for`               |
| Dependence on dynamic condition    | `while`             |
| Traverse array                     | `for` or `for-each` |
| Continuous menu                    | `while`             |
| Iteration with index               | `for`               |

---

# `for` vs `for-each`

| Characteristic                 | `for` | `for-each`    |
| ------------------------------ | ----- | ------------- |
| Access to index                | ✅     | ❌ directly   |
| Traverse all elements          | ✅     | ✅             |
| Simple syntax                  | Medium| ✅             |
| Control of increment           | ✅     | ❌             |
| Ideal for reading collections  | ✅     | ✅             |

---

# `break` vs `continue`

| Command    | Function                       |
| ---------- | ------------------------------ |
| `break`    | Exits the loop                 |
| `continue` | Skips only the current iteration |

Example:

```text
break
 ↓
EXITS THE LOOP
```

```text
continue
 ↓
SKIPS THIS ITERATION
 ↓
CONTINUES THE LOOP
```

---

# `&&` vs `&`

| Operator | Usage                 | Short-circuit |
| -------- | --------------------- | ------------- |
| `&&`     | Boolean logic         | ✅             |
| `&`      | Bitwise or boolean    | ❌             |

---

# `||` vs `|`

| Operator | Usage                 | Short-circuit |
| -------- | --------------------- | ------------- |
| `        |                     ` | Boolean logic | ✅ |
| `        | `                     | Bitwise or boolean | ❌ |

---

# 🧪 Complete example

The example below combines arithmetic operators, conditional structures and loop structures.

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner =
                new Scanner(System.in);

        while (true) {

            System.out.println(
                "\n=== MENU ==="
            );

            System.out.println(
                "1 - Check age"
            );

            System.out.println(
                "2 - Calculator"
            );

            System.out.println(
                "3 - Show even numbers"
            );

            System.out.println(
                "0 - Exit"
            );

            System.out.print(
                "Choose: "
            );

            int opcao =
                    scanner.nextInt();

            switch (opcao) {

                case 1 -> {

                    System.out.print(
                        "Enter your age: "
                    );

                    int idade =
                            scanner.nextInt();

                    if (idade < 0) {

                        System.out.println(
                            "Invalid age"
                        );

                    } else if (idade < 18) {

                        System.out.println(
                            "Minor"
                        );

                    } else if (
                        idade >= 18 &&
                        idade < 60
                    ) {

                        System.out.println(
                            "Adult"
                        );

                    } else {

                        System.out.println(
                            "60 years or older"
                        );
                    }
                }

                case 2 -> {

                    System.out.print(
                        "Enter the first number: "
                    );

                    double numero1 =
                            scanner.nextDouble();

                    System.out.print(
                        "Enter the second number: "
                    );

                    double numero2 =
                            scanner.nextDouble();

                    System.out.println(
                        "Sum: " +
                        (numero1 + numero2)
                    );

                    System.out.println(
                        "Subtraction: " +
                        (numero1 - numero2)
                    );

                    System.out.println(
                        "Multiplication: " +
                        (numero1 * numero2)
                    );

                    if (numero2 != 0) {

                        System.out.println(
                            "Division: " +
                            (numero1 / numero2)
                        );

                        System.out.println(
                            "Modulo: " +
                            (numero1 % numero2)
                        );

                    } else {

                        System.out.println(
                            "Cannot divide by zero."
                        );
                    }
                }

                case 3 -> {

                    for (
                        int i = 1;
                        i <= 20;
                        i++
                    ) {

                        if (i % 2 != 0) {
                            continue;
                        }

                        System.out.println(i);
                    }
                }

                case 0 -> {

                    System.out.println(
                        "Program ended."
                    );

                    scanner.close();

                    return;
                }

                default ->
                    System.out.println(
                        "Invalid option."
                    );
            }
        }
    }
}
```

This example uses:

* `+` operator;
* `-` operator;
* `*` operator;
* `/` operator;
* `%` operator;
* Relational operators;
* Logical operator `&&`;
* `while (true)`;
* `switch`;
* `case`;
* `default`;
* `if`;
* `else`;
* `else if`;
* `for`;
* `continue`;
* Data input;
* Menu control.

---

# 📋 General summary

| Structure / Operator | Function                                                |
| -------------------- | ----------------------------------------------------- |
| `+`                  | Addition or concatenation                             |
| `-`                  | Subtraction                                           |
| `*`                  | Multiplication                                        |
| `/`                  | Division                                              |
| `%`                  | Remainder of division                                 |
| `++`                 | Increment by one unit                                 |
| `--`                 | Decrement by one unit                                 |
| `if`                 | Executes when a condition is true                     |
| `else`               | Executes when `if` is false                           |
| `else if`            | Adds intermediate conditions                          |
| Nested `if`          | Puts one condition inside another                     |
| `switch`             | Selects between different cases                       |
| `case`               | Represents an option in `switch`                      |
| `default`            | Default path of `switch`                              |
| `break`              | Interrupts loop or structure                          |
| `switch ->`          | Modern syntax of switch                               |
| `switch expression`  | Switch capable of producing value                     |
| `yield`              | Produces a value in block of switch expression        |
| `? :`                | Conditional in form of expression                     |
| `while`              | Repeats while a condition is true                     |
| `while (true)`       | Creates a continuous loop                             |
| `do while`           | Executes before testing the condition                 |
| `for`                | Loop with initialization, condition and update        |
| `for-each`           | Traverses arrays and collections                      |
| `continue`           | Skips the current iteration                           |
| `label`              | Names a loop or block                                 |
| `break label`        | Exits an identified structure                         |
| `continue label`     | Continues the next iteration of the identified structure |
| `==`                 | Equality                                              |
| `!=`                 | Difference                                            |
| `>`                  | Greater                                               |
| `<`                  | Less                                                  |
| `>=`                 | Greater or equal                                      |
| `<=`                 | Less or equal                                         |
| `&&`                 | Logical AND                                           |
| `                    | `                                                     | Logical OR |
| `!`                  | Negation                                              |
| `&`                  | Bitwise AND                                           |
| `                    | `                                                     | Bitwise OR |
| `^`                  | XOR                                                   |
| `~`                  | Bitwise complement                                    |

---

# 🧠 Which structure to choose?

```text
Need to perform a calculation?
        │
        ▼
Arithmetic operators
        │
        ├── add
        │      ↓
        │      +
        │
        ├── subtract
        │      ↓
        │      -
        │
        ├── multiply
        │      ↓
        │      *
        │
        ├── divide
        │      ↓
        │      /
        │
        └── get the remainder
               ↓
               %
```

For decisions:

```text
Need to make a decision?
        │
        ▼
       if
        │
        ├── two options
        │      ↓
        │   if / else
        │
        ├── various conditions
        │      ↓
        │   else if
        │
        └── various specific values
               ↓
            switch
```

For repetitions:

```text
Need to repeat?
      │
      ▼
Known quantity?
 │             │
Yes           No
 │             │
 ▼             ▼
for          while
```

Traverse collection:

```text
Array / Collection
       ↓
Need the index?
 │             │
Yes           No
 │             │
 ▼             ▼
for         for-each
```

---

# 🚫 Common mistakes

## 1. Confusing `=` with `==`

Wrong:

```java
if (numero = 10) {
}
```

Correct:

```java
if (numero == 10) {
}
```

---

## 2. Dividing integers expecting decimal result

```java
int resultado = 10 / 3;
```

Result:

```text
3
```

To get decimal places:

```java
double resultado = 10.0 / 3;
```

---

## 3. Dividing by zero

Avoid:

```java
int resultado = numero / 0;
```

Always validate the divisor:

```java
if (divisor != 0) {
    int resultado = numero / divisor;
}
```

---

## 4. Comparing Strings with `==`

Avoid:

```java
if (nome == "Java") {
}
```

Prefer:

```java
if ("Java".equals(nome)) {
}
```

---

## 5. Creating an infinite loop unintentionally

```java
int contador = 0;

while (contador < 10) {

    System.out.println(contador);
}
```

Missing:

```java
contador++;
```

---

## 6. Forgetting `break` in traditional switch

Without `break`, fall-through can occur.

---

## 7. Using `continue` expecting to exit the loop

`continue` does not exit the loop.

To exit:

```java
break;
```

---

## 8. Creating many nested `if`

Whenever possible, simplify conditions or extract responsibilities to methods.

---

# 🧭 Decision hierarchy

A way to visualize the evolution of these concepts:

```text
Variables
    ↓
Arithmetic operators
    ↓
Relational operators
    ↓
Logical operators
    ↓
Conditions
    ↓
if / else
    ↓
else if
    ↓
switch
    ↓
Loops
    ↓
while / do while
    ↓
for
    ↓
for-each
    ↓
break / continue
    ↓
labels
    ↓
More complex algorithms
```

---

# 📈 Study evolution

These concepts form a fundamental foundation for more advanced topics in the Java language.

```text
Variables
    ↓
Data types
    ↓
Arithmetic operators
    ↓
Relational operators
    ↓
Logical operators
    ↓
Conditional Structures
    ↓
Loop Structures
    ↓
Methods
    ↓
Arrays
    ↓
Strings
    ↓
Classes and Objects
    ↓
Object-Oriented Programming
    ↓
Collections
    ↓
Exception Handling
    ↓
Database
    ↓
APIs
    ↓
Complete applications
```

The goal is to continue using these foundations in increasingly structured projects.

---

# ✅ Content checklist

## Arithmetic operators

* [x] Addition `+`
* [x] Subtraction `-`
* [x] Multiplication `*`
* [x] Division `/`
* [x] Modulo `%`
* [x] Increment `++`
* [x] Decrement `--`
* [x] Operator precedence

## Conditionals

* [x] `if`
* [x] `else`
* [x] `else if`
* [x] Nested `if`
* [x] `switch`
* [x] `case`
* [x] `default`
* [x] `break`
* [x] `switch ->`
* [x] `switch expression`
* [x] `yield`
* [x] Ternary operator `? :`

## Loops

* [x] `while`
* [x] `while (true)`
* [x] `do while`
* [x] `for`
* [x] `for-each`
* [x] `continue`

## Labels

* [x] `label`
* [x] `break` with label
* [x] `continue` with label

## Relational operators

* [x] `==`
* [x] `!=`
* [x] `>`
* [x] `<`
* [x] `>=`
* [x] `<=`

## Logical operators

* [x] `&&`
* [x] `||`
* [x] `!`

## Bitwise operators

* [x] `&`
* [x] `|`
* [x] `^`
* [x] `~`

---

# ⚙️ Technologies used

* **Java**
* **JDK**

Specific versions may vary depending on the environment used during studies.

---

# 💻 Prerequisites

To run the examples in this repository, you need to have:

* JDK installed;
* IDE compatible with Java or terminal;
* Java environment configured.

Check the installation:

```bash
java -version
```

And:

```bash
javac -version
```

---

# ▶️ How to run

Compile:

```bash
javac Main.java
```

Execute:

```bash
java Main
```

It is also possible to run the examples through an IDE compatible with Java.

---

# 📁 Code files organization

The example codes are organized in the following folders:

* **Operadores/** — Contains all arithmetic, relational, logical and bitwise operator examples (.java files)
* **Condicionais/** — Contains all conditional structure examples (if, else, switch, ternary operator, etc.) (.java files)
* **Repeticao/** — Contains all loop structure examples (while, do while, for, for-each, etc.) (.java files)

Each example is implemented as a separate `.java` file for easy understanding and testing.

---

# 📝 Suggested exercises

To practice the content in this repository:

### Arithmetic operators

* Basic calculator;
* Sum of two numbers;
* Subtraction of values;
* Area calculation;
* Average calculation;
* Second conversion;
* Check if number is even or odd;
* Discount calculation;
* Simple interest calculation;
* Change calculation.

### Conditionals

* Age verification;
* Grade classification;
* Largest between two numbers;
* Largest between three numbers;
* Check if number is positive or negative;
* Check if number is even or odd;
* Calculator;
* Menu with `switch`.

### Loops

* Growing count;
* Descending count;
* Multiplication table;
* Sum of numbers;
* Average;
* Factorial;
* Even numbers;
* Odd numbers;
* Number sequences.

### Combined structures

* Interactive menu;
* Continuous calculator;
* Simple login system;
* Password validation;
* Repetitive registration;
* Search in arrays;
* Attempt control;
* Menu using `while (true)` and `switch`.

> These are examples of possible exercises and do not necessarily mean that all are present in the repository.

---

# 👨‍💻 Author

**Eduardo Fernandez Evangelista**

**GitHub:** [EduardoFernandezEvangelista](https://github.com/EduardoFernandezEvangelista)

---

# 📄 License

This project does not yet have a specific license defined.

**License:** ``

---

<div align="center">

### ☕ Java • Conditionals • Loops • Operators

**Learn → Practice → Understand → Apply → Evolve**

📚 Material developed for study and continuous evolution in Java.

</div>
