# 📥📤 Java — Entrada e Saída (I/O)

> Entrada e saída, ou **I/O (Input/Output)**, é a forma como uma aplicação Java recebe, processa e envia dados.

No dia a dia, uma aplicação pode:

| Operação             | Exemplos                                      |
| -------------------- | --------------------------------------------- |
| 📥 **Input**         | Ler dados do teclado, arquivos ou rede        |
| ⚙️ **Processamento** | Validar, transformar ou armazenar informações |
| 📤 **Output**        | Exibir dados, salvar arquivos ou enviar dados |

```text
Origem dos dados
       ↓
Entrada (Input)
       ↓
Programa Java
       ↓
Processamento
       ↓
Saída (Output)
       ↓
Destino dos dados
```

Java possui diferentes APIs de I/O porque cada situação exige uma abordagem específica. Ler um nome digitado no teclado, copiar uma imagem, escrever um arquivo ou receber dados de uma rede são operações semelhantes em conceito, mas diferentes na implementação.

---

# `System.in`, `System.out` e `System.err`

A classe `System` disponibiliza os principais fluxos padrão da aplicação.

| Fluxo        | Tipo          | Utilização                            |
| ------------ | ------------- | ------------------------------------- |
| `System.in`  | `InputStream` | Entrada padrão, normalmente o teclado |
| `System.out` | `PrintStream` | Saída padrão, normalmente o console   |
| `System.err` | `PrintStream` | Mensagens de erro e avisos            |

## `System.out`

`System.out` é utilizado para exibir informações no console.

| Método      | Função                                          |
| ----------- | ----------------------------------------------- |
| `print()`   | Exibe o conteúdo sem quebrar a linha            |
| `println()` | Exibe o conteúdo e quebra a linha               |
| `printf()`  | Exibe o conteúdo com formatação                 |
| `format()`  | Exibe o conteúdo utilizando formatação          |
| `flush()`   | Força o envio imediato do conteúdo para a saída |

## Outras formas de escrever no Java atual

Em versões recentes do Java, também é possível utilizar referências estáticas ou criar uma referência local para o fluxo de saída.

### Importação estática de `System.out`

```java
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        out.println("Olá, Java!");
        out.print("Mensagem sem quebra de linha");
    }
}
```

### Referência local para `System.out`

```java
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {

        PrintStream output = System.out;

        output.println("Olá, Java!");
        output.print("Outra mensagem");
    }
}
```

### `System.console()`

Também é possível utilizar `System.console()` em aplicações executadas diretamente no terminal.

```java
public class Main {

    public static void main(String[] args) {

        var console = System.console();

        if (console != null) {
            console.writer().println("Mensagem no console");
        }
    }
}
```

Apesar dessas alternativas, `System.out.println()` continua sendo a forma mais comum e direta para exemplos, testes rápidos e aplicações simples.

## `System.in`

`System.in` representa a entrada padrão da aplicação. Normalmente, essa entrada vem do teclado.

```text
Teclado
   ↓
System.in
   ↓
Programa Java
```

Por ser um fluxo de bytes, `System.in` geralmente é utilizado junto com classes como `Scanner`, `InputStreamReader` ou `BufferedReader`.

## `System.err`

`System.err` é utilizado para mensagens de erro ou avisos.

| Método              | Função                                         |
| ------------------- | ---------------------------------------------- |
| `print()`           | Exibe uma mensagem de erro sem quebrar a linha |
| `println()`         | Exibe uma mensagem de erro e quebra a linha    |
| `printf()`          | Exibe uma mensagem de erro formatada           |
| `flush()`           | Força o envio imediato da mensagem de erro     |
| `printStackTrace()` | Exibe informações detalhadas de uma exceção    |

---

# ⌨️ `Scanner`

A classe `Scanner` facilita a leitura de dados digitados pelo usuário. Ela funciona como uma camada de leitura sobre `System.in` e consegue converter os valores para tipos primitivos.

```text
Teclado
   ↓
System.in
   ↓
Scanner
   ↓
Programa Java
```

## Principais métodos

| Método                | Função                                     |
| --------------------- | ------------------------------------------ |
| `next()`              | Lê o próximo token                         |
| `nextLine()`          | Lê uma linha completa                      |
| `nextInt()`           | Lê um número inteiro                       |
| `nextDouble()`        | Lê um número decimal                       |
| `nextFloat()`         | Lê um número decimal do tipo `float`       |
| `nextLong()`          | Lê um número do tipo `long`                |
| `nextShort()`         | Lê um número do tipo `short`               |
| `nextByte()`          | Lê um número do tipo `byte`                |
| `nextBoolean()`       | Lê um valor booleano                       |
| `hasNext()`           | Verifica se existe outro token             |
| `hasNextLine()`       | Verifica se existe outra linha             |
| `hasNextInt()`        | Verifica se o próximo valor é inteiro      |
| `hasNextDouble()`     | Verifica se o próximo valor é decimal      |
| `hasNextFloat()`      | Verifica se o próximo valor é `float`      |
| `hasNextLong()`       | Verifica se o próximo valor é `long`       |
| `hasNextBoolean()`    | Verifica se o próximo valor é booleano     |
| `useDelimiter()`      | Define o separador utilizado na leitura    |
| `useLocale()`         | Define a localidade utilizada na conversão |
| `skip()`              | Ignora parte do conteúdo de entrada        |
| `findInLine()`        | Procura um padrão na linha atual           |
| `findWithinHorizon()` | Procura um padrão dentro de um limite      |
| `close()`             | Fecha o scanner                            |

## `next()` x `nextLine()`

A diferença entre esses métodos costuma causar confusão.

| Método       | Comportamento                         |
| ------------ | ------------------------------------- |
| `next()`     | Lê apenas o próximo token             |
| `nextLine()` | Lê toda a linha até a quebra de linha |

Exemplo:

```text
Entrada:
João Silva 25

next()
→ João

nextLine()
→ João Silva 25
```

Ao misturar métodos como `nextInt()` com `nextLine()`, é necessário prestar atenção ao caractere de quebra de linha que permanece no buffer:

```java
import java.util.Scanner;

public class ExemploScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println(nome + " tem " + idade + " anos.");

        scanner.close();
    }
}
```

---

# Outras APIs de Entrada e Saída

As APIs abaixo são organizadas por biblioteca ou grupo de classes. Cada tabela apresenta as principais funções e a finalidade de cada recurso.

---

## `BufferedReader`

A classe `BufferedReader` pertence ao pacote `java.io` e serve para realizar a leitura eficiente de caracteres. Ela utiliza um buffer para reduzir o número de acessos à origem dos dados.

| Método                                | Função                                                |
| ------------------------------------- | ----------------------------------------------------- |
| `read()`                              | Lê um caractere                                       |
| `read(char[] cbuf)`                   | Lê caracteres para um array                           |
| `read(char[] cbuf, int off, int len)` | Lê uma quantidade específica de caracteres            |
| `readLine()`                          | Lê uma linha completa                                 |
| `skip(long n)`                        | Ignora uma quantidade de caracteres                   |
| `ready()`                             | Verifica se a leitura pode ser realizada sem bloqueio |
| `mark(int readAheadLimit)`            | Marca uma posição para possível retorno               |
| `reset()`                             | Retorna à posição marcada                             |
| `markSupported()`                     | Verifica se a marcação de posição é suportada         |
| `close()`                             | Fecha o leitor                                        |

---

## `InputStreamReader`

A classe `InputStreamReader` pertence ao pacote `java.io` e serve para converter um fluxo de bytes em um fluxo de caracteres. É útil quando a origem fornece bytes, mas o programa precisa trabalhar com texto.

| Método                                | Função                                                |
| ------------------------------------- | ----------------------------------------------------- |
| `read()`                              | Lê um caractere                                       |
| `read(char[] cbuf)`                   | Lê caracteres para um array                           |
| `read(char[] cbuf, int off, int len)` | Lê uma quantidade específica de caracteres            |
| `ready()`                             | Verifica se a leitura pode ser realizada sem bloqueio |
| `getEncoding()`                       | Retorna a codificação utilizada                       |
| `skip(long n)`                        | Ignora caracteres                                     |
| `mark(int readAheadLimit)`            | Marca uma posição de leitura                          |
| `reset()`                             | Retorna à posição marcada                             |
| `close()`                             | Fecha o leitor                                        |

---

## `Reader`

A classe abstrata `Reader` pertence ao pacote `java.io` e serve como base para as classes que realizam leitura de caracteres.

| Método                                | Função                                     |
| ------------------------------------- | ------------------------------------------ |
| `read()`                              | Lê um caractere                            |
| `read(char[] cbuf)`                   | Lê caracteres para um array                |
| `read(char[] cbuf, int off, int len)` | Lê uma quantidade específica de caracteres |
| `skip(long n)`                        | Ignora caracteres                          |
| `ready()`                             | Verifica se existem caracteres disponíveis |
| `mark(int readAheadLimit)`            | Marca uma posição de leitura               |
| `reset()`                             | Retorna à posição marcada                  |
| `markSupported()`                     | Verifica se a marcação é suportada         |
| `transferTo(Writer out)`              | Transfere caracteres para um escritor      |
| `close()`                             | Fecha o leitor                             |

---

## `FileReader`

A classe `FileReader` pertence ao pacote `java.io` e serve para ler caracteres diretamente de arquivos de texto.

| Método                                | Função                                     |
| ------------------------------------- | ------------------------------------------ |
| `read()`                              | Lê um caractere                            |
| `read(char[] cbuf)`                   | Lê caracteres para um array                |
| `read(char[] cbuf, int off, int len)` | Lê uma quantidade específica de caracteres |
| `skip(long n)`                        | Ignora caracteres do arquivo               |
| `ready()`                             | Verifica se existem dados disponíveis      |
| `getEncoding()`                       | Retorna a codificação utilizada            |
| `close()`                             | Fecha o arquivo                            |

---

## `StringReader`

A classe `StringReader` pertence ao pacote `java.io` e serve para tratar o conteúdo de uma `String` como uma fonte de leitura de caracteres.

| Método                                | Função                                     |
| ------------------------------------- | ------------------------------------------ |
| `read()`                              | Lê um caractere da string                  |
| `read(char[] cbuf)`                   | Lê caracteres para um array                |
| `read(char[] cbuf, int off, int len)` | Lê uma quantidade específica de caracteres |
| `skip(long n)`                        | Ignora caracteres                          |
| `ready()`                             | Verifica se existem caracteres disponíveis |
| `mark(int readAheadLimit)`            | Marca uma posição                          |
| `reset()`                             | Retorna à posição marcada                  |
| `markSupported()`                     | Verifica se a marcação é suportada         |
| `close()`                             | Fecha o leitor                             |

---

## `Writer`

A classe abstrata `Writer` pertence ao pacote `java.io` e serve como base para as classes que escrevem caracteres.

| Método                                         | Função                               |
| ---------------------------------------------- | ------------------------------------ |
| `write(int c)`                                 | Escreve um caractere                 |
| `write(char[] cbuf)`                           | Escreve um array de caracteres       |
| `write(char[] cbuf, int off, int len)`         | Escreve parte de um array            |
| `write(String str)`                            | Escreve uma string                   |
| `write(String str, int off, int len)`          | Escreve parte de uma string          |
| `append(char c)`                               | Adiciona um caractere                |
| `append(CharSequence csq)`                     | Adiciona uma sequência de caracteres |
| `append(CharSequence csq, int start, int end)` | Adiciona parte de uma sequência      |
| `flush()`                                      | Envia os dados pendentes             |
| `close()`                                      | Fecha o escritor                     |

---

## `BufferedWriter`

A classe `BufferedWriter` pertence ao pacote `java.io` e serve para escrever texto utilizando um buffer, reduzindo acessos diretos ao destino.

| Método                                 | Função                                  |
| -------------------------------------- | --------------------------------------- |
| `write(int c)`                         | Escreve um caractere                    |
| `write(char[] cbuf)`                   | Escreve um array de caracteres          |
| `write(char[] cbuf, int off, int len)` | Escreve parte de um array               |
| `write(String s)`                      | Escreve uma string                      |
| `write(String s, int off, int len)`    | Escreve parte de uma string             |
| `newLine()`                            | Escreve o separador de linha do sistema |
| `append(char c)`                       | Adiciona um caractere                   |
| `append(CharSequence csq)`             | Adiciona uma sequência de caracteres    |
| `flush()`                              | Envia os dados do buffer                |
| `close()`                              | Fecha o escritor                        |

---

## `FileWriter`

A classe `FileWriter` pertence ao pacote `java.io` e serve para escrever caracteres em arquivos de texto.

| Método                                 | Função                               |
| -------------------------------------- | ------------------------------------ |
| `write(int c)`                         | Escreve um caractere                 |
| `write(char[] cbuf)`                   | Escreve um array de caracteres       |
| `write(char[] cbuf, int off, int len)` | Escreve parte de um array            |
| `write(String str)`                    | Escreve uma string                   |
| `write(String str, int off, int len)`  | Escreve parte de uma string          |
| `append(char c)`                       | Adiciona um caractere                |
| `append(CharSequence csq)`             | Adiciona uma sequência de caracteres |
| `flush()`                              | Envia os dados pendentes             |
| `close()`                              | Fecha o arquivo                      |

---

## `OutputStreamWriter`

A classe `OutputStreamWriter` pertence ao pacote `java.io` e serve para converter caracteres em bytes. É utilizada quando o destino trabalha com bytes, mas o programa produz texto.

| Método                                 | Função                              |
| -------------------------------------- | ----------------------------------- |
| `write(int c)`                         | Escreve um caractere                |
| `write(char[] cbuf)`                   | Escreve caracteres                  |
| `write(char[] cbuf, int off, int len)` | Escreve parte de um array           |
| `write(String str)`                    | Escreve uma string                  |
| `write(String str, int off, int len)`  | Escreve parte de uma string         |
| `getEncoding()`                        | Retorna a codificação utilizada     |
| `append(char c)`                       | Adiciona um caractere               |
| `append(CharSequence csq)`             | Adiciona uma sequência              |
| `flush()`                              | Converte e envia os dados pendentes |
| `close()`                              | Fecha o escritor                    |

---

## `PrintWriter`

A classe `PrintWriter` pertence ao pacote `java.io` e serve para facilitar a escrita de texto, mensagens e dados formatados.

| Método         | Função                               |
| -------------- | ------------------------------------ |
| `print()`      | Escreve um valor sem quebra de linha |
| `println()`    | Escreve um valor e quebra a linha    |
| `printf()`     | Escreve dados formatados             |
| `format()`     | Escreve dados utilizando formatação  |
| `append()`     | Adiciona caracteres ou sequências    |
| `write()`      | Escreve caracteres ou strings        |
| `flush()`      | Envia os dados pendentes             |
| `checkError()` | Verifica se ocorreu algum erro       |
| `clearError()` | Limpa o estado de erro               |
| `close()`      | Fecha o escritor                     |

---

## `InputStream`

A classe abstrata `InputStream` pertence ao pacote `java.io` e serve como base para a leitura de dados em bytes.

| Método                             | Função                                      |
| ---------------------------------- | ------------------------------------------- |
| `read()`                           | Lê um byte                                  |
| `read(byte[] b)`                   | Lê bytes para um array                      |
| `read(byte[] b, int off, int len)` | Lê uma quantidade específica de bytes       |
| `readAllBytes()`                   | Lê todos os bytes disponíveis               |
| `readNBytes()`                     | Lê até uma quantidade determinada de bytes  |
| `skip(long n)`                     | Ignora bytes                                |
| `available()`                      | Retorna uma estimativa de bytes disponíveis |
| `mark(int readlimit)`              | Marca uma posição de leitura                |
| `reset()`                          | Retorna à posição marcada                   |
| `markSupported()`                  | Verifica se a marcação é suportada          |
| `transferTo(OutputStream out)`     | Transfere dados para um fluxo de saída      |
| `close()`                          | Fecha o fluxo                               |

---

## `OutputStream`

A classe abstrata `OutputStream` pertence ao pacote `java.io` e serve como base para a escrita de dados em bytes.

| Método                              | Função                    |
| ----------------------------------- | ------------------------- |
| `write(int b)`                      | Escreve um byte           |
| `write(byte[] b)`                   | Escreve um array de bytes |
| `write(byte[] b, int off, int len)` | Escreve parte de um array |
| `flush()`                           | Envia os dados pendentes  |
| `close()`                           | Fecha o fluxo             |

---

## `FileInputStream`

A classe `FileInputStream` pertence ao pacote `java.io` e serve para ler bytes diretamente de arquivos.

| Método                             | Função                                      |
| ---------------------------------- | ------------------------------------------- |
| `read()`                           | Lê um byte                                  |
| `read(byte[] b)`                   | Lê bytes para um array                      |
| `read(byte[] b, int off, int len)` | Lê parte dos dados                          |
| `skip(long n)`                     | Ignora bytes                                |
| `available()`                      | Retorna uma estimativa de bytes disponíveis |
| `getChannel()`                     | Retorna o canal associado ao arquivo        |
| `getFD()`                          | Retorna o descritor do arquivo              |
| `close()`                          | Fecha o arquivo                             |

---

## `FileOutputStream`

A classe `FileOutputStream` pertence ao pacote `java.io` e serve para escrever bytes diretamente em arquivos.

| Método                              | Função                               |
| ----------------------------------- | ------------------------------------ |
| `write(int b)`                      | Escreve um byte                      |
| `write(byte[] b)`                   | Escreve um array de bytes            |
| `write(byte[] b, int off, int len)` | Escreve parte de um array            |
| `flush()`                           | Envia os dados pendentes             |
| `getChannel()`                      | Retorna o canal associado ao arquivo |
| `getFD()`                           | Retorna o descritor do arquivo       |
| `close()`                           | Fecha o arquivo                      |

---

## `BufferedInputStream`

A classe `BufferedInputStream` pertence ao pacote `java.io` e serve para melhorar a leitura de bytes utilizando um buffer interno.

| Método                             | Função                                      |
| ---------------------------------- | ------------------------------------------- |
| `read()`                           | Lê um byte                                  |
| `read(byte[] b)`                   | Lê bytes para um array                      |
| `read(byte[] b, int off, int len)` | Lê parte dos dados                          |
| `skip(long n)`                     | Ignora bytes                                |
| `available()`                      | Retorna uma estimativa de bytes disponíveis |
| `mark(int readlimit)`              | Marca uma posição                           |
| `reset()`                          | Retorna à posição marcada                   |
| `markSupported()`                  | Verifica se a marcação é suportada          |
| `close()`                          | Fecha o fluxo                               |

---

## `BufferedOutputStream`

A classe `BufferedOutputStream` pertence ao pacote `java.io` e serve para melhorar a escrita de bytes utilizando um buffer interno.

| Método                              | Função                    |
| ----------------------------------- | ------------------------- |
| `write(int b)`                      | Escreve um byte no buffer |
| `write(byte[] b)`                   | Escreve bytes no buffer   |
| `write(byte[] b, int off, int len)` | Escreve parte de um array |
| `flush()`                           | Envia os dados do buffer  |
| `close()`                           | Fecha o fluxo             |

---

## `ByteArrayInputStream`

A classe `ByteArrayInputStream` pertence ao pacote `java.io` e serve para ler bytes armazenados em um array na memória.

| Método                             | Função                                    |
| ---------------------------------- | ----------------------------------------- |
| `read()`                           | Lê um byte                                |
| `read(byte[] b)`                   | Lê bytes para um array                    |
| `read(byte[] b, int off, int len)` | Lê parte dos dados                        |
| `readAllBytes()`                   | Lê todos os bytes restantes               |
| `skip(long n)`                     | Ignora bytes                              |
| `available()`                      | Retorna a quantidade de bytes disponíveis |
| `mark(int readAheadLimit)`         | Marca uma posição                         |
| `reset()`                          | Retorna ao início ou à posição marcada    |
| `markSupported()`                  | Informa se a marcação é suportada         |
| `close()`                          | Fecha o fluxo em memória                  |

---

## `ByteArrayOutputStream`

A classe `ByteArrayOutputStream` pertence ao pacote `java.io` e serve para escrever bytes em uma estrutura de memória que pode ser convertida posteriormente em array ou string.

| Método                              | Função                                         |
| ----------------------------------- | ---------------------------------------------- |
| `write(int b)`                      | Escreve um byte                                |
| `write(byte[] b)`                   | Escreve um array de bytes                      |
| `write(byte[] b, int off, int len)` | Escreve parte de um array                      |
| `writeBytes(byte[] b)`              | Escreve todos os bytes do array                |
| `writeTo(OutputStream out)`         | Envia o conteúdo para outro fluxo              |
| `toByteArray()`                     | Retorna os dados como array de bytes           |
| `toString()`                        | Converte os dados para string                  |
| `reset()`                           | Limpa o conteúdo armazenado                    |
| `size()`                            | Retorna a quantidade de bytes armazenados      |
| `flush()`                           | Não realiza operação significativa nesse fluxo |
| `close()`                           | Fecha o fluxo em memória                       |

---

## `DataInputStream`

A classe `DataInputStream` pertence ao pacote `java.io` e serve para ler tipos primitivos em formato binário.

| Método                | Função                                 |
| --------------------- | -------------------------------------- |
| `readBoolean()`       | Lê um booleano                         |
| `readByte()`          | Lê um byte                             |
| `readUnsignedByte()`  | Lê um byte sem sinal                   |
| `readShort()`         | Lê um `short`                          |
| `readUnsignedShort()` | Lê um `short` sem sinal                |
| `readChar()`          | Lê um caractere                        |
| `readInt()`           | Lê um inteiro                          |
| `readLong()`          | Lê um `long`                           |
| `readFloat()`         | Lê um `float`                          |
| `readDouble()`        | Lê um `double`                         |
| `readUTF()`           | Lê uma string no formato UTF           |
| `readFully()`         | Garante a leitura completa de um array |
| `skipBytes()`         | Ignora uma quantidade de bytes         |
| `read()`              | Lê um byte                             |
| `close()`             | Fecha o fluxo                          |

---

## `DataOutputStream`

A classe `DataOutputStream` pertence ao pacote `java.io` e serve para escrever tipos primitivos em formato binário.

| Método           | Função                                 |
| ---------------- | -------------------------------------- |
| `writeBoolean()` | Escreve um booleano                    |
| `writeByte()`    | Escreve um byte                        |
| `writeShort()`   | Escreve um `short`                     |
| `writeChar()`    | Escreve um caractere                   |
| `writeInt()`     | Escreve um inteiro                     |
| `writeLong()`    | Escreve um `long`                      |
| `writeFloat()`   | Escreve um `float`                     |
| `writeDouble()`  | Escreve um `double`                    |
| `writeUTF()`     | Escreve uma string no formato UTF      |
| `write()`        | Escreve um byte ou array de bytes      |
| `size()`         | Retorna a quantidade de bytes escritos |
| `flush()`        | Envia os dados pendentes               |
| `close()`        | Fecha o fluxo                          |

---

## `ObjectInputStream`

A classe `ObjectInputStream` pertence ao pacote `java.io` e serve para ler e desserializar objetos gravados em formato binário.

| Método                 | Função                                                 |
| ---------------------- | ------------------------------------------------------ |
| `readObject()`         | Lê e reconstrói um objeto                              |
| `readUnshared()`       | Lê um objeto sem reutilizar referências compartilhadas |
| `readBoolean()`        | Lê um booleano                                         |
| `readByte()`           | Lê um byte                                             |
| `readShort()`          | Lê um `short`                                          |
| `readChar()`           | Lê um caractere                                        |
| `readInt()`            | Lê um inteiro                                          |
| `readLong()`           | Lê um `long`                                           |
| `readFloat()`          | Lê um `float`                                          |
| `readDouble()`         | Lê um `double`                                         |
| `readUTF()`            | Lê uma string UTF                                      |
| `defaultReadObject()`  | Lê os campos padrão de um objeto                       |
| `registerValidation()` | Registra uma validação durante a desserialização       |
| `close()`              | Fecha o fluxo                                          |

---

## `ObjectOutputStream`

A classe `ObjectOutputStream` pertence ao pacote `java.io` e serve para serializar objetos e gravá-los em formato binário.

| Método                 | Função                                         |
| ---------------------- | ---------------------------------------------- |
| `writeObject()`        | Serializa e escreve um objeto                  |
| `writeUnshared()`      | Escreve um objeto sem compartilhar referências |
| `writeBoolean()`       | Escreve um booleano                            |
| `writeByte()`          | Escreve um byte                                |
| `writeShort()`         | Escreve um `short`                             |
| `writeChar()`          | Escreve um caractere                           |
| `writeInt()`           | Escreve um inteiro                             |
| `writeLong()`          | Escreve um `long`                              |
| `writeFloat()`         | Escreve um `float`                             |
| `writeDouble()`        | Escreve um `double`                            |
| `writeUTF()`           | Escreve uma string UTF                         |
| `defaultWriteObject()` | Escreve os campos padrão de um objeto          |
| `reset()`              | Limpa o estado de referências do fluxo         |
| `flush()`              | Envia os dados pendentes                       |
| `close()`              | Fecha o fluxo                                  |

---

## `SequenceInputStream`

A classe `SequenceInputStream` pertence ao pacote `java.io` e serve para combinar dois ou mais fluxos de entrada em uma única sequência contínua.

| Método                             | Função                                      |
| ---------------------------------- | ------------------------------------------- |
| `read()`                           | Lê um byte do fluxo atual                   |
| `read(byte[] b)`                   | Lê bytes para um array                      |
| `read(byte[] b, int off, int len)` | Lê parte dos dados                          |
| `available()`                      | Retorna uma estimativa de bytes disponíveis |
| `close()`                          | Fecha todos os fluxos combinados            |

---

## `File`

A classe `File` pertence ao pacote `java.io` e representa arquivos e diretórios. É uma API tradicional para consultar propriedades e realizar operações básicas no sistema de arquivos.

| Método               | Função                                         |
| -------------------- | ---------------------------------------------- |
| `exists()`           | Verifica se o arquivo ou diretório existe      |
| `isFile()`           | Verifica se representa um arquivo              |
| `isDirectory()`      | Verifica se representa um diretório            |
| `createNewFile()`    | Cria um novo arquivo                           |
| `mkdir()`            | Cria um diretório                              |
| `mkdirs()`           | Cria diretórios e subdiretórios necessários    |
| `delete()`           | Exclui o arquivo ou diretório                  |
| `renameTo()`         | Renomeia ou move o arquivo                     |
| `list()`             | Lista os nomes do conteúdo de um diretório     |
| `listFiles()`        | Lista os arquivos e diretórios de um diretório |
| `length()`           | Retorna o tamanho do arquivo                   |
| `lastModified()`     | Retorna a data da última modificação           |
| `getName()`          | Retorna o nome do arquivo                      |
| `getPath()`          | Retorna o caminho informado                    |
| `getAbsolutePath()`  | Retorna o caminho absoluto                     |
| `getCanonicalPath()` | Retorna o caminho canônico                     |
| `canRead()`          | Verifica se o arquivo pode ser lido            |
| `canWrite()`         | Verifica se o arquivo pode ser alterado        |
| `canExecute()`       | Verifica se o arquivo pode ser executado       |
| `isHidden()`         | Verifica se o arquivo está oculto              |
| `toURI()`            | Converte o caminho para uma URI                |

---

## `RandomAccessFile`

A classe `RandomAccessFile` pertence ao pacote `java.io` e serve para ler e escrever dados em posições específicas de um arquivo.

| Método             | Função                                    |
| ------------------ | ----------------------------------------- |
| `read()`           | Lê um byte                                |
| `readInt()`        | Lê um inteiro                             |
| `readLong()`       | Lê um `long`                              |
| `readDouble()`     | Lê um `double`                            |
| `readUTF()`        | Lê uma string UTF                         |
| `write()`          | Escreve bytes                             |
| `writeInt()`       | Escreve um inteiro                        |
| `writeLong()`      | Escreve um `long`                         |
| `writeDouble()`    | Escreve um `double`                       |
| `writeUTF()`       | Escreve uma string UTF                    |
| `seek()`           | Move o cursor para uma posição específica |
| `getFilePointer()` | Retorna a posição atual do cursor         |
| `length()`         | Retorna o tamanho do arquivo              |
| `setLength()`      | Define o tamanho do arquivo               |
| `skipBytes()`      | Avança uma quantidade de bytes            |
| `readFully()`      | Garante a leitura completa dos dados      |
| `close()`          | Fecha o arquivo                           |

---

# Java NIO.2 — `Path`, `Files` e `Paths`

O pacote `java.nio.file` fornece uma API moderna para trabalhar com arquivos, diretórios e caminhos. Em projetos atuais, `Path` e `Files` geralmente são preferíveis à classe `File`.

---

## `Path`

A interface `Path` representa o caminho de um arquivo ou diretório.

| Método             | Função                                         |
| ------------------ | ---------------------------------------------- |
| `getFileName()`    | Retorna o último elemento do caminho           |
| `getParent()`      | Retorna o diretório pai                        |
| `getRoot()`        | Retorna a raiz do caminho                      |
| `getName()`        | Retorna um elemento específico do caminho      |
| `getNameCount()`   | Retorna a quantidade de elementos              |
| `subpath()`        | Retorna uma parte do caminho                   |
| `startsWith()`     | Verifica se começa com determinado caminho     |
| `endsWith()`       | Verifica se termina com determinado caminho    |
| `normalize()`      | Remove elementos redundantes                   |
| `resolve()`        | Combina dois caminhos                          |
| `resolveSibling()` | Combina um caminho com o diretório pai         |
| `relativize()`     | Calcula o caminho relativo entre dois caminhos |
| `toAbsolutePath()` | Converte para caminho absoluto                 |
| `toRealPath()`     | Retorna o caminho real existente               |
| `toFile()`         | Converte para um objeto `File`                 |
| `toUri()`          | Converte para uma URI                          |
| `iterator()`       | Percorre os elementos do caminho               |

---

## `Paths`

A classe `Paths` pertence ao pacote `java.nio.file` e serve para criar objetos `Path`.

| Método                              | Função                                          |
| ----------------------------------- | ----------------------------------------------- |
| `get(String first, String... more)` | Cria um `Path` a partir de partes de um caminho |

---

## `Files`

A classe `Files` pertence ao pacote `java.nio.file` e fornece operações modernas para criar, ler, escrever, copiar, mover, excluir e consultar arquivos e diretórios.

| Método                      | Função                                                |
| --------------------------- | ----------------------------------------------------- |
| `exists()`                  | Verifica se o caminho existe                          |
| `notExists()`               | Verifica se o caminho não existe                      |
| `isRegularFile()`           | Verifica se o caminho representa um arquivo comum     |
| `isDirectory()`             | Verifica se o caminho representa um diretório         |
| `isReadable()`              | Verifica se o caminho pode ser lido                   |
| `isWritable()`              | Verifica se o caminho pode ser alterado               |
| `isExecutable()`            | Verifica se o caminho pode ser executado              |
| `createFile()`              | Cria um arquivo vazio                                 |
| `createDirectory()`         | Cria um diretório                                     |
| `createDirectories()`       | Cria diretórios e subdiretórios necessários           |
| `delete()`                  | Exclui um arquivo ou diretório                        |
| `deleteIfExists()`          | Exclui se o caminho existir                           |
| `copy()`                    | Copia um arquivo ou diretório                         |
| `move()`                    | Move ou renomeia um arquivo ou diretório              |
| `readAllBytes()`            | Lê todos os bytes de um arquivo                       |
| `readString()`              | Lê todo o conteúdo como string                        |
| `readAllLines()`            | Lê todas as linhas de um arquivo                      |
| `newBufferedReader()`       | Cria um leitor com buffer                             |
| `newInputStream()`          | Cria um fluxo de entrada                              |
| `write()`                   | Escreve bytes em um arquivo                           |
| `writeString()`             | Escreve uma string em um arquivo                      |
| `newBufferedWriter()`       | Cria um escritor com buffer                           |
| `newOutputStream()`         | Cria um fluxo de saída                                |
| `size()`                    | Retorna o tamanho do arquivo                          |
| `getLastModifiedTime()`     | Retorna a data da última modificação                  |
| `getOwner()`                | Retorna o proprietário                                |
| `getPosixFilePermissions()` | Retorna permissões POSIX                              |
| `setLastModifiedTime()`     | Altera a data de modificação                          |
| `list()`                    | Lista o conteúdo de um diretório                      |
| `walk()`                    | Percorre uma árvore de diretórios                     |
| `find()`                    | Localiza caminhos usando um filtro                    |
| `lines()`                   | Retorna as linhas como um stream                      |
| `isSameFile()`              | Verifica se dois caminhos representam o mesmo arquivo |
| `probeContentType()`        | Tenta identificar o tipo de conteúdo                  |

---

## `DirectoryStream`

A interface `DirectoryStream` pertence ao pacote `java.nio.file` e serve para percorrer o conteúdo de um diretório.

| Método       | Função                                             |
| ------------ | -------------------------------------------------- |
| `iterator()` | Retorna um iterador para os elementos do diretório |
| `close()`    | Fecha o fluxo do diretório                         |

---

## `FileSystem`

A classe abstrata `FileSystem` representa um sistema de arquivos e fornece informações sobre seus caminhos, provedores e recursos disponíveis.

| Método                 | Função                                        |
| ---------------------- | --------------------------------------------- |
| `getPath()`            | Cria um caminho dentro do sistema de arquivos |
| `getRootDirectories()` | Retorna os diretórios raiz                    |
| `getFileStores()`      | Retorna os dispositivos de armazenamento      |
| `getSeparator()`       | Retorna o separador de caminhos               |
| `getPathMatcher()`     | Cria um mecanismo para comparar caminhos      |
| `newWatchService()`    | Cria um serviço de monitoramento              |
| `provider()`           | Retorna o provedor do sistema de arquivos     |
| `isOpen()`             | Verifica se o sistema está aberto             |
| `isReadOnly()`         | Verifica se o sistema é somente leitura       |
| `close()`              | Fecha o sistema de arquivos                   |

---

## `FileSystems`

A classe `FileSystems` pertence ao pacote `java.nio.file` e serve para acessar o sistema de arquivos padrão ou criar sistemas de arquivos adicionais.

| Método            | Função                                             |
| ----------------- | -------------------------------------------------- |
| `getDefault()`    | Retorna o sistema de arquivos padrão               |
| `getFileSystem()` | Retorna um sistema de arquivos associado a uma URI |
| `newFileSystem()` | Cria ou abre um sistema de arquivos                |

---

## `FileStore`

A classe `FileStore` representa uma unidade ou dispositivo de armazenamento.

| Método                        | Função                                           |
| ----------------------------- | ------------------------------------------------ |
| `name()`                      | Retorna o nome do armazenamento                  |
| `type()`                      | Retorna o tipo do armazenamento                  |
| `getTotalSpace()`             | Retorna o espaço total                           |
| `getUsableSpace()`            | Retorna o espaço disponível para a aplicação     |
| `getUnallocatedSpace()`       | Retorna o espaço não alocado                     |
| `supportsFileAttributeView()` | Verifica se suporta determinado tipo de atributo |
| `getFileStoreAttributeView()` | Retorna uma visão de atributos                   |
| `getAttribute()`              | Retorna um atributo específico                   |

---

## `WatchService`

A interface `WatchService` pertence ao pacote `java.nio.file` e serve para monitorar alterações em arquivos e diretórios.

| Método                              | Função                                      |
| ----------------------------------- | ------------------------------------------- |
| `poll()`                            | Obtém um evento disponível sem aguardar     |
| `poll(long timeout, TimeUnit unit)` | Aguarda por um evento durante um período    |
| `take()`                            | Aguarda até que um evento esteja disponível |
| `close()`                           | Fecha o serviço de monitoramento            |

---

## `WatchKey`

A classe `WatchKey` representa o registro de um diretório no serviço de monitoramento.

| Método         | Função                                     |
| -------------- | ------------------------------------------ |
| `pollEvents()` | Retorna os eventos detectados              |
| `reset()`      | Reativa a chave para receber novos eventos |
| `isValid()`    | Verifica se a chave ainda é válida         |
| `cancel()`     | Cancela o monitoramento                    |
| `watchable()`  | Retorna o caminho monitorado               |

---

## `WatchEvent`

A interface `WatchEvent` representa uma alteração detectada em um diretório monitorado.

| Método      | Função                                 |
| ----------- | -------------------------------------- |
| `kind()`    | Retorna o tipo do evento               |
| `count()`   | Retorna a quantidade de ocorrências    |
| `context()` | Retorna o contexto associado ao evento |

Tipos comuns de eventos:

| Evento         | Função                                            |
| -------------- | ------------------------------------------------- |
| `ENTRY_CREATE` | Indica a criação de um arquivo ou diretório       |
| `ENTRY_DELETE` | Indica a exclusão de um arquivo ou diretório      |
| `ENTRY_MODIFY` | Indica a alteração de um arquivo ou diretório     |
| `OVERFLOW`     | Indica que alguns eventos podem ter sido perdidos |

---

# Java NIO — Buffers e Channels

Java NIO oferece uma abordagem baseada em buffers e canais. Essa API é útil para operações de I/O mais eficientes, comunicação não bloqueante e aplicações que precisam lidar com várias conexões.

---

## `Buffer`

A classe abstrata `Buffer` representa uma área de memória utilizada temporariamente durante operações de leitura e escrita.

| Método                      | Função                                      |
| --------------------------- | ------------------------------------------- |
| `capacity()`                | Retorna a capacidade total do buffer        |
| `position()`                | Retorna a posição atual                     |
| `position(int newPosition)` | Altera a posição atual                      |
| `limit()`                   | Retorna o limite atual                      |
| `limit(int newLimit)`       | Altera o limite                             |
| `remaining()`               | Retorna a quantidade de elementos restantes |
| `hasRemaining()`            | Verifica se existem elementos restantes     |
| `flip()`                    | Prepara o buffer para leitura               |
| `clear()`                   | Prepara o buffer para nova escrita          |
| `rewind()`                  | Retorna a posição para o início             |
| `mark()`                    | Marca a posição atual                       |
| `reset()`                   | Retorna à posição marcada                   |
| `compact()`                 | Move os dados restantes para o início       |
| `isReadOnly()`              | Verifica se o buffer é somente leitura      |
| `array()`                   | Retorna o array interno, quando disponível  |
| `arrayOffset()`             | Retorna o deslocamento do array interno     |

---

## `ByteBuffer`

A classe `ByteBuffer` serve para armazenar e manipular bytes em memória.

| Método                   | Função                                    |
| ------------------------ | ----------------------------------------- |
| `allocate()`             | Cria um buffer na memória                 |
| `allocateDirect()`       | Cria um buffer direto                     |
| `wrap()`                 | Cria um buffer a partir de um array       |
| `get()`                  | Lê um byte                                |
| `get(byte[] dst)`        | Lê bytes para um array                    |
| `get(int index)`         | Lê um byte em uma posição específica      |
| `put()`                  | Escreve um byte                           |
| `put(byte[] src)`        | Escreve um array de bytes                 |
| `put(int index, byte b)` | Escreve um byte em uma posição específica |
| `getChar()`              | Lê um caractere                           |
| `getShort()`             | Lê um `short`                             |
| `getInt()`               | Lê um inteiro                             |
| `getLong()`              | Lê um `long`                              |
| `getFloat()`             | Lê um `float`                             |
| `getDouble()`            | Lê um `double`                            |
| `putChar()`              | Escreve um caractere                      |
| `putShort()`             | Escreve um `short`                        |
| `putInt()`               | Escreve um inteiro                        |
| `putLong()`              | Escreve um `long`                         |
| `putFloat()`             | Escreve um `float`                        |
| `putDouble()`            | Escreve um `double`                       |
| `order()`                | Consulta ou altera a ordem dos bytes      |
| `slice()`                | Cria uma visão parcial do buffer          |
| `duplicate()`            | Cria uma cópia da estrutura do buffer     |
| `asReadOnlyBuffer()`     | Cria uma visão somente leitura            |

---

## `Channel`

A interface `Channel` representa um canal de comunicação com arquivos, sockets ou outros recursos de I/O.

| Método     | Função                          |
| ---------- | ------------------------------- |
| `isOpen()` | Verifica se o canal está aberto |
| `close()`  | Fecha o canal                   |

---

## `FileChannel`

A classe `FileChannel` serve para realizar operações de leitura, escrita, posicionamento e transferência em arquivos utilizando canais.

| Método                                 | Função                                    |
| -------------------------------------- | ----------------------------------------- |
| `open()`                               | Abre ou cria um canal de arquivo          |
| `read(ByteBuffer dst)`                 | Lê dados para um buffer                   |
| `read(ByteBuffer dst, long position)`  | Lê dados a partir de uma posição          |
| `write(ByteBuffer src)`                | Escreve dados de um buffer                |
| `write(ByteBuffer src, long position)` | Escreve dados em uma posição              |
| `position()`                           | Retorna a posição atual                   |
| `position(long newPosition)`           | Altera a posição atual                    |
| `size()`                               | Retorna o tamanho do arquivo              |
| `truncate()`                           | Reduz o tamanho do arquivo                |
| `force()`                              | Força a gravação dos dados no dispositivo |
| `transferTo()`                         | Transfere dados para outro canal          |
| `transferFrom()`                       | Transfere dados de outro canal            |
| `map()`                                | Mapeia uma região do arquivo na memória   |
| `lock()`                               | Obtém um bloqueio no arquivo              |
| `tryLock()`                            | Tenta obter um bloqueio sem aguardar      |
| `isOpen()`                             | Verifica se o canal está aberto           |
| `close()`                              | Fecha o canal                             |

---

## `SocketChannel`

A classe `SocketChannel` serve para realizar comunicação TCP utilizando canais, podendo operar em modo bloqueante ou não bloqueante.

| Método                  | Função                                                |
| ----------------------- | ----------------------------------------------------- |
| `open()`                | Cria ou abre um canal TCP                             |
| `connect()`             | Conecta o canal a um servidor                         |
| `finishConnect()`       | Finaliza uma conexão iniciada de forma não bloqueante |
| `isConnected()`         | Verifica se o canal está conectado                    |
| `isConnectionPending()` | Verifica se existe uma conexão pendente               |
| `read(ByteBuffer dst)`  | Lê dados do socket                                    |
| `write(ByteBuffer src)` | Envia dados pelo socket                               |
| `shutdownInput()`       | Desativa a entrada do socket                          |
| `shutdownOutput()`      | Desativa a saída do socket                            |
| `bind()`                | Associa o canal a um endereço local                   |
| `setOption()`           | Define uma opção do socket                            |
| `getRemoteAddress()`    | Retorna o endereço remoto                             |
| `getLocalAddress()`     | Retorna o endereço local                              |
| `configureBlocking()`   | Define o modo bloqueante ou não bloqueante            |
| `isBlocking()`          | Verifica se o canal está em modo bloqueante           |
| `close()`               | Fecha o canal                                         |

---

## `ServerSocketChannel`

A classe `ServerSocketChannel` serve para criar servidores TCP baseados em canais.

| Método                | Função                                     |
| --------------------- | ------------------------------------------ |
| `open()`              | Cria um canal de servidor                  |
| `bind()`              | Associa o servidor a um endereço e porta   |
| `accept()`            | Aceita uma conexão de cliente              |
| `isOpen()`            | Verifica se o canal está aberto            |
| `configureBlocking()` | Define o modo bloqueante ou não bloqueante |
| `isBlocking()`        | Verifica o modo de operação                |
| `register()`          | Registra o canal em um `Selector`          |
| `setOption()`         | Define uma opção do servidor               |
| `getLocalAddress()`   | Retorna o endereço local                   |
| `close()`             | Fecha o canal                              |

---

## `DatagramChannel`

A classe `DatagramChannel` serve para realizar comunicação UDP utilizando canais.

| Método                | Função                                     |
| --------------------- | ------------------------------------------ |
| `open()`              | Cria um canal UDP                          |
| `bind()`              | Associa o canal a um endereço local        |
| `connect()`           | Associa o canal a um endereço remoto       |
| `disconnect()`        | Remove a associação remota                 |
| `receive()`           | Recebe um datagrama                        |
| `send()`              | Envia um datagrama                         |
| `read()`              | Lê dados de um canal conectado             |
| `write()`             | Escreve dados em um canal conectado        |
| `isConnected()`       | Verifica se o canal está conectado         |
| `getRemoteAddress()`  | Retorna o endereço remoto                  |
| `getLocalAddress()`   | Retorna o endereço local                   |
| `configureBlocking()` | Define o modo bloqueante ou não bloqueante |
| `register()`          | Registra o canal em um `Selector`          |
| `close()`             | Fecha o canal                              |

---

## `Selector`

A classe `Selector` serve para monitorar vários canais de forma centralizada, principalmente em aplicações não bloqueantes.

| Método                 | Função                                   |
| ---------------------- | ---------------------------------------- |
| `open()`               | Cria um selector                         |
| `select()`             | Aguarda canais prontos para operação     |
| `select(long timeout)` | Aguarda durante um período               |
| `selectNow()`          | Verifica imediatamente os canais prontos |
| `selectedKeys()`       | Retorna as chaves selecionadas           |
| `keys()`               | Retorna todas as chaves registradas      |
| `wakeup()`             | Interrompe uma operação de seleção       |
| `isOpen()`             | Verifica se o selector está aberto       |
| `close()`              | Fecha o selector                         |

---

## `SelectionKey`

A classe `SelectionKey` representa o registro de um canal em um `Selector`.

| Método                 | Função                                       |
| ---------------------- | -------------------------------------------- |
| `channel()`            | Retorna o canal associado                    |
| `selector()`           | Retorna o selector associado                 |
| `isValid()`            | Verifica se a chave é válida                 |
| `cancel()`             | Cancela o registro                           |
| `interestOps()`        | Consulta as operações de interesse           |
| `interestOps(int ops)` | Define as operações de interesse             |
| `readyOps()`           | Retorna as operações prontas                 |
| `isReadable()`         | Verifica se o canal está pronto para leitura |
| `isWritable()`         | Verifica se o canal está pronto para escrita |
| `isConnectable()`      | Verifica se o canal está pronto para conexão |
| `isAcceptable()`       | Verifica se o servidor pode aceitar conexão  |
| `attach()`             | Associa um objeto à chave                    |
| `attachment()`         | Retorna o objeto associado                   |

---

# Comunicação de Rede

As APIs de rede pertencem principalmente ao pacote `java.net` e permitem criar clientes, servidores e aplicações que trocam dados por TCP, UDP ou HTTP.

---

## `Socket`

A classe `Socket` representa uma conexão TCP do lado do cliente.

| Método              | Função                                             |
| ------------------- | -------------------------------------------------- |
| `connect()`         | Conecta o socket a um servidor                     |
| `getInputStream()`  | Retorna o fluxo de entrada                         |
| `getOutputStream()` | Retorna o fluxo de saída                           |
| `getInetAddress()`  | Retorna o endereço remoto                          |
| `getLocalAddress()` | Retorna o endereço local                           |
| `getPort()`         | Retorna a porta remota                             |
| `getLocalPort()`    | Retorna a porta local                              |
| `setSoTimeout()`    | Define o tempo limite de leitura                   |
| `getSoTimeout()`    | Retorna o tempo limite de leitura                  |
| `setTcpNoDelay()`   | Ativa ou desativa o algoritmo de Nagle             |
| `getTcpNoDelay()`   | Consulta o estado do algoritmo de Nagle            |
| `setKeepAlive()`    | Ativa ou desativa o envio de pacotes de manutenção |
| `isConnected()`     | Verifica se o socket está conectado                |
| `isClosed()`        | Verifica se o socket está fechado                  |
| `shutdownInput()`   | Desativa a entrada                                 |
| `shutdownOutput()`  | Desativa a saída                                   |
| `close()`           | Fecha a conexão                                    |

---

## `ServerSocket`

A classe `ServerSocket` serve para criar servidores TCP que aguardam conexões de clientes.

| Método                    | Função                                              |
| ------------------------- | --------------------------------------------------- |
| `accept()`                | Aguarda e aceita uma conexão                        |
| `bind()`                  | Associa o servidor a um endereço e porta            |
| `getInetAddress()`        | Retorna o endereço local                            |
| `getLocalPort()`          | Retorna a porta local                               |
| `getLocalSocketAddress()` | Retorna o endereço local completo                   |
| `setSoTimeout()`          | Define o tempo limite para aguardar conexões        |
| `getSoTimeout()`          | Retorna o tempo limite configurado                  |
| `setReuseAddress()`       | Permite reutilizar o endereço                       |
| `getReuseAddress()`       | Consulta a reutilização do endereço                 |
| `isBound()`               | Verifica se o servidor está associado a um endereço |
| `isClosed()`              | Verifica se o servidor está fechado                 |
| `close()`                 | Fecha o servidor                                    |

---

## `DatagramSocket`

A classe `DatagramSocket` serve para enviar e receber pacotes UDP.

| Método              | Função                                |
| ------------------- | ------------------------------------- |
| `send()`            | Envia um pacote UDP                   |
| `receive()`         | Aguarda e recebe um pacote UDP        |
| `connect()`         | Associa o socket a um endereço remoto |
| `disconnect()`      | Remove a associação remota            |
| `getInetAddress()`  | Retorna o endereço remoto             |
| `getLocalAddress()` | Retorna o endereço local              |
| `getPort()`         | Retorna a porta remota                |
| `getLocalPort()`    | Retorna a porta local                 |
| `setSoTimeout()`    | Define o tempo limite de recebimento  |
| `getSoTimeout()`    | Retorna o tempo limite configurado    |
| `setBroadcast()`    | Permite ou bloqueia broadcast         |
| `getBroadcast()`    | Consulta o estado de broadcast        |
| `isConnected()`     | Verifica se está conectado            |
| `isClosed()`        | Verifica se está fechado              |
| `close()`           | Fecha o socket                        |

---

## `DatagramPacket`

A classe `DatagramPacket` representa um pacote utilizado na comunicação UDP.

| Método               | Função                         |
| -------------------- | ------------------------------ |
| `getData()`          | Retorna o array de dados       |
| `setData()`          | Define o array de dados        |
| `getLength()`        | Retorna o tamanho dos dados    |
| `setLength()`        | Define o tamanho dos dados     |
| `getOffset()`        | Retorna o deslocamento inicial |
| `setAddress()`       | Define o endereço de destino   |
| `getAddress()`       | Retorna o endereço associado   |
| `setPort()`          | Define a porta de destino      |
| `getPort()`          | Retorna a porta associada      |
| `getSocketAddress()` | Retorna o endereço completo    |
| `setSocketAddress()` | Define o endereço completo     |

---

## `InetAddress`

A classe `InetAddress` representa endereços IP e nomes de hosts.

| Método                   | Função                                    |
| ------------------------ | ----------------------------------------- |
| `getByName()`            | Obtém o endereço de um host               |
| `getAllByName()`         | Obtém todos os endereços de um host       |
| `getLocalHost()`         | Obtém o endereço da máquina local         |
| `getLoopbackAddress()`   | Obtém o endereço de loopback              |
| `getHostName()`          | Retorna o nome do host                    |
| `getCanonicalHostName()` | Retorna o nome canônico                   |
| `getHostAddress()`       | Retorna o endereço IP em texto            |
| `getAddress()`           | Retorna o endereço como array de bytes    |
| `isReachable()`          | Verifica se o endereço pode ser alcançado |
| `isLoopbackAddress()`    | Verifica se é um endereço de loopback     |
| `isAnyLocalAddress()`    | Verifica se é um endereço local curinga   |
| `isMulticastAddress()`   | Verifica se é um endereço multicast       |
| `isSiteLocalAddress()`   | Verifica se é um endereço local de rede   |

---

## `URL`

A classe `URL` representa o endereço de um recurso localizado na rede.

| Método             | Função                                             |
| ------------------ | -------------------------------------------------- |
| `openConnection()` | Abre uma conexão com o recurso                     |
| `openStream()`     | Abre um fluxo de entrada                           |
| `getProtocol()`    | Retorna o protocolo utilizado                      |
| `getHost()`        | Retorna o host                                     |
| `getPort()`        | Retorna a porta                                    |
| `getDefaultPort()` | Retorna a porta padrão do protocolo                |
| `getPath()`        | Retorna o caminho do recurso                       |
| `getQuery()`       | Retorna os parâmetros da consulta                  |
| `getFile()`        | Retorna o caminho e a consulta                     |
| `getRef()`         | Retorna a referência do recurso                    |
| `toURI()`          | Converte a URL para uma URI                        |
| `toExternalForm()` | Converte para representação textual                |
| `sameFile()`       | Verifica se duas URLs apontam para o mesmo recurso |

---

## `URLConnection`

A classe `URLConnection` representa uma conexão com um recurso acessado por uma URL.

| Método                 | Função                                 |
| ---------------------- | -------------------------------------- |
| `connect()`            | Estabelece a conexão                   |
| `getInputStream()`     | Retorna o fluxo de entrada             |
| `getOutputStream()`    | Retorna o fluxo de saída               |
| `getContent()`         | Obtém o conteúdo do recurso            |
| `getContentType()`     | Retorna o tipo de conteúdo             |
| `getContentLength()`   | Retorna o tamanho do conteúdo          |
| `getContentEncoding()` | Retorna a codificação do conteúdo      |
| `getDate()`            | Retorna a data do recurso              |
| `getLastModified()`    | Retorna a data da última modificação   |
| `getExpiration()`      | Retorna a data de expiração            |
| `getHeaderField()`     | Retorna o valor de um cabeçalho        |
| `getHeaderFields()`    | Retorna todos os cabeçalhos            |
| `setConnectTimeout()`  | Define o tempo limite de conexão       |
| `getConnectTimeout()`  | Retorna o tempo limite de conexão      |
| `setReadTimeout()`     | Define o tempo limite de leitura       |
| `getReadTimeout()`     | Retorna o tempo limite de leitura      |
| `setDoInput()`         | Define se haverá entrada               |
| `setDoOutput()`        | Define se haverá saída                 |
| `setRequestProperty()` | Define uma propriedade da requisição   |
| `getRequestProperty()` | Consulta uma propriedade da requisição |

---

## `HttpClient`

A classe `HttpClient` pertence ao pacote `java.net.http` e serve para realizar requisições HTTP e HTTPS de forma moderna.

| Método              | Função                                   |
| ------------------- | ---------------------------------------- |
| `newHttpClient()`   | Cria um cliente HTTP padrão              |
| `newBuilder()`      | Cria um construtor de cliente            |
| `send()`            | Envia uma requisição de forma bloqueante |
| `sendAsync()`       | Envia uma requisição de forma assíncrona |
| `executor()`        | Retorna o executor utilizado             |
| `version()`         | Retorna a versão HTTP utilizada          |
| `cookieHandler()`   | Retorna o gerenciador de cookies         |
| `connectTimeout()`  | Retorna o tempo limite de conexão        |
| `followRedirects()` | Retorna a política de redirecionamento   |
| `proxy()`           | Retorna a configuração de proxy          |
| `authenticator()`   | Retorna o autenticador utilizado         |

---

## `HttpRequest`

A classe `HttpRequest` pertence ao pacote `java.net.http` e representa uma requisição HTTP.

| Método             | Função                                     |
| ------------------ | ------------------------------------------ |
| `newBuilder()`     | Cria um construtor de requisição           |
| `uri()`            | Retorna a URI da requisição                |
| `method()`         | Retorna o método HTTP                      |
| `headers()`        | Retorna os cabeçalhos                      |
| `bodyPublisher()`  | Retorna o conteúdo enviado                 |
| `timeout()`        | Retorna o tempo limite                     |
| `version()`        | Retorna a versão HTTP                      |
| `expectContinue()` | Verifica se utiliza `Expect: 100-continue` |

---

## `HttpResponse`

A interface `HttpResponse` pertence ao pacote `java.net.http` e representa a resposta recebida de uma requisição HTTP.

| Método               | Função                                       |
| -------------------- | -------------------------------------------- |
| `statusCode()`       | Retorna o código de status HTTP              |
| `body()`             | Retorna o corpo da resposta                  |
| `headers()`          | Retorna os cabeçalhos da resposta            |
| `request()`          | Retorna a requisição associada               |
| `uri()`              | Retorna a URI final                          |
| `version()`          | Retorna a versão HTTP utilizada              |
| `previousResponse()` | Retorna uma resposta anterior, quando houver |
| `sslSession()`       | Retorna informações da sessão SSL            |

---

# Bytes x Caracteres

A escolha entre bytes e caracteres depende do tipo de dado que será processado.

| Bytes          | Caracteres        |
| -------------- | ----------------- |
| `InputStream`  | `Reader`          |
| `OutputStream` | `Writer`          |
| Dados binários | Dados textuais    |
| Imagens        | Arquivos de texto |
| Áudio          | Documentos        |
| Vídeos         | Strings           |

```text
Dados binários
     ↓
InputStream / OutputStream

Dados textuais
     ↓
Reader / Writer
```

---

# Comunicação de Rede

As APIs de rede permitem enviar e receber dados entre máquinas ou processos.

| Conceito     | Significado                                        |
| ------------ | -------------------------------------------------- |
| **Cliente**  | Inicia uma conexão                                 |
| **Servidor** | Aguarda conexões                                   |
| **IP**       | Identifica um dispositivo na rede                  |
| **Porta**    | Identifica um serviço ou processo                  |
| **Socket**   | Representa uma comunicação de rede                 |
| **TCP**      | Comunicação confiável e orientada à conexão        |
| **UDP**      | Comunicação mais simples e sem garantia de entrega |

```text
CLIENTE
   ↓
Socket
   ↓
Rede
   ↓
Socket
   ↓
SERVIDOR
```

## TCP e UDP

| Característica    | TCP                                   | UDP                                                   |
| ----------------- | ------------------------------------- | ----------------------------------------------------- |
| Conexão           | Orientado à conexão                   | Sem conexão tradicional                               |
| Entrega garantida | Sim                                   | Não                                                   |
| Ordem dos dados   | Preservada                            | Não garantida                                         |
| Controle          | Maior                                 | Menor                                                 |
| Uso comum         | Web, arquivos e sistemas corporativos | Jogos, áudio, vídeo e aplicações sensíveis à latência |

---

# Resumo

Entrada e saída em Java não se limita a imprimir mensagens no console. O mesmo conceito aparece quando uma aplicação:

* Recebe dados do teclado;
* Lê um arquivo;
* Salva informações;
* Processa uma imagem;
* Envia uma requisição HTTP;
* Se comunica com outro sistema;
* Monitora alterações em um diretório.

As APIs mais importantes podem ser organizadas assim:

```text
JAVA I/O
   │
   ├── Console
   │   ├── System.in
   │   ├── System.out
   │   ├── System.err
   │   └── Scanner
   │
   ├── Texto
   │   ├── Reader
   │   ├── Writer
   │   ├── BufferedReader
   │   └── BufferedWriter
   │
   ├── Bytes
   │   ├── InputStream
   │   ├── OutputStream
   │   ├── DataInputStream
   │   └── DataOutputStream
   │
   ├── Arquivos
   │   ├── File
   │   ├── RandomAccessFile
   │   ├── Path
   │   └── Files
   │
   ├── NIO
   │   ├── Buffer
   │   ├── ByteBuffer
   │   ├── Channel
   │   └── Selector
   │
   └── Rede
       ├── Socket
       ├── ServerSocket
       ├── DatagramSocket
       ├── URL
       └── HttpClient
```

Para começar, `System.out`, `System.in` e `Scanner` já cobrem boa parte dos exercícios e aplicações simples. Conforme o projeto cresce, entram em cena as APIs de arquivos, streams, NIO e comunicação de rede.

---

<div align="center">

☕ **Java • Entrada e Saída • I/O**

</div>
