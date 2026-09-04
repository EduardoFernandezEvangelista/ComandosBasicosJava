# ☕ Java — Variáveis e Tipos de Dados

Material de referência sobre **variáveis e tipos de dados em Java**, com exemplos práticos e observações sobre declaração, armazenamento, escopo e utilização de valores.

Este conteúdo faz parte da sequência de estudos de comandos básicos em Java e concentra os exemplos práticos no arquivo `VariaveisJava.java`.

---

## Conteúdo abordado

Aqui reúne os principais aspectos relacionados ao uso de dados em Java, desde os **tipos primitivos** até **tipos de referência, classes Wrapper, constantes, ****`enum`****, ****`var`**** e variáveis associadas a classes e objetos**.

| Tema                    | Conteúdo                                                  |
| ----------------------- | --------------------------------------------------------- |
| Tipos primitivos        | Características e utilização dos 8 tipos primitivos       |
| Tipos de referência     | Referências para objetos, arrays, `String` e outros tipos |
| `String`                | Representação e manipulação de textos                     |
| Arrays                  | Armazenamento de múltiplos valores                        |
| Wrapper                 | Representação de tipos primitivos como objetos            |
| Autoboxing              | Conversão automática de primitivo para Wrapper            |
| Unboxing                | Conversão automática de Wrapper para primitivo            |
| `null`                  | Ausência de referência para um objeto                     |
| Variáveis locais        | Escopo dentro de métodos e blocos                         |
| Variáveis de instância  | Dados pertencentes a objetos                              |
| `static`                | Dados associados à classe                                 |
| `final`                 | Valores que não recebem nova atribuição                   |
| `static final`          | Declaração de constantes                                  |
| Parâmetros              | Valores recebidos por métodos                             |
| Modificadores de acesso | Controle de visibilidade                                  |
| `enum`                  | Representação de conjuntos fixos de valores               |
| Interfaces              | Variáveis declaradas em interfaces                        |
| `var`                   | Inferência do tipo de variáveis locais                    |
| Classes e objetos       | Atributos, métodos e construtores                         |
| `this`                  | Referência à instância atual                              |
| Escopo                  | Região em que uma variável pode ser acessada              |

---

# Tipos de dados em Java

Java possui **tipagem estática**, portanto o tipo de uma variável é definido em tempo de compilação.

De forma geral, os tipos utilizados em Java são organizados em:

```text
Tipos em Java
│
├── Tipos Primitivos
│
└── Tipos de Referência
    │
    ├── Classes
    ├── String
    ├── Arrays
    ├── Enums
    └── Objetos
```

---

## Tipos primitivos

Java possui **8 tipos primitivos**:

| Tipo      | Tamanho        | Descrição                        | Exemplo                      |
| --------- | -------------- | -------------------------------- | ---------------------------- |
| `byte`    | 8 bits         | Inteiro pequeno                  | `byte idade = 18;`           |
| `short`   | 16 bits        | Inteiro                          | `short numero = 1000;`       |
| `int`     | 32 bits        | Inteiro                          | `int idade = 18;`            |
| `long`    | 64 bits        | Inteiro grande                   | `long populacao = 1000000L;` |
| `float`   | 32 bits        | Número decimal                   | `float altura = 1.75f;`      |
| `double`  | 64 bits        | Número decimal de maior precisão | `double preco = 19.99;`      |
| `char`    | 16 bits        | Um caractere Unicode             | `char letra = 'A';`          |
| `boolean` | JVM-dependente | Verdadeiro ou falso              | `boolean ativo = true;`      |

> **Observação:** a especificação Java não define `boolean` como tendo exatamente 1 bit de armazenamento. Sua representação depende da implementação da JVM.

### Exemplo

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

# Intervalo dos tipos numéricos

| Tipo     |                     Mínimo |                    Máximo |
| -------- | -------------------------: | ------------------------: |
| `byte`   |                     `-128` |                     `127` |
| `short`  |                  `-32.768` |                  `32.767` |
| `int`    |                     `-2³¹` |                 `2³¹ - 1` |
| `long`   |                     `-2⁶³` |                 `2⁶³ - 1` |
| `float`  |  Aproximadamente `-3.4E38` |  Aproximadamente `3.4E38` |
| `double` | Aproximadamente `-1.7E308` | Aproximadamente `1.7E308` |

---

# `byte`

Tipo inteiro com representação de **8 bits**.

```text
-128 até 127
```

É adequado para valores inteiros pequenos.

---

# `short`

Tipo inteiro com representação de **16 bits**.

```text
-32.768 até 32.767
```

Embora faça parte da linguagem, seu uso é menos comum que `int`.

---

# `int`

Tipo inteiro com representação de **32 bits** e uma das opções mais utilizadas para valores inteiros.

```java
int idade = 20;
int quantidade = 100;
int resultado = 10 + 20;
```

---

# `long`

Tipo inteiro com representação de **64 bits**, utilizado para valores inteiros maiores.

```java
long populacao = 200000000L;
```

O sufixo `L` identifica o literal como `long`.

---

# `float`

Tipo decimal com representação de **32 bits**.

```java
float altura = 1.75f;
float temperatura = 25.5f;
```

O sufixo `f` indica que o literal deve ser tratado como `float`.

---

# `double`

Tipo decimal com representação de **64 bits**.

```java
double preco = 19.99;
double media = 8.75;
```

Literais decimais são considerados `double` por padrão.

---

# `char`

Representa um único caractere Unicode.

### `char` x `String`

| Tipo     | Exemplo | Representação           |
| -------- | ------- | ----------------------- |
| `char`   | `'A'`   | Um único caractere      |
| `String` | `"A"`   | Sequência de caracteres |

---

# `boolean`

Representa dois estados:

```text
true
false
```

Exemplo:

```java
boolean ligado = true;
boolean aprovado = false;
```

É utilizado em expressões condicionais:

```java
if (aprovado) {
    System.out.println("Aluno aprovado!");
}
```

---

# Tipos de referência

Tipos de referência representam valores relacionados a **objetos**.

Exemplos:

```java
String nome = "Eduardo";

int[] numeros = {1, 2, 3};

Pessoa pessoa = new Pessoa("João", 30);
```

Diferentemente de um tipo primitivo, uma variável de referência armazena uma referência para um objeto.

---

## Principais tipos de referência

| Tipo     | Exemplo                         |
| -------- | ------------------------------- |
| `String` | `String nome = "Java";`         |
| Array    | `int[] numeros = {1, 2, 3};`    |
| Classe   | `Pessoa pessoa = new Pessoa();` |
| `enum`   | `Dia dia = Dia.SEGUNDA;`        |
| Wrapper  | `Integer idade = 18;`           |

---

# `String`

`String` representa uma sequência de caracteres.

```java
String nome = "Eduardo";
String mensagem = "Olá, mundo!";
```

É diferente de `char`:

```java
char letra = 'A';

String palavra = "Java";
```

| Tipo     | Aspas | Quantidade                  |
| -------- | ----- | --------------------------- |
| `char`   | `' '` | Um caractere                |
| `String` | `" "` | Uma sequência de caracteres |

---

# Arrays

Arrays armazenam múltiplos valores do mesmo tipo.

```java
int[] numeros = {1, 2, 3, 4, 5};
```

Também podem armazenar referências:

```java
String[] nomes = {
    "Eduardo",
    "João",
    "Maria"
};
```

Os índices começam em `0`:

```java
System.out.println(numeros[0]);
```

---

# Classes Wrapper

As classes Wrapper representam tipos primitivos como objetos.

| Primitivo | Wrapper     |
| --------- | ----------- |
| `byte`    | `Byte`      |
| `short`   | `Short`     |
| `int`     | `Integer`   |
| `long`    | `Long`      |
| `float`   | `Float`     |
| `double`  | `Double`    |
| `char`    | `Character` |
| `boolean` | `Boolean`   |

Exemplo:

```java
Integer idade = 20;
Double altura = 1.75;
Boolean ativo = true;
Character letra = 'A';
```

---

## Autoboxing e Unboxing

| Processo       | Conversão           |
| -------------- | ------------------- |
| **Autoboxing** | Primitivo → Wrapper |
| **Unboxing**   | Wrapper → Primitivo |

### Autoboxing

```java
int numero = 10;

Integer valor = numero;
```

### Unboxing

```java
Integer valor = 10;

int numero = valor;
```

O Java realiza essas conversões automaticamente em diversos contextos.

---

# `null`

`null` representa a ausência de uma referência para um objeto.

Tipos primitivos não podem receber `null`, enquanto tipos de referência podem.

### `null` x valor vazio

```java
String nome = null;
```

```java
String nome = "";
```

| Valor  | Significado                             |
| ------ | --------------------------------------- |
| `null` | Não existe referência para um objeto    |
| `""`   | Existe uma `String`, mas ela está vazia |

---

# Escopo das variáveis

O escopo determina **onde uma variável pode ser acessada**.

| Tipo      | Local de declaração | Escopo                       |
| --------- | ------------------- | ---------------------------- |
| Local     | Método ou bloco     | Dentro daquele método/bloco  |
| Instância | Classe              | Associada ao objeto          |
| `static`  | Classe              | Associada à classe           |
| Parâmetro | Método              | Durante a execução do método |

---

# Variáveis locais

São declaradas dentro de métodos, construtores ou blocos.

```java
public static void main(String[] args) {

    int idade = 18;

    System.out.println(idade);
}
```

A variável `idade` pode ser acessada apenas dentro do escopo em que foi declarada.

---

# Variáveis de instância

São declaradas dentro de uma classe, mas fora de métodos, construtores ou blocos.

```java
class Pessoa {

    String nome;
    int idade;
}
```

Cada objeto possui seus próprios valores:

```java
Pessoa pessoa1 = new Pessoa();
Pessoa pessoa2 = new Pessoa();

pessoa1.nome = "João";
pessoa2.nome = "Maria";
```

| Objeto    | `nome`    |
| --------- | --------- |
| `pessoa1` | `"João"`  |
| `pessoa2` | `"Maria"` |

---

# Variáveis `static`

Uma variável `static` pertence à classe, em vez de pertencer individualmente a cada objeto.

```java
class Pessoa {

    static int quantidadePessoas = 0;
}
```

Acesso:

```java
Pessoa.quantidadePessoas++;
```

| Tipo                  | Pertence a |
| --------------------- | ---------- |
| Variável de instância | Objeto     |
| Variável `static`     | Classe     |

---

# `final`

Uma variável `final` não pode receber uma nova atribuição depois de inicializada.

```java
final int idade = 18;
```

A tentativa abaixo é inválida:

```java
idade = 20;
```

---

# `static final`

A combinação `static final` é utilizada para representar constantes.

```java
static final double PI = 3.14159;
```

Outro exemplo:

```java
static final int MAX_USUARIOS = 100;
```

| Palavra-chave  | Característica                   |
| -------------- | -------------------------------- |
| `static`       | Associada à classe               |
| `final`        | Não pode receber nova atribuição |
| `static final` | Constante associada à classe     |

Por convenção, constantes utilizam nomes em letras maiúsculas.

---

# Variáveis de parâmetro

Parâmetros são variáveis declaradas na assinatura de um método.

```java
public void apresentar(String nome, int idade) {

    System.out.println(nome);
    System.out.println(idade);
}
```

Nesse exemplo:

| Elemento | Função    |
| -------- | --------- |
| `nome`   | Parâmetro |
| `idade`  | Parâmetro |

Ao chamar:

```java
apresentar("Eduardo", 18);
```

Os valores fornecidos são os **argumentos** da chamada.

---

# Modificadores de acesso

Os modificadores controlam o acesso aos membros de uma classe.

| Modificador     | Acesso                                                                 |
| --------------- | ---------------------------------------------------------------------- |
| `public`        | Qualquer classe que tenha acesso ao tipo                               |
| `private`       | Somente dentro da própria classe                                       |
| `protected`     | Própria classe, mesmo pacote e subclasses conforme as regras de acesso |
| Sem modificador | Dentro do mesmo pacote                                                 |

Exemplo:

```java
class Pessoa {

    private String nome;

    public int idade;

    protected String cidade;

    String pais;
}
```

---

# `enum`

`enum` representa um conjunto fixo de constantes.

```java
enum DiaDaSemana {

    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO,
    DOMINGO
}
```

Utilização:

```java
DiaDaSemana dia = DiaDaSemana.SEGUNDA;
```

É utilizado quando existe um conjunto limitado de possibilidades.

---

# Variáveis em interfaces

Variáveis declaradas diretamente em interfaces são implicitamente:

```text
public static final
```

Exemplo:

```java
interface Configuracao {

    int MAX_USUARIOS = 100;
}
```

Conceitualmente:

```java
interface Configuracao {

    public static final int MAX_USUARIOS = 100;
}
```

---

# `var`

`var` permite que o compilador infira o tipo de uma **variável local** durante a inicialização.

```java
var numero = 10;
var nome = "Java";
var ativo = true;
```

O compilador identifica:

| Variável | Tipo inferido |
| -------- | ------------- |
| `numero` | `int`         |
| `nome`   | `String`      |
| `ativo`  | `boolean`     |

`var` não torna a variável dinamicamente tipada:

```java
var numero = 10;

numero = "Java";
```

O código acima é inválido.

A variável também precisa ser inicializada no momento da declaração:

```java
var numero = 10;
```

Não é permitido:

```java
var numero;
```

---

# Classes e objetos

As variáveis também podem representar atributos de objetos.

```java
public class Pessoa {

    String nome;
    int idade;

    public Pessoa(String nome, int idade) {

        this.nome = nome;
        this.idade = idade;
    }
}
```

Criação do objeto:

```java
Pessoa pessoa = new Pessoa("João", 30);
```

Nesse exemplo:

| Elemento          | Representa                   |
| ----------------- | ---------------------------- |
| `Pessoa`          | Classe                       |
| `pessoa`          | Variável de referência       |
| `nome`            | Atributo                     |
| `idade`           | Atributo                     |
| `new Pessoa(...)` | Criação do objeto            |
| `this`            | Referência à instância atual |

---

# `this`

`this` representa a instância atual da classe.

```java
public Pessoa(String nome, int idade) {

    this.nome = nome;
    this.idade = idade;
}
```

Nesse caso:

```text
this.nome
    ↓
atributo da classe

nome
    ↓
parâmetro
```

---

# Variáveis de referência

Uma variável de referência pode apontar para um objeto.

```java
Pessoa pessoa = new Pessoa("João", 30);
```

Representação simplificada:

```text
pessoa
   │
   ▼
┌──────────────────┐
│   Objeto Pessoa  │
│                  │
│ nome = "João"    │
│ idade = 30       │
└──────────────────┘
```

Também pode não apontar para nenhum objeto:

```java
Pessoa pessoa = null;
```

---

# Primitivos x Referências

| Característica      | Primitivo                  | Referência                           |
| ------------------- | -------------------------- | ------------------------------------ |
| Exemplo             | `int`                      | `Integer`                            |
| Representa          | Valor básico               | Referência para objeto               |
| Pode receber `null` | ❌                          | ✅                                    |
| Possui métodos      | ❌                          | ✅                                    |
| Exemplos            | `int`, `double`, `boolean` | `String`, arrays, classes, `Integer` |

---

# Resumo das variáveis

| Tipo           | Exemplo                      | Associada a               |
| -------------- | ---------------------------- | ------------------------- |
| Local          | `int idade = 18;`            | Método/bloco              |
| Instância      | `String nome;`               | Objeto                    |
| `static`       | `static int total;`          | Classe                    |
| `final`        | `final int MAX = 10;`        | Valor sem nova atribuição |
| `static final` | `static final int MAX = 10;` | Constante da classe       |
| Parâmetro      | `void metodo(int idade)`     | Método                    |
| Referência     | `Pessoa pessoa;`             | Objeto                    |
| `enum`         | `Dia.SEGUNDA`                | Conjunto de constantes    |
| Interface      | `int MAX = 100;`             | Constante da interface    |
| `var`          | `var numero = 10;`           | Tipo inferido localmente  |

---

# Organização do material

Os conteúdos deste estudo estão organizados junto aos demais fundamentos de Java:

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

Os exemplos práticos relacionados a variáveis, tipos de dados, escopo, referências, Wrapper, `null`, `static`, `final`, `enum` e `var` estão concentrados no arquivo:

```text
Variaveis/VariaveisJava.java
```

Os arquivos Markdown apresentam a documentação conceitual, enquanto os arquivos `.java` concentram os exemplos executáveis de cada tema.

---

<div align="center">

☕ **Java — Variáveis e Tipos de Dados**

</div>
