# 📥📤 Java — Input and Output (I/O)

> Input and output, or **I/O (Input/Output)**, is how a Java application receives, processes, and sends data.

In everyday applications, a program can:

| Operation         | Examples                                       |
| ----------------- | ---------------------------------------------- |
| 📥 **Input**      | Read data from the keyboard, files, or network |
| ⚙️ **Processing** | Validate, transform, or store information      |
| 📤 **Output**     | Display data, save files, or send data         |

```text
Data Source
       ↓
Input
       ↓
Java Program
       ↓
Processing
       ↓
Output
       ↓
Data Destination
```

Java has different I/O APIs because each situation requires a specific approach. Reading a name typed on the keyboard, copying an image, writing a file, or receiving data from a network are similar concepts, but their implementations are different.

---

# `System.in`, `System.out` and `System.err`

The `System` class provides the main standard streams of an application.

| Stream       | Type          | Usage                                |
| ------------ | ------------- | ------------------------------------ |
| `System.in`  | `InputStream` | Standard input, usually the keyboard |
| `System.out` | `PrintStream` | Standard output, usually the console |
| `System.err` | `PrintStream` | Error messages and warnings          |

## `System.out`

`System.out` is used to display information in the console.

| Method      | Function                                    |
| ----------- | ------------------------------------------- |
| `print()`   | Displays content without breaking the line  |
| `println()` | Displays content and breaks the line        |
| `printf()`  | Displays content with formatting            |
| `format()`  | Displays content using formatting           |
| `flush()`   | Forces the content to be sent to the output |

## Other ways to write output in modern Java

In recent Java versions, it is also possible to use static imports or create a local reference to the output stream.

### Static import of `System.out`

```java
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        out.println("Hello, Java!");
        out.print("Message without line break");
    }
}
```

### Local reference to `System.out`

```java
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {

        PrintStream output = System.out;

        output.println("Hello, Java!");
        output.print("Another message");
    }
}
```

### `System.console()`

It is also possible to use `System.console()` in applications executed directly in the terminal.

```java
public class Main {

    public static void main(String[] args) {

        var console = System.console();

        if (console != null) {
            console.writer().println("Console message");
        }
    }
}
```

Even with these alternatives, `System.out.println()` is still the most common and direct way to write output in examples, quick tests, and simple applications.

## `System.in`

`System.in` represents the standard input of the application. Normally, this input comes from the keyboard.

```text
Keyboard
   ↓
System.in
   ↓
Java Program
```

Because it is a byte stream, `System.in` is usually used together with classes such as `Scanner`, `InputStreamReader`, or `BufferedReader`.

## `System.err`

`System.err` is used for error messages or warnings.

| Method              | Function                                         |
| ------------------- | ------------------------------------------------ |
| `print()`           | Displays an error message without a line break   |
| `println()`         | Displays an error message and breaks the line    |
| `printf()`          | Displays a formatted error message               |
| `flush()`           | Forces the error message to be sent              |
| `printStackTrace()` | Displays detailed information about an exception |

---

# `Scanner`

The `Scanner` class makes it easier to read data entered by the user. It works as a reading layer over `System.in` and can convert values into primitive types.

```text
Keyboard
   ↓
System.in
   ↓
Scanner
   ↓
Java Program
```

## Main methods

| Method                | Function                                   |
| --------------------- | ------------------------------------------ |
| `next()`              | Reads the next token                       |
| `nextLine()`          | Reads a complete line                      |
| `nextInt()`           | Reads an integer                           |
| `nextDouble()`        | Reads a decimal number                     |
| `nextFloat()`         | Reads a decimal `float` value              |
| `nextLong()`          | Reads a `long` value                       |
| `nextShort()`         | Reads a `short` value                      |
| `nextByte()`          | Reads a `byte` value                       |
| `nextBoolean()`       | Reads a boolean value                      |
| `hasNext()`           | Checks if another token exists             |
| `hasNextLine()`       | Checks if another line exists              |
| `hasNextInt()`        | Checks if the next value is an integer     |
| `hasNextDouble()`     | Checks if the next value is a decimal      |
| `hasNextFloat()`      | Checks if the next value is a `float`      |
| `hasNextLong()`       | Checks if the next value is a `long`       |
| `hasNextBoolean()`    | Checks if the next value is a boolean      |
| `useDelimiter()`      | Defines the separator used during reading  |
| `useLocale()`         | Defines the locale used during conversion  |
| `skip()`              | Ignores part of the input                  |
| `findInLine()`        | Searches for a pattern in the current line |
| `findWithinHorizon()` | Searches for a pattern within a limit      |
| `close()`             | Closes the scanner                         |

## `next()` vs `nextLine()`

The difference between these methods can often cause confusion.

| Method       | Behavior                              |
| ------------ | ------------------------------------- |
| `next()`     | Reads only the next token             |
| `nextLine()` | Reads the entire line until the break |

Example:

```text
Input:
João Silva 25

next()
→ João

nextLine()
→ João Silva 25
```

When mixing methods such as `nextInt()` and `nextLine()`, you need to pay attention to the line break character that remains in the buffer:

```java
import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();

        System.out.println(name + " is " + age + " years old.");

        scanner.close();
    }
}
```

---

# Other Input and Output APIs

The APIs below are organized by library or group of classes. Each table presents the main functions and the purpose of each resource.

---

## `BufferedReader`

The `BufferedReader` class belongs to the `java.io` package and is used to read characters efficiently. It uses a buffer to reduce the number of accesses to the data source.

| Method                                | Function                                            |
| ------------------------------------- | --------------------------------------------------- |
| `read()`                              | Reads a character                                   |
| `read(char[] cbuf)`                   | Reads characters into an array                      |
| `read(char[] cbuf, int off, int len)` | Reads a specific amount of characters               |
| `readLine()`                          | Reads a complete line                               |
| `skip(long n)`                        | Skips a number of characters                        |
| `ready()`                             | Checks if reading can be performed without blocking |
| `mark(int readAheadLimit)`            | Marks a position for a possible return              |
| `reset()`                             | Returns to the marked position                      |
| `markSupported()`                     | Checks if position marking is supported             |
| `close()`                             | Closes the reader                                   |

---

## `InputStreamReader`

The `InputStreamReader` class belongs to the `java.io` package and is used to convert a byte stream into a character stream. It is useful when the source provides bytes, but the program needs to work with text.

| Method                                | Function                                            |
| ------------------------------------- | --------------------------------------------------- |
| `read()`                              | Reads a character                                   |
| `read(char[] cbuf)`                   | Reads characters into an array                      |
| `read(char[] cbuf, int off, int len)` | Reads a specific amount of characters               |
| `ready()`                             | Checks if reading can be performed without blocking |
| `getEncoding()`                       | Returns the encoding being used                     |
| `skip(long n)`                        | Skips characters                                    |
| `mark(int readAheadLimit)`            | Marks a reading position                            |
| `reset()`                             | Returns to the marked position                      |
| `close()`                             | Closes the reader                                   |

---

## `Reader`

The abstract `Reader` class belongs to the `java.io` package and serves as the base for classes that read characters.

| Method                                | Function                              |
| ------------------------------------- | ------------------------------------- |
| `read()`                              | Reads a character                     |
| `read(char[] cbuf)`                   | Reads characters into an array        |
| `read(char[] cbuf, int off, int len)` | Reads a specific amount of characters |
| `skip(long n)`                        | Skips characters                      |
| `ready()`                             | Checks if characters are available    |
| `mark(int readAheadLimit)`            | Marks a reading position              |
| `reset()`                             | Returns to the marked position        |
| `markSupported()`                     | Checks if marking is supported        |
| `transferTo(Writer out)`              | Transfers characters to a writer      |
| `close()`                             | Closes the reader                     |

---

## `FileReader`

The `FileReader` class belongs to the `java.io` package and is used to read characters directly from text files.

| Method                                | Function                              |
| ------------------------------------- | ------------------------------------- |
| `read()`                              | Reads a character                     |
| `read(char[] cbuf)`                   | Reads characters into an array        |
| `read(char[] cbuf, int off, int len)` | Reads a specific amount of characters |
| `skip(long n)`                        | Skips characters from the file        |
| `ready()`                             | Checks if data is available           |
| `getEncoding()`                       | Returns the encoding being used       |
| `close()`                             | Closes the file                       |

---

## `StringReader`

The `StringReader` class belongs to the `java.io` package and is used to treat the content of a `String` as a source of character input.

| Method                                | Function                              |
| ------------------------------------- | ------------------------------------- |
| `read()`                              | Reads a character from the string     |
| `read(char[] cbuf)`                   | Reads characters into an array        |
| `read(char[] cbuf, int off, int len)` | Reads a specific amount of characters |
| `skip(long n)`                        | Skips characters                      |
| `ready()`                             | Checks if characters are available    |
| `mark(int readAheadLimit)`            | Marks a position                      |
| `reset()`                             | Returns to the marked position        |
| `markSupported()`                     | Checks if marking is supported        |
| `close()`                             | Closes the reader                     |

---

## `Writer`

The abstract `Writer` class belongs to the `java.io` package and serves as the base for classes that write characters.

| Method                                         | Function                     |
| ---------------------------------------------- | ---------------------------- |
| `write(int c)`                                 | Writes a character           |
| `write(char[] cbuf)`                           | Writes a character array     |
| `write(char[] cbuf, int off, int len)`         | Writes part of an array      |
| `write(String str)`                            | Writes a string              |
| `write(String str, int off, int len)`          | Writes part of a string      |
| `append(char c)`                               | Appends a character          |
| `append(CharSequence csq)`                     | Appends a character sequence |
| `append(CharSequence csq, int start, int end)` | Appends part of a sequence   |
| `flush()`                                      | Sends pending data           |
| `close()`                                      | Closes the writer            |

---

## `BufferedWriter`

The `BufferedWriter` class belongs to the `java.io` package and is used to write text using a buffer, reducing direct accesses to the destination.

| Method                                 | Function                         |
| -------------------------------------- | -------------------------------- |
| `write(int c)`                         | Writes a character               |
| `write(char[] cbuf)`                   | Writes a character array         |
| `write(char[] cbuf, int off, int len)` | Writes part of an array          |
| `write(String s)`                      | Writes a string                  |
| `write(String s, int off, int len)`    | Writes part of a string          |
| `newLine()`                            | Writes the system line separator |
| `append(char c)`                       | Appends a character              |
| `append(CharSequence csq)`             | Appends a character sequence     |
| `flush()`                              | Sends the data from the buffer   |
| `close()`                              | Closes the writer                |

---

## `FileWriter`

The `FileWriter` class belongs to the `java.io` package and is used to write characters to text files.

| Method                                 | Function                     |
| -------------------------------------- | ---------------------------- |
| `write(int c)`                         | Writes a character           |
| `write(char[] cbuf)`                   | Writes a character array     |
| `write(char[] cbuf, int off, int len)` | Writes part of an array      |
| `write(String str)`                    | Writes a string              |
| `write(String str, int off, int len)`  | Writes part of a string      |
| `append(char c)`                       | Appends a character          |
| `append(CharSequence csq)`             | Appends a character sequence |
| `flush()`                              | Sends pending data           |
| `close()`                              | Closes the file              |

---

## `OutputStreamWriter`

The `OutputStreamWriter` class belongs to the `java.io` package and is used to convert characters into bytes. It is used when the destination works with bytes, but the program produces text.

| Method                                 | Function                        |
| -------------------------------------- | ------------------------------- |
| `write(int c)`                         | Writes a character              |
| `write(char[] cbuf)`                   | Writes characters               |
| `write(char[] cbuf, int off, int len)` | Writes part of an array         |
| `write(String str)`                    | Writes a string                 |
| `write(String str, int off, int len)`  | Writes part of a string         |
| `getEncoding()`                        | Returns the encoding being used |
| `append(char c)`                       | Appends a character             |
| `append(CharSequence csq)`             | Appends a sequence              |
| `flush()`                              | Converts and sends pending data |
| `close()`                              | Closes the writer               |

---

## `PrintWriter`

The `PrintWriter` class belongs to the `java.io` package and makes it easier to write text, messages, and formatted data.

| Method         | Function                            |
| -------------- | ----------------------------------- |
| `print()`      | Writes a value without a line break |
| `println()`    | Writes a value and breaks the line  |
| `printf()`     | Writes formatted data               |
| `format()`     | Writes data using formatting        |
| `append()`     | Appends characters or sequences     |
| `write()`      | Writes characters or strings        |
| `flush()`      | Sends pending data                  |
| `checkError()` | Checks if an error occurred         |
| `clearError()` | Clears the error state              |
| `close()`      | Closes the writer                   |

---

## `InputStream`

The abstract `InputStream` class belongs to the `java.io` package and serves as the base for reading byte data.

| Method                             | Function                               |
| ---------------------------------- | -------------------------------------- |
| `read()`                           | Reads a byte                           |
| `read(byte[] b)`                   | Reads bytes into an array              |
| `read(byte[] b, int off, int len)` | Reads a specific amount of bytes       |
| `readAllBytes()`                   | Reads all available bytes              |
| `readNBytes()`                     | Reads up to a specific number of bytes |
| `skip(long n)`                     | Skips bytes                            |
| `available()`                      | Returns an estimate of available bytes |
| `mark(int readlimit)`              | Marks a reading position               |
| `reset()`                          | Returns to the marked position         |
| `markSupported()`                  | Checks if marking is supported         |
| `transferTo(OutputStream out)`     | Transfers data to an output stream     |
| `close()`                          | Closes the stream                      |

---

## `OutputStream`

The abstract `OutputStream` class belongs to the `java.io` package and serves as the base for writing byte data.

| Method                              | Function                |
| ----------------------------------- | ----------------------- |
| `write(int b)`                      | Writes a byte           |
| `write(byte[] b)`                   | Writes a byte array     |
| `write(byte[] b, int off, int len)` | Writes part of an array |
| `flush()`                           | Sends pending data      |
| `close()`                           | Closes the stream       |

---

## `FileInputStream`

The `FileInputStream` class belongs to the `java.io` package and is used to read bytes directly from files.

| Method                             | Function                                     |
| ---------------------------------- | -------------------------------------------- |
| `read()`                           | Reads a byte                                 |
| `read(byte[] b)`                   | Reads bytes into an array                    |
| `read(byte[] b, int off, int len)` | Reads part of the data                       |
| `skip(long n)`                     | Skips bytes                                  |
| `available()`                      | Returns an estimate of available bytes       |
| `getChannel()`                     | Returns the channel associated with the file |
| `getFD()`                          | Returns the file descriptor                  |
| `close()`                          | Closes the file                              |

---

## `FileOutputStream`

The `FileOutputStream` class belongs to the `java.io` package and is used to write bytes directly to files.

| Method                              | Function                                     |
| ----------------------------------- | -------------------------------------------- |
| `write(int b)`                      | Writes a byte                                |
| `write(byte[] b)`                   | Writes a byte array                          |
| `write(byte[] b, int off, int len)` | Writes part of an array                      |
| `flush()`                           | Sends pending data                           |
| `getChannel()`                      | Returns the channel associated with the file |
| `getFD()`                           | Returns the file descriptor                  |
| `close()`                           | Closes the file                              |

---

## `BufferedInputStream`

The `BufferedInputStream` class belongs to the `java.io` package and improves byte reading by using an internal buffer.

| Method                             | Function                               |
| ---------------------------------- | -------------------------------------- |
| `read()`                           | Reads a byte                           |
| `read(byte[] b)`                   | Reads bytes into an array              |
| `read(byte[] b, int off, int len)` | Reads part of the data                 |
| `skip(long n)`                     | Skips bytes                            |
| `available()`                      | Returns an estimate of available bytes |
| `mark(int readlimit)`              | Marks a position                       |
| `reset()`                          | Returns to the marked position         |
| `markSupported()`                  | Checks if marking is supported         |
| `close()`                          | Closes the stream                      |

---

## `BufferedOutputStream`

The `BufferedOutputStream` class belongs to the `java.io` package and improves byte writing by using an internal buffer.

| Method                              | Function                       |
| ----------------------------------- | ------------------------------ |
| `write(int b)`                      | Writes a byte to the buffer    |
| `write(byte[] b)`                   | Writes bytes to the buffer     |
| `write(byte[] b, int off, int len)` | Writes part of an array        |
| `flush()`                           | Sends the data from the buffer |
| `close()`                           | Closes the stream              |

---

## `ByteArrayInputStream`

The `ByteArrayInputStream` class belongs to the `java.io` package and is used to read bytes stored in an array in memory.

| Method                             | Function                                    |
| ---------------------------------- | ------------------------------------------- |
| `read()`                           | Reads a byte                                |
| `read(byte[] b)`                   | Reads bytes into an array                   |
| `read(byte[] b, int off, int len)` | Reads part of the data                      |
| `readAllBytes()`                   | Reads all remaining bytes                   |
| `skip(long n)`                     | Skips bytes                                 |
| `available()`                      | Returns the amount of available bytes       |
| `mark(int readAheadLimit)`         | Marks a position                            |
| `reset()`                          | Returns to the beginning or marked position |
| `markSupported()`                  | Indicates if marking is supported           |
| `close()`                          | Closes the in-memory stream                 |

---

## `ByteArrayOutputStream`

The `ByteArrayOutputStream` class belongs to the `java.io` package and is used to write bytes to a memory structure that can later be converted into an array or string.

| Method                              | Function                                      |
| ----------------------------------- | --------------------------------------------- |
| `write(int b)`                      | Writes a byte                                 |
| `write(byte[] b)`                   | Writes a byte array                           |
| `write(byte[] b, int off, int len)` | Writes part of an array                       |
| `writeBytes(byte[] b)`              | Writes all bytes from the array               |
| `writeTo(OutputStream out)`         | Sends the content to another stream           |
| `toByteArray()`                     | Returns the data as a byte array              |
| `toString()`                        | Converts the data to a string                 |
| `reset()`                           | Clears the stored content                     |
| `size()`                            | Returns the amount of stored bytes            |
| `flush()`                           | Does not perform a significant operation here |
| `close()`                           | Closes the in-memory stream                   |

---

## `DataInputStream`

The `DataInputStream` class belongs to the `java.io` package and is used to read primitive types in binary format.

| Method                | Function                            |
| --------------------- | ----------------------------------- |
| `readBoolean()`       | Reads a boolean                     |
| `readByte()`          | Reads a byte                        |
| `readUnsignedByte()`  | Reads an unsigned byte              |
| `readShort()`         | Reads a `short`                     |
| `readUnsignedShort()` | Reads an unsigned `short`           |
| `readChar()`          | Reads a character                   |
| `readInt()`           | Reads an integer                    |
| `readLong()`          | Reads a `long`                      |
| `readFloat()`         | Reads a `float`                     |
| `readDouble()`        | Reads a `double`                    |
| `readUTF()`           | Reads a string in UTF format        |
| `readFully()`         | Ensures that an array is fully read |
| `skipBytes()`         | Skips a number of bytes             |
| `read()`              | Reads a byte                        |
| `close()`             | Closes the stream                   |

---

## `DataOutputStream`

The `DataOutputStream` class belongs to the `java.io` package and is used to write primitive types in binary format.

| Method           | Function                            |
| ---------------- | ----------------------------------- |
| `writeBoolean()` | Writes a boolean                    |
| `writeByte()`    | Writes a byte                       |
| `writeShort()`   | Writes a `short`                    |
| `writeChar()`    | Writes a character                  |
| `writeInt()`     | Writes an integer                   |
| `writeLong()`    | Writes a `long`                     |
| `writeFloat()`   | Writes a `float`                    |
| `writeDouble()`  | Writes a `double`                   |
| `writeUTF()`     | Writes a string in UTF format       |
| `write()`        | Writes a byte or byte array         |
| `size()`         | Returns the number of bytes written |
| `flush()`        | Sends pending data                  |
| `close()`        | Closes the stream                   |

---

## `ObjectInputStream`

The `ObjectInputStream` class belongs to the `java.io` package and is used to read and deserialize objects stored in binary format.

| Method                 | Function                                          |
| ---------------------- | ------------------------------------------------- |
| `readObject()`         | Reads and reconstructs an object                  |
| `readUnshared()`       | Reads an object without reusing shared references |
| `readBoolean()`        | Reads a boolean                                   |
| `readByte()`           | Reads a byte                                      |
| `readShort()`          | Reads a `short`                                   |
| `readChar()`           | Reads a character                                 |
| `readInt()`            | Reads an integer                                  |
| `readLong()`           | Reads a `long`                                    |
| `readFloat()`          | Reads a `float`                                   |
| `readDouble()`         | Reads a `double`                                  |
| `readUTF()`            | Reads a UTF string                                |
| `defaultReadObject()`  | Reads the default fields of an object             |
| `registerValidation()` | Registers a validation during deserialization     |
| `close()`              | Closes the stream                                 |

---

## `ObjectOutputStream`

The `ObjectOutputStream` class belongs to the `java.io` package and is used to serialize objects and store them in binary format.

| Method                 | Function                                    |
| ---------------------- | ------------------------------------------- |
| `writeObject()`        | Serializes and writes an object             |
| `writeUnshared()`      | Writes an object without sharing references |
| `writeBoolean()`       | Writes a boolean                            |
| `writeByte()`          | Writes a byte                               |
| `writeShort()`         | Writes a `short`                            |
| `writeChar()`          | Writes a character                          |
| `writeInt()`           | Writes an integer                           |
| `writeLong()`          | Writes a `long`                             |
| `writeFloat()`         | Writes a `float`                            |
| `writeDouble()`        | Writes a `double`                           |
| `writeUTF()`           | Writes a UTF string                         |
| `defaultWriteObject()` | Writes the default fields of an object      |
| `reset()`              | Clears the stream reference state           |
| `flush()`              | Sends pending data                          |
| `close()`              | Closes the stream                           |

---

## `SequenceInputStream`

The `SequenceInputStream` class belongs to the `java.io` package and is used to combine two or more input streams into one continuous sequence.

| Method                             | Function                               |
| ---------------------------------- | -------------------------------------- |
| `read()`                           | Reads a byte from the current stream   |
| `read(byte[] b)`                   | Reads bytes into an array              |
| `read(byte[] b, int off, int len)` | Reads part of the data                 |
| `available()`                      | Returns an estimate of available bytes |
| `close()`                          | Closes all combined streams            |

---

## `File`

The `File` class belongs to the `java.io` package and represents files and directories. It is a traditional API used to check properties and perform basic file system operations.

| Method               | Function                                        |
| -------------------- | ----------------------------------------------- |
| `exists()`           | Checks if the file or directory exists          |
| `isFile()`           | Checks if it represents a file                  |
| `isDirectory()`      | Checks if it represents a directory             |
| `createNewFile()`    | Creates a new file                              |
| `mkdir()`            | Creates a directory                             |
| `mkdirs()`           | Creates required directories and subdirectories |
| `delete()`           | Deletes the file or directory                   |
| `renameTo()`         | Renames or moves the file                       |
| `list()`             | Lists the names inside a directory              |
| `listFiles()`        | Lists files and directories                     |
| `length()`           | Returns the file size                           |
| `lastModified()`     | Returns the last modification date              |
| `getName()`          | Returns the file name                           |
| `getPath()`          | Returns the provided path                       |
| `getAbsolutePath()`  | Returns the absolute path                       |
| `getCanonicalPath()` | Returns the canonical path                      |
| `canRead()`          | Checks if the file can be read                  |
| `canWrite()`         | Checks if the file can be changed               |
| `canExecute()`       | Checks if the file can be executed              |
| `isHidden()`         | Checks if the file is hidden                    |
| `toURI()`            | Converts the path to a URI                      |

---

## `RandomAccessFile`

The `RandomAccessFile` class belongs to the `java.io` package and is used to read and write data at specific positions in a file.

| Method             | Function                                |
| ------------------ | --------------------------------------- |
| `read()`           | Reads a byte                            |
| `readInt()`        | Reads an integer                        |
| `readLong()`       | Reads a `long`                          |
| `readDouble()`     | Reads a `double`                        |
| `readUTF()`        | Reads a UTF string                      |
| `write()`          | Writes bytes                            |
| `writeInt()`       | Writes an integer                       |
| `writeLong()`      | Writes a `long`                         |
| `writeDouble()`    | Writes a `double`                       |
| `writeUTF()`       | Writes a UTF string                     |
| `seek()`           | Moves the cursor to a specific position |
| `getFilePointer()` | Returns the current cursor position     |
| `length()`         | Returns the file size                   |
| `setLength()`      | Defines the file size                   |
| `skipBytes()`      | Moves forward by a number of bytes      |
| `readFully()`      | Ensures all data is read                |
| `close()`          | Closes the file                         |

---

# Java NIO.2 — `Path`, `Files` and `Paths`

The `java.nio.file` package provides a modern API for working with files, directories, and paths. In current projects, `Path` and `Files` are generally preferred over the `File` class.

---

## `Path`

The `Path` interface represents the path of a file or directory.

| Method             | Function                                   |
| ------------------ | ------------------------------------------ |
| `getFileName()`    | Returns the last element of the path       |
| `getParent()`      | Returns the parent directory               |
| `getRoot()`        | Returns the root of the path               |
| `getName()`        | Returns a specific path element            |
| `getNameCount()`   | Returns the number of elements             |
| `subpath()`        | Returns part of the path                   |
| `startsWith()`     | Checks if it starts with a specific path   |
| `endsWith()`       | Checks if it ends with a specific path     |
| `normalize()`      | Removes redundant elements                 |
| `resolve()`        | Combines two paths                         |
| `resolveSibling()` | Combines a path with the parent directory  |
| `relativize()`     | Calculates the relative path between paths |
| `toAbsolutePath()` | Converts to an absolute path               |
| `toRealPath()`     | Returns the real existing path             |
| `toFile()`         | Converts to a `File` object                |
| `toUri()`          | Converts to a URI                          |
| `iterator()`       | Iterates through the path elements         |

---

## `Paths`

The `Paths` class belongs to the `java.nio.file` package and is used to create `Path` objects.

| Method                              | Function                              |
| ----------------------------------- | ------------------------------------- |
| `get(String first, String... more)` | Creates a `Path` from parts of a path |

---

## `Files`

The `Files` class belongs to the `java.nio.file` package and provides modern operations to create, read, write, copy, move, delete, and inspect files and directories.

| Method                      | Function                                        |
| --------------------------- | ----------------------------------------------- |
| `exists()`                  | Checks if the path exists                       |
| `notExists()`               | Checks if the path does not exist               |
| `isRegularFile()`           | Checks if the path represents a regular file    |
| `isDirectory()`             | Checks if the path represents a directory       |
| `isReadable()`              | Checks if the path can be read                  |
| `isWritable()`              | Checks if the path can be changed               |
| `isExecutable()`            | Checks if the path can be executed              |
| `createFile()`              | Creates an empty file                           |
| `createDirectory()`         | Creates a directory                             |
| `createDirectories()`       | Creates required directories and subdirectories |
| `delete()`                  | Deletes a file or directory                     |
| `deleteIfExists()`          | Deletes if the path exists                      |
| `copy()`                    | Copies a file or directory                      |
| `move()`                    | Moves or renames a file or directory            |
| `readAllBytes()`            | Reads all bytes from a file                     |
| `readString()`              | Reads the entire content as a string            |
| `readAllLines()`            | Reads all lines from a file                     |
| `newBufferedReader()`       | Creates a buffered reader                       |
| `newInputStream()`          | Creates an input stream                         |
| `write()`                   | Writes bytes to a file                          |
| `writeString()`             | Writes a string to a file                       |
| `newBufferedWriter()`       | Creates a buffered writer                       |
| `newOutputStream()`         | Creates an output stream                        |
| `size()`                    | Returns the file size                           |
| `getLastModifiedTime()`     | Returns the last modification date              |
| `getOwner()`                | Returns the owner                               |
| `getPosixFilePermissions()` | Returns POSIX permissions                       |
| `setLastModifiedTime()`     | Changes the modification date                   |
| `list()`                    | Lists the content of a directory                |
| `walk()`                    | Walks through a directory tree                  |
| `find()`                    | Finds paths using a filter                      |
| `lines()`                   | Returns the lines as a stream                   |
| `isSameFile()`              | Checks if two paths represent the same file     |
| `probeContentType()`        | Tries to identify the content type              |

---

## `DirectoryStream`

The `DirectoryStream` interface belongs to the `java.nio.file` package and is used to iterate through the contents of a directory.

| Method       | Function                                       |
| ------------ | ---------------------------------------------- |
| `iterator()` | Returns an iterator for the directory elements |
| `close()`    | Closes the directory stream                    |

---

## `FileSystem`

The abstract `FileSystem` class represents a file system and provides information about its paths, providers, and available resources.

| Method                 | Function                               |
| ---------------------- | -------------------------------------- |
| `getPath()`            | Creates a path inside the file system  |
| `getRootDirectories()` | Returns the root directories           |
| `getFileStores()`      | Returns the storage devices            |
| `getSeparator()`       | Returns the path separator             |
| `getPathMatcher()`     | Creates a mechanism to compare paths   |
| `newWatchService()`    | Creates a monitoring service           |
| `provider()`           | Returns the file system provider       |
| `isOpen()`             | Checks if the file system is open      |
| `isReadOnly()`         | Checks if the file system is read-only |
| `close()`              | Closes the file system                 |

---

## `FileSystems`

The `FileSystems` class belongs to the `java.nio.file` package and is used to access the default file system or create additional file systems.

| Method            | Function                                    |
| ----------------- | ------------------------------------------- |
| `getDefault()`    | Returns the default file system             |
| `getFileSystem()` | Returns a file system associated with a URI |
| `newFileSystem()` | Creates or opens a file system              |

---

## `FileStore`

The `FileStore` class represents a storage unit or device.

| Method                        | Function                                         |
| ----------------------------- | ------------------------------------------------ |
| `name()`                      | Returns the storage name                         |
| `type()`                      | Returns the storage type                         |
| `getTotalSpace()`             | Returns the total space                          |
| `getUsableSpace()`            | Returns the space available to the application   |
| `getUnallocatedSpace()`       | Returns the unallocated space                    |
| `supportsFileAttributeView()` | Checks if a specific attribute type is supported |
| `getFileStoreAttributeView()` | Returns an attribute view                        |
| `getAttribute()`              | Returns a specific attribute                     |

---

## `WatchService`

The `WatchService` interface belongs to the `java.nio.file` package and is used to monitor changes in files and directories.

| Method                              | Function                                |
| ----------------------------------- | --------------------------------------- |
| `poll()`                            | Gets an available event without waiting |
| `poll(long timeout, TimeUnit unit)` | Waits for an event for a period         |
| `take()`                            | Waits until an event is available       |
| `close()`                           | Closes the monitoring service           |

---

## `WatchKey`

The `WatchKey` class represents the registration of a directory in the monitoring service.

| Method         | Function                                  |
| -------------- | ----------------------------------------- |
| `pollEvents()` | Returns the detected events               |
| `reset()`      | Reactivates the key to receive new events |
| `isValid()`    | Checks if the key is still valid          |
| `cancel()`     | Cancels the monitoring                    |
| `watchable()`  | Returns the monitored path                |

---

## `WatchEvent`

The `WatchEvent` interface represents a change detected in a monitored directory.

| Method      | Function                                      |
| ----------- | --------------------------------------------- |
| `kind()`    | Returns the event type                        |
| `count()`   | Returns the number of occurrences             |
| `context()` | Returns the context associated with the event |

Common event types:

| Event          | Function                                      |
| -------------- | --------------------------------------------- |
| `ENTRY_CREATE` | Indicates the creation of a file or directory |
| `ENTRY_DELETE` | Indicates the deletion of a file or directory |
| `ENTRY_MODIFY` | Indicates a change to a file or directory     |
| `OVERFLOW`     | Indicates that some events may have been lost |

---

# Java NIO — Buffers and Channels

Java NIO provides an approach based on buffers and channels. This API is useful for more efficient I/O operations, non-blocking communication, and applications that need to handle multiple connections.

---

## `Buffer`

The abstract `Buffer` class represents a memory area temporarily used during read and write operations.

| Method                      | Function                                   |
| --------------------------- | ------------------------------------------ |
| `capacity()`                | Returns the total buffer capacity          |
| `position()`                | Returns the current position               |
| `position(int newPosition)` | Changes the current position               |
| `limit()`                   | Returns the current limit                  |
| `limit(int newLimit)`       | Changes the limit                          |
| `remaining()`               | Returns the number of remaining elements   |
| `hasRemaining()`            | Checks if there are remaining elements     |
| `flip()`                    | Prepares the buffer for reading            |
| `clear()`                   | Prepares the buffer for new writing        |
| `rewind()`                  | Returns the position to the beginning      |
| `mark()`                    | Marks the current position                 |
| `reset()`                   | Returns to the marked position             |
| `compact()`                 | Moves remaining data to the beginning      |
| `isReadOnly()`              | Checks if the buffer is read-only          |
| `array()`                   | Returns the internal array, when available |
| `arrayOffset()`             | Returns the internal array offset          |

---

## `ByteBuffer`

The `ByteBuffer` class is used to store and manipulate bytes in memory.

| Method                   | Function                             |
| ------------------------ | ------------------------------------ |
| `allocate()`             | Creates a buffer in memory           |
| `allocateDirect()`       | Creates a direct buffer              |
| `wrap()`                 | Creates a buffer from an array       |
| `get()`                  | Reads a byte                         |
| `get(byte[] dst)`        | Reads bytes into an array            |
| `get(int index)`         | Reads a byte at a specific position  |
| `put()`                  | Writes a byte                        |
| `put(byte[] src)`        | Writes a byte array                  |
| `put(int index, byte b)` | Writes a byte at a specific position |
| `getChar()`              | Reads a character                    |
| `getShort()`             | Reads a `short`                      |
| `getInt()`               | Reads an integer                     |
| `getLong()`              | Reads a `long`                       |
| `getFloat()`             | Reads a `float`                      |
| `getDouble()`            | Reads a `double`                     |
| `putChar()`              | Writes a character                   |
| `putShort()`             | Writes a `short`                     |
| `putInt()`               | Writes an integer                    |
| `putLong()`              | Writes a `long`                      |
| `putFloat()`             | Writes a `float`                     |
| `putDouble()`            | Writes a `double`                    |
| `order()`                | Gets or changes the byte order       |
| `slice()`                | Creates a partial view of the buffer |
| `duplicate()`            | Creates a duplicate buffer structure |
| `asReadOnlyBuffer()`     | Creates a read-only view             |

---

## `Channel`

The `Channel` interface represents a communication channel with files, sockets, or other I/O resources.

| Method     | Function                      |
| ---------- | ----------------------------- |
| `isOpen()` | Checks if the channel is open |
| `close()`  | Closes the channel            |

---

## `FileChannel`

The `FileChannel` class is used to perform reading, writing, positioning, and transfer operations on files using channels.

| Method                                 | Function                                |
| -------------------------------------- | --------------------------------------- |
| `open()`                               | Opens or creates a file channel         |
| `read(ByteBuffer dst)`                 | Reads data into a buffer                |
| `read(ByteBuffer dst, long position)`  | Reads data from a specific position     |
| `write(ByteBuffer src)`                | Writes data from a buffer               |
| `write(ByteBuffer src, long position)` | Writes data at a specific position      |
| `position()`                           | Returns the current position            |
| `position(long newPosition)`           | Changes the current position            |
| `size()`                               | Returns the file size                   |
| `truncate()`                           | Reduces the file size                   |
| `force()`                              | Forces data to be written to the device |
| `transferTo()`                         | Transfers data to another channel       |
| `transferFrom()`                       | Transfers data from another channel     |
| `map()`                                | Maps a file region into memory          |
| `lock()`                               | Gets a file lock                        |
| `tryLock()`                            | Tries to get a lock without waiting     |
| `isOpen()`                             | Checks if the channel is open           |
| `close()`                              | Closes the channel                      |

---

## `SocketChannel`

The `SocketChannel` class is used for TCP communication through channels and can operate in blocking or non-blocking mode.

| Method                  | Function                                           |
| ----------------------- | -------------------------------------------------- |
| `open()`                | Creates or opens a TCP channel                     |
| `connect()`             | Connects the channel to a server                   |
| `finishConnect()`       | Finishes a connection started in non-blocking mode |
| `isConnected()`         | Checks if the channel is connected                 |
| `isConnectionPending()` | Checks if a connection is pending                  |
| `read(ByteBuffer dst)`  | Reads data from the socket                         |
| `write(ByteBuffer src)` | Sends data through the socket                      |
| `shutdownInput()`       | Disables socket input                              |
| `shutdownOutput()`      | Disables socket output                             |
| `bind()`                | Associates the channel with a local address        |
| `setOption()`           | Defines a socket option                            |
| `getRemoteAddress()`    | Returns the remote address                         |
| `getLocalAddress()`     | Returns the local address                          |
| `configureBlocking()`   | Defines blocking or non-blocking mode              |
| `isBlocking()`          | Checks if the channel is in blocking mode          |
| `close()`               | Closes the channel                                 |

---

## `ServerSocketChannel`

The `ServerSocketChannel` class is used to create TCP servers based on channels.

| Method                | Function                                       |
| --------------------- | ---------------------------------------------- |
| `open()`              | Creates a server channel                       |
| `bind()`              | Associates the server with an address and port |
| `accept()`            | Accepts a client connection                    |
| `isOpen()`            | Checks if the channel is open                  |
| `configureBlocking()` | Defines blocking or non-blocking mode          |
| `isBlocking()`        | Checks the operating mode                      |
| `register()`          | Registers the channel in a `Selector`          |
| `setOption()`         | Defines a server option                        |
| `getLocalAddress()`   | Returns the local address                      |
| `close()`             | Closes the channel                             |

---

## `DatagramChannel`

The `DatagramChannel` class is used for UDP communication through channels.

| Method                | Function                                     |
| --------------------- | -------------------------------------------- |
| `open()`              | Creates a UDP channel                        |
| `bind()`              | Associates the channel with a local address  |
| `connect()`           | Associates the channel with a remote address |
| `disconnect()`        | Removes the remote association               |
| `receive()`           | Receives a datagram                          |
| `send()`              | Sends a datagram                             |
| `read()`              | Reads data from a connected channel          |
| `write()`             | Writes data to a connected channel           |
| `isConnected()`       | Checks if the channel is connected           |
| `getRemoteAddress()`  | Returns the remote address                   |
| `getLocalAddress()`   | Returns the local address                    |
| `configureBlocking()` | Defines blocking or non-blocking mode        |
| `register()`          | Registers the channel in a `Selector`        |
| `close()`             | Closes the channel                           |

---

## `Selector`

The `Selector` class is used to monitor multiple channels in a centralized way, mainly in non-blocking applications.

| Method                 | Function                               |
| ---------------------- | -------------------------------------- |
| `open()`               | Creates a selector                     |
| `select()`             | Waits for channels ready for operation |
| `select(long timeout)` | Waits for a specific period            |
| `selectNow()`          | Immediately checks ready channels      |
| `selectedKeys()`       | Returns the selected keys              |
| `keys()`               | Returns all registered keys            |
| `wakeup()`             | Interrupts a selection operation       |
| `isOpen()`             | Checks if the selector is open         |
| `close()`              | Closes the selector                    |

---

## `SelectionKey`

The `SelectionKey` class represents the registration of a channel in a `Selector`.

| Method                 | Function                                      |
| ---------------------- | --------------------------------------------- |
| `channel()`            | Returns the associated channel                |
| `selector()`           | Returns the associated selector               |
| `isValid()`            | Checks if the key is valid                    |
| `cancel()`             | Cancels the registration                      |
| `interestOps()`        | Gets the operations of interest               |
| `interestOps(int ops)` | Defines the operations of interest            |
| `readyOps()`           | Returns the operations that are ready         |
| `isReadable()`         | Checks if the channel is ready for reading    |
| `isWritable()`         | Checks if the channel is ready for writing    |
| `isConnectable()`      | Checks if the channel is ready for connection |
| `isAcceptable()`       | Checks if the server can accept a connection  |
| `attach()`             | Associates an object with the key             |
| `attachment()`         | Returns the associated object                 |

---

# Network Communication

Network APIs mainly belong to the `java.net` package and allow applications to create clients, servers, and systems that exchange data using TCP, UDP, or HTTP.

---

## `Socket`

The `Socket` class represents a TCP connection on the client side.

| Method              | Function                                |
| ------------------- | --------------------------------------- |
| `connect()`         | Connects the socket to a server         |
| `getInputStream()`  | Returns the input stream                |
| `getOutputStream()` | Returns the output stream               |
| `getInetAddress()`  | Returns the remote address              |
| `getLocalAddress()` | Returns the local address               |
| `getPort()`         | Returns the remote port                 |
| `getLocalPort()`    | Returns the local port                  |
| `setSoTimeout()`    | Defines the read timeout                |
| `getSoTimeout()`    | Returns the read timeout                |
| `setTcpNoDelay()`   | Enables or disables the Nagle algorithm |
| `getTcpNoDelay()`   | Checks the state of the Nagle algorithm |
| `setKeepAlive()`    | Enables or disables keep-alive packets  |
| `isConnected()`     | Checks if the socket is connected       |
| `isClosed()`        | Checks if the socket is closed          |
| `shutdownInput()`   | Disables input                          |
| `shutdownOutput()`  | Disables output                         |
| `close()`           | Closes the connection                   |

---

## `ServerSocket`

The `ServerSocket` class is used to create TCP servers that wait for client connections.

| Method                    | Function                                           |
| ------------------------- | -------------------------------------------------- |
| `accept()`                | Waits for and accepts a connection                 |
| `bind()`                  | Associates the server with an address and port     |
| `getInetAddress()`        | Returns the local address                          |
| `getLocalPort()`          | Returns the local port                             |
| `getLocalSocketAddress()` | Returns the complete local address                 |
| `setSoTimeout()`          | Defines the timeout for waiting for connections    |
| `getSoTimeout()`          | Returns the configured timeout                     |
| `setReuseAddress()`       | Allows address reuse                               |
| `getReuseAddress()`       | Checks address reuse                               |
| `isBound()`               | Checks if the server is associated with an address |
| `isClosed()`              | Checks if the server is closed                     |
| `close()`                 | Closes the server                                  |

---

## `DatagramSocket`

The `DatagramSocket` class is used to send and receive UDP packets.

| Method              | Function                                    |
| ------------------- | ------------------------------------------- |
| `send()`            | Sends a UDP packet                          |
| `receive()`         | Waits for and receives a UDP packet         |
| `connect()`         | Associates the socket with a remote address |
| `disconnect()`      | Removes the remote association              |
| `getInetAddress()`  | Returns the remote address                  |
| `getLocalAddress()` | Returns the local address                   |
| `getPort()`         | Returns the remote port                     |
| `getLocalPort()`    | Returns the local port                      |
| `setSoTimeout()`    | Defines the receive timeout                 |
| `getSoTimeout()`    | Returns the configured timeout              |
| `setBroadcast()`    | Allows or blocks broadcast                  |
| `getBroadcast()`    | Checks the broadcast state                  |
| `isConnected()`     | Checks if it is connected                   |
| `isClosed()`        | Checks if it is closed                      |
| `close()`           | Closes the socket                           |

---

## `DatagramPacket`

The `DatagramPacket` class represents a packet used in UDP communication.

| Method               | Function                        |
| -------------------- | ------------------------------- |
| `getData()`          | Returns the data array          |
| `setData()`          | Defines the data array          |
| `getLength()`        | Returns the data length         |
| `setLength()`        | Defines the data length         |
| `getOffset()`        | Returns the initial offset      |
| `setAddress()`       | Defines the destination address |
| `getAddress()`       | Returns the associated address  |
| `setPort()`          | Defines the destination port    |
| `getPort()`          | Returns the associated port     |
| `getSocketAddress()` | Returns the complete address    |
| `setSocketAddress()` | Defines the complete address    |

---

## `InetAddress`

The `InetAddress` class represents IP addresses and host names.

| Method                   | Function                                 |
| ------------------------ | ---------------------------------------- |
| `getByName()`            | Gets the address of a host               |
| `getAllByName()`         | Gets all addresses of a host             |
| `getLocalHost()`         | Gets the address of the local machine    |
| `getLoopbackAddress()`   | Gets the loopback address                |
| `getHostName()`          | Returns the host name                    |
| `getCanonicalHostName()` | Returns the canonical name               |
| `getHostAddress()`       | Returns the IP address as text           |
| `getAddress()`           | Returns the address as a byte array      |
| `isReachable()`          | Checks if the address can be reached     |
| `isLoopbackAddress()`    | Checks if it is a loopback address       |
| `isAnyLocalAddress()`    | Checks if it is a wildcard local address |
| `isMulticastAddress()`   | Checks if it is a multicast address      |
| `isSiteLocalAddress()`   | Checks if it is a local network address  |

---

## `URL`

The `URL` class represents the address of a resource located on a network.

| Method             | Function                                      |
| ------------------ | --------------------------------------------- |
| `openConnection()` | Opens a connection to the resource            |
| `openStream()`     | Opens an input stream                         |
| `getProtocol()`    | Returns the protocol being used               |
| `getHost()`        | Returns the host                              |
| `getPort()`        | Returns the port                              |
| `getDefaultPort()` | Returns the default port of the protocol      |
| `getPath()`        | Returns the resource path                     |
| `getQuery()`       | Returns the query parameters                  |
| `getFile()`        | Returns the path and query                    |
| `getRef()`         | Returns the resource reference                |
| `toURI()`          | Converts the URL to a URI                     |
| `toExternalForm()` | Converts to a text representation             |
| `sameFile()`       | Checks if two URLs point to the same resource |

---

## `URLConnection`

The `URLConnection` class represents a connection to a resource accessed through a URL.

| Method                 | Function                             |
| ---------------------- | ------------------------------------ |
| `connect()`            | Establishes the connection           |
| `getInputStream()`     | Returns the input stream             |
| `getOutputStream()`    | Returns the output stream            |
| `getContent()`         | Gets the resource content            |
| `getContentType()`     | Returns the content type             |
| `getContentLength()`   | Returns the content length           |
| `getContentEncoding()` | Returns the content encoding         |
| `getDate()`            | Returns the resource date            |
| `getLastModified()`    | Returns the last modification date   |
| `getExpiration()`      | Returns the expiration date          |
| `getHeaderField()`     | Returns a header value               |
| `getHeaderFields()`    | Returns all headers                  |
| `setConnectTimeout()`  | Defines the connection timeout       |
| `getConnectTimeout()`  | Returns the connection timeout       |
| `setReadTimeout()`     | Defines the read timeout             |
| `getReadTimeout()`     | Returns the read timeout             |
| `setDoInput()`         | Defines whether there will be input  |
| `setDoOutput()`        | Defines whether there will be output |
| `setRequestProperty()` | Defines a request property           |
| `getRequestProperty()` | Gets a request property              |

---

## `HttpClient`

The `HttpClient` class belongs to the `java.net.http` package and is used to make HTTP and HTTPS requests in a modern way.

| Method              | Function                             |
| ------------------- | ------------------------------------ |
| `newHttpClient()`   | Creates a default HTTP client        |
| `newBuilder()`      | Creates a client builder             |
| `send()`            | Sends a request synchronously        |
| `sendAsync()`       | Sends a request asynchronously       |
| `executor()`        | Returns the executor being used      |
| `version()`         | Returns the HTTP version being used  |
| `cookieHandler()`   | Returns the cookie manager           |
| `connectTimeout()`  | Returns the connection timeout       |
| `followRedirects()` | Returns the redirect policy          |
| `proxy()`           | Returns the proxy configuration      |
| `authenticator()`   | Returns the authenticator being used |

---

## `HttpRequest`

The `HttpRequest` class belongs to the `java.net.http` package and represents an HTTP request.

| Method             | Function                                 |
| ------------------ | ---------------------------------------- |
| `newBuilder()`     | Creates a request builder                |
| `uri()`            | Returns the request URI                  |
| `method()`         | Returns the HTTP method                  |
| `headers()`        | Returns the headers                      |
| `bodyPublisher()`  | Returns the content being sent           |
| `timeout()`        | Returns the timeout                      |
| `version()`        | Returns the HTTP version                 |
| `expectContinue()` | Checks if `Expect: 100-continue` is used |

---

## `HttpResponse`

The `HttpResponse` interface belongs to the `java.net.http` package and represents the response received from an HTTP request.

| Method               | Function                                    |
| -------------------- | ------------------------------------------- |
| `statusCode()`       | Returns the HTTP status code                |
| `body()`             | Returns the response body                   |
| `headers()`          | Returns the response headers                |
| `request()`          | Returns the associated request              |
| `uri()`              | Returns the final URI                       |
| `version()`          | Returns the HTTP version being used         |
| `previousResponse()` | Returns a previous response, when available |
| `sslSession()`       | Returns information about the SSL session   |

---

# Bytes vs Characters

The choice between bytes and characters depends on the type of data being processed.

| Bytes          | Characters |
| -------------- | ---------- |
| `InputStream`  | `Reader`   |
| `OutputStream` | `Writer`   |
| Binary data    | Text data  |
| Images         | Text files |
| Audio          | Documents  |
| Videos         | Strings    |

```text
Binary Data
     ↓
InputStream / OutputStream

Text Data
     ↓
Reader / Writer
```

---

# Network Communication

Network APIs allow data to be sent and received between machines or processes.

| Concept    | Meaning                                           |
| ---------- | ------------------------------------------------- |
| **Client** | Starts a connection                               |
| **Server** | Waits for connections                             |
| **IP**     | Identifies a device on the network                |
| **Port**   | Identifies a service or process                   |
| **Socket** | Represents network communication                  |
| **TCP**    | Reliable and connection-oriented communication    |
| **UDP**    | Simpler communication without guaranteed delivery |

```text
CLIENT
   ↓
Socket
   ↓
Network
   ↓
Socket
   ↓
SERVER
```

## TCP and UDP

| Characteristic      | TCP                               | UDP                                                     |
| ------------------- | --------------------------------- | ------------------------------------------------------- |
| Connection          | Connection-oriented               | No traditional connection                               |
| Guaranteed delivery | Yes                               | No                                                      |
| Data order          | Preserved                         | Not guaranteed                                          |
| Control             | Greater                           | Lower                                                   |
| Common use          | Web, files, and corporate systems | Games, audio, video, and latency-sensitive applications |

---

# Summary

Input and output in Java are not limited to printing messages in the console. The same concept appears when an application:

* Receives data from the keyboard;
* Reads a file;
* Saves information;
* Processes an image;
* Sends an HTTP request;
* Communicates with another system;
* Monitors changes in a directory.

The most important APIs can be organized like this:

```text
JAVA I/O
   │
   ├── Console
   │   ├── System.in
   │   ├── System.out
   │   ├── System.err
   │   └── Scanner
   │
   ├── Text
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
   ├── Files
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
   └── Network
       ├── Socket
       ├── ServerSocket
       ├── DatagramSocket
       ├── URL
       └── HttpClient
```

To get started, `System.out`, `System.in`, and `Scanner` already cover many exercises and simple applications. As the project grows, file APIs, streams, NIO, and network communication become useful.

---

<div align="center">

☕ **Java • Input and Output • I/O**

</div>
