# ☕ Java — Methods

> Reference material about **methods in Java**, including their structure, parameters, return values, `void`, the `main` method, and useful methods from the Java standard library.

Methods help organize code into smaller and reusable parts. This material presents examples of methods commonly used in Java development.

---

# 📚 Contents

| Topic            | Content                                     |
| ---------------- | ------------------------------------------- |
| Method Structure | Declaration, parameters, return, and `void` |
| `main`           | Traditional and simplified forms            |
| `Math`           | Mathematical operations                     |
| `String`         | Text manipulation                           |
| `Object`         | Basic object methods                        |
| Collections      | `List`, `Set`, and `Map`                    |
| `Arrays`         | Operations with arrays                      |
| `Scanner`        | Reading input                               |
| Files            | `File` and `Files`                          |
| I/O              | Reading and writing data                    |
| Stream API       | Collection processing                       |
| Threads          | Task execution                              |
| Dates            | `LocalDate` and `LocalDateTime`             |
| `Random`         | Generating random values                    |
| `System`         | System resources                            |
| `StringBuilder`  | Building and modifying text                 |
| Exceptions       | Information about errors                    |

---

# 🧱 Method Structure

A method is a block of code created to perform a specific task. It can receive values, process information, return a result, or simply perform an action.

```java
modifier returnType methodName(parameters) {
    // instructions
}
```

---

## 🔁 Method with a Return Value

A method can process information and return a value using the `return` statement.

```java
public static int add(int firstNumber, int secondNumber) {
    return firstNumber + secondNumber;
}
```

Usage:

```java
int result = add(10, 5);

System.out.println(result);
```

Output:

```text
15
```

---

## ⚙️ Method without a Return Value

When a method does not need to return a value, we use `void`.

```java
public static void displayMessage(String message) {
    System.out.println(message);
}
```

Usage:

```java
displayMessage("Hello, Java!");
```

Output:

```text
Hello, Java!
```

---

# 🧩 Method Elements

| Element    | Function                                         |
| ---------- | ------------------------------------------------ |
| `public`   | Defines the access level                         |
| `static`   | Allows the method to be called through the class |
| `int`      | Defines the return type                          |
| `add`      | Method name                                      |
| Parameters | Values received by the method                    |
| `return`   | Returns a value                                  |
| `void`     | Indicates that there is no return value          |

---

# 🚀 The `main` Method

The `main` method is used as the entry point of a Java application.

## 🏛️ Traditional Form

```java
public static void main(String[] args) {
    System.out.println("Hello, Java!");
}
```

| Element         | Function                                          |
| --------------- | ------------------------------------------------- |
| `public`        | Allows the application to find the method         |
| `static`        | Allows execution without creating an object       |
| `void`          | Indicates that the method does not return a value |
| `main`          | Identifies the entry method                       |
| `String[] args` | Stores arguments received from the command line   |

### Example

```java
public class Main {

    public static void main(String[] args) {
        System.out.println("Number of arguments: " + args.length);

        for (String argument : args) {
            System.out.println(argument);
        }
    }
}
```

Execution:

```bash
javac Main.java
java Main Java 17
```

Output:

```text
Number of arguments: 2
Java
17
```

---

## ✨ Simplified Forms

Recent versions of Java also support simplified forms of the `main` method.

```java
void main() {
    System.out.println("Hello, Java!");
}
```

```java
void main(String[] args) {
    System.out.println("Hello, Java!");
}
```

| Form                                     | Characteristic                       |
| ---------------------------------------- | ------------------------------------ |
| `public static void main(String[] args)` | Traditional and more compatible form |
| `void main()`                            | Simplified form without arguments    |
| `void main(String[] args)`               | Simplified form with arguments       |

---

# 🧰 Useful Methods from the Standard Library

In addition to methods created by programmers, Java provides many ready-to-use classes with methods for common tasks, such as working with text, lists, files, dates, and numbers.

---

# 🧮 `Math`

The `Math` class provides methods for performing mathematical calculations.

| Method or Constant | Function                                   |
| ------------------ | ------------------------------------------ |
| `abs()`            | Returns the absolute value                 |
| `max()`            | Returns the largest value                  |
| `min()`            | Returns the smallest value                 |
| `pow()`            | Calculates a power                         |
| `sqrt()`           | Calculates the square root                 |
| `cbrt()`           | Calculates the cube root                   |
| `random()`         | Generates a number between `0.0` and `1.0` |
| `round()`          | Rounds a value                             |
| `floor()`          | Rounds down                                |
| `ceil()`           | Rounds up                                  |
| `sin()`            | Calculates the sine                        |
| `cos()`            | Calculates the cosine                      |
| `tan()`            | Calculates the tangent                     |
| `log()`            | Calculates the natural logarithm           |
| `log10()`          | Calculates the base-10 logarithm           |
| `exp()`            | Calculates an exponential value            |
| `PI`               | Represents the π constant                  |
| `E`                | Represents the mathematical constant e     |

Example:

```java
double squareRoot = Math.sqrt(25);

System.out.println(squareRoot);
```

Output:

```text
5.0
```

---

# 🔤 `String`

The `String` class represents text. Because its objects are immutable, methods that modify text return a new `String`.

| Method                  | Function                                                |
| ----------------------- | ------------------------------------------------------- |
| `length()`              | Returns the number of characters                        |
| `charAt()`              | Returns the character at a position                     |
| `substring()`           | Extracts part of the text                               |
| `toUpperCase()`         | Converts text to uppercase                              |
| `toLowerCase()`         | Converts text to lowercase                              |
| `equals()`              | Compares the content                                    |
| `equalsIgnoreCase()`    | Compares ignoring uppercase and lowercase               |
| `contains()`            | Checks if it contains a sequence                        |
| `startsWith()`          | Checks the beginning of the text                        |
| `endsWith()`            | Checks the end of the text                              |
| `indexOf()`             | Finds the first occurrence                              |
| `lastIndexOf()`         | Finds the last occurrence                               |
| `replace()`             | Replaces characters or sequences                        |
| `replaceAll()`          | Replaces using a regular expression                     |
| `trim()`                | Removes spaces from the beginning and end               |
| `strip()`               | Removes Unicode whitespace from the beginning and end   |
| `split()`               | Splits the text                                         |
| `concat()`              | Joins texts                                             |
| `isEmpty()`             | Checks if the text is empty                             |
| `isBlank()`             | Checks if the text is empty or contains only whitespace |
| `repeat()`              | Repeats the text                                        |
| `matches()`             | Checks a regular expression match                       |
| `compareTo()`           | Compares strings lexicographically                      |
| `compareToIgnoreCase()` | Compares ignoring letter case                           |
| `toCharArray()`         | Converts the text into a character array                |

Example:

```java
String language = "Java";

System.out.println(language.length());
System.out.println(language.toUpperCase());
System.out.println(language.charAt(0));
```

Output:

```text
4
JAVA
J
```

---

# 🧬 `Object`

`Object` is the base class of all Java classes.

| Method        | Function                                     |
| ------------- | -------------------------------------------- |
| `toString()`  | Returns a text representation of the object  |
| `equals()`    | Compares objects                             |
| `hashCode()`  | Returns a code used by hash-based structures |
| `getClass()`  | Returns the class of the object              |
| `clone()`     | Creates a copy when allowed                  |
| `wait()`      | Makes the thread wait                        |
| `notify()`    | Notifies a waiting thread                    |
| `notifyAll()` | Notifies all waiting threads                 |

> The `finalize()` method has been deprecated and should not be used in new code.

---

# 📦 Collections

Collections are used to store and manipulate groups of objects.

## 📋 `List`

`List` represents an ordered collection that allows duplicate elements.

| Method          | Function                              |
| --------------- | ------------------------------------- |
| `add()`         | Adds an element                       |
| `addAll()`      | Adds elements from another collection |
| `get()`         | Gets an element by index              |
| `set()`         | Replaces an element                   |
| `remove()`      | Removes an element                    |
| `clear()`       | Removes all elements                  |
| `size()`        | Returns the number of elements        |
| `isEmpty()`     | Checks if the list is empty           |
| `contains()`    | Checks if an element exists           |
| `containsAll()` | Checks if several elements exist      |
| `indexOf()`     | Returns the first index of an element |
| `lastIndexOf()` | Returns the last index of an element  |
| `subList()`     | Returns part of the list              |
| `sort()`        | Sorts the list                        |
| `forEach()`     | Executes an action for each element   |

Example:

```java
List<String> names = new ArrayList<>();

names.add("John");
names.add("Maria");

System.out.println(names.get(0));
```

---

## 🧱 `Set`

`Set` represents a collection that does not allow duplicate elements.

| Method        | Function                                          |
| ------------- | ------------------------------------------------- |
| `add()`       | Adds an element                                   |
| `remove()`    | Removes an element                                |
| `contains()`  | Checks if an element exists                       |
| `size()`      | Returns the number of elements                    |
| `clear()`     | Removes all elements                              |
| `isEmpty()`   | Checks if the collection is empty                 |
| `addAll()`    | Adds elements from another collection             |
| `removeAll()` | Removes elements present in another collection    |
| `retainAll()` | Keeps only elements present in another collection |
| `forEach()`   | Executes an action for each element               |

---

## 🗺️ `Map`

`Map` stores data in **key-value pairs**.

| Method               | Function                                     |
| -------------------- | -------------------------------------------- |
| `put()`              | Adds or replaces a pair                      |
| `putAll()`           | Adds pairs from another map                  |
| `get()`              | Gets a value by key                          |
| `getOrDefault()`     | Gets a value or returns a default value      |
| `remove()`           | Removes a key                                |
| `containsKey()`      | Checks if a key exists                       |
| `containsValue()`    | Checks if a value exists                     |
| `keySet()`           | Returns the set of keys                      |
| `values()`           | Returns the values                           |
| `entrySet()`         | Returns the key-value pairs                  |
| `size()`             | Returns the number of pairs                  |
| `clear()`            | Removes all pairs                            |
| `isEmpty()`          | Checks if the map is empty                   |
| `replace()`          | Replaces a value                             |
| `compute()`          | Calculates a new value                       |
| `computeIfAbsent()`  | Calculates a value if the key does not exist |
| `computeIfPresent()` | Calculates a value if the key exists         |
| `merge()`            | Combines values                              |
| `forEach()`          | Iterates through the pairs                   |

Example:

```java
Map<String, Integer> ages = new HashMap<>();

ages.put("John", 20);

System.out.println(ages.get("John"));
```

---

# 🧮 `Arrays`

The `Arrays` class provides methods for sorting, searching, copying, and comparing arrays.

| Method             | Function                                 |
| ------------------ | ---------------------------------------- |
| `sort()`           | Sorts the elements                       |
| `binarySearch()`   | Searches a sorted array                  |
| `equals()`         | Compares arrays                          |
| `deepEquals()`     | Compares multidimensional arrays         |
| `fill()`           | Fills the array                          |
| `copyOf()`         | Copies the array with a new size         |
| `copyOfRange()`    | Copies a range of the array              |
| `toString()`       | Converts the array to text               |
| `deepToString()`   | Converts multidimensional arrays to text |
| `asList()`         | Creates a list based on an array         |
| `stream()`         | Creates a Stream from the array          |
| `parallelSort()`   | Sorts using parallel processing          |
| `parallelPrefix()` | Applies an accumulated operation         |
| `parallelSetAll()` | Fills the array in parallel              |
| `setAll()`         | Fills the array using a function         |

Example:

```java
int[] numbers = {5, 2, 9, 1};

Arrays.sort(numbers);

System.out.println(Arrays.toString(numbers));
```

---

# 🔎 `Scanner`

`Scanner` allows you to read data entered by the user or obtained from other sources.

| Method            | Function                               |
| ----------------- | -------------------------------------- |
| `next()`          | Reads the next token                   |
| `nextLine()`      | Reads a complete line                  |
| `nextInt()`       | Reads an `int`                         |
| `nextDouble()`    | Reads a `double`                       |
| `nextFloat()`     | Reads a `float`                        |
| `nextLong()`      | Reads a `long`                         |
| `nextBoolean()`   | Reads a `boolean`                      |
| `nextByte()`      | Reads a `byte`                         |
| `hasNext()`       | Checks if another token exists         |
| `hasNextLine()`   | Checks if another line exists          |
| `hasNextInt()`    | Checks if the next value is an integer |
| `hasNextDouble()` | Checks if the next value is decimal    |
| `close()`         | Closes the `Scanner`                   |

Example:

```java
Scanner scanner = new Scanner(System.in);

System.out.print("Enter your age: ");

int age = scanner.nextInt();

System.out.println("Age: " + age);

scanner.close();
```

---

# 📁 Files

## 📄 `File`

`File` represents file and directory paths and allows basic operations on them.

| Method              | Function                                   |
| ------------------- | ------------------------------------------ |
| `createNewFile()`   | Creates an empty file                      |
| `exists()`          | Checks if the path exists                  |
| `delete()`          | Deletes a file or directory                |
| `mkdir()`           | Creates a directory                        |
| `mkdirs()`          | Creates directories and parent directories |
| `isFile()`          | Checks if it represents a file             |
| `isDirectory()`     | Checks if it represents a directory        |
| `getName()`         | Returns the name                           |
| `getPath()`         | Returns the path                           |
| `getAbsolutePath()` | Returns the absolute path                  |
| `length()`          | Returns the size                           |
| `list()`            | Lists the names in a directory             |
| `listFiles()`       | Lists the files in a directory             |
| `renameTo()`        | Renames or moves                           |
| `canRead()`         | Checks read permission                     |
| `canWrite()`        | Checks write permission                    |
| `canExecute()`      | Checks execute permission                  |

---

## 🗃️ `Files`

`Files`, from the `java.nio.file` package, provides methods for working with files and directories.

| Method                | Function                          |
| --------------------- | --------------------------------- |
| `exists()`            | Checks if the path exists         |
| `createFile()`        | Creates a file                    |
| `createDirectory()`   | Creates a directory               |
| `createDirectories()` | Creates the required directories  |
| `delete()`            | Deletes a path                    |
| `deleteIfExists()`    | Deletes it if it exists           |
| `copy()`              | Copies a path                     |
| `move()`              | Moves or renames                  |
| `readAllBytes()`      | Reads all bytes                   |
| `readAllLines()`      | Reads all lines                   |
| `write()`             | Writes data                       |
| `writeString()`       | Writes a `String`                 |
| `readString()`        | Reads the content as a `String`   |
| `newBufferedReader()` | Creates a buffered reader         |
| `newBufferedWriter()` | Creates a buffered writer         |
| `newInputStream()`    | Creates an input stream           |
| `newOutputStream()`   | Creates an output stream          |
| `list()`              | Lists the contents of a directory |
| `walk()`              | Walks through a path tree         |
| `find()`              | Finds paths using a filter        |
| `lines()`             | Reads lines as a Stream           |
| `size()`              | Returns the size                  |
| `isDirectory()`       | Checks if it is a directory       |
| `isRegularFile()`     | Checks if it is a regular file    |

Example:

```java
Path path = Path.of("file.txt");

Files.writeString(path, "Hello, Java!");

String content = Files.readString(path);

System.out.println(content);
```

---

# 🔌 I/O

I/O classes are used to read and write bytes and characters.

## 📥 `InputStream`

| Method           | Function                         |
| ---------------- | -------------------------------- |
| `read()`         | Reads a byte                     |
| `readAllBytes()` | Reads all bytes                  |
| `readNBytes()`   | Reads a specific number of bytes |
| `skip()`         | Skips bytes                      |
| `available()`    | Returns the available amount     |
| `close()`        | Closes the stream                |
| `transferTo()`   | Transfers data to another stream |

## 📤 `OutputStream`

| Method    | Function                      |
| --------- | ----------------------------- |
| `write()` | Writes bytes                  |
| `flush()` | Forces the data to be written |
| `close()` | Closes the stream             |

## 📖 `Reader`

| Method    | Function                           |
| --------- | ---------------------------------- |
| `read()`  | Reads characters                   |
| `skip()`  | Skips characters                   |
| `ready()` | Checks if reading can be performed |
| `close()` | Closes the reader                  |

## 📚 `BufferedReader`

| Method       | Function              |
| ------------ | --------------------- |
| `readLine()` | Reads a complete line |

## ✍️ `Writer`

| Method     | Function                      |
| ---------- | ----------------------------- |
| `write()`  | Writes characters             |
| `append()` | Adds characters               |
| `flush()`  | Forces the data to be written |
| `close()`  | Closes the writer             |

---

# 🌊 Stream API

The Stream API allows collections to be processed in a more organized way by applying filters, transformations, and other operations.

## 🔄 Intermediate Operations

| Method       | Function                            |
| ------------ | ----------------------------------- |
| `filter()`   | Filters elements                    |
| `map()`      | Transforms elements                 |
| `flatMap()`  | Combines nested Streams             |
| `distinct()` | Removes duplicate elements          |
| `sorted()`   | Sorts elements                      |
| `limit()`    | Limits the number of elements       |
| `skip()`     | Skips elements                      |
| `peek()`     | Observes elements during processing |

## ✅ Terminal Operations

| Method             | Function                                    |
| ------------------ | ------------------------------------------- |
| `forEach()`        | Executes an action                          |
| `forEachOrdered()` | Executes an action while preserving order   |
| `collect()`        | Collects the results                        |
| `toList()`         | Converts the result into a list             |
| `count()`          | Counts the elements                         |
| `findFirst()`      | Returns the first element                   |
| `findAny()`        | Returns any element                         |
| `anyMatch()`       | Checks if any element matches the condition |
| `allMatch()`       | Checks if all elements match the condition  |
| `noneMatch()`      | Checks if no elements match the condition   |
| `reduce()`         | Combines elements into one result           |
| `min()`            | Returns the smallest element                |
| `max()`            | Returns the largest element                 |
| `sum()`            | Adds values in primitive Streams            |
| `average()`        | Calculates the average in primitive Streams |

Example:

```java
List<Integer> numbers = List.of(1, 2, 3, 4, 5);

numbers.stream()
        .filter(number -> number % 2 == 0)
        .forEach(System.out::println);
```

Output:

```text
2
4
```

---

# 🧵 Threads

The `Thread` class allows tasks to be executed separately.

| Method            | Function                           |
| ----------------- | ---------------------------------- |
| `start()`         | Starts the thread                  |
| `run()`           | Defines the code that is executed  |
| `sleep()`         | Temporarily suspends execution     |
| `join()`          | Waits for another thread to finish |
| `interrupt()`     | Requests an interruption           |
| `isAlive()`       | Checks if the thread is active     |
| `getName()`       | Returns the name                   |
| `setName()`       | Sets the name                      |
| `getState()`      | Returns the state                  |
| `currentThread()` | Returns the current thread         |
| `yield()`         | Suggests giving up CPU time        |

Example:

```java
Thread thread = new Thread(() -> {
    System.out.println("Running in another thread.");
});

thread.start();
```

---

# 🗓️ Dates and Times

## 📅 `LocalDate`

`LocalDate` represents a date without a time.

| Method            | Function                  |
| ----------------- | ------------------------- |
| `now()`           | Returns the current date  |
| `of()`            | Creates a date            |
| `parse()`         | Converts text into a date |
| `plusDays()`      | Adds days                 |
| `plusMonths()`    | Adds months               |
| `plusYears()`     | Adds years                |
| `minusDays()`     | Subtracts days            |
| `minusMonths()`   | Subtracts months          |
| `minusYears()`    | Subtracts years           |
| `getDayOfMonth()` | Returns the day           |
| `getMonth()`      | Returns the month         |
| `getYear()`       | Returns the year          |
| `isBefore()`      | Checks if it is earlier   |
| `isAfter()`       | Checks if it is later     |
| `isEqual()`       | Compares two dates        |

## ⏰ `LocalDateTime`

`LocalDateTime` represents a date and time without a time zone.

| Method           | Function                          |
| ---------------- | --------------------------------- |
| `now()`          | Returns the current date and time |
| `of()`           | Creates a date and time           |
| `parse()`        | Converts text                     |
| `plusDays()`     | Adds days                         |
| `plusHours()`    | Adds hours                        |
| `plusMinutes()`  | Adds minutes                      |
| `minusDays()`    | Subtracts days                    |
| `minusHours()`   | Subtracts hours                   |
| `minusMinutes()` | Subtracts minutes                 |
| `toLocalDate()`  | Returns only the date             |
| `toLocalTime()`  | Returns only the time             |

---

# 🎲 `Random`

The `Random` class generates pseudo-random values.

| Method          | Function                                     |
| --------------- | -------------------------------------------- |
| `nextInt()`     | Generates an `int`                           |
| `nextLong()`    | Generates a `long`                           |
| `nextDouble()`  | Generates a `double` between `0.0` and `1.0` |
| `nextFloat()`   | Generates a `float` between `0.0` and `1.0`  |
| `nextBoolean()` | Generates `true` or `false`                  |
| `nextBytes()`   | Fills an array with bytes                    |

Example:

```java
Random random = new Random();

int number = random.nextInt(10);

System.out.println(number);
```

---

# 🖥️ `System`

The `System` class provides methods related to the execution environment.

| Method                 | Function                              |
| ---------------------- | ------------------------------------- |
| `System.out.println()` | Displays text with a line break       |
| `System.out.print()`   | Displays text without a line break    |
| `System.out.printf()`  | Displays formatted text               |
| `currentTimeMillis()`  | Returns the time in milliseconds      |
| `nanoTime()`           | Returns a high-precision time counter |
| `arraycopy()`          | Copies elements between arrays        |
| `getProperty()`        | Returns a system property             |
| `getenv()`             | Returns an environment variable       |
| `exit()`               | Ends the application                  |
| `gc()`                 | Requests garbage collection           |

---

# 🧱 `StringBuilder`

`StringBuilder` allows text to be built and modified.

| Method           | Function                     |
| ---------------- | ---------------------------- |
| `append()`       | Adds content                 |
| `insert()`       | Inserts content              |
| `delete()`       | Removes a range              |
| `deleteCharAt()` | Removes a character          |
| `replace()`      | Replaces a range             |
| `reverse()`      | Reverses the content         |
| `length()`       | Returns the length           |
| `capacity()`     | Returns the capacity         |
| `charAt()`       | Returns a character          |
| `setCharAt()`    | Changes a character          |
| `substring()`    | Extracts part of the content |
| `toString()`     | Converts to `String`         |

Example:

```java
StringBuilder text = new StringBuilder();

text.append("Java");
text.append(" is powerful");

System.out.println(text);
```

---

# ⚠️ Exceptions

The `Exception` and `Throwable` classes provide methods for checking information about errors.

| Method                  | Function                      |
| ----------------------- | ----------------------------- |
| `getMessage()`          | Returns the exception message |
| `getLocalizedMessage()` | Returns the localized message |
| `getCause()`            | Returns the cause             |
| `printStackTrace()`     | Displays the execution stack  |
| `getStackTrace()`       | Returns the stack elements    |
| `fillInStackTrace()`    | Updates the execution stack   |
| `addSuppressed()`       | Adds a suppressed exception   |
| `getSuppressed()`       | Returns suppressed exceptions |

Example:

```java
try {
    int result = 10 / 0;
} catch (ArithmeticException exception) {
    System.out.println(exception.getMessage());
    exception.printStackTrace();
}
```

---

# 🧪 Integrated Example

```java
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        double squareRoot = Math.sqrt(25);

        System.out.println("Square root: " + squareRoot);

        String language = "Java";

        System.out.println("Length: " + language.length());
        System.out.println("Uppercase: " + language.toUpperCase());
        System.out.println("First character: " + language.charAt(0));

        List<String> names = List.of("John", "Maria");

        names.forEach(System.out::println);

        Map<String, Integer> ages = new HashMap<>();

        ages.put("John", 20);

        System.out.println("Age: " + ages.get("John"));

        int[] numbers = {5, 2, 9, 1};

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        Random random = new Random();

        System.out.println("Random number: " + random.nextInt(100));
    }
}
```

---

# 🗂️ Material Organization

This content is part of the **JavaBasicCommands** repository and follows the studies about variables, conditionals, loops, operators, and other Java fundamentals.

```text
Metodos/
├── Metodos.md
├── Methods.md
└── MetodosJava.java
```

| File               | Content               |
| ------------------ | --------------------- |
| `Metodos.md`       | Content in Portuguese |
| `Methods.md`       | Content in English    |
| `MetodosJava.java` | Practical examples    |

---

<div align="center">

☕ **Java — Methods**

**Concepts → Examples → Practice**

</div>
