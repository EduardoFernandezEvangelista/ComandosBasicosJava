# 📥📤 Input and Output (I/O) in Java

A complete and professional guide to **Input/Output (I/O)** in Java, exploring how programs receive, process, and send data through different channels and resources.

---

## 🎯 Introduction

Every Java application interacts with the outside world. Programs:

* **Receive data** from users, files, networks, or sensors (Input)
* **Process** this data internally
* **Send results** to the console, files, networks, or other devices (Output)

Java provides a powerful set of classes for managing input and output operations. These classes are organized into different categories according to the source or destination of the data and the type of data being handled (bytes vs. characters).

### ⚠️ Important Note About the Examples

The code examples presented in this README are **conceptual and educational**. Not all practical examples have executable files stored in the repository. The code shown here is used as:

* **Syntax and usage reference**
* **A learning and understanding base**
* **A starting point for your own projects**

To run the examples, you should:

1. Copy the code shown
2. Create a `.java` file in your environment
3. Adapt it according to your use case
4. Compile and run it locally

If there are **complete example files** in the repository, they will be explicitly referenced in their respective sections.

---

## 💡 Fundamental Concepts

### What is Input/Output (I/O)?

* **Input**: Data flowing into the application
* **Output**: Data flowing out of the application

### Where Does the Data Come From?

```text
┌─────────────────────────────────┐
│        DATA SOURCE              │
├─────────────────────────────────┤
│ • Keyboard (console)            │
│ • Files on disk                 │
│ • Network (internet/sockets)    │
│ • Sensors and devices           │
│ • Memory (strings, arrays)      │
└─────────────────────────────────┘
         ↓
      JAVA PROGRAM
         ↓
┌─────────────────────────────────┐
│       DATA DESTINATION          │
├─────────────────────────────────┤
│ • Screen (console)              │
│ • Files on disk                 │
│ • Network (internet/sockets)    │
│ • Printer                       │
│ • Memory (strings, arrays)      │
└─────────────────────────────────┘
```

### Why Are There Different Classes?

Java provides different classes because each I/O situation has its own characteristics:

* **Bytes vs. Characters**: Binary files use bytes, while text files use characters
* **Buffering**: Reading one character at a time is inefficient; buffers store multiple pieces of data
* **Blocking vs. Non-blocking**: Traditional I/O is usually blocking, while NIO provides non-blocking alternatives
* **Source**: Console, file, network, and memory operations require different approaches

---

## 💻 Console Input and Output

The console is the standard communication channel between a program and the user through the terminal or command line.

### System.in, System.out, and System.err

Java provides three standard streams through the `System` class:

#### **System.in** (Input)

```text
User types on the keyboard
         ↓
      System.in
         ↓
Java program receives bytes
```

* Represents the standard input of the program
* Normally receives data typed by the user
* Returns an `InputStream` (byte stream)

#### **System.out** (Standard Output)

```text
    Java Program
         ↓
     System.out
         ↓
Messages displayed in the console
```

* Standard output of the program
* Normally displays information and results
* It is a `PrintStream`

#### **System.err** (Error Output)

```text
   Java Program (error)
         ↓
      System.err
         ↓
Error messages displayed in the console
```

* Output specifically intended for error messages
* Allows normal information to be separated from problems
* It is a `PrintStream`

### PrintStream

`PrintStream` is a class that provides convenient methods for printing formatted data. Both `System.out` and `System.err` are instances of `PrintStream`.

### Practical Examples

#### Using System.out

```java
// print() method - does not add a line break
System.out.print("Hello");
System.out.print(" World");  // Output: Hello World

// println() method - automatically adds a line break
System.out.println("First line");
System.out.println("Second line");
// Output:
// First line
// Second line

// printf() method - formatted output (similar to C)
String name = "John";
int age = 25;
double salary = 3500.50;

System.out.printf("Name: %s, Age: %d, Salary: $ %.2f%n",
                  name, age, salary);
// Output: Name: John, Age: 25, Salary: $ 3500.50
```

#### Using System.err

```java
// Similar to System.out, but intended for errors
System.err.println("⚠️ WARNING: Operation not authorized!");
System.err.printf("Error: Field '%s' is required%n", "email");

try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.err.println("Arithmetic error detected!");
    e.printStackTrace(System.err);  // Prints stack trace to stderr
}
```

#### Practical Differences

```java
// Normal information
System.out.println("Processing file: data.txt");

// Success information
System.out.println("✓ File processed successfully!");

// Error message
System.err.println("✗ Error: File not found!");

// Debug
System.out.printf("[DEBUG] Variable x = %d%n", x);

// Progress
System.out.print(".");  // Shows progress without a line break
```

---

## ⌨️ Scanner - Simplified Input

`Scanner` is a class from the standard Java library that **makes reading input data easier**, acting as an intermediary between `System.in` and the program.

### Why Use Scanner?

* `System.in` works only with raw bytes
* `Scanner` processes bytes and converts them into specific types (`int`, `double`, `String`, etc.)
* Provides intuitive methods for different data types
* Automatically handles whitespace and line breaks

### Data Flow

```text
User types: "John 25 3500.50"
         ↓
      Keyboard
         ↓
    System.in (bytes)
         ↓
       Scanner
         ↓
Program receives formatted data
```

### Main Methods

```java
Scanner scanner = new Scanner(System.in);

// next() - reads the next word (until space/line break)
String word = scanner.next();

// nextLine() - reads the entire line (including spaces)
String line = scanner.nextLine();

// nextInt() - reads an integer
int number = scanner.nextInt();

// nextDouble() - reads a decimal number
double value = scanner.nextDouble();

// nextBoolean() - reads a boolean (true/false)
boolean active = scanner.nextBoolean();

// Important: close the Scanner after using it
scanner.close();
```

### Difference: next() vs nextLine()

```text
User input: "John Silva 25"

Using next():
String name = scanner.next();  // "John"
                               // " Silva 25" remains in the buffer

Using nextLine():
String line = scanner.nextLine();  // "John Silva 25"
                                   // Buffer cleared
```

### Complete Example

```java
import java.util.Scanner;

public class DataReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean student = scanner.nextBoolean();

        // Display collected data
        System.out.println("\n--- Collected Data ---");
        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d years%n", age);
        System.out.printf("Height: %.2f m%n", height);
        System.out.printf("Student: %s%n", student);

        scanner.close();
    }
}
```

---

## 📖 BufferedReader and InputStreamReader

These classes provide an alternative and more efficient approach for reading input data.

### Conversion Flow

```text
System.in (raw bytes)
         ↓
InputStreamReader (converts bytes to characters)
         ↓
BufferedReader (stores characters in a buffer)
         ↓
Java Program (accesses characters/lines)
```

### InputStreamReader

* **What it is**: A bridge between bytes and characters
* **What it is used for**: Reading `System.in` as characters instead of bytes
* **Advantage**: Allows working with Unicode characters

### BufferedReader

* **What it is**: A wrapper that stores data in a buffer
* **What it is used for**: Improving reading performance and avoiding reading one byte/character at a time
* **Advantage**: More efficient operations and the convenient `readLine()` method

### Comparison: Scanner vs BufferedReader

| Aspect                | Scanner      | BufferedReader     |
| --------------------- | ------------ | ------------------ |
| Type conversion       | Automatic    | Manual             |
| Ease of use           | High         | Medium             |
| Performance           | Good         | Better             |
| Method to read a line | `nextLine()` | `readLine()`       |
| Exception handling    | Simplified   | Requires try-catch |

### Practical Example

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try {
            // Create the reading chain
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            System.out.print("Enter your name: ");
            String name = br.readLine();  // Reads the entire line

            System.out.print("Enter your age: ");
            String ageStr = br.readLine();
            int age = Integer.parseInt(ageStr);  // Manual conversion

            System.out.println("\n--- Collected Data ---");
            System.out.printf("Name: %s%n", name);
            System.out.printf("Age: %d%n", age);

            br.close();  // Close when finished

        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        }
    }
}
```

---

## 🌐 Network Input and Output

Programs often communicate through networks such as the internet or a local network (LAN). Java provides classes to make this communication easier.

### Basic Network Concepts

```text
         CLIENT                         SERVER
            ↓                              ↓
    IP Address: 192.168.1.100      IP Address: 192.168.1.200
    Port: 54321                    Port: 8080
            ↓                              ↓
            └────── Network (TCP/UDP) ──────┘
```

### Terminology

* **Client**: Application that starts the connection
* **Server**: Application that waits for connections
* **IP (Internet Protocol)**: Address that identifies a machine on a network (example: 192.168.1.100)
* **Port**: Specific communication channel on a machine (example: 8080, 3306)
* **Socket**: Represents a connection between a client and a server
* **TCP**: Reliable, connection-oriented communication
* **UDP**: Datagram-based communication without a connection guarantee

---

## 🔌 Socket

### What Is It?

A `Socket` represents a **network connection between two computers**, usually used on the client side.

### What Is It Used For?

* Sending and receiving data over a network
* Client-server communication
* Creating network applications such as chat systems and web applications

### How Does It Work?

```text
Java Client
     ↓
Socket (server IP address + port)
     ↓
InputStream  ← Receive data from server
OutputStream → Send data to server
     ↓
Network
     ↓
Server
```

### Main Methods

```java
// Create a connection to the server
Socket socket = new Socket("192.168.1.100", 8080);

// Get input and output streams
InputStream input = socket.getInputStream();
OutputStream output = socket.getOutputStream();

// Close the connection when finished
socket.close();
```

### Example: Simple Client

```java
import java.io.*;
import java.net.Socket;

public class SimpleClient {
    public static void main(String[] args) {
        try {
            // Connect to the server
            Socket socket = new Socket("localhost", 8080);
            System.out.println("✓ Connected to the server!");

            // Create input and output streams
            PrintWriter output = new PrintWriter(
                socket.getOutputStream(), true
            );
            BufferedReader input = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
            );

            // Send message
            output.println("Hello, Server!");

            // Receive response
            String response = input.readLine();
            System.out.println("Server response: " + response);

            // Close connection
            input.close();
            output.close();
            socket.close();

        } catch (IOException e) {
            System.err.println("Connection error: " + e.getMessage());
        }
    }
}
```

---

## 🖥️ ServerSocket

### What Is It?

A `ServerSocket` is a **server-side socket that waits for client connections**.

### What Is It Used For?

* Creating servers that wait for connections
* Accepting multiple client connections
* Managing communication with multiple clients

### How Does It Work?

```text
Java Server
     ↓
ServerSocket (port 8080)
     ↓
Waiting for connections...
     ↓
Client connects
     ↓
Socket (accepted)
     ↓
Communication established
```

### Main Methods

```java
// Open server on port 8080
ServerSocket server = new ServerSocket(8080);

// Wait for a client connection (blocking)
Socket client = server.accept();

// Work with the client...

// Close server
server.close();
```

### Example: Simple Server

```java
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public static void main(String[] args) {
        try {
            // Open server on port 8080
            ServerSocket server = new ServerSocket(8080);
            System.out.println("🖥️  Server started on port 8080");
            System.out.println("Waiting for connections...");

            // Accept one connection
            Socket client = server.accept();
            System.out.println("✓ Client connected from: " +
                             client.getInetAddress().getHostAddress());

            // Create communication streams
            BufferedReader input = new BufferedReader(
                new InputStreamReader(client.getInputStream())
            );
            PrintWriter output = new PrintWriter(
                client.getOutputStream(), true
            );

            // Receive message from client
            String message = input.readLine();
            System.out.println("Client said: " + message);

            // Send response
            output.println("Message received successfully!");

            // Close connections
            input.close();
            output.close();
            client.close();
            server.close();
            System.out.println("Connection closed");

        } catch (IOException e) {
            System.err.println("Server error: " + e.getMessage());
        }
    }
}
```

---

## 📡 DatagramSocket and DatagramPacket

### Concept

Used for **UDP (User Datagram Protocol)** communication as an alternative to TCP.

### UDP vs TCP

| Aspect      | TCP                   | UDP                   |
| ----------- | --------------------- | --------------------- |
| Connection  | Requires a connection | Connectionless        |
| Reliability | Guarantees delivery   | No delivery guarantee |
| Order       | Preserves order       | No order guarantee    |
| Speed       | Slower, more reliable | Faster                |
| Usage       | Files, email, web     | Video, audio, games   |

### Classes Involved

* **DatagramSocket**: Socket used for UDP communication
* **DatagramPacket**: Data packet sent through UDP

### Usage Example

```java
// UDP client
DatagramSocket socket = new DatagramSocket();
byte[] data = "Message".getBytes();

DatagramPacket packet = new DatagramPacket(
    data, data.length,
    InetAddress.getByName("localhost"), 5000
);

socket.send(packet);
socket.close();
```

---

## 🌐 URL and URLConnection

### What Are They?

* **URL**: Represents the address of a resource on the internet (example: `https://www.example.com`)
* **URLConnection**: Connection to an HTTP/HTTPS server to retrieve content

### What Are They Used For?

* Accessing web pages
* Making HTTP requests
* Downloading files from the internet
* Consuming web APIs

### Conceptual Flow

```text
URL (address)
     ↓
URLConnection (connects)
     ↓
InputStream (receives data)
     ↓
Program processes the content
```

---

## 📥📤 Byte Streams

Byte streams work with raw binary data. They are mainly used for:

* Binary files
* Images, audio, and video
* Compressed data
* Low-level network communication

### Main Classes

| Class                   | Purpose                                            |
| ----------------------- | -------------------------------------------------- |
| `InputStream`           | Abstract base class for reading bytes              |
| `OutputStream`          | Abstract base class for writing bytes              |
| `FileInputStream`       | Reads bytes from files                             |
| `FileOutputStream`      | Writes bytes to files                              |
| `BufferedInputStream`   | Buffer for improving reading performance           |
| `BufferedOutputStream`  | Buffer for improving writing performance           |
| `DataInputStream`       | Reads Java primitive types (`int`, `double`, etc.) |
| `DataOutputStream`      | Writes Java primitive types                        |
| `ObjectInputStream`     | Deserializes Java objects                          |
| `ObjectOutputStream`    | Serializes Java objects                            |
| `ByteArrayInputStream`  | Reads bytes from memory                            |
| `ByteArrayOutputStream` | Writes bytes to memory                             |
| `SequenceInputStream`   | Combines multiple `InputStream` objects            |

### Focus: InputStream, OutputStream, FileInputStream, FileOutputStream

```java
// Read a binary file
FileInputStream fis = new FileInputStream("image.jpg");
byte[] buffer = new byte[1024];
int bytesRead = fis.read(buffer);
fis.close();

// Write a binary file
FileOutputStream fos = new FileOutputStream("copy.jpg");
fos.write(buffer);
fos.close();
```

### Focus: ObjectInputStream and ObjectOutputStream

Used to serialize and deserialize Java objects:

```java
// Serialize (write object)
ObjectOutputStream oos = new ObjectOutputStream(
    new FileOutputStream("object.dat")
);
oos.writeObject(myObject);
oos.close();

// Deserialize (read object)
ObjectInputStream ois = new ObjectInputStream(
    new FileInputStream("object.dat")
);
Object obj = ois.readObject();
ois.close();
```

---

## 🔤 Character Streams

Character streams are designed specifically for **text and characters**. They are used for:

* Text files
* String processing
* Text-based communication
* Support for different Unicode encodings

### Main Classes

| Class                | Purpose                                    |
| -------------------- | ------------------------------------------ |
| `Reader`             | Abstract base class for reading characters |
| `Writer`             | Abstract base class for writing characters |
| `FileReader`         | Reads characters from text files           |
| `FileWriter`         | Writes characters to text files            |
| `BufferedReader`     | Buffer for improving text reading          |
| `BufferedWriter`     | Buffer for improving text writing          |
| `InputStreamReader`  | Converts an `InputStream` into a `Reader`  |
| `OutputStreamWriter` | Converts an `OutputStream` into a `Writer` |
| `CharArrayReader`    | Reads characters from an array             |
| `CharArrayWriter`    | Writes characters to an array              |
| `StringReader`       | Reads characters from a `String`           |
| `StringWriter`       | Writes characters to a `String`            |
| `PrintWriter`        | Convenient character output                |

### Focus: Reader, Writer, BufferedReader, PrintWriter

```java
// Read a text file using a buffer
BufferedReader br = new BufferedReader(
    new FileReader("data.txt")
);

String line = br.readLine();
br.close();

// Write a text file using PrintWriter
PrintWriter pw = new PrintWriter(
    new FileWriter("output.txt")
);

pw.println("First line");
pw.println("Second line");
pw.close();
```

---

## 📁 File Handling

Input and output operations using files from the file system.

### Main Classes

| Class              | Purpose                                                                 |
| ------------------ | ----------------------------------------------------------------------- |
| `File`             | Represents a file or directory (management, not direct reading/writing) |
| `RandomAccessFile` | Accesses a file at different positions                                  |
| `FileInputStream`  | Reads bytes from a file                                                 |
| `FileOutputStream` | Writes bytes to a file                                                  |
| `FileReader`       | Reads characters from a text file                                       |
| `FileWriter`       | Writes characters to a text file                                        |

### File - Management

```java
File file = new File("data.txt");

// Information
if (file.exists()) {
    System.out.println("Size: " + file.length() + " bytes");
    System.out.println("Absolute path: " + file.getAbsolutePath());
}

// Operations
file.delete();  // Delete
file.renameTo(new File("new_name.txt"));  // Rename

// Create directory
File directory = new File("my_directory");
directory.mkdir();
```

### RandomAccessFile

Allows access to different positions within a file:

```java
// Open for reading and writing
RandomAccessFile raf = new RandomAccessFile("data.bin", "rw");

// Go to a specific position
raf.seek(100);

// Read/write at this position
raf.writeInt(42);
raf.close();
```

---

## ⚡ Java NIO

Java NIO (New I/O) provides an **alternative and more modern approach** to input and output operations, especially for high-performance applications.

### Main Concepts

**Buffer**: Temporary memory area used to store data during transfer.

**Channel**: Communication channel between buffers and I/O operations.

### Main Classes

| Class                           | Purpose                            |
| ------------------------------- | ---------------------------------- |
| `Buffer`                        | Abstract class for buffers         |
| `ByteBuffer`                    | Buffer for bytes (the most common) |
| `CharBuffer`                    | Buffer for characters              |
| `IntBuffer`, `LongBuffer`, etc. | Buffers for primitive types        |
| `Channel`                       | Base abstraction for channels      |
| `FileChannel`                   | Channel for reading/writing files  |
| `SocketChannel`                 | Channel for TCP/IP communication   |
| `ServerSocketChannel`           | Channel for TCP/IP servers         |
| `DatagramChannel`               | Channel for UDP communication      |

### Focus: ByteBuffer, FileChannel, SocketChannel

#### ByteBuffer - Basic Operations

```java
// Create a buffer with a capacity of 1024 bytes
ByteBuffer buffer = ByteBuffer.allocate(1024);

// Write data
buffer.put("Hello".getBytes());

// Switch to reading mode
buffer.flip();

// Read data
byte[] data = new byte[buffer.remaining()];
buffer.get(data);
```

#### FileChannel - File Reading

```java
try (FileInputStream fis = new FileInputStream("data.txt");
     FileChannel channel = fis.getChannel()) {

    ByteBuffer buffer = ByteBuffer.allocate(1024);

    while (channel.read(buffer) > 0) {
        buffer.flip();
        // Process data
        buffer.clear();
    }
}
```

---

## 🚀 Java NIO.2

Java NIO.2 (also known as `java.nio.file`) introduced **more modern features**, especially for **file and file system management**.

### Main Classes

| Class             | Purpose                                  |
| ----------------- | ---------------------------------------- |
| `Path`            | Represents a file or directory path      |
| `Paths`           | Factory for creating `Path` instances    |
| `Files`           | Utility class for file operations        |
| `FileSystem`      | Represents a file system                 |
| `FileSystems`     | Factory for accessing file systems       |
| `FileStore`       | Provides storage information             |
| `DirectoryStream` | Iterates through files in a directory    |
| `WatchService`    | Monitors changes in files/directories    |
| `WatchKey`        | Represents a monitoring event key        |
| `WatchEvent`      | Represents a file/directory change event |

### Focus: Path, Files, DirectoryStream

#### Path and Files - Modern Operations

```java
import java.nio.file.*;

// Create path
Path path = Paths.get("data.txt");

// Check existence
if (Files.exists(path)) {
    System.out.println("File exists");
}

// Read the entire file (simple!)
List<String> lines = Files.readAllLines(path);

// Write to a file
Files.write(path, "New content".getBytes());

// Copy file
Files.copy(path, Paths.get("copy.txt"));

// Delete file
Files.delete(path);
```

#### DirectoryStream - List Files

```java
Path directory = Paths.get(".");

// Iterate through files in the directory
try (DirectoryStream<Path> stream = Files.newDirectoryStream(directory)) {
    for (Path file : stream) {
        System.out.println(file.getFileName());
    }
}
```

#### WatchService - Monitor Changes

```java
WatchService watchService =
    FileSystems.getDefault().newWatchService();

Path directory = Paths.get(".");

// Register the directory to monitor changes
directory.register(
    watchService,
    StandardWatchEventKinds.ENTRY_CREATE,
    StandardWatchEventKinds.ENTRY_MODIFY,
    StandardWatchEventKinds.ENTRY_DELETE
);

// Wait for events
WatchKey key = watchService.take();

for (WatchEvent<?> event : key.pollEvents()) {
    System.out.println("Change detected: " + event.context());
}
```

---

## 🌐 Networking with Java NIO

Java NIO provides alternatives to traditional sockets using a channel-based approach.

### Comparison: Traditional Java vs NIO

| Aspect             | Traditional Java      | Java NIO                     |
| ------------------ | --------------------- | ---------------------------- |
| **Socket reading** | `Socket`              | `SocketChannel`              |
| **Server**         | `ServerSocket`        | `ServerSocketChannel`        |
| **UDP**            | `DatagramSocket`      | `DatagramChannel`            |
| **Blocking**       | Blocking              | Non-blocking                 |
| **Scalability**    | One thread per client | One thread, multiple clients |

### Network Channels

* **SocketChannel**: TCP client (alternative to `Socket`)
* **ServerSocketChannel**: TCP server (alternative to `ServerSocket`)
* **DatagramChannel**: UDP (alternative to `DatagramSocket`)

### Advanced Concepts (Overview)

For truly scalable applications, Java NIO provides:

* **Selector**: Multiplexes multiple channels using a single thread
* **Non-blocking programming**: Avoids blocking while waiting for I/O
* **Asynchronous operations**: Allows operations without blocking the application

These concepts are **more advanced** and are outside the scope of this introductory guide.

---

## 📊 Summary Table

| Category                | Main Classes                              | Usage                        |
| ----------------------- | ----------------------------------------- | ---------------------------- |
| 📥 Byte input           | `InputStream`, `FileInputStream`          | Read binary data             |
| 📤 Byte output          | `OutputStream`, `FileOutputStream`        | Write binary data            |
| 🔤 Character input      | `Reader`, `BufferedReader`                | Read text                    |
| 📝 Character output     | `Writer`, `BufferedWriter`                | Write text                   |
| 💻 Console              | `System.in`, `System.out`, `System.err`   | User interaction             |
| ⌨️ User input           | `Scanner`, `BufferedReader`, `Console`    | Receive user data            |
| 🖨️ Printing            | `PrintStream`, `PrintWriter`              | Formatted output             |
| 📁 Files                | `File`, `Path`, `Files`                   | Manage and access files      |
| 🧠 Object serialization | `ObjectInputStream`, `ObjectOutputStream` | Persist Java objects         |
| 🔢 Primitive types      | `DataInputStream`, `DataOutputStream`     | I/O for primitive types      |
| ⚡ Java NIO              | `Buffer`, `Channel`, `FileChannel`        | Non-blocking I/O             |
| 🚀 Java NIO.2           | `Path`, `Files`, `WatchService`           | Modern file management       |
| 🌐 TCP networking       | `Socket`, `ServerSocket`                  | Client-server communication  |
| 📡 UDP networking       | `DatagramSocket`, `DatagramPacket`        | Connectionless communication |
| 🔌 NIO networking       | `SocketChannel`, `ServerSocketChannel`    | Non-blocking networking      |

---

## 👨‍💻 Author

**Eduardo Fernandez Evangelista**

**GitHub:** [EduardoFernandezEvangelista](https://github.com/EduardoFernandezEvangelista)

---

## 📄 License

This project does not have a specific license defined yet.

**License:** ``

---

<div align="center">

☕ **Java • Input and Output Types**

📚 Study • Practice • Development • Progress

</div>
