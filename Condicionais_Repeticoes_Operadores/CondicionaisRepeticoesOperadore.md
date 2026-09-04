# ☕ Java — Condicionais, Repetições e Operadores

Parte do projeto **JavaBasicCommands**, reunindo os principais recursos de **controle de fluxo e operadores da linguagem Java**.

O material foi organizado como uma referência prática: conceitos essenciais, sintaxe, tabelas de consulta e exemplos pequenos o suficiente para serem testados rapidamente.

---

## 📚 Conteúdo

| Categoria                   | Principais recursos                    |
| --------------------------- | -------------------------------------- |
| **Operadores aritméticos**  | `+`, `-`, `*`, `/`, `%`                |
| **Incremento / decremento** | `++`, `--`                             |
| **Atribuição**              | `=`, `+=`, `-=`, `*=`, `/=`, `%=`      |
| **Relacionais**             | `==`, `!=`, `>`, `<`, `>=`, `<=`       |
| **Lógicos**                 | `&&`, `||`, `!`                        |
| **Bit a bit**               | `&`, `|`, `^`, `~`, `<<`, `>>`, `>>>`  |
| **Condicionais**            | `if`, `else if`, `else`, `switch`      |
| **Switch moderno**          | `->`, `switch expression`, `yield`     |
| **Condicional compacto**    | operador ternário `? :`                |
| **Repetições**              | `while`, `do while`, `for`, `for-each` |
| **Controle de loops**       | `break`, `continue`                    |
| **Labels**                  | `break label`, `continue label`        |

---

# 🧮 Operadores

Operadores são utilizados para realizar cálculos, comparações, atribuições e operações lógicas.

## Operadores aritméticos

| Operador | Função           |  Exemplo | Resultado |
| -------- | ---------------- | -------: | --------: |
| `+`      | Soma             | `10 + 3` |      `13` |
| `-`      | Subtração        | `10 - 3` |       `7` |
| `*`      | Multiplicação    | `10 * 3` |      `30` |
| `/`      | Divisão          | `10 / 3` |       `3` |
| `%`      | Resto da divisão | `10 % 3` |       `1` |

> Em uma divisão entre inteiros, o resultado também é inteiro.

```java
int resultado = 10 / 3;
System.out.println(resultado); // 3
```

Para obter casas decimais:

```java
double resultado = 10.0 / 3;
System.out.println(resultado); // 3.333...
```

O operador `%` é bastante útil para verificar números pares e ímpares:

```java
if (numero % 2 == 0) {
    System.out.println("Par");
}
```

---

## Incremento e decremento

| Operador | Função       |
| -------- | ------------ |
| `++`     | adiciona `1` |
| `--`     | subtrai `1`  |

```java
int contador = 0;

contador++;
contador--;

System.out.println(contador);
```

Também existem as formas **pré** e **pós**:

```java
int a = 5;

int x = ++a; // incrementa antes
int y = a++; // incrementa depois
```

---

## Operadores de atribuição

Além da atribuição simples, Java possui formas abreviadas:

| Operador | Equivalente |
| -------- | ----------- |
| `=`      | `a = b`     |
| `+=`     | `a = a + b` |
| `-=`     | `a = a - b` |
| `*=`     | `a = a * b` |
| `/=`     | `a = a / b` |
| `%=`     | `a = a % b` |

Exemplo:

```java
int saldo = 100;

saldo += 50;
saldo -= 20;

System.out.println(saldo); // 130
```

---

# 🔎 Operadores relacionais

Utilizados para comparar valores. O resultado é sempre `true` ou `false`.

| Operador | Significado    |
| -------- | -------------- |
| `==`     | igual          |
| `!=`     | diferente      |
| `>`      | maior          |
| `<`      | menor          |
| `>=`     | maior ou igual |
| `<=`     | menor ou igual |

```java
int idade = 20;

System.out.println(idade >= 18); // true
System.out.println(idade == 20); // true
```

### `==` com objetos

Para tipos primitivos, `==` compara valores.

Para objetos, como `String`, normalmente deve-se comparar o conteúdo:

```java
String nome = "Java";

if ("Java".equals(nome)) {
    System.out.println("Nome correto");
}
```

Evite usar `==` para comparar o conteúdo de `String`.

---

# 🧩 Operadores lógicos

Permitem combinar condições.

| Operador | Nome | Regra                                          |
| -------- | ---- | ---------------------------------------------- |
| `&&`     | AND  | todas as condições precisam ser verdadeiras    |
| ||       | OR   | pelo menos uma condição precisa ser verdadeira |
| `!`      | NOT  | inverte o resultado                            |

```java
int idade = 20;
boolean possuiCarteira = true;

if (idade >= 18 && possuiCarteira) {
    System.out.println("Pode dirigir");
}
```

### Curto-circuito

`&&` e `||` utilizam avaliação de curto-circuito.

```java
if (objeto != null && objeto.isValido()) {
    // ...
}
```

Se `objeto != null` for falso, a segunda condição não será avaliada.

---

# ⚙️ Operadores bit a bit

Trabalham diretamente com a representação binária dos números.

| Operador | Operação                         |
| -------- | -------------------------------- |
| `&`      | AND                              |
| `|`      | OR                               |
| `^`      | XOR                              |
| `~`      | complemento                      |
| `<<`     | deslocamento à esquerda          |
| `>>`     | deslocamento à direita com sinal |
| `>>>`    | deslocamento à direita sem sinal |

Exemplo:

```java
int a = 5; // 0101
int b = 3; // 0011

System.out.println(a & b); // 1
System.out.println(a | b); // 7
System.out.println(a ^ b); // 6
```

Os operadores `&` e `|` também podem ser usados com `boolean`, mas não possuem o mesmo comportamento de curto-circuito de `&&` e `||`.

---

# 🔀 Estruturas condicionais

## `if`

Use `if` quando uma ação depende de uma condição.

```java
if (idade >= 18) {
    System.out.println("Maior de idade");
}
```

---

## `if / else`

Quando existem dois caminhos:

```java
if (saldo >= valor) {
    System.out.println("Compra autorizada");
} else {
    System.out.println("Saldo insuficiente");
}
```

---

## `else if`

Para múltiplas condições:

```java
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

A primeira condição verdadeira interrompe a sequência.

---

## `if` aninhado

Um `if` pode existir dentro de outro:

```java
if (idade >= 18) {

    if (possuiCarteira) {
        System.out.println("Pode dirigir");
    }

}
```

Quando a lógica puder ser expressa de forma simples, muitas vezes é melhor combinar as condições:

```java
if (idade >= 18 && possuiCarteira) {
    System.out.println("Pode dirigir");
}
```

---

# 🎛️ `switch`

É uma boa opção quando a decisão depende de **valores específicos**.

### Forma tradicional

```java
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

No `switch` tradicional, `break` evita que a execução continue no próximo `case`.

---

## `switch` moderno

A sintaxe com `->` é mais direta e evita o `fall-through` acidental:

```java
switch (opcao) {

    case 1 -> System.out.println("Cadastrar");
    case 2 -> System.out.println("Consultar");
    case 3 -> System.out.println("Excluir");
    default -> System.out.println("Opção inválida");
}
```

---

## `switch expression`

O `switch` também pode produzir um valor:

```java
String resultado = switch (numero) {

    case 1 -> "Um";
    case 2 -> "Dois";
    case 3 -> "Três";
    default -> "Desconhecido";
};
```

---

## `yield`

Quando um `case` possui várias instruções, `yield` permite produzir o valor daquele bloco:

```java
String resultado = switch (numero) {

    case 1 -> "Um";

    case 2 -> {
        System.out.println("Processando...");
        yield "Dois";
    }

    default -> "Outro";
};
```

---

# ❓ Operador ternário

Indicado para decisões simples que precisam produzir um valor.

```java
String status =
        idade >= 18
        ? "Maior de idade"
        : "Menor de idade";
```

Equivale basicamente a:

```java
String status;

if (idade >= 18) {
    status = "Maior de idade";
} else {
    status = "Menor de idade";
}
```

> Se o ternário começar a ficar difícil de ler, prefira `if/else`.

---

# 🔁 Estruturas de repetição

## `while`

Executa enquanto a condição for verdadeira.

```java
int contador = 0;

while (contador < 5) {

    System.out.println(contador);

    contador++;
}
```

Use principalmente quando a quantidade de repetições depende de uma condição que pode mudar durante a execução.

---

## `while (true)`

Cria um loop contínuo, normalmente encerrado com `break`.

```java
while (true) {

    System.out.println("Executando...");

    if (condicaoDeSaida) {
        break;
    }
}
```

É bastante comum em menus e sistemas interativos.

---

## `do while`

Executa o bloco pelo menos uma vez.

```java
int opcao;

do {

    System.out.println("1 - Continuar");
    System.out.println("0 - Sair");

    opcao = scanner.nextInt();

} while (opcao != 0);
```

Diferença principal:

| Estrutura  | Quando verifica    |
| ---------- | ------------------ |
| `while`    | antes da execução  |
| `do while` | depois da execução |

---

# 🔂 `for`

Ideal quando a repetição possui inicialização, condição e atualização bem definidas.

```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```

Estrutura:

```text
for (inicialização; condição; atualização)
```

Exemplo clássico:

```java
for (int i = 1; i <= 10; i++) {
    System.out.println("5 x " + i + " = " + (5 * i));
}
```

---

# 📦 `for-each`

Usado principalmente para percorrer arrays e coleções quando o índice não é necessário.

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

Comparação:

| Necessidade                    | Estrutura  |
| ------------------------------ | ---------- |
| Precisa do índice              | `for`      |
| Precisa percorrer elementos    | `for-each` |
| Controle manual do incremento  | `for`      |
| Leitura simples de uma coleção | `for-each` |

---

# 🛑 `break`

Encerra imediatamente o loop ou `switch` atual.

```java
for (int i = 0; i < 10; i++) {

    if (i == 5) {
        break;
    }

    System.out.println(i);
}
```

Saída:

```text
0
1
2
3
4
```

---

# ⏭️ `continue`

Ignora a iteração atual e continua com a próxima.

```java
for (int i = 1; i <= 10; i++) {

    if (i % 2 != 0) {
        continue;
    }

    System.out.println(i);
}
```

Saída:

```text
2
4
6
8
10
```

---

# 🏷️ Labels

Labels permitem identificar loops, principalmente em estruturas aninhadas.

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

Também é possível utilizar:

```java
continue externo;
```

> Labels são úteis em casos específicos, mas devem ser usados com moderação para não dificultar a leitura do fluxo.

---

# 🧭 Qual estrutura utilizar?

| Situação                                      | Escolha comum |
| --------------------------------------------- | ------------- |
| Uma condição simples                          | `if`          |
| Dois caminhos                                 | `if / else`   |
| Várias condições                              | `else if`     |
| Vários valores específicos                    | `switch`      |
| Decisão simples produzindo um valor           | `?:`          |
| Repetição com quantidade/controlador definido | `for`         |
| Repetição baseada em condição                 | `while`       |
| Precisa executar pelo menos uma vez           | `do while`    |
| Percorrer array/coleção sem índice            | `for-each`    |
| Encerrar uma repetição                        | `break`       |
| Pular uma iteração                            | `continue`    |

---

# 📊 Comparação rápida

### Condicionais

| `if`                | `switch`                              |
| ------------------- | ------------------------------------- |
| Condições complexas | Valores específicos                   |
| Intervalos          | Casos definidos                       |
| `&&`, `||`, `!`     | `case`                                |
| Maior flexibilidade | Mais organizado para múltiplas opções |

### Loops

| `for`                                  | `while`            | `do while`                 |
| -------------------------------------- | ------------------ | -------------------------- |
| Repetição controlada                   | Condição dinâmica  | Executa pelo menos uma vez |
| Índices/contadores                     | Menus/condições    | Entrada e validação        |
| Inicialização + condição + atualização | Condição no início | Condição no final          |

---

# ⚠️ Erros comuns

| Problema                          | Correto                             |
| --------------------------------- | ----------------------------------- |
| `if (idade = 18)`                 | `if (idade == 18)`                  |
| `10 / 3` esperando `3.33`         | `10.0 / 3`                          |
| Comparar `String` com `==`        | `"Java".equals(nome)`               |
| Dividir por zero                  | Validar o divisor                   |
| Loop sem atualização              | Atualizar a variável de controle    |
| Usar `continue` para sair do loop | Usar `break`                        |
| `switch` tradicional sem `break`  | Adicionar `break` quando necessário |
| Muitos `if` aninhados             | Simplificar ou extrair métodos      |

---

# 📁 Estrutura do projeto

Dentro do **JavaBasicCommands**, este conteúdo está organizado da seguinte forma:

```text
JavaBasicCommands/
│
├── Condicionais_Repeticoes_Operadores/
│   │
│   ├── Condicionais/
│   │   └── Exemplos de estruturas condicionais
│   │
│   ├── Operadores/
│   │   └── Exemplos de operadores
│   │
│   ├── Repeticao/
│   │   └── Exemplos de estruturas de repetição
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

Os exemplos práticos deste conteúdo estão indicados e organizados nas pastas:

* **Condicionais**: exemplos de estruturas condicionais;
* **Operadores**: exemplos dos operadores da linguagem Java;
* **Repeticao**: exemplos de estruturas de repetição.

Os arquivos em português e inglês permitem consultar o mesmo conteúdo em diferentes idiomas, enquanto os diretórios separam os exemplos por assunto.

---

# ▶️ Executando os exemplos

É necessário possuir um **JDK** configurado.

Verifique:

```bash
java -version
```

```bash
javac -version
```

Para compilar um exemplo:

```bash
javac Main.java
```

Para executar:

```bash
java Main
```

Também é possível executar os arquivos diretamente por uma IDE compatível com Java.

---

# ☕ Sobre

Este diretório faz parte do **JavaBasicCommands**, um projeto de estudos voltado à prática dos fundamentos da linguagem Java por meio de exemplos pequenos, organizados e progressivos.

**Autor:** Eduardo Fernandez Evangelista

**GitHub:** `EduardoFernandezEvangelista`

---

<div align="center">

### ☕ JavaBasicCommands

**Aprender → Praticar → Aplicar → Evoluir**

</div>
