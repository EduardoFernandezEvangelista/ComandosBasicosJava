# Java - Comandos Básicos

Repositório de estudos desenvolvido para praticar os fundamentos da linguagem **Java**, reunindo exemplos, pequenos programas e exercícios relacionados aos primeiros conceitos de programação.

O projeto tem finalidade **exclusivamente educacional** e serve como material de estudo, prática e consulta para o aprendizado da linguagem Java durante o início da graduação na área de programação e desenvolvimento de software.

---

## 📚 Sobre o projeto

Este repositório foi criado com o objetivo de estudar e praticar os principais fundamentos da linguagem **Java**.

Aqui são reunidos pequenos programas e exercícios que ajudam a compreender a sintaxe da linguagem, a lógica de programação e a utilização de estruturas fundamentais presentes no desenvolvimento de aplicações.

Entre os conteúdos praticados estão entrada e saída de dados, variáveis, operadores, estruturas condicionais, estruturas de repetição, métodos, arrays, strings e outros conceitos introdutórios.

A organização e os exemplos presentes no projeto acompanham a evolução dos estudos, começando pelos conceitos mais básicos e avançando gradualmente conforme novos conteúdos são aprendidos.

> **Observação:** este projeto possui finalidade educacional e não representa necessariamente uma aplicação completa ou pronta para produção.

---

## 🎯 Objetivos

Os principais objetivos deste projeto são:

* Aprender a sintaxe básica da linguagem Java;
* Praticar lógica de programação;
* Compreender variáveis e tipos de dados;
* Aprender a receber dados fornecidos pelo usuário;
* Praticar estruturas condicionais;
* Compreender estruturas de repetição;
* Praticar a utilização de métodos;
* Aprender a trabalhar com parâmetros e valores de retorno;
* Praticar arrays e manipulação de strings;
* Desenvolver familiaridade com a linguagem Java;
* Criar pequenos programas para colocar os conceitos em prática;
* Servir como material de consulta para estudos futuros;
* Registrar a evolução do aprendizado durante a graduação.

---

## 📖 Conteúdos estudados

| Conceito               | Descrição                                    |
| ---------------------- | -------------------------------------------- |
| Variáveis              | Armazenamento e manipulação de dados         |
| Tipos de dados         | Representação de diferentes tipos de valores |
| `Scanner`              | Entrada de dados pelo teclado                |
| `System.out.println()` | Exibição de informações no console           |
| Operadores matemáticos | Realização de operações aritméticas          |
| Operadores relacionais | Comparação entre valores                     |
| Operadores lógicos     | Combinação de condições                      |
| `if / else`            | Estruturas condicionais                      |
| `else if`              | Utilização de múltiplas condições            |
| `switch / case`        | Seleção entre diferentes casos               |
| `for`                  | Estrutura de repetição                       |
| `while`                | Repetição baseada em uma condição            |
| `while (true)`         | Criação de loops contínuos                   |
| `break`                | Interrupção de loops ou casos                |
| `continue`             | Pulo de uma determinada iteração             |
| Métodos                | Organização e reutilização de código         |
| Parâmetros             | Passagem de valores para métodos             |
| `return`               | Retorno de valores por métodos               |
| Arrays                 | Armazenamento de múltiplos valores           |
| Strings                | Manipulação de textos                        |
| Conversão de tipos     | Conversão entre diferentes tipos de dados    |
| Classes                | Organização básica do código Java            |

---

## 🧠 Exemplos de conceitos

A seguir estão alguns exemplos simples dos conceitos praticados no projeto.

### Entrada de dados

O `Scanner` permite receber informações digitadas pelo usuário através do teclado.

```java
Scanner scanner = new Scanner(System.in);

System.out.print("Digite seu nome: ");
String nome = scanner.nextLine();

System.out.println("Olá, " + nome);
```

Neste exemplo:

* `Scanner` é utilizado para capturar uma entrada;
* `nextLine()` recebe uma linha de texto;
* O valor digitado é armazenado na variável `nome`;
* `System.out.println()` exibe uma mensagem no console.

---

### `if / else`

As estruturas `if` e `else` permitem executar diferentes trechos de código dependendo de uma condição.

```java
if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}
```

Neste caso, o programa verifica se o valor armazenado em `idade` é maior ou igual a `18`.

---

### `else if`

O `else if` permite trabalhar com múltiplas condições.

```java
if (nota >= 9) {
    System.out.println("Excelente");
} else if (nota >= 7) {
    System.out.println("Bom");
} else {
    System.out.println("Precisa melhorar");
}
```

O programa verifica as condições em sequência até encontrar uma que seja verdadeira.

---

### `switch / case`

O `switch` pode ser utilizado quando é necessário selecionar uma opção entre diferentes possibilidades.

```java
switch (opcao) {
    case 1:
        System.out.println("Opção 1");
        break;

    case 2:
        System.out.println("Opção 2");
        break;

    default:
        System.out.println("Opção inválida");
}
```

Neste exemplo, o valor de `opcao` determina qual `case` será executado.

O `break` é utilizado para interromper a execução do `switch` após o caso correspondente.

---

### `for`

O `for` é utilizado principalmente quando sabemos ou conseguimos definir a quantidade de repetições.

```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```

O exemplo começa com `i` igual a `0` e continua enquanto `i` for menor que `10`.

---

### `while`

O `while` executa um bloco de código enquanto uma determinada condição for verdadeira.

```java
while (contador < 10) {
    System.out.println(contador);
    contador++;
}
```

A cada repetição, o valor de `contador` é incrementado até que a condição deixe de ser verdadeira.

---

### `while (true)`

O `while (true)` cria um loop contínuo.

Para interromper esse tipo de loop, normalmente utilizamos o `break`.

```java
while (true) {
    System.out.println("Executando...");

    if (condicao) {
        break;
    }
}
```

Esse tipo de estrutura pode ser útil em programas que precisam continuar executando até que o usuário escolha sair ou até que determinada condição aconteça.

---

### Método

Métodos permitem organizar o código em blocos reutilizáveis.

```java
public static int somar(int a, int b) {
    return a + b;
}
```

Neste exemplo:

* `public` define a visibilidade do método;
* `static` permite utilizar o método sem criar uma instância da classe;
* `int` indica que o método retorna um número inteiro;
* `somar` é o nome do método;
* `a` e `b` são parâmetros;
* `return` devolve o resultado da soma.

Um método pode então ser utilizado da seguinte forma:

```java
int resultado = somar(10, 20);

System.out.println(resultado);
```

---

## 📁 Estrutura do projeto

Uma possível organização para os exercícios é:

```text
Java-Comandos-Basicos/
│
├── src/
│   ├── entrada_dados/
│   ├── condicionais/
│   ├── switch_case/
│   ├── repeticoes/
│   ├── metodos/
│   ├── arrays/
│   ├── strings/
│   └── exercicios/
│
└── README.md
```

A estrutura acima é apenas uma **sugestão de organização**.

A estrutura definitiva pode ser adaptada conforme a quantidade de exercícios e a evolução do projeto.

Novas pastas podem ser adicionadas posteriormente para separar melhor os conteúdos estudados.

---

## ⚙️ Tecnologias utilizadas

Atualmente, o projeto utiliza:

* **Java**
* **JDK**

A versão específica do JDK não é definida neste README, pois pode variar de acordo com o ambiente utilizado durante os estudos.

A IDE utilizada também pode variar conforme o ambiente de desenvolvimento.

---

## 💻 Pré-requisitos

Para executar os programas deste repositório, é necessário ter um ambiente Java configurado.

### Necessário

* **JDK (Java Development Kit)** instalado;
* Uma IDE compatível com Java **ou** um terminal;
* Variáveis de ambiente configuradas, caso sejam necessárias no sistema operacional.

Para verificar se o Java está instalado, utilize:

```bash
java -version
```

Para verificar a instalação do compilador Java:

```bash
javac -version
```

Se os comandos retornarem as versões instaladas, o ambiente Java está disponível para execução dos programas.

---

## ▶️ Como executar

### Pelo terminal

Primeiro, navegue até a pasta onde está localizado o arquivo `.java`.

Depois, compile o programa utilizando:

```bash
javac NomeDoArquivo.java
```

Após a compilação, execute o programa com:

```bash
java NomeDoArquivo
```

Por exemplo:

```bash
javac Main.java
java Main
```

> Ao utilizar o comando `java`, normalmente não é necessário informar a extensão `.java` ou `.class`.

### Pela IDE

Também é possível executar os programas diretamente através de uma IDE compatível com Java.

De forma geral:

1. Abra o projeto na IDE;
2. Localize a classe que contém o método `main`;
3. Abra o arquivo;
4. Execute o programa utilizando a opção **Run/Executar** disponibilizada pela IDE;
5. Observe a saída no console.

O procedimento exato pode variar dependendo da IDE utilizada.

---

## 📝 Exemplos de exercícios

Durante os estudos de lógica de programação e Java, alguns exercícios comuns que podem ser desenvolvidos são:

* Calculadora;
* Verificação de maioridade;
* Verificação de números pares e ímpares;
* Tabuada;
* Contagem utilizando loops;
* Identificação do menor e maior número;
* Cálculo de média de notas;
* Menus utilizando `switch`;
* Programas utilizando entrada do usuário;
* Exercícios envolvendo condições;
* Exercícios envolvendo estruturas de repetição;
* Exercícios básicos de lógica de programação.

Esses exemplos representam possibilidades de exercícios para prática e **não significam necessariamente que todos estejam presentes atualmente neste repositório**.

---

## 📈 Evolução dos estudos

Este repositório representa uma etapa inicial do aprendizado da linguagem Java.

A ideia é começar pelos fundamentos e, conforme os estudos avançarem, adicionar novos conceitos e projetos com maior nível de complexidade.

Alguns conteúdos que poderão ser estudados posteriormente incluem:

* Programação Orientada a Objetos;
* Classes e objetos;
* Encapsulamento;
* Herança;
* Polimorfismo;
* Interfaces;
* Collections;
* Tratamento de exceções;
* Manipulação de arquivos;
* Banco de dados;
* APIs.

Esses conteúdos serão adicionados posteriormente, conforme forem estudados e praticados.

O objetivo é manter este repositório como um registro da evolução do aprendizado em Java.

---

## 🚀 Próximos passos

### Roadmap de estudos

* [x] Estrutura básica do Java
* [x] Variáveis e tipos de dados
* [x] Entrada e saída de dados
* [x] Operadores
* [x] Estruturas condicionais
* [x] Estruturas de repetição
* [x] Métodos
* [x] Arrays e Strings
* [ ] Aprofundar a lógica de programação
* [ ] Programação Orientada a Objetos
* [ ] Classes e objetos
* [ ] Encapsulamento
* [ ] Herança
* [ ] Polimorfismo
* [ ] Interfaces
* [ ] Collections
* [ ] Tratamento de exceções
* [ ] Manipulação de arquivos
* [ ] Banco de dados
* [ ] APIs

> Os itens marcados como concluídos representam os conteúdos abordados no escopo introdutório deste repositório. O roadmap poderá ser atualizado conforme os estudos evoluírem.

---

## 👨‍💻 Autor

**Autor:** Eduardo Fernandez Evangelista

**GitHub:** EduardoFernandezEvangelista

---

## 📄 Licença

Este projeto ainda não possui uma licença específica definida.

**Licença:** 

---

<div align="center">

📚 Projeto desenvolvido para fins de estudo e prática de Java.

**Java - Comandos Básicos**

</div>
