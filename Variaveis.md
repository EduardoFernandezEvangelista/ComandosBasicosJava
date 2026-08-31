# ☕ Java - Variáveis e Tipos de Dados

Repositório de estudos dedicado ao aprendizado e à prática dos diferentes tipos de **variáveis, tipos de dados e formas de declaração utilizadas na linguagem Java**.

Este projeto reúne exemplos práticos e explicações sobre tipos primitivos, tipos não primitivos, classes Wrapper, variáveis locais, de instância, estáticas, parâmetros, constantes, modificadores de acesso, `enum`, interfaces e variáveis de referência.

O projeto possui finalidade **educacional**, servindo como material de estudo, prática e consulta durante a evolução do aprendizado em Java.

---

## 🎯 Introdução

As variáveis são um dos conceitos fundamentais da programação. Em Java, existem diferentes formas de declarar e utilizar variáveis, dependendo do tipo de dado armazenado, do local onde a variável é declarada e da forma como ela será utilizada.

Neste projeto são estudados conceitos como:

* Tipos primitivos;
* Tipos não primitivos;
* Classes Wrapper;
* Variáveis locais;
* Variáveis de instância;
* Variáveis estáticas;
* Variáveis de parâmetro;
* Variáveis `final`;
* Variáveis `static`;
* Constantes `static final`;
* Modificadores de acesso;
* Variáveis de referência;
* `enum`;
* Variáveis declaradas em interfaces;
* Inferência de tipos com `var`;
* Classes e objetos;
* Construtores;
* Métodos;
* Referência `this`;
* Valores `null`.

A proposta é compreender não apenas **quais tipos de variáveis existem**, mas também **onde podem ser utilizadas, qual é seu escopo e como funcionam dentro da estrutura de uma aplicação Java**.

---

## 🎯 Objetivos

Os principais objetivos deste projeto são:

* Compreender o conceito de variável;
* Conhecer os tipos primitivos do Java;
* Conhecer os principais tipos não primitivos;
* Compreender a diferença entre tipos primitivos e objetos;
* Aprender sobre classes Wrapper;
* Compreender autoboxing e unboxing;
* Trabalhar com `String`;
* Trabalhar com arrays;
* Compreender o conceito de `null`;
* Conhecer variáveis locais;
* Conhecer variáveis de instância;
* Conhecer variáveis estáticas;
* Compreender variáveis de parâmetro;
* Utilizar `final`;
* Utilizar `static`;
* Compreender constantes;
* Conhecer os modificadores de acesso;
* Trabalhar com `enum`;
* Compreender variáveis declaradas em interfaces;
* Compreender variáveis de referência;
* Praticar classes e objetos;
* Compreender construtores;
* Utilizar `this`;
* Desenvolver uma base para Programação Orientada a Objetos.

---

# 📖 Tipos de dados em Java

Java possui **tipagem estática**, o que significa que o tipo de uma variável é conhecido em tempo de compilação.

De forma geral, podemos dividir os tipos utilizados em Java em:

```text
Tipos em Java
│
├── Tipos Primitivos
│
└── Tipos de Referência
    │
    ├── Classes
    ├── Strings
    ├── Arrays
    ├── Enums
    └── Objetos
```

---

## 🔹 Tipos primitivos

Os tipos primitivos são os tipos básicos da linguagem Java.

Java possui **8 tipos primitivos**:

| Tipo      |        Tamanho | Descrição                        | Exemplo                      |
| --------- | -------------: | -------------------------------- | ---------------------------- |
| `byte`    |         8 bits | Inteiro pequeno                  | `byte idade = 18;`           |
| `short`   |        16 bits | Inteiro                          | `short numero = 1000;`       |
| `int`     |        32 bits | Inteiro                          | `int idade = 18;`            |
| `long`    |        64 bits | Inteiro grande                   | `long populacao = 1000000L;` |
| `float`   |        32 bits | Número decimal                   | `float altura = 1.75f;`      |
| `double`  |        64 bits | Número decimal de maior precisão | `double preco = 19.99;`      |
| `char`    |        16 bits | Um caractere Unicode             | `char letra = 'A';`          |
| `boolean` | JVM-dependente | Verdadeiro ou falso              | `boolean ativo = true;`      |

> **Observação:** embora seja comum encontrar `boolean` descrito como "1 bit", a especificação da linguagem Java não define um tamanho de armazenamento de 1 bit para `boolean`. O tamanho exato depende da implementação da JVM.

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

# 🔹 `byte`

O `byte` é um tipo inteiro de **8 bits**.

Seu intervalo é:

```text
-128 até 127
```

Exemplo:

```java
byte idade = 18;
byte temperatura = 25;
```

É útil quando precisamos trabalhar com valores inteiros pequenos.

---

# 🔹 `short`

O `short` é um tipo inteiro de **16 bits**.

Seu intervalo é:

```text
-32.768 até 32.767
```

Exemplo:

```java
short quantidade = 1000;
```

Apesar de existir, o `short` é menos utilizado que `int` em aplicações comuns.

---

# 🔹 `int`

O `int` é o tipo inteiro mais utilizado em muitos programas Java.

Possui **32 bits**.

Exemplo:

```java
int idade = 20;
int quantidade = 100;
int resultado = 10 + 20;
```

---

# 🔹 `long`

O `long` possui **64 bits** e permite armazenar números inteiros maiores.

Exemplo:

```java
long populacao = 200000000L;
```

O sufixo `L` indica que o literal é do tipo `long`.

---

# 🔹 `float`

O `float` representa números de ponto flutuante com **32 bits**.

Exemplo:

```java
float altura = 1.75f;
float temperatura = 25.5f;
```

O `f` é utilizado para indicar que o valor literal deve ser tratado como `float`.

---

# 🔹 `double`

O `double` representa números de ponto flutuante com **64 bits**.

Exemplo:

```java
double preco = 19.99;
double media = 8.75;
```

Por padrão, valores decimais como `19.99` são considerados `double`.

---

# 🔹 `char`

O `char` representa **um único caractere Unicode**.

Exemplo:

```java
char letra = 'A';
char simbolo = '#';
char numero = '1';
```

É importante observar a diferença:

```java
char letra = 'A';
String palavra = "A";
```

`char` utiliza aspas simples e representa um único caractere.

`String` utiliza aspas duplas e representa uma sequência de caracteres.

---

# 🔹 `boolean`

O `boolean` representa apenas dois estados:

```text
true
false
```

Exemplo:

```java
boolean ligado = true;
boolean aprovado = false;
```

É muito utilizado em condições:

```java
if (aprovado) {
    System.out.println("Aluno aprovado!");
}
```

---

# 🧩 Tipos de referência

Além dos tipos primitivos, Java possui **tipos de referência**.

Eles podem representar objetos, arrays, strings, enums e instâncias de classes.

Exemplos:

```java
String nome = "Eduardo";

int[] numeros = {1, 2, 3, 4, 5};

Pessoa pessoa = new Pessoa("João", 30);
```

Uma variável de referência não armazena diretamente o objeto da mesma forma que uma variável primitiva armazena seu valor. Ela mantém uma referência para um objeto.

---

# 📝 `String`

`String` é uma classe utilizada para representar sequências de caracteres.

Exemplo:

```java
String nome = "Eduardo";
String mensagem = "Olá, mundo!";
```

Diferentemente de `char`, uma `String` pode armazenar vários caracteres.

```java
char letra = 'A';

String palavra = "Java";
```

---

# 📦 Arrays

Arrays permitem armazenar vários valores do mesmo tipo.

Exemplo:

```java
int[] numeros = {1, 2, 3, 4, 5};
```

Também podemos criar arrays de outros tipos:

```java
String[] nomes = {
    "Eduardo",
    "João",
    "Maria"
};
```

Os elementos podem ser acessados através de seus índices:

```java
System.out.println(numeros[0]);
```

O índice começa em `0`.

---

# 📦 Classes Wrapper

As classes Wrapper representam os tipos primitivos como **objetos**.

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

Java realiza automaticamente a conversão entre primitivos e seus respectivos Wrappers em muitos contextos.

---

## 🔄 Autoboxing

Autoboxing ocorre quando um valor primitivo é convertido automaticamente para seu Wrapper.

```java
int numero = 10;

Integer valor = numero;
```

O Java realiza a conversão automaticamente.

---

## 🔄 Unboxing

Unboxing é o processo inverso.

```java
Integer valor = 10;

int numero = valor;
```

O Java converte automaticamente o objeto `Integer` para `int`.

---

# ⚠️ `null`

Variáveis de tipos primitivos não podem receber `null`.

Isso gera erro:

```java
int numero = null;
```

Já uma variável de referência pode receber `null`:

```java
String nome = null;

Pessoa pessoa = null;

int[] numeros = null;
```

`null` significa que a variável de referência **não está apontando para um objeto**.

É importante diferenciar:

```java
String nome = null;
```

de:

```java
String nome = "";
```

No primeiro caso, não existe uma referência para um objeto `String`.

No segundo, existe uma `String` vazia.

---

# 📍 Variáveis locais

Variáveis locais são declaradas dentro de métodos, construtores ou blocos.

Exemplo:

```java
public static void main(String[] args) {

    int idade = 18;

    System.out.println(idade);
}
```

A variável `idade` só pode ser utilizada dentro do escopo onde foi declarada.

---

# 🏠 Variáveis de instância

Variáveis de instância são declaradas dentro de uma classe, mas fora de métodos, construtores ou blocos.

Exemplo:

```java
class Pessoa {

    String nome;
    int idade;
}
```

Cada objeto da classe `Pessoa` possui suas próprias variáveis de instância.

```java
Pessoa pessoa1 = new Pessoa();
Pessoa pessoa2 = new Pessoa();

pessoa1.nome = "João";
pessoa2.nome = "Maria";
```

Cada objeto possui seu próprio `nome`.

---

# 🌐 Variáveis `static`

Uma variável `static` pertence à **classe**, e não a uma instância específica.

Exemplo:

```java
class Pessoa {

    static int quantidadePessoas = 0;
}
```

A variável pode ser acessada através da classe:

```java
Pessoa.quantidadePessoas++;
```

Como ela pertence à classe, existe uma única variável compartilhada entre as instâncias.

---

# 🔒 Variáveis `final`

Uma variável declarada como `final` não pode receber uma nova atribuição depois de inicializada.

Exemplo:

```java
final int idade = 18;
```

O código abaixo gera erro:

```java
idade = 20;
```

`final` é utilizado quando queremos impedir que uma referência ou variável receba uma nova atribuição.

---

# ⭐ `static final`

A combinação `static final` é muito utilizada para representar **constantes**.

Exemplo:

```java
static final double PI = 3.14159;
```

A variável:

* Pertence à classe;
* Não pode receber uma nova atribuição.

Por convenção, constantes em Java normalmente utilizam nomes em letras maiúsculas:

```java
static final int MAX_USUARIOS = 100;
```

---

# 🧩 Variáveis de parâmetro

Parâmetros são variáveis declaradas na assinatura de um método.

Exemplo:

```java
public void apresentar(String nome, int idade) {

    System.out.println(
        "Nome: " + nome +
        " | Idade: " + idade
    );
}
```

Nesse exemplo:

```text
nome → parâmetro
idade → parâmetro
```

Quando o método é chamado:

```java
apresentar("Eduardo", 18);
```

Os valores `"Eduardo"` e `18` são passados para os parâmetros.

---

# 🔐 Modificadores de acesso

Java possui modificadores que controlam o acesso aos membros de uma classe.

| Modificador     | Acesso                                                                           |
| --------------- | -------------------------------------------------------------------------------- |
| `public`        | Acessível de qualquer lugar                                                      |
| `private`       | Acessível apenas dentro da própria classe                                        |
| `protected`     | Acessível dentro do mesmo pacote e em subclasses, observadas as regras de acesso |
| Sem modificador | Acesso dentro do mesmo pacote                                                    |

Exemplo:

```java
class Pessoa {

    private String nome;

    public int idade;

    protected String cidade;

    String pais;
}
```

Esses modificadores são importantes principalmente para o conceito de **encapsulamento**.

---

# 🏷️ `enum`

`enum` permite representar um conjunto fixo de constantes.

Exemplo:

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

Podemos utilizar o `enum` da seguinte maneira:

```java
DiaDaSemana dia = DiaDaSemana.SEGUNDA;
```

Isso é útil quando trabalhamos com valores que possuem um conjunto limitado de possibilidades.

---

# 🔌 Variáveis em interfaces

Variáveis declaradas em interfaces são implicitamente:

```text
public static final
```

Exemplo:

```java
interface Configuracao {

    int MAX_USUARIOS = 100;
}
```

Na prática, isso equivale conceitualmente a:

```java
interface Configuracao {

    public static final int MAX_USUARIOS = 100;
}
```

Por isso, essas variáveis funcionam como constantes associadas à interface.

---

# 🧠 `var`

O `var` permite que o compilador **infira o tipo da variável local a partir do valor utilizado na inicialização**.

Exemplo:

```java
var numero = 10;
var nome = "Java";
var ativo = true;
```

O compilador identifica:

```text
numero → int
nome   → String
ativo  → boolean
```

É importante lembrar que `var` **não significa que a variável pode mudar de tipo**.

Isto continua sendo inválido:

```java
var numero = 10;

numero = "Java";
```

Além disso, `var` é utilizado para variáveis locais e precisa ser inicializado:

```java
var numero = 10;
```

Não podemos fazer:

```java
var numero;
```

---

# 👤 Classes e objetos

As variáveis ficam ainda mais importantes quando começamos a trabalhar com **Programação Orientada a Objetos**.

Uma classe pode possuir:

* Atributos;
* Métodos;
* Construtores.

Exemplo:

```java
public class Pessoa {

    String nome;
    int idade;

    public Pessoa(String nome, int idade) {

        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar() {

        System.out.println(
            "Olá, meu nome é " +
            nome +
            " e eu tenho " +
            idade +
            " anos."
        );
    }
}
```

---

# 🏗️ Construtor

O construtor é utilizado durante a criação de um objeto.

```java
Pessoa pessoa = new Pessoa("João", 30);
```

Nesse momento, o construtor recebe os valores:

```java
public Pessoa(String nome, int idade) {

    this.nome = nome;
    this.idade = idade;
}
```

---

# 🔎 `this`

A palavra-chave `this` representa a instância atual da classe.

No exemplo:

```java
public Pessoa(String nome, int idade) {

    this.nome = nome;
    this.idade = idade;
}
```

Temos:

```text
this.nome
    ↓
atributo da classe

nome
    ↓
parâmetro do construtor
```

O `this` ajuda a diferenciar o atributo da classe do parâmetro que possui o mesmo nome.

---

# 🔗 Variáveis de referência

Uma variável de referência pode armazenar uma referência para um objeto.

Exemplo:

```java
Pessoa pessoa = new Pessoa("João", 30);
```

Nesse caso:

```text
pessoa
   │
   ▼
┌─────────────────────┐
│      Objeto Pessoa  │
│                     │
│ nome = "João"       │
│ idade = 30          │
└─────────────────────┘
```

Também podemos ter:

```java
Pessoa pessoa = null;
```

Nesse caso, a variável não possui uma referência para um objeto.

---

# 🧪 Exemplo completo

O exemplo abaixo reúne alguns dos conceitos apresentados:

```java
public class Pessoa {

    // Variáveis de instância
    private String nome;
    private int idade;

    // Variável estática
    static int quantidadePessoas = 0;

    // Constante
    static final String TIPO = "PESSOA";

    // Construtor
    public Pessoa(String nome, int idade) {

        this.nome = nome;
        this.idade = idade;

        quantidadePessoas++;
    }

    // Método
    public void apresentar() {

        System.out.println(
            "Nome: " + nome
        );

        System.out.println(
            "Idade: " + idade
        );
    }
}
```

Utilização:

```java
public class Main {

    public static void main(String[] args) {

        // Variável local
        int numero = 10;

        // Variável de referência
        Pessoa pessoa = new Pessoa(
            "Eduardo",
            18
        );

        pessoa.apresentar();

        System.out.println(
            "Total de pessoas: " +
            Pessoa.quantidadePessoas
        );
    }
}
```

Esse exemplo combina diferentes conceitos:

* Variável local;
* Variáveis de instância;
* `private`;
* `static`;
* `static final`;
* Construtor;
* `this`;
* Objeto;
* Variável de referência;
* Método.

---

# 📊 Comparação dos principais tipos

| Categoria | Exemplo           | Pode ser `null`? | Associado a objeto? |
| --------- | ----------------- | ---------------: | ------------------: |
| Primitivo | `int idade`       |                ❌ |                   ❌ |
| Wrapper   | `Integer idade`   |                ✅ |                   ✅ |
| String    | `String nome`     |                ✅ |                   ✅ |
| Array     | `int[] numeros`   |                ✅ |                   ✅ |
| Objeto    | `Pessoa pessoa`   |                ✅ |                   ✅ |
| Enum      | `DiaDaSemana dia` |                ✅ |                   ✅ |

---

# 🧭 Escopo das variáveis

O **escopo** determina onde uma variável pode ser acessada.

Exemplo:

```java
public class Exemplo {

    // Escopo da classe
    int atributo = 10;

    public void metodo() {

        // Escopo local
        int local = 20;

        System.out.println(atributo);
        System.out.println(local);
    }
}
```

De forma simplificada:

```text
Classe
│
├── Variável de instância
│
└── Método
    │
    └── Variável local
```

Compreender escopo é fundamental para evitar erros e organizar corretamente o código.

---

# 🧠 Conceitos relacionados

O estudo de variáveis também serve como base para diversos conceitos posteriores da linguagem Java:

* Tipagem estática;
* Conversão de tipos;
* Casting;
* Autoboxing;
* Unboxing;
* Escopo;
* Modificadores de acesso;
* Encapsulamento;
* Classes;
* Objetos;
* Construtores;
* Métodos;
* Programação Orientada a Objetos;
* Coleções;
* Banco de dados;
* APIs.

---

# 📈 Evolução dos estudos

Este projeto representa uma etapa da evolução no aprendizado de Java.

Os conceitos de variáveis servem como base para conteúdos cada vez mais estruturados:

```text
Tipos de dados
      ↓
Variáveis
      ↓
Operadores
      ↓
Estruturas condicionais
      ↓
Estruturas de repetição
      ↓
Métodos
      ↓
Arrays e Strings
      ↓
Classes e Objetos
      ↓
Encapsulamento
      ↓
Herança
      ↓
Polimorfismo
      ↓
Banco de Dados
      ↓
APIs
      ↓
Aplicações mais completas
```

O aprendizado é contínuo. Conceitos já estudados continuam sendo praticados e aprofundados através de novos exercícios e projetos.

---

# 📁 Estrutura sugerida

Uma possível organização para este conteúdo é:

```text
Java-Variaveis/
│
├── src/
│   │
│   ├── primitivas/
│   │   ├── Byte.java
│   │   ├── Short.java
│   │   ├── Int.java
│   │   ├── Long.java
│   │   ├── Float.java
│   │   ├── Double.java
│   │   ├── Char.java
│   │   └── Boolean.java
│   │
│   ├── nao_primitivas/
│   │   ├── String.java
│   │   └── Arrays.java
│   │
│   ├── wrappers/
│   │   └── Wrapper.java
│   │
│   ├── escopo/
│   │   ├── Local.java
│   │   ├── Instancia.java
│   │   ├── Static.java
│   │   └── Parametro.java
│   │
│   ├── modificadores/
│   │   ├── Final.java
│   │   ├── StaticFinal.java
│   │   └── Acesso.java
│   │
│   ├── enum/
│   │   └── DiaDaSemana.java
│   │
│   ├── interfaces/
│   │   └── VariaveisInterface.java
│   │
│   ├── objetos/
│   │   ├── Pessoa.java
│   │   └── Main.java
│   │
│   └── exercicios/
│
└── README.md
```

> A estrutura acima é apenas uma sugestão e pode ser adaptada à organização real do projeto.

---

# ⚙️ Tecnologias utilizadas

* **Java**
* **JDK**

As versões específicas utilizadas podem variar conforme o ambiente de estudos.

---

# 💻 Pré-requisitos

Para executar os exemplos, é necessário possuir:

* JDK instalado;
* IDE compatível com Java ou terminal;
* Ambiente Java configurado.

Verifique a instalação utilizando:

```bash
java -version
```

E:

```bash
javac -version
```

---

# ▶️ Como executar

### Terminal

Compile o arquivo:

```bash
javac NomeDoArquivo.java
```

Depois execute:

```bash
java NomeDoArquivo
```

Exemplo:

```bash
javac Main.java
java Main
```

### IDE

Também é possível executar os exemplos diretamente através de uma IDE compatível com Java.

Localize a classe que contém:

```java
public static void main(String[] args)
```

e utilize a opção **Run / Executar**.

---

# 📝 Exercícios sugeridos

Alguns exercícios que podem ser utilizados para praticar os conceitos deste projeto:

### 🔹 Nível básico

* Criar variáveis de cada tipo primitivo;
* Exibir os valores no console;
* Trabalhar com operações matemáticas;
* Criar variáveis `String`;
* Criar arrays;
* Trabalhar com `char` e `boolean`.

### 🔹 Tipos e conversões

* Converter `int` para `double`;
* Trabalhar com casting;
* Praticar autoboxing;
* Praticar unboxing;
* Comparar tipos primitivos e Wrapper.

### 🔹 Escopo

* Criar variáveis locais;
* Criar variáveis de instância;
* Criar variáveis `static`;
* Trabalhar com parâmetros;
* Observar diferenças de escopo.

### 🔹 Orientação a Objetos

* Criar uma classe `Pessoa`;
* Criar objetos;
* Criar atributos;
* Criar métodos;
* Criar construtores;
* Utilizar `this`;
* Aplicar `private`;
* Criar getters e setters.

---

## 👨‍💻 Autor

**Eduardo Fernandez Evangelista**

**GitHub:** [EduardoFernandezEvangelista](https://github.com/EduardoFernandezEvangelista)

---

## 📄 Licença

Este projeto ainda não possui uma licença específica definida.

**Licença:** `[ADICIONAR LICENÇA]`

---

<div align="center">

☕ **Java • Variáveis • Tipos de Dados • POO**

📚 Estudo • Prática • Desenvolvimento • Evolução

</div>
