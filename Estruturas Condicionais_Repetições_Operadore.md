# ☕ Java — Estruturas Condicionais, Repetições e Operadores

Repositório de estudos dedicado ao aprendizado e à prática das principais **estruturas condicionais, estruturas de repetição e operadores da linguagem Java**.

O objetivo deste material é apresentar os conceitos de forma progressiva, utilizando explicações, sintaxes, exemplos simples, exemplos práticos, comparações e observações sobre erros comuns.

Este conteúdo foi desenvolvido com finalidade **educacional**, funcionando como material de estudo, revisão e consulta durante a evolução no aprendizado da linguagem Java.

---

# 🎯 Sobre o projeto

Estruturas condicionais e estruturas de repetição são fundamentais para controlar o comportamento de um programa.

Elas permitem que uma aplicação:

* Tome decisões;
* Realize cálculos;
* Compare valores;
* Execute determinados trechos somente quando necessário;
* Repita operações;
* Interrompa repetições;
* Ignore determinadas iterações;
* Trabalhe com múltiplos caminhos de execução;
* Organize regras de negócio;
* Controle menus;
* Valide dados;
* Percorra coleções;
* Crie algoritmos mais complexos.

Este material também aborda os principais operadores utilizados dentro dessas estruturas.

---

# 🎯 Objetivos

Os principais objetivos deste estudo são:

* Compreender operadores aritméticos;
* Utilizar adição, subtração, multiplicação, divisão e módulo;
* Compreender incremento e decremento;
* Compreender operadores relacionais;
* Compreender operadores lógicos;
* Conhecer operadores bit a bit;
* Aprender a utilizar `if`;
* Trabalhar com `else`;
* Criar múltiplas condições com `else if`;
* Trabalhar com `if` aninhado;
* Compreender `switch`;
* Utilizar `case`;
* Utilizar `default`;
* Compreender `break`;
* Aprender a sintaxe moderna do `switch` com `->`;
* Trabalhar com `switch expression`;
* Compreender `yield`;
* Utilizar o operador ternário;
* Criar repetições com `while`;
* Compreender loops contínuos com `while (true)`;
* Utilizar `do while`;
* Criar repetições com `for`;
* Percorrer coleções com `for-each`;
* Utilizar `continue`;
* Conhecer labels;
* Utilizar `break` com labels;
* Utilizar `continue` com labels;
* Compreender quando utilizar cada estrutura.

---

# 🧠 Visão geral

Podemos organizar o conteúdo da seguinte maneira:

```text
Controle de Fluxo e Operadores em Java
│
├── Operadores
│   │
│   ├── Aritméticos
│   │   ├── +
│   │   ├── -
│   │   ├── *
│   │   ├── /
│   │   └── %
│   │
│   ├── Relacionais
│   │   ├── ==
│   │   ├── !=
│   │   ├── >
│   │   ├── <
│   │   ├── >=
│   │   └── <=
│   │
│   ├── Lógicos
│   │   ├── &&
│   │   ├── ||
│   │   └── !
│   │
│   └── Bit a bit
│       ├── &
│       ├── |
│       ├── ^
│       └── ~
│
├── Condicionais
│   │
│   ├── if
│   ├── else
│   ├── else if
│   ├── if aninhado
│   ├── switch
│   ├── switch ->
│   ├── switch expression
│   └── operador ternário
│
└── Repetições
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

# ➕ Operadores aritméticos

Operadores aritméticos são utilizados para realizar cálculos matemáticos em Java.

Os principais operadores aritméticos são:

```text
+
-
*
/
%
```

Eles podem ser utilizados com tipos numéricos, como:

```java
int
long
float
double
```

---

## 🔹 Operador `+` — Adição

### O que é?

O operador `+` realiza a soma de dois valores.

### Sintaxe

```java
valor1 + valor2
```

### Exemplo simples

```java
int numero1 = 10;
int numero2 = 5;

int resultado = numero1 + numero2;

System.out.println(resultado);
```

Resultado:

```text
15
```

### Exemplo com números decimais

```java
double preco = 19.90;
double frete = 5.00;

double total = preco + frete;

System.out.println(total);
```

### Concatenação de Strings

O operador `+` também pode concatenar textos.

```java
String nome = "Java";
String mensagem = "Estudando " + nome;

System.out.println(mensagem);
```

Resultado:

```text
Estudando Java
```

Quando uma das partes da expressão é uma `String`, o operador `+` passa a realizar concatenação.

```java
int idade = 20;

System.out.println("Idade: " + idade);
```

Resultado:

```text
Idade: 20
```

---

## 🔹 Operador `-` — Subtração

### O que é?

O operador `-` realiza a subtração de valores.

### Sintaxe

```java
valor1 - valor2
```

### Exemplo

```java
int saldo = 100;
int compra = 35;

int restante = saldo - compra;

System.out.println(restante);
```

Resultado:

```text
65
```

### Exemplo prático

```java
int estoque = 50;
int produtosVendidos = 12;

estoque = estoque - produtosVendidos;

System.out.println("Estoque restante: " + estoque);
```

---

## 🔹 Operador `*` — Multiplicação

### O que é?

O operador `*` realiza a multiplicação de valores.

### Sintaxe

```java
valor1 * valor2
```

### Exemplo

```java
int largura = 10;
int altura = 5;

int area = largura * altura;

System.out.println(area);
```

Resultado:

```text
50
```

### Exemplo prático

```java
double preco = 25.50;
int quantidade = 3;

double total = preco * quantidade;

System.out.println("Total: " + total);
```

---

## 🔹 Operador `/` — Divisão

### O que é?

O operador `/` realiza a divisão entre valores.

### Sintaxe

```java
valor1 / valor2
```

### Divisão inteira

Quando os dois valores são inteiros, o resultado também será inteiro.

```java
int resultado = 10 / 3;

System.out.println(resultado);
```

Resultado:

```text
3
```

A parte decimal é descartada.

### Divisão decimal

Para obter um resultado decimal, pelo menos um dos valores deve ser decimal.

```java
double resultado = 10.0 / 3;

System.out.println(resultado);
```

Resultado aproximado:

```text
3.3333333333333335
```

Também é possível utilizar conversão de tipo:

```java
int numero1 = 10;
int numero2 = 3;

double resultado = (double) numero1 / numero2;

System.out.println(resultado);
```

### ⚠️ Divisão por zero

Não é permitido dividir um número inteiro por zero:

```java
int resultado = 10 / 0;
```

Isso causa:

```text
ArithmeticException
```

Com valores de ponto flutuante, o comportamento pode resultar em `Infinity` ou `NaN`.

---

## 🔹 Operador `%` — Módulo

### O que é?

O operador `%` retorna o resto da divisão inteira.

### Sintaxe

```java
valor1 % valor2
```

### Exemplo

```java
int resto = 10 % 3;

System.out.println(resto);
```

Resultado:

```text
1
```

Porque:

```text
10 ÷ 3 = 3
resto = 1
```

### Verificar se um número é par

```java
int numero = 8;

if (numero % 2 == 0) {
    System.out.println("Número par");
}
```

### Verificar se um número é ímpar

```java
int numero = 7;

if (numero % 2 != 0) {
    System.out.println("Número ímpar");
}
```

### Exemplo prático

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

# 🔼 Incremento e decremento

Além dos operadores aritméticos básicos, Java possui operadores para aumentar ou diminuir uma unidade.

---

## 🔹 Operador `++`

Incrementa o valor em `1`.

```java
int contador = 0;

contador++;

System.out.println(contador);
```

Resultado:

```text
1
```

Também pode ser escrito como:

```java
contador = contador + 1;
```

### Pré-incremento

```java
int numero = 5;

int resultado = ++numero;

System.out.println(numero);
System.out.println(resultado);
```

Resultado:

```text
6
6
```

### Pós-incremento

```java
int numero = 5;

int resultado = numero++;

System.out.println(numero);
System.out.println(resultado);
```

Resultado:

```text
6
5
```

No pós-incremento, o valor atual é utilizado primeiro e incrementado depois.

---

## 🔹 Operador `--`

Decrementa o valor em `1`.

```java
int contador = 5;

contador--;

System.out.println(contador);
```

Resultado:

```text
4
```

Também pode ser escrito como:

```java
contador = contador - 1;
```

### Pré-decremento

```java
int numero = 5;

int resultado = --numero;

System.out.println(numero);
System.out.println(resultado);
```

Resultado:

```text
4
4
```

### Pós-decremento

```java
int numero = 5;

int resultado = numero--;

System.out.println(numero);
System.out.println(resultado);
```

Resultado:

```text
4
5
```

---

# 📊 Resumo dos operadores aritméticos

| Operador | Nome          | Exemplo    | Resultado   |
| -------- | ------------- | ---------- | ----------- |
| `+`      | Adição        | `10 + 5`   | `15`        |
| `-`      | Subtração     | `10 - 5`   | `5`         |
| `*`      | Multiplicação | `10 * 5`   | `50`        |
| `/`      | Divisão       | `10 / 5`   | `2`         |
| `%`      | Módulo        | `10 % 3`   | `1`         |
| `++`     | Incremento    | `numero++` | Soma `1`    |
| `--`     | Decremento    | `numero--` | Subtrai `1` |

---

# 🧮 Precedência dos operadores aritméticos

Quando uma expressão possui vários operadores, Java segue uma ordem de precedência.

A ordem básica é:

```text
1. Parênteses
2. Multiplicação, divisão e módulo
3. Adição e subtração
```

### Exemplo

```java
int resultado = 2 + 3 * 4;

System.out.println(resultado);
```

Resultado:

```text
14
```

A multiplicação é realizada primeiro:

```text
2 + (3 * 4)
2 + 12
14
```

### Utilizando parênteses

```java
int resultado = (2 + 3) * 4;

System.out.println(resultado);
```

Resultado:

```text
20
```

Os parênteses alteram a ordem de execução.

---

# 🔎 Operadores relacionais

Operadores relacionais são utilizados para **comparar valores**.

O resultado de uma comparação será sempre um valor booleano:

```text
true
ou
false
```

---

## 🔹 Operador `==`

### O que é?

O operador `==` verifica igualdade.

### Para que serve?

Permite verificar se dois valores são iguais.

### Sintaxe

```java
valor1 == valor2
```

### Exemplo simples

```java
int numero = 10;

System.out.println(numero == 10);
```

Resultado:

```text
true
```

### Exemplo prático

```java
int senhaDigitada = 1234;
int senhaCorreta = 1234;

if (senhaDigitada == senhaCorreta) {
    System.out.println("Senha correta");
}
```

### ⚠️ Atenção com `String`

Para comparar o conteúdo de Strings, normalmente utilizamos `.equals()`.

Evite:

```java
String nome = "Java";

if (nome == "Java") {
    System.out.println("Igual");
}
```

Prefira:

```java
if (nome.equals("Java")) {
    System.out.println("Igual");
}
```

`==` compara referências quando aplicado a objetos.

---

## 🔹 Operador `!=`

### O que é?

Representa **diferente de**.

### Sintaxe

```java
valor1 != valor2
```

### Exemplo

```java
int idade = 20;

if (idade != 18) {
    System.out.println("A idade não é 18");
}
```

---

## 🔹 Operador `>`

Representa **maior que**.

```java
int idade = 20;

if (idade > 18) {
    System.out.println("Maior que 18");
}
```

---

## 🔹 Operador `<`

Representa **menor que**.

```java
int idade = 16;

if (idade < 18) {
    System.out.println("Menor de idade");
}
```

---

## 🔹 Operador `>=`

Representa **maior ou igual**.

```java
int idade = 18;

if (idade >= 18) {
    System.out.println("Maior de idade");
}
```

---

## 🔹 Operador `<=`

Representa **menor ou igual**.

```java
int temperatura = 0;

if (temperatura <= 0) {
    System.out.println("Temperatura igual ou abaixo de zero");
}
```

---

# 📊 Resumo dos operadores relacionais

| Operador | Significado    |
| -------- | -------------- |
| `==`     | Igual          |
| `!=`     | Diferente      |
| `>`      | Maior          |
| `<`      | Menor          |
| `>=`     | Maior ou igual |
| `<=`     | Menor ou igual |

---

# 🧩 Operadores lógicos

Operadores lógicos permitem combinar condições booleanas.

Os principais são:

```text
&&
||
!
```

---

# 🔹 Operador `&&` — AND

### O que é?

Representa o operador lógico **E**.

Todas as condições precisam ser verdadeiras.

### Sintaxe

```java
condicao1 && condicao2
```

### Exemplo

```java
int idade = 20;
boolean possuiCarteira = true;

if (idade >= 18 && possuiCarteira) {
    System.out.println("Pode dirigir");
}
```

### Funcionamento

```text
true && true   → true
true && false  → false
false && true  → false
false && false → false
```

---

# 🔹 Operador `||` — OR

Representa o operador lógico **OU**.

Basta uma condição ser verdadeira.

```java
boolean administrador = false;
boolean moderador = true;

if (administrador || moderador) {
    System.out.println("Acesso permitido");
}
```

Tabela:

```text
true  || true  → true
true  || false → true
false || true  → true
false || false → false
```

---

# 🔹 Operador `!` — NOT

O operador `!` realiza a negação lógica.

```java
boolean conectado = false;

if (!conectado) {
    System.out.println("Usuário desconectado");
}
```

Temos:

```text
!true  → false
!false → true
```

---

# ⚡ Curto-circuito

`&&` e `||` possuem comportamento de **curto-circuito**.

Exemplo:

```java
if (idade >= 18 && possuiCarteira()) {
    // ...
}
```

Se:

```java
idade >= 18
```

for `false`, o Java não precisa avaliar a segunda condição.

O mesmo acontece com `||`.

Se a primeira condição já for `true`, o resultado da expressão já está determinado.

---

# ⚙️ Operadores bit a bit

Java também possui operadores que trabalham diretamente com bits.

São eles:

```text
&
|
^
~
```

Esses operadores são diferentes dos operadores lógicos de curto-circuito `&&` e `||`.

---

# 🔹 Operador `&` — Bitwise AND

Realiza a operação **AND bit a bit**.

Exemplo:

```java
int a = 5;
int b = 3;

int resultado = a & b;

System.out.println(resultado);
```

Representação:

```text
5 = 0101
3 = 0011
---------
    0001
```

Resultado:

```text
1
```

---

# 🔹 Operador `|` — Bitwise OR

Realiza **OR bit a bit**.

```java
int a = 5;
int b = 3;

int resultado = a | b;
```

Representação:

```text
0101
0011
----
0111
```

Resultado:

```text
7
```

---

# 🔹 Operador `^` — XOR

Representa **OU exclusivo**.

O resultado é `1` quando os bits são diferentes.

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

Resultado:

```text
6
```

---

# 🔹 Operador `~` — Complemento

Inverte os bits de um número.

```java
int numero = 5;

int resultado = ~numero;

System.out.println(resultado);
```

Em Java:

```text
~5 = -6
```

Isso acontece devido à representação binária de números inteiros com sinal.

---

# ⚠️ `&` e `|` com booleanos

`&` e `|` também podem trabalhar com valores booleanos.

Exemplo:

```java
boolean a = true;
boolean b = false;

System.out.println(a & b);
System.out.println(a | b);
```

Porém, diferentemente de `&&` e `||`, eles **não realizam curto-circuito**.

---

# 🔀 `if`

```text
┌───────────────────────────────┐
│ IF                            │
├───────────────────────────────┤
│ O que é? Condicional          │
│ Para que serve? Tomar decisão │
│ Quando usar? Condição simples │
└───────────────────────────────┘
```

## O que é?

`if` é uma estrutura condicional utilizada para executar um bloco de código somente quando uma condição for verdadeira.

### Sintaxe

```java
if (condicao) {
    // código
}
```

### Exemplo simples

```java
int idade = 20;

if (idade >= 18) {
    System.out.println("Maior de idade");
}
```

### Fluxo

```text
Condição
   │
   ▼
É verdadeira?
   │
 ┌─┴─┐
 │   │
Sim Não
 │
 ▼
Executa
```

### Exemplo prático

```java
double saldo = 500;
double compra = 300;

if (saldo >= compra) {
    System.out.println("Compra autorizada");
}
```

### Erro comum

```java
if (idade = 18)
```

Isso está incorreto.

Para comparação:

```java
if (idade == 18)
```

---

# 🔀 `else`

`else` representa o caminho executado quando a condição do `if` é falsa.

### Sintaxe

```java
if (condicao) {
    // verdadeiro
} else {
    // falso
}
```

### Exemplo

```java
int idade = 16;

if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}
```

### Quando usar?

Quando existem dois caminhos principais:

```text
verdadeiro
ou
falso
```

---

# 🔀 `else if`

`else if` permite criar múltiplas verificações.

### Sintaxe

```java
if (condicao1) {

} else if (condicao2) {

} else {

}
```

### Exemplo simples

```java
double nota = 8;

if (nota >= 9) {
    System.out.println("Excelente");
} else if (nota >= 7) {
    System.out.println("Aprovado");
} else if (nota >= 5) {
    System.out.println("Recuperação");
} else {
    System.out.println("Reprovado");
}
```

### Fluxo

```text
Condição 1
   │
   ├── true → executa
   │
   ▼
Condição 2
   │
   ├── true → executa
   │
   ▼
Condição 3
   │
   ├── true → executa
   │
   ▼
else
```

---

# 🧱 `if` aninhado

Um `if` aninhado ocorre quando existe um `if` dentro de outro.

### Exemplo

```java
int idade = 20;
boolean possuiCarteira = true;

if (idade >= 18) {

    if (possuiCarteira) {
        System.out.println("Pode dirigir");
    } else {
        System.out.println("Precisa de habilitação");
    }

} else {
    System.out.println("Menor de idade");
}
```

### Quando usar?

Pode ser útil quando uma condição depende de outra.

### Comparação

Isso:

```java
if (idade >= 18) {
    if (possuiCarteira) {
        System.out.println("Pode dirigir");
    }
}
```

pode muitas vezes ser simplificado para:

```java
if (idade >= 18 && possuiCarteira) {
    System.out.println("Pode dirigir");
}
```

### ⚠️ Erro comum

Criar muitos níveis de `if` aninhado pode prejudicar a legibilidade.

---

# 🎛️ `switch`

`switch` permite escolher um caminho com base no valor de uma expressão.

### Sintaxe tradicional

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

### Exemplo

```java
int opcao = 2;

switch (opcao) {

    case 1:
        System.out.println("Cadastrar");
        break;

    case 2:
        System.out.println("Consultar");
        break;

    case 3:
        System.out.println("Excluir");
        break;

    default:
        System.out.println("Opção inválida");
}
```

---

# 📌 `case`

Cada `case` representa um valor possível.

```java
case 1:
    System.out.println("Opção 1");
    break;
```

O `switch` compara o valor recebido com cada `case`.

---

# 📌 `default`

`default` é executado quando nenhum `case` corresponde ao valor recebido.

```java
default:
    System.out.println("Opção inválida");
```

Ele funciona de forma semelhante ao `else`.

---

# 🛑 `break`

Dentro do `switch` tradicional, `break` encerra a execução do bloco correspondente.

Exemplo:

```java
case 1:
    System.out.println("Cadastrar");
    break;
```

Sem `break`, pode ocorrer **fall-through**:

```java
int valor = 1;

switch (valor) {

    case 1:
        System.out.println("Um");

    case 2:
        System.out.println("Dois");
}
```

Resultado:

```text
Um
Dois
```

Isso acontece porque a execução continua no próximo `case`.

---

# ➡️ `switch` com `->`

Versões modernas do Java permitem utilizar `->`.

### Exemplo

```java
int opcao = 2;

switch (opcao) {

    case 1 -> System.out.println("Cadastrar");

    case 2 -> System.out.println("Consultar");

    case 3 -> System.out.println("Excluir");

    default -> System.out.println("Opção inválida");
}
```

### Vantagens

* Mais compacto;
* Evita fall-through acidental;
* Não exige `break` para cada caso.

---

# 🧠 `switch expression`

O `switch` moderno também pode retornar um valor.

### Exemplo

```java
int numero = 2;

String resultado = switch (numero) {

    case 1 -> "Um";

    case 2 -> "Dois";

    case 3 -> "Três";

    default -> "Desconhecido";
};

System.out.println(resultado);
```

Resultado:

```text
Dois
```

### Comparação

Forma tradicional:

```java
String resultado;

switch (numero) {

    case 1:
        resultado = "Um";
        break;

    case 2:
        resultado = "Dois";
        break;

    default:
        resultado = "Desconhecido";
}
```

Forma moderna:

```java
String resultado = switch (numero) {
    case 1 -> "Um";
    case 2 -> "Dois";
    default -> "Desconhecido";
};
```

---

# 📤 `yield`

`yield` é utilizado dentro de determinados blocos de um `switch expression` para retornar um valor.

### Exemplo

```java
int numero = 2;

String resultado = switch (numero) {

    case 1 -> "Um";

    case 2 -> {
        System.out.println("Processando...");
        yield "Dois";
    }

    default -> "Outro";
};
```

### Por que utilizar?

Quando o `case` precisa executar mais de uma instrução antes de produzir o resultado.

Exemplo:

```java
int nota = 8;

String status = switch (nota) {

    case 10 -> "Perfeito";

    case 8, 9 -> {
        System.out.println("Ótimo desempenho");
        yield "Aprovado";
    }

    default -> "Verificar resultado";
};
```

---

# ❓ Operador ternário `? :`

O operador ternário permite realizar uma decisão simples em uma única expressão.

### Sintaxe

```java
condicao ? valorSeTrue : valorSeFalse
```

### Exemplo

```java
int idade = 20;

String resultado =
        idade >= 18
        ? "Maior de idade"
        : "Menor de idade";
```

### Equivalente com `if`

```java
String resultado;

if (idade >= 18) {
    resultado = "Maior de idade";
} else {
    resultado = "Menor de idade";
}
```

### Quando usar?

Quando a condição é pequena e simples.

### Evite

Ternários excessivamente complexos:

```java
String resultado =
    idade >= 18
    ? nota >= 7
        ? "A"
        : "B"
    : "C";
```

Isso pode prejudicar a leitura.

---

# 🔁 `while`

`while` repete um bloco enquanto uma condição for verdadeira.

### Sintaxe

```java
while (condicao) {
    // código
}
```

### Exemplo

```java
int contador = 0;

while (contador < 5) {

    System.out.println(contador);

    contador++;
}
```

Resultado:

```text
0
1
2
3
4
```

### Fluxo

```text
Verifica condição
      │
      ▼
   true?
   │    │
 Sim   Não
 │      │
 ▼      ▼
Executa Fim
 │
 └────────→ volta
```

### Erro comum

Esquecer de alterar a variável da condição:

```java
int contador = 0;

while (contador < 5) {
    System.out.println(contador);
}
```

Isso gera um loop infinito.

---

# ♾️ `while (true)`

`while (true)` cria um loop contínuo.

### Exemplo

```java
while (true) {
    System.out.println("Executando...");
}
```

Esse código continuará indefinidamente.

Normalmente utilizamos uma condição com `break`.

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

Resultado:

```text
1
2
3
4
5
```

### Exemplo prático — menu

```java
Scanner scanner = new Scanner(System.in);

while (true) {

    System.out.println("1 - Cadastrar");
    System.out.println("2 - Consultar");
    System.out.println("0 - Sair");

    int opcao = scanner.nextInt();

    if (opcao == 0) {
        break;
    }

    System.out.println(
        "Opção escolhida: " + opcao
    );
}
```

---

# 🔄 `do while`

`do while` executa o bloco **pelo menos uma vez** antes de verificar a condição.

### Sintaxe

```java
do {

    // código

} while (condicao);
```

### Exemplo

```java
int numero = 0;

do {

    System.out.println(numero);

    numero++;

} while (numero < 5);
```

### Diferença para `while`

`while`:

```text
Verifica
   ↓
Executa
```

`do while`:

```text
Executa
   ↓
Verifica
```

### Exemplo importante

```java
int numero = 10;

do {
    System.out.println(numero);
} while (numero < 5);
```

Mesmo com a condição falsa, o programa imprime:

```text
10
```

porque o bloco executa antes da verificação.

---

# 🔂 `for`

`for` é utilizado principalmente quando conhecemos a estrutura da repetição.

### Sintaxe

```java
for (inicializacao; condicao; incremento) {

}
```

### Exemplo

```java
for (int i = 0; i < 5; i++) {

    System.out.println(i);
}
```

### Partes

```text
int i = 0
   ↓
Inicialização

i < 5
   ↓
Condição

i++
   ↓
Atualização
```

### Fluxo

```text
Inicialização
     ↓
Condição
     ↓
Código
     ↓
Atualização
     ↓
Condição novamente
```

---

# 🧮 Exemplo prático — tabuada

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

Resultado:

```text
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
...
5 x 10 = 50
```

---

# 📦 `for-each`

O `for-each` é utilizado principalmente para percorrer arrays e coleções.

### Sintaxe

```java
for (Tipo elemento : colecao) {

}
```

### Exemplo com array

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

### Fluxo

```text
Array
 │
 ├── Ana
 ├── João
 └── Maria
      ↓
Cada elemento
      ↓
Variável nome
```

### Comparação

`for` tradicional:

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

### Quando usar?

Use quando precisa percorrer todos os elementos e não necessita diretamente do índice.

---

# ⏭️ `continue`

`continue` interrompe a iteração atual e passa para a próxima.

### Exemplo

```java
for (int i = 1; i <= 5; i++) {

    if (i == 3) {
        continue;
    }

    System.out.println(i);
}
```

Resultado:

```text
1
2
4
5
```

O número `3` é ignorado.

---

# 🧪 Exemplo prático

Exibir somente números pares:

```java
for (int i = 1; i <= 10; i++) {

    if (i % 2 != 0) {
        continue;
    }

    System.out.println(i);
}
```

Resultado:

```text
2
4
6
8
10
```

---

# 🏷️ Labels

Java permite nomear determinadas estruturas utilizando **labels**.

### Sintaxe

```java
nomeDoLabel:
for (...) {

}
```

Exemplo:

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

Nesse caso:

```text
externo:
```

é um label.

Labels são especialmente úteis com loops aninhados.

---

# 🛑 `break` com label

`break` normalmente encerra apenas o loop mais próximo.

Exemplo:

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

O `break` encerra somente o segundo `for`.

---

## Com label

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

Quando:

```java
break externo;
```

é executado, o loop marcado como:

```java
externo:
```

é encerrado.

### Fluxo

```text
Loop externo
   │
   └── Loop interno
          │
          └── break externo
                    │
                    ▼
             encerra tudo
```

---

# ⏭️ `continue` com label

`continue` também pode trabalhar com labels.

Exemplo:

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

Quando:

```java
continue externo;
```

é executado, a execução continua na **próxima iteração do loop identificado pelo label**.

---

# ⚠️ Labels devem ser usados com cuidado

Apesar de serem válidos, labels podem deixar algoritmos mais difíceis de entender.

Use quando realmente melhorarem o controle de loops aninhados.

Evite transformar o código em uma coleção de saltos difíceis de acompanhar.

---

# 📊 Comparações

## `if` vs `switch`

| Característica                    | `if`             | `switch`                |   |                    |
| --------------------------------- | ---------------- | ----------------------- | - | ------------------ |
| Condições complexas               | ✅                | Limitado                |   |                    |
| Intervalos                        | ✅                | ❌ diretamente           |   |                    |
| Comparação de valores específicos | ✅                | ✅                       |   |                    |
| Múltiplas opções                  | Pode ficar longo | Muito adequado          |   |                    |
| Operadores `&&` / `               |                  | `                       | ✅ | Não da mesma forma |
| Retornar valor diretamente        | Não              | ✅ com switch expression |   |                    |

---

# `while` vs `do while`

| Característica             | `while` | `do while` |
| -------------------------- | ------- | ---------- |
| Verifica antes             | ✅       | ❌          |
| Executa pelo menos uma vez | ❌       | ✅          |
| Condição no início         | ✅       | ❌          |
| Condição no final          | ❌       | ✅          |

---

# `for` vs `while`

| Situação                           | Melhor opção comum  |
| ---------------------------------- | ------------------- |
| Quantidade de repetições conhecida | `for`               |
| Dependência de condição dinâmica   | `while`             |
| Percorrer array                    | `for` ou `for-each` |
| Menu contínuo                      | `while`             |
| Iteração com índice                | `for`               |

---

# `for` vs `for-each`

| Característica                 | `for` | `for-each`    |
| ------------------------------ | ----- | ------------- |
| Acesso ao índice               | ✅     | ❌ diretamente |
| Percorrer todos os elementos   | ✅     | ✅             |
| Sintaxe simples                | Média | ✅             |
| Controle do incremento         | ✅     | ❌             |
| Ideal para leitura de coleções | ✅     | ✅             |

---

# `break` vs `continue`

| Comando    | Função                       |
| ---------- | ---------------------------- |
| `break`    | Encerra o loop               |
| `continue` | Pula apenas a iteração atual |

Exemplo:

```text
break
 ↓
SAI DO LOOP
```

```text
continue
 ↓
PULA ESTA ITERAÇÃO
 ↓
CONTINUA O LOOP
```

---

# `&&` vs `&`

| Operador | Uso                   | Curto-circuito |
| -------- | --------------------- | -------------- |
| `&&`     | Lógica booleana       | ✅              |
| `&`      | Bit a bit ou booleano | ❌              |

---

# `||` vs `|`

| Operador | Uso | Curto-circuito        |                 |   |
| -------- | --- | --------------------- | --------------- | - |
| `        |     | `                     | Lógica booleana | ✅ |
| `        | `   | Bit a bit ou booleano | ❌               |   |

---

# 🧪 Exemplo completo

O exemplo abaixo combina operadores aritméticos, estruturas condicionais e estruturas de repetição.

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
                "1 - Verificar idade"
            );

            System.out.println(
                "2 - Calculadora"
            );

            System.out.println(
                "3 - Mostrar números pares"
            );

            System.out.println(
                "0 - Sair"
            );

            System.out.print(
                "Escolha: "
            );

            int opcao =
                    scanner.nextInt();

            switch (opcao) {

                case 1 -> {

                    System.out.print(
                        "Digite sua idade: "
                    );

                    int idade =
                            scanner.nextInt();

                    if (idade < 0) {

                        System.out.println(
                            "Idade inválida"
                        );

                    } else if (idade < 18) {

                        System.out.println(
                            "Menor de idade"
                        );

                    } else if (
                        idade >= 18 &&
                        idade < 60
                    ) {

                        System.out.println(
                            "Adulto"
                        );

                    } else {

                        System.out.println(
                            "60 anos ou mais"
                        );
                    }
                }

                case 2 -> {

                    System.out.print(
                        "Digite o primeiro número: "
                    );

                    double numero1 =
                            scanner.nextDouble();

                    System.out.print(
                        "Digite o segundo número: "
                    );

                    double numero2 =
                            scanner.nextDouble();

                    System.out.println(
                        "Soma: " +
                        (numero1 + numero2)
                    );

                    System.out.println(
                        "Subtração: " +
                        (numero1 - numero2)
                    );

                    System.out.println(
                        "Multiplicação: " +
                        (numero1 * numero2)
                    );

                    if (numero2 != 0) {

                        System.out.println(
                            "Divisão: " +
                            (numero1 / numero2)
                        );

                        System.out.println(
                            "Módulo: " +
                            (numero1 % numero2)
                        );

                    } else {

                        System.out.println(
                            "Não é possível dividir por zero."
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
                        "Programa encerrado."
                    );

                    scanner.close();

                    return;
                }

                default ->
                    System.out.println(
                        "Opção inválida."
                    );
            }
        }
    }
}
```

Esse exemplo utiliza:

* Operador `+`;
* Operador `-`;
* Operador `*`;
* Operador `/`;
* Operador `%`;
* Operadores relacionais;
* Operador lógico `&&`;
* `while (true)`;
* `switch`;
* `case`;
* `default`;
* `if`;
* `else`;
* `else if`;
* `for`;
* `continue`;
* Entrada de dados;
* Controle de menu.

---

# 📋 Resumo geral

| Estrutura / Operador | Função                                                |              |           |
| -------------------- | ----------------------------------------------------- | ------------ | --------- |
| `+`                  | Adição ou concatenação                                |              |           |
| `-`                  | Subtração                                             |              |           |
| `*`                  | Multiplicação                                         |              |           |
| `/`                  | Divisão                                               |              |           |
| `%`                  | Resto da divisão                                      |              |           |
| `++`                 | Incremento de uma unidade                             |              |           |
| `--`                 | Decremento de uma unidade                             |              |           |
| `if`                 | Executa quando uma condição é verdadeira              |              |           |
| `else`               | Executa quando o `if` é falso                         |              |           |
| `else if`            | Adiciona condições intermediárias                     |              |           |
| `if` aninhado        | Coloca uma condição dentro de outra                   |              |           |
| `switch`             | Seleciona entre diferentes casos                      |              |           |
| `case`               | Representa uma opção no `switch`                      |              |           |
| `default`            | Caminho padrão do `switch`                            |              |           |
| `break`              | Interrompe loop ou estrutura                          |              |           |
| `switch ->`          | Sintaxe moderna do switch                             |              |           |
| `switch expression`  | Switch capaz de produzir valor                        |              |           |
| `yield`              | Produz um valor em bloco de switch expression         |              |           |
| `? :`                | Condicional em forma de expressão                     |              |           |
| `while`              | Repete enquanto uma condição for verdadeira           |              |           |
| `while (true)`       | Cria um loop contínuo                                 |              |           |
| `do while`           | Executa antes de testar a condição                    |              |           |
| `for`                | Loop com inicialização, condição e atualização        |              |           |
| `for-each`           | Percorre arrays e coleções                            |              |           |
| `continue`           | Pula a iteração atual                                 |              |           |
| `label`              | Nomeia um loop ou bloco                               |              |           |
| `break label`        | Encerra uma estrutura identificada                    |              |           |
| `continue label`     | Continua a próxima iteração da estrutura identificada |              |           |
| `==`                 | Igualdade                                             |              |           |
| `!=`                 | Diferença                                             |              |           |
| `>`                  | Maior                                                 |              |           |
| `<`                  | Menor                                                 |              |           |
| `>=`                 | Maior ou igual                                        |              |           |
| `<=`                 | Menor ou igual                                        |              |           |
| `&&`                 | E lógico                                              |              |           |
| `                    |                                                       | `            | OU lógico |
| `!`                  | Negação                                               |              |           |
| `&`                  | AND bit a bit                                         |              |           |
| `                    | `                                                     | OR bit a bit |           |
| `^`                  | XOR                                                   |              |           |
| `~`                  | Complemento bit a bit                                 |              |           |

---

# 🧠 Qual estrutura escolher?

```text
Precisa realizar um cálculo?
        │
        ▼
Operadores aritméticos
        │
        ├── somar
        │      ↓
        │      +
        │
        ├── subtrair
        │      ↓
        │      -
        │
        ├── multiplicar
        │      ↓
        │      *
        │
        ├── dividir
        │      ↓
        │      /
        │
        └── obter o resto
               ↓
               %
```

Para decisões:

```text
Precisa tomar uma decisão?
        │
        ▼
       if
        │
        ├── duas opções
        │      ↓
        │   if / else
        │
        ├── várias condições
        │      ↓
        │   else if
        │
        └── vários valores específicos
               ↓
            switch
```

Para repetições:

```text
Precisa repetir?
      │
      ▼
Quantidade conhecida?
 │             │
Sim           Não
 │             │
 ▼             ▼
for          while
```

Percorrer coleção:

```text
Array / Collection
       ↓
Precisa do índice?
 │             │
Sim           Não
 │             │
 ▼             ▼
for         for-each
```

---

# 🚫 Erros comuns

## 1. Confundir `=` com `==`

Errado:

```java
if (numero = 10) {
}
```

Correto:

```java
if (numero == 10) {
}
```

---

## 2. Dividir inteiros esperando resultado decimal

```java
int resultado = 10 / 3;
```

Resultado:

```text
3
```

Para obter casas decimais:

```java
double resultado = 10.0 / 3;
```

---

## 3. Dividir por zero

Evite:

```java
int resultado = numero / 0;
```

Sempre valide o divisor:

```java
if (divisor != 0) {
    int resultado = numero / divisor;
}
```

---

## 4. Comparar Strings com `==`

Evite:

```java
if (nome == "Java") {
}
```

Prefira:

```java
if ("Java".equals(nome)) {
}
```

---

## 5. Criar loop infinito sem intenção

```java
int contador = 0;

while (contador < 10) {

    System.out.println(contador);
}
```

Faltou:

```java
contador++;
```

---

## 6. Esquecer `break` no switch tradicional

Sem `break`, pode ocorrer fall-through.

---

## 7. Usar `continue` esperando sair do loop

`continue` não encerra o loop.

Para encerrar:

```java
break;
```

---

## 8. Criar muitos `if` aninhados

Sempre que possível, simplifique condições ou extraia responsabilidades para métodos.

---

# 🧭 Hierarquia de decisão

Uma forma de visualizar a evolução desses conceitos:

```text
Variáveis
    ↓
Operadores aritméticos
    ↓
Operadores relacionais
    ↓
Operadores lógicos
    ↓
Condições
    ↓
if / else
    ↓
else if
    ↓
switch
    ↓
Repetições
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
Algoritmos mais complexos
```

---

# 📈 Evolução dos estudos

Esses conceitos formam uma base fundamental para conteúdos mais avançados da linguagem Java.

```text
Variáveis
    ↓
Tipos de dados
    ↓
Operadores aritméticos
    ↓
Operadores relacionais
    ↓
Operadores lógicos
    ↓
Estruturas Condicionais
    ↓
Estruturas de Repetição
    ↓
Métodos
    ↓
Arrays
    ↓
Strings
    ↓
Classes e Objetos
    ↓
Programação Orientada a Objetos
    ↓
Collections
    ↓
Tratamento de Exceções
    ↓
Banco de Dados
    ↓
APIs
    ↓
Aplicações completas
```

O objetivo é continuar utilizando esses fundamentos em projetos cada vez mais estruturados.

---

# ✅ Checklist de conteúdos

## Operadores aritméticos

* [x] Adição `+`
* [x] Subtração `-`
* [x] Multiplicação `*`
* [x] Divisão `/`
* [x] Módulo `%`
* [x] Incremento `++`
* [x] Decremento `--`
* [x] Precedência de operadores

## Condicionais

* [x] `if`
* [x] `else`
* [x] `else if`
* [x] `if` aninhado
* [x] `switch`
* [x] `case`
* [x] `default`
* [x] `break`
* [x] `switch ->`
* [x] `switch expression`
* [x] `yield`
* [x] Operador ternário `? :`

## Repetições

* [x] `while`
* [x] `while (true)`
* [x] `do while`
* [x] `for`
* [x] `for-each`
* [x] `continue`

## Labels

* [x] `label`
* [x] `break` com label
* [x] `continue` com label

## Operadores relacionais

* [x] `==`
* [x] `!=`
* [x] `>`
* [x] `<`
* [x] `>=`
* [x] `<=`

## Operadores lógicos

* [x] `&&`
* [x] `||`
* [x] `!`

## Operadores bit a bit

* [x] `&`
* [x] `|`
* [x] `^`
* [x] `~`

---

# ⚙️ Tecnologias utilizadas

* **Java**
* **JDK**

As versões específicas podem variar conforme o ambiente utilizado durante os estudos.

---

# 💻 Pré-requisitos

Para executar os exemplos deste repositório é necessário possuir:

* JDK instalado;
* IDE compatível com Java ou terminal;
* Ambiente Java configurado.

Verifique a instalação:

```bash
java -version
```

E:

```bash
javac -version
```

---

# ▶️ Como executar

Compile:

```bash
javac Main.java
```

Execute:

```bash
java Main
```

Também é possível executar os exemplos através de uma IDE compatível com Java.

---

# 📝 Exercícios sugeridos

Para praticar os conteúdos deste repositório:

### Operadores aritméticos

* Calculadora básica;
* Soma de dois números;
* Subtração de valores;
* Cálculo de área;
* Cálculo de média;
* Conversão de segundos;
* Verificação de número par ou ímpar;
* Cálculo de desconto;
* Cálculo de juros simples;
* Cálculo de troco.

### Condicionais

* Verificação de maioridade;
* Classificação de notas;
* Maior entre dois números;
* Maior entre três números;
* Verificação de número positivo ou negativo;
* Verificação de par ou ímpar;
* Calculadora;
* Menu com `switch`.

### Repetições

* Contagem crescente;
* Contagem regressiva;
* Tabuada;
* Soma de números;
* Média;
* Fatorial;
* Números pares;
* Números ímpares;
* Sequências numéricas.

### Estruturas combinadas

* Menu interativo;
* Calculadora contínua;
* Sistema simples de login;
* Validação de senha;
* Cadastro repetitivo;
* Busca em arrays;
* Controle de tentativas;
* Menu utilizando `while (true)` e `switch`.

> Estes são exemplos de exercícios possíveis e não significam necessariamente que todos estejam presentes no repositório.

---

# 👨‍💻 Autor

**Eduardo Fernandez Evangelista**

**GitHub:** [EduardoFernandezEvangelista](https://github.com/EduardoFernandezEvangelista)

---

# 📄 Licença

Este projeto ainda não possui uma licença específica definida.

**Licença:** `[ADICIONAR LICENÇA]`

---

<div align="center">

### ☕ Java • Condicionais • Repetições • Operadores

**Aprender → Praticar → Entender → Aplicar → Evoluir**

📚 Material desenvolvido para estudo e evolução contínua em Java.

</div>
