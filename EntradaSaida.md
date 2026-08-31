# 📥📤 Entrada e Saída (I/O) em Java

Um guia completo e profissional sobre **Input/Output (I/O)** em Java, explorando como programas recebem, processam e enviam dados através de diferentes canais e recursos.

---

## 📋 Índice

1. [Introdução](#introdução)
2. [Conceitos Fundamentais](#conceitos-fundamentais)
3. [Entrada e Saída pelo Console](#entrada-e-saída-pelo-console)
4. [Scanner - Leitura Simplificada](#scanner---leitura-simplificada)
5. [BufferedReader e InputStreamReader](#bufferedreader-e-inputstreamreader)
6. [Entrada e Saída pela Rede](#entrada-e-saída-pela-rede)
7. [Streams de Bytes](#streams-de-bytes)
8. [Streams de Caracteres](#streams-de-caracteres)
9. [Manipulação de Arquivos](#manipulação-de-arquivos)
10. [Java NIO](#java-nio)
11. [Java NIO.2](#java-nio2)
12. [Tabela de Resumo](#tabela-de-resumo)

---

## 🎯 Introdução

Toda aplicação Java interage com o mundo exterior. Programas:

- **Recebem dados** do usuário, arquivos, rede ou sensores (Input)
- **Processam** esses dados internamente
- **Enviam resultados** para o console, arquivos, rede ou outros dispositivos (Output)

Java oferece um conjunto robusto de classes para gerenciar entrada e saída de dados, organizadas em diferentes categorias conforme a origem ou destino dos dados, e o tipo de dado (bytes vs. caracteres).

### ⚠️ Nota Importante Sobre os Exemplos

Os exemplos de código apresentados neste README são **conceituais e educacionais**. Nem todos os exemplos práticos possuem arquivos executáveis depositados no repositório. Os códigos aqui servem como:

- **Referência de sintaxe e uso**
- **Base para aprendizado e compreensão**
- **Ponto de partida para seus próprios projetos**

Para executar os exemplos, você deverá:

1. Copiar o código apresentado
2. Criar um arquivo `.java` em seu ambiente
3. Adaptar conforme necessário para seu caso de uso
4. Compilar e executar localmente

Se houver **arquivos de exemplo completos** no repositório, eles estarão explicitamente referenciados em suas respectivas seções.

---

## 💡 Conceitos Fundamentais

### O que é Input/Output (I/O)?

- **Input (Entrada)**: Fluxo de dados entrando na aplicação
- **Output (Saída)**: Fluxo de dados saindo da aplicação

### De onde vêm os dados?

```
┌─────────────────────────────────┐
│    ORIGEM DOS DADOS             │
├─────────────────────────────────┤
│ • Teclado (console)             │
│ • Arquivos no disco             │
│ • Rede (internet/sockets)       │
│ • Sensores e dispositivos       │
│ • Memória (strings, arrays)     │
└─────────────────────────────────┘
         ↓
    PROGRAMA JAVA
         ↓
┌─────────────────────────────────┐
│    DESTINO DOS DADOS            │
├─────────────────────────────────┤
│ • Tela (console)                │
│ • Arquivos no disco             │
│ • Rede (internet/sockets)       │
│ • Impressora                    │
│ • Memória (strings, arrays)     │
└─────────────────────────────────┘
```

### Por que existem diferentes classes?

Java oferece diferentes classes porque cada situação de I/O tem características únicas:

- **Bytes vs. Caracteres**: Arquivos binários usam bytes; textos usam caracteres
- **Buffering**: Ler um caractere de cada vez é ineficiente; buffers armazenam múltiplos dados
- **Bloqueante vs. Não-bloqueante**: Tradicional (bloqueante) vs. NIO (não-bloqueante)
- **Origem**: Console, arquivo, rede e memória precisam de abordagens diferentes

---

## 💻 Entrada e Saída pelo Console

O console é o canal de comunicação padrão entre programa e usuário através do terminal/linha de comando.

### System.in, System.out e System.err

Java oferece três fluxos padrão através da classe `System`:

#### **System.in** (Entrada)
```
Usuário digita no teclado
         ↓
    System.in
         ↓
Programa Java recebe bytes
```

- Representa a entrada padrão do programa
- Normalmente recebe dados digitados pelo usuário
- Retorna um `InputStream` (fluxo de bytes)

#### **System.out** (Saída Padrão)
```
Programa Java
         ↓
  System.out
         ↓
Mensagens exibidas no console
```

- Saída padrão do programa
- Normalmente exibe informações e resultados
- É um `PrintStream`

#### **System.err** (Saída de Erros)
```
Programa Java (erro)
         ↓
  System.err
         ↓
Mensagens de erro exibidas no console
```

- Saída destinada especificamente a mensagens de erro
- Permite separar informações normais de problemas
- É um `PrintStream`

### PrintStream

`PrintStream` é a classe que oferece métodos convenientes para impressão de dados formatados. Tanto `System.out` quanto `System.err` são instâncias de `PrintStream`.

### Exemplos Práticos

#### Usando System.out

```java
// Método print() - não adiciona quebra de linha
System.out.print("Olá");
System.out.print(" Mundo");  // Output: Olá Mundo

// Método println() - adiciona quebra de linha automaticamente
System.out.println("Primeira linha");
System.out.println("Segunda linha");
// Output:
// Primeira linha
// Segunda linha

// Método printf() - impressão formatada (similar a C)
String nome = "João";
int idade = 25;
double salario = 3500.50;

System.out.printf("Nome: %s, Idade: %d, Salário: R$ %.2f%n", 
                  nome, idade, salario);
// Output: Nome: João, Idade: 25, Salário: R$ 3500.50
```

#### Usando System.err

```java
// Similar a System.out, mas destinado a erros
System.err.println("⚠️ AVISO: Operação não autorizada!");
System.err.printf("Erro: Campo '%s' é obrigatório%n", "email");

try {
    int resultado = 10 / 0;
} catch (ArithmeticException e) {
    System.err.println("Erro aritmético detectado!");
    e.printStackTrace(System.err);  // Imprime stack trace no stderr
}
```

#### Diferenças Práticas

```java
// Informação normal
System.out.println("Processando arquivo: dados.txt");

// Informação de sucesso
System.out.println("✓ Arquivo processado com sucesso!");

// Mensagem de erro
System.err.println("✗ Erro: Arquivo não encontrado!");

// Debug
System.out.printf("[DEBUG] Variável x = %d%n", x);

// Progresso
System.out.print(".");  // Mostra progresso sem quebra de linha
```

---

## ⌨️ Scanner - Leitura Simplificada

`Scanner` é uma classe da biblioteca padrão Java que **facilita a leitura de dados de entrada**, agindo como um intermediário entre `System.in` e o programa.

### Por que usar Scanner?

- `System.in` trabalha apenas com bytes brutos
- `Scanner` processa bytes e converte para tipos específicos (int, double, String, etc.)
- Oferece métodos intuitivos para diferentes tipos de dados
- Tratamento automático de espaços em branco e quebras de linha

### Fluxo de Dados

```
Usuário digita: "João 25 3500.50"
         ↓
    Teclado
         ↓
  System.in (bytes)
         ↓
   Scanner
         ↓
Programa recebe dados formatados
```

### Métodos Principais

```java
Scanner scanner = new Scanner(System.in);

// next() - lê a próxima palavra (até espaço/quebra de linha)
String palavra = scanner.next();

// nextLine() - lê a linha inteira (incluindo espaços)
String linha = scanner.nextLine();

// nextInt() - lê um inteiro
int numero = scanner.nextInt();

// nextDouble() - lê um número decimal
double valor = scanner.nextDouble();

// nextBoolean() - lê um booleano (true/false)
boolean ativo = scanner.nextBoolean();

// Importante: fechar o Scanner após usar
scanner.close();
```

### Diferença: next() vs nextLine()

```
Entrada do usuário: "João Silva 25"

Usando next():
String nome = scanner.next();  // "João"
                               // " Silva 25" permanece no buffer

Usando nextLine():
String linha = scanner.nextLine();  // "João Silva 25"
                                    // Buffer limpo
```

### Exemplo Completo

```java
import java.util.Scanner;

public class LeitorDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();
        
        System.out.print("É estudante? (true/false): ");
        boolean estudante = scanner.nextBoolean();
        
        // Exibir dados coletados
        System.out.println("\n--- Dados Coletados ---");
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Idade: %d anos%n", idade);
        System.out.printf("Altura: %.2f m%n", altura);
        System.out.printf("Estudante: %s%n", estudante);
        
        scanner.close();
    }
}
```

---

## 📖 BufferedReader e InputStreamReader

Essas classes oferecem uma abordagem alternativa e mais eficiente para ler dados de entrada.

### O Fluxo de Conversão

```
System.in (bytes brutos)
         ↓
InputStreamReader (converte bytes em caracteres)
         ↓
BufferedReader (armazena caracteres em buffer)
         ↓
Programa Java (acessa caracteres/linhas)
```

### InputStreamReader

- **O que é**: Converter (bridge) entre bytes e caracteres
- **Para que serve**: Ler `System.in` como caracteres, não bytes
- **Vantagem**: Permite trabalhar com caracteres Unicode

### BufferedReader

- **O que é**: Wrapper que armazena dados em um buffer
- **Para que serve**: Otimizar leitura, evitar ler um byte/caractere de cada vez
- **Vantagem**: Operações mais eficientes e método `readLine()` conveniente

### Comparação: Scanner vs BufferedReader

| Aspecto | Scanner | BufferedReader |
|---------|---------|---|
| Conversão de tipos | Automática | Manual |
| Facilidade de uso | Alta | Média |
| Performance | Boa | Melhor |
| Método para ler linha | `nextLine()` | `readLine()` |
| Tratamento de exceções | Simplificado | Requer try-catch |

### Exemplo Prático

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LeitorComBufferedReader {
    public static void main(String[] args) {
        try {
            // Criar a cadeia de leitura
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            
            System.out.print("Digite seu nome: ");
            String nome = br.readLine();  // Lê a linha inteira
            
            System.out.print("Digite sua idade: ");
            String idadeStr = br.readLine();
            int idade = Integer.parseInt(idadeStr);  // Conversão manual
            
            System.out.println("\n--- Dados Coletados ---");
            System.out.printf("Nome: %s%n", nome);
            System.out.printf("Idade: %d%n", idade);
            
            br.close();  // Fechar quando terminar
            
        } catch (IOException e) {
            System.err.println("Erro ao ler entrada: " + e.getMessage());
        }
    }
}
```

---

## 🌐 Entrada e Saída pela Rede

Programas frequentemente se comunicam através da rede (internet/LAN). Java oferece classes para facilitar essa comunicação.

### Conceitos Básicos de Rede

```
         CLIENTE                          SERVIDOR
            ↓                                 ↓
       Endereço IP: 192.168.1.100     Endereço IP: 192.168.1.200
       Porta: 54321                    Porta: 8080
            ↓                                 ↓
            └─────── Rede (TCP/UDP) ────────┘
```

### Terminologia

- **Cliente**: Aplicação que inicia a conexão
- **Servidor**: Aplicação que aguarda conexões
- **IP (Internet Protocol)**: Endereço único da máquina na rede (ex: 192.168.1.100)
- **Porta**: Canal específico na máquina (ex: 8080, 3306)
- **Socket**: Representa uma conexão entre cliente e servidor
- **TCP**: Conexão confiável, orientada à conexão (garante entrega)
- **UDP**: Comunicação por datagramas, sem conexão (sem garantia)

---

## 🔌 Socket

### O que é?

Um `Socket` representa uma **conexão de rede entre dois computadores**, geralmente usado pelo cliente.

### Para que serve?

- Enviar e receber dados através da rede
- Comunicação cliente-servidor
- Criar aplicações de rede (chat, web, etc.)

### Como funciona?

```
Cliente Java
     ↓
Socket (endereço IP + porta do servidor)
     ↓
InputStream  ← Receber dados do servidor
OutputStream → Enviar dados ao servidor
     ↓
Rede
     ↓
Servidor
```

### Métodos Principais

```java
// Criar conexão com servidor
Socket socket = new Socket("192.168.1.100", 8080);

// Obter fluxos de entrada e saída
InputStream entrada = socket.getInputStream();
OutputStream saida = socket.getOutputStream();

// Fechar conexão quando terminar
socket.close();
```

### Exemplo: Cliente Simples

```java
import java.io.*;
import java.net.Socket;

public class ClienteSimples {
    public static void main(String[] args) {
        try {
            // Conectar ao servidor
            Socket socket = new Socket("localhost", 8080);
            System.out.println("✓ Conectado ao servidor!");
            
            // Criar fluxos de entrada e saída
            PrintWriter saida = new PrintWriter(
                socket.getOutputStream(), true
            );
            BufferedReader entrada = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
            );
            
            // Enviar mensagem
            saida.println("Olá, Servidor!");
            
            // Receber resposta
            String resposta = entrada.readLine();
            System.out.println("Servidor respondeu: " + resposta);
            
            // Fechar conexão
            entrada.close();
            saida.close();
            socket.close();
            
        } catch (IOException e) {
            System.err.println("Erro na conexão: " + e.getMessage());
        }
    }
}
```

---

## 🖥️ ServerSocket

### O que é?

Um `ServerSocket` é uma **porta aberta no servidor esperando por conexões de clientes**.

### Para que serve?

- Criar servidores que aguardam conexões
- Aceitar múltiplas conexões de clientes
- Gerenciar comunicação com vários clientes

### Como funciona?

```
Servidor Java
     ↓
ServerSocket (na porta 8080)
     ↓
Aguarda conexões...
     ↓
Cliente conecta
     ↓
Socket (aceito)
     ↓
Comunicação estabelecida
```

### Métodos Principais

```java
// Abrir servidor na porta 8080
ServerSocket servidor = new ServerSocket(8080);

// Aguardar conexão de cliente (bloqueante)
Socket cliente = servidor.accept();

// Trabalhar com cliente...

// Fechar servidor
servidor.close();
```

### Exemplo: Servidor Simples

```java
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorSimples {
    public static void main(String[] args) {
        try {
            // Abrir servidor na porta 8080
            ServerSocket servidor = new ServerSocket(8080);
            System.out.println("🖥️  Servidor iniciado na porta 8080");
            System.out.println("Aguardando conexões...");
            
            // Aceitar uma conexão
            Socket cliente = servidor.accept();
            System.out.println("✓ Cliente conectado de: " + 
                             cliente.getInetAddress().getHostAddress());
            
            // Criar fluxos de comunicação
            BufferedReader entrada = new BufferedReader(
                new InputStreamReader(cliente.getInputStream())
            );
            PrintWriter saida = new PrintWriter(
                cliente.getOutputStream(), true
            );
            
            // Receber mensagem do cliente
            String mensagem = entrada.readLine();
            System.out.println("Cliente disse: " + mensagem);
            
            // Enviar resposta
            saida.println("Mensagem recebida com sucesso!");
            
            // Fechar conexões
            entrada.close();
            saida.close();
            cliente.close();
            servidor.close();
            System.out.println("Conexão encerrada");
            
        } catch (IOException e) {
            System.err.println("Erro no servidor: " + e.getMessage());
        }
    }
}
```

---

## 📡 DatagramSocket e DatagramPacket

### Conceito

Para comunicação **UDP** (User Datagram Protocol) - alternativa ao TCP.

### UDP vs TCP

| Aspecto | TCP | UDP |
|---------|-----|-----|
| Conexão | Requer conexão (connect) | Sem conexão |
| Confiabilidade | Garante entrega | Sem garantia |
| Ordem | Preserva ordem | Sem garantia |
| Velocidade | Mais lento (mais confiável) | Mais rápido |
| Uso | Arquivos, email, web | Vídeo, áudio, games |

### Classes Envolvidas

- **DatagramSocket**: Socket para comunicação UDP
- **DatagramPacket**: Pacote de dados enviado via UDP

### Resumo de Uso

```java
// Cliente UDP
DatagramSocket socket = new DatagramSocket();
byte[] dados = "Mensagem".getBytes();
DatagramPacket pacote = new DatagramPacket(
    dados, dados.length, 
    InetAddress.getByName("localhost"), 5000
);
socket.send(pacote);
socket.close();
```

---

## 🌐 URL e URLConnection

### O que são?

- **URL**: Representa um endereço de recurso na internet (ex: https://www.example.com)
- **URLConnection**: Conexão com um servidor HTTP/HTTPS para obter conteúdo

### Para que servem?

- Acessar páginas web
- Fazer requisições HTTP
- Baixar arquivos da internet
- Consumir APIs web

### Fluxo Conceitual

```
URL (endereço)
     ↓
URLConnection (conecta)
     ↓
InputStream (recebe dados)
     ↓
Programa processa o conteúdo
```

---

## 📥📤 Streams de Bytes

Streams de bytes trabalham com dados binários brutos. Utilizadas principalmente para:

- Arquivos binários
- Imagens, áudio, vídeo
- Dados compactados
- Comunicação de rede de baixo nível

### Principais Classes

| Classe | Propósito |
|--------|-----------|
| `InputStream` | Classe abstrata base para leitura de bytes |
| `OutputStream` | Classe abstrata base para escrita de bytes |
| `FileInputStream` | Ler bytes de arquivos |
| `FileOutputStream` | Escrever bytes em arquivos |
| `BufferedInputStream` | Buffer para otimizar leitura |
| `BufferedOutputStream` | Buffer para otimizar escrita |
| `DataInputStream` | Ler tipos primitivos Java (int, double, etc.) |
| `DataOutputStream` | Escrever tipos primitivos Java |
| `ObjectInputStream` | Desserializar objetos Java |
| `ObjectOutputStream` | Serializar objetos Java |
| `ByteArrayInputStream` | Ler bytes da memória (array) |
| `ByteArrayOutputStream` | Escrever bytes em memória |
| `SequenceInputStream` | Concatenar múltiplos InputStreams |

### Destaque: InputStream, OutputStream, FileInputStream, FileOutputStream

```java
// Ler arquivo binário
FileInputStream fis = new FileInputStream("imagem.jpg");
byte[] buffer = new byte[1024];
int bytesLidos = fis.read(buffer);
fis.close();

// Escrever arquivo binário
FileOutputStream fos = new FileOutputStream("copia.jpg");
fos.write(buffer);
fos.close();
```

### Destaque: ObjectInputStream e ObjectOutputStream

Para serializar e desserializar objetos Java:

```java
// Serializar (escrever objeto)
ObjectOutputStream oos = new ObjectOutputStream(
    new FileOutputStream("objeto.dat")
);
oos.writeObject(meuObjeto);
oos.close();

// Desserializar (ler objeto)
ObjectInputStream ois = new ObjectInputStream(
    new FileInputStream("objeto.dat")
);
Object obj = ois.readObject();
ois.close();
```

---

## 🔤 Streams de Caracteres

Streams de caracteres trabalham especificamente com **texto e caracteres**. Utilizadas para:

- Arquivos de texto
- Processamento de strings
- Comunicação em formato texto
- Suporte a diferentes codificações Unicode

### Principais Classes

| Classe | Propósito |
|--------|-----------|
| `Reader` | Classe abstrata base para leitura de caracteres |
| `Writer` | Classe abstrata base para escrita de caracteres |
| `FileReader` | Ler caracteres de arquivos de texto |
| `FileWriter` | Escrever caracteres em arquivos de texto |
| `BufferedReader` | Buffer para otimizar leitura de texto |
| `BufferedWriter` | Buffer para otimizar escrita de texto |
| `InputStreamReader` | Converter InputStream em Reader |
| `OutputStreamWriter` | Converter OutputStream em Writer |
| `CharArrayReader` | Ler caracteres de um array |
| `CharArrayWriter` | Escrever caracteres em um array |
| `StringReader` | Ler caracteres de uma String |
| `StringWriter` | Escrever caracteres em uma String |
| `PrintWriter` | Impressão conveniente de caracteres |

### Destaque: Reader, Writer, BufferedReader, PrintWriter

```java
// Ler arquivo de texto com buffer
BufferedReader br = new BufferedReader(new FileReader("dados.txt"));
String linha = br.readLine();
br.close();

// Escrever arquivo de texto com PrintWriter
PrintWriter pw = new PrintWriter(new FileWriter("saida.txt"));
pw.println("Primeira linha");
pw.println("Segunda linha");
pw.close();
```

---

## 📁 Manipulação de Arquivos

Entrada e saída usando arquivos no sistema de arquivos.

### Classes Principais

| Classe | Propósito |
|--------|-----------|
| `File` | Representa um arquivo ou diretório (gerenciar, não ler/escrever) |
| `RandomAccessFile` | Acessar arquivo em qualquer posição |
| `FileInputStream` | Ler bytes de arquivo |
| `FileOutputStream` | Escrever bytes em arquivo |
| `FileReader` | Ler caracteres de arquivo de texto |
| `FileWriter` | Escrever caracteres em arquivo de texto |

### File - Gerenciamento

```java
File arquivo = new File("dados.txt");

// Informações
if (arquivo.exists()) {
    System.out.println("Tamanho: " + arquivo.length() + " bytes");
    System.out.println("Caminho absoluto: " + arquivo.getAbsolutePath());
}

// Operações
arquivo.delete();  // Deletar
arquivo.renameTo(new File("novo_nome.txt"));  // Renomear

// Criar diretório
File diretorio = new File("meu_diretorio");
diretorio.mkdir();
```

### RandomAccessFile

Permite acessar diferentes posições de um arquivo:

```java
// Abrir para leitura e escrita
RandomAccessFile raf = new RandomAccessFile("dados.bin", "rw");

// Ir para posição específica
raf.seek(100);

// Ler/escrever nessa posição
raf.writeInt(42);
raf.close();
```

---

## ⚡ Java NIO

Java NIO (New I/O) oferece uma abordagem **alternativa e mais moderna** para operações de entrada e saída, especialmente para aplicações de alta performance.

### Conceitos Principais

**Buffer**: Área de memória temporária para armazenar dados durante transferência

**Channel**: Canal de comunicação entre buffers e I/O

### Principais Classes

| Classe | Propósito |
|--------|-----------|
| `Buffer` | Classe abstrata para buffers (armazena dados) |
| `ByteBuffer` | Buffer para bytes (o mais comum) |
| `CharBuffer` | Buffer para caracteres |
| `IntBuffer`, `LongBuffer`, etc. | Buffers para tipos primitivos |
| `Channel` | Classe abstrata para canais |
| `FileChannel` | Canal para leitura/escrita em arquivos |
| `SocketChannel` | Canal para comunicação TCP/IP |
| `ServerSocketChannel` | Canal para servidores TCP/IP |
| `DatagramChannel` | Canal para comunicação UDP |

### Destaque: ByteBuffer, FileChannel, SocketChannel

#### ByteBuffer - Operações Básicas

```java
// Criar buffer com capacidade de 1024 bytes
ByteBuffer buffer = ByteBuffer.allocate(1024);

// Escrever dados
buffer.put("Olá".getBytes());

// Alternar para leitura
buffer.flip();

// Ler dados
byte[] dados = new byte[buffer.remaining()];
buffer.get(dados);
```

#### FileChannel - Leitura de Arquivo

```java
try (FileInputStream fis = new FileInputStream("dados.txt");
     FileChannel channel = fis.getChannel()) {
    
    ByteBuffer buffer = ByteBuffer.allocate(1024);
    
    while (channel.read(buffer) > 0) {
        buffer.flip();
        // Processar dados
        buffer.clear();
    }
}
```

---

## 🚀 Java NIO.2

Java NIO.2 (também chamado `java.nio.file`) trouxe **melhorias modernas** principalmente para **manipulação de arquivos e sistemas de arquivos**.

### Classes Principais

| Classe | Propósito |
|--------|-----------|
| `Path` | Representa caminho de arquivo ou diretório |
| `Paths` | Factory para criar instâncias de Path |
| `Files` | Utilitários para operações em arquivos |
| `FileSystem` | Representa o sistema de arquivos |
| `FileSystems` | Factory para acessar FileSystems |
| `FileStore` | Informações sobre armazenamento |
| `DirectoryStream` | Iterar sobre arquivos em diretório |
| `WatchService` | Monitorar alterações em arquivos/diretórios |
| `WatchKey` | Chave de evento de monitoramento |
| `WatchEvent` | Evento de alteração em arquivo/diretório |

### Destaque: Path, Files, DirectoryStream

#### Path e Files - Operações Modernas

```java
import java.nio.file.*;

// Criar path
Path caminho = Paths.get("dados.txt");

// Verificar existência
if (Files.exists(caminho)) {
    System.out.println("Arquivo existe");
}

// Ler arquivo inteiro (simples!)
List<String> linhas = Files.readAllLines(caminho);

// Escrever em arquivo
Files.write(caminho, "Novo conteúdo".getBytes());

// Copiar arquivo
Files.copy(caminho, Paths.get("copia.txt"));

// Deletar arquivo
Files.delete(caminho);
```

#### DirectoryStream - Listar Arquivos

```java
Path diretorio = Paths.get(".");

// Iterar sobre arquivos do diretório
try (DirectoryStream<Path> stream = Files.newDirectoryStream(diretorio)) {
    for (Path arquivo : stream) {
        System.out.println(arquivo.getFileName());
    }
}
```

#### WatchService - Monitorar Alterações

```java
WatchService watchService = FileSystems.getDefault().newWatchService();
Path diretorio = Paths.get(".");

// Registrar para monitorar alterações
diretorio.register(watchService, 
    StandardWatchEventKinds.ENTRY_CREATE,
    StandardWatchEventKinds.ENTRY_MODIFY,
    StandardWatchEventKinds.ENTRY_DELETE
);

// Aguardar eventos
WatchKey chave = watchService.take();
for (WatchEvent<?> evento : chave.pollEvents()) {
    System.out.println("Alteração detectada: " + evento.context());
}
```

---

## 🌐 Rede com Java NIO

Java NIO oferece alternativas aos sockets tradicionais com abordagem baseada em channels:

### Comparação: Java Tradicional vs NIO

| Aspecto | Java Tradicional | Java NIO |
|---------|---|---|
| **Leitura de socket** | `Socket` | `SocketChannel` |
| **Servidor** | `ServerSocket` | `ServerSocketChannel` |
| **UDP** | `DatagramSocket` | `DatagramChannel` |
| **Bloqueio** | Bloqueante | Não-bloqueante |
| **Escalabilidade** | Uma thread por cliente | Uma thread, múltiplos clientes |

### Canais de Rede

- **SocketChannel**: Cliente TCP (alternativa a `Socket`)
- **ServerSocketChannel**: Servidor TCP (alternativa a `ServerSocket`)
- **DatagramChannel**: UDP (alternativa a `DatagramSocket`)

### Conceitos Avançados (Menção)

Para aplicações verdadeiramente escaláveis, Java NIO oferece:

- **Selector**: Multiplexação de múltiplos canais em uma thread
- **Programação não-bloqueante**: Evita bloqueios ao aguardar I/O
- **Assincronismo**: Operações sem travamento

Esses conceitos são **mais avançados** e estão fora do escopo deste guia introdutório.

---

## 📊 Tabela de Resumo

| Categoria | Classes Principais | Uso |
|-----------|-------------------|-----|
| 📥 Entrada de bytes | `InputStream`, `FileInputStream` | Ler dados binários |
| 📤 Saída de bytes | `OutputStream`, `FileOutputStream` | Escrever dados binários |
| 🔤 Entrada de caracteres | `Reader`, `BufferedReader` | Ler texto |
| 📝 Saída de caracteres | `Writer`, `BufferedWriter` | Escrever texto |
| 💻 Console | `System.in`, `System.out`, `System.err` | Interação com usuário |
| ⌨️ Entrada do usuário | `Scanner`, `BufferedReader`, `Console` | Receber dados do usuário |
| 🖨️ Impressão | `PrintStream`, `PrintWriter` | Saída formatada |
| 📁 Arquivos | `File`, `Path`, `Files` | Gerenciar e acessar arquivos |
| 🧠 Serialização de objetos | `ObjectInputStream`, `ObjectOutputStream` | Persistir objetos Java |
| 🔢 Tipos primitivos | `DataInputStream`, `DataOutputStream` | I/O de tipos primitivos |
| ⚡ Java NIO | `Buffer`, `Channel`, `FileChannel` | I/O não-bloqueante |
| 🚀 Java NIO.2 | `Path`, `Files`, `WatchService` | Manipulação moderna de arquivos |
| 🌐 Rede TCP | `Socket`, `ServerSocket` | Comunicação cliente-servidor |
| 📡 Rede UDP | `DatagramSocket`, `DatagramPacket` | Comunicação sem conexão |
| 🔌 Rede NIO | `SocketChannel`, `ServerSocketChannel` | Rede não-bloqueante |

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

☕ **Java • Tipos de entradas e saídas **

📚 Estudo • Prática • Desenvolvimento • Evolução

</div>
