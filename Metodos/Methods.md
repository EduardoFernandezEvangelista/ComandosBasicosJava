# ☕ Java - Methods

Study repository dedicated to learning and practicing the main **methods available in the Java language and its standard APIs**.

This project contains clear explanations, reference tables, and practical examples using classes such as `Math`, `String`, `Object`, `Arrays`, `Collections`, `Scanner`, `Files`, `Thread`, `LocalDate`, `Random`, `System`, `StringBuilder`, `Stream`, and classes related to exceptions.

The `.java` files available in this repository are used as **practical examples**, allowing the concepts explained in this README to be tested and practiced directly with Java code.

The project also presents the complete structure of the `main` method in **Java 17** and **Java 25**.

---

## 📚 Project Purpose

This repository is focused on:

* 📚 Education
* 💻 Practice
* 🧠 Quick reference
* 📖 Learning the Java API
* 🚀 Programming development

---

# 🎯 Introduction

Methods are blocks of code responsible for performing specific tasks.

They can:

* Receive parameters;
* Process information;
* Return values;
* Modify objects;
* Perform actions;
* Be reused in different parts of a program.

Example:

```java
public static int sum(int a, int b) {
    return a + b;
}
```

Method call:

```java
int result = sum(10, 20);
```

---

# 🏗️ Structure of a Method

The general structure of a method is:

```java
modifier returnType methodName(parameters) {
    // instructions
}
```

Example:

```java
public static int sum(int a, int b) {
    return a + b;
}
```

| Part             | Explanation                                     |
| ---------------- | ----------------------------------------------- |
| `public`         | Defines the access level of the method.         |
| `static`         | Indicates that the method belongs to the class. |
| `int`            | Defines the type of value returned.             |
| `sum`            | Name used to call the method.                   |
| `(int a, int b)` | Parameters received by the method.              |
| `return`         | Returns a value and finishes the method.        |

Methods that do not return a value use `void`:

```java
public void showMessage() {
    System.out.println("Hello!");
}
```

---

# 🚀 `main` Method in Java 17

In Java 17, the traditional form of the `main` method is:

```java
public static void main(String[] args) {
    System.out.println("Hello, Java!");
}
```

## Complete Explanation

| Part                   | Explanation                                                         |
| ---------------------- | ------------------------------------------------------------------- |
| `public`               | Allows the JVM to access the method from anywhere.                  |
| `static`               | Allows the method to run without creating an object of the class.   |
| `void`                 | Indicates that the method does not return a value.                  |
| `main`                 | Special name recognized by the JVM as the program's starting point. |
| `String[]`             | Defines an array of strings.                                        |
| `args`                 | Variable that stores command-line arguments.                        |
| `{}`                   | Defines the block of instructions executed by the method.           |
| `System.out.println()` | Displays a message in the console.                                  |

Example with arguments:

```java
public class Main {

    public static void main(String[] args) {

        System.out.println(
            "Number of arguments: " + args.length
        );

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

Approximate output:

```text
Number of arguments: 2
Java
17
```

In Java 17, the traditional `main` method needs to be `public`, `static`, and `void`, receiving a `String[]` array.

---

# 🚀 `main` Method in Java 25

Java 25 keeps the traditional form of the `main` method:

```java
public static void main(String[] args) {
    System.out.println("Hello, Java 25!");
}
```

With simplified `main` methods, reduced forms can also be used in compatible contexts, such as:

```java
void main() {
    System.out.println("Hello, Java 25!");
}
```

Or:

```java
void main(String[] args) {
    System.out.println("Hello, Java 25!");
}
```

## Traditional Form

| Part            | Explanation                                             |
| --------------- | ------------------------------------------------------- |
| `public`        | Allows the JVM to access the method.                    |
| `static`        | Allows the program to start without creating an object. |
| `void`          | Indicates that there is no return value.                |
| `main`          | Identifies the traditional entry point of the program.  |
| `String[] args` | Receives arguments passed through the command line.     |

## Simplified Form

| Part             | Explanation                                                                  |
| ---------------- | ---------------------------------------------------------------------------- |
| `void`           | Defines that the method does not return a value.                             |
| `main`           | Identifies the program's entry method.                                       |
| `String[] args`  | Allows command-line arguments to be received.                                |
| Without `public` | Simplified code can use more flexible access rules depending on the feature. |
| Without `static` | The runtime environment can manage the required initialization.              |

The traditional form continues to be the most compatible with projects, tools, IDEs, and previous Java versions.

---

# 🔢 `Math` Class Methods

The `Math` class provides static mathematical operations.

| Method or Constant | Explanation                                    |
| ------------------ | ---------------------------------------------- |
| `Math.abs()`       | Returns the absolute value of a number.        |
| `Math.max()`       | Returns the largest of two values.             |
| `Math.min()`       | Returns the smallest of two values.            |
| `Math.pow()`       | Calculates a power.                            |
| `Math.sqrt()`      | Calculates the square root.                    |
| `Math.cbrt()`      | Calculates the cube root.                      |
| `Math.random()`    | Generates a random decimal between 0 and 1.    |
| `Math.round()`     | Rounds to the nearest integer.                 |
| `Math.floor()`     | Rounds down.                                   |
| `Math.ceil()`      | Rounds up.                                     |
| `Math.sin()`       | Calculates the sine of an angle in radians.    |
| `Math.cos()`       | Calculates the cosine of an angle in radians.  |
| `Math.tan()`       | Calculates the tangent of an angle in radians. |
| `Math.log()`       | Calculates the natural logarithm.              |
| `Math.log10()`     | Calculates the base-10 logarithm.              |
| `Math.exp()`       | Calculates the exponential value.              |
| `Math.PI`          | Represents the mathematical constant π.        |
| `Math.E`           | Represents the mathematical constant e.        |

Example:

```java
double result = Math.sqrt(25);

System.out.println(result);
```

Output:

```text
5.0
```

---

# 🔤 `String` Class Methods

The `String` class represents immutable text.

| Method                  | Explanation                                        |
| ----------------------- | -------------------------------------------------- |
| `length()`              | Returns the number of characters.                  |
| `charAt()`              | Returns the character at a specific position.      |
| `substring()`           | Extracts part of the text.                         |
| `toUpperCase()`         | Converts the text to uppercase.                    |
| `toLowerCase()`         | Converts the text to lowercase.                    |
| `equals()`              | Compares the content of two strings.               |
| `equalsIgnoreCase()`    | Compares strings without considering letter case.  |
| `contains()`            | Checks if the text contains a sequence.            |
| `startsWith()`          | Checks if the text starts with a sequence.         |
| `endsWith()`            | Checks if the text ends with a sequence.           |
| `indexOf()`             | Returns the first position found.                  |
| `lastIndexOf()`         | Returns the last position found.                   |
| `replace()`             | Replaces characters or sequences.                  |
| `replaceAll()`          | Replaces content using a regular expression.       |
| `trim()`                | Removes traditional spaces from the edges.         |
| `strip()`               | Removes Unicode whitespace from the edges.         |
| `split()`               | Divides text using a delimiter.                    |
| `concat()`              | Adds another string to the current string.         |
| `isEmpty()`             | Checks if the string has a length of zero.         |
| `isBlank()`             | Checks if it is empty or contains only whitespace. |
| `repeat()`              | Repeats the text a specific number of times.       |
| `matches()`             | Checks if the text matches a regular expression.   |
| `compareTo()`           | Compares strings lexicographically.                |
| `compareToIgnoreCase()` | Compares strings while ignoring letter case.       |
| `toCharArray()`         | Converts the text into a character array.          |

Example:

```java
String name = "Java";

System.out.println(name.length());
System.out.println(name.toUpperCase());
System.out.println(name.charAt(0));
```

Output:

```text
4
JAVA
J
```

---

# 📦 `Object` Class Methods

All Java classes directly or indirectly inherit from `Object`.

| Method        | Explanation                                     |
| ------------- | ----------------------------------------------- |
| `toString()`  | Returns a text representation of the object.    |
| `equals()`    | Logically compares two objects.                 |
| `hashCode()`  | Returns a code used by hash-based structures.   |
| `getClass()`  | Returns the actual class of the object.         |
| `clone()`     | Creates a copy when the class supports cloning. |
| `finalize()`  | Legacy method related to object finalization.   |
| `wait()`      | Makes the thread wait for a notification.       |
| `notify()`    | Wakes one waiting thread.                       |
| `notifyAll()` | Wakes all waiting threads.                      |

> `finalize()` is deprecated and should not be used in new code.

Example:

```java
Object object = new Object();

System.out.println(object.toString());
System.out.println(object.getClass());
```

---

# 📋 Collection Methods

## 📃 `List`

| Method          | Explanation                                |
| --------------- | ------------------------------------------ |
| `add()`         | Adds an element to the list.               |
| `addAll()`      | Adds all elements from another collection. |
| `get()`         | Gets an element by index.                  |
| `set()`         | Replaces an element by index.              |
| `remove()`      | Removes an element or index.               |
| `clear()`       | Removes all elements.                      |
| `size()`        | Returns the number of elements.            |
| `isEmpty()`     | Checks if the list is empty.               |
| `contains()`    | Checks if the list contains an element.    |
| `containsAll()` | Checks if all specified elements exist.    |
| `indexOf()`     | Returns the first index of an element.     |
| `lastIndexOf()` | Returns the last index of an element.      |
| `subList()`     | Returns part of the list.                  |
| `sort()`        | Sorts the elements using a comparator.     |
| `forEach()`     | Performs an action for each element.       |

Example:

```java
List<String> names = new ArrayList<>();

names.add("John");
names.add("Maria");

System.out.println(names.get(0));
```

---

## 🔷 `Set`

| Method        | Explanation                                        |
| ------------- | -------------------------------------------------- |
| `add()`       | Adds an element without duplicates.                |
| `remove()`    | Removes an element.                                |
| `contains()`  | Checks if an element exists.                       |
| `size()`      | Returns the number of elements.                    |
| `clear()`     | Removes all elements.                              |
| `isEmpty()`   | Checks if the set is empty.                        |
| `addAll()`    | Adds elements from another collection.             |
| `removeAll()` | Removes elements that exist in another collection. |
| `retainAll()` | Keeps only elements found in another collection.   |
| `forEach()`   | Performs an action for each element.               |

---

## 🗺️ `Map`

| Method               | Explanation                                        |
| -------------------- | -------------------------------------------------- |
| `put()`              | Adds or replaces a key-value pair.                 |
| `putAll()`           | Adds all pairs from another map.                   |
| `get()`              | Gets the value associated with a key.              |
| `getOrDefault()`     | Gets the value or returns a default value.         |
| `remove()`           | Removes a key and its value.                       |
| `containsKey()`      | Checks if a key exists.                            |
| `containsValue()`    | Checks if a value exists.                          |
| `keySet()`           | Returns the set of keys.                           |
| `values()`           | Returns the stored values.                         |
| `entrySet()`         | Returns the key-value pairs.                       |
| `size()`             | Returns the number of pairs.                       |
| `clear()`            | Removes all pairs.                                 |
| `isEmpty()`          | Checks if the map is empty.                        |
| `replace()`          | Replaces the value associated with a key.          |
| `compute()`          | Calculates a new value for a key.                  |
| `computeIfAbsent()`  | Calculates a value only if the key does not exist. |
| `computeIfPresent()` | Calculates a value only if the key exists.         |
| `merge()`            | Combines a value with an existing value.           |
| `forEach()`          | Performs an action for each pair.                  |

Example:

```java
Map<String, Integer> ages = new HashMap<>();

ages.put("John", 20);

System.out.println(ages.get("John"));
```

---

# 🔄 `Arrays` Class Methods

The `Arrays` class provides utility operations for arrays.

| Method             | Explanation                                   |
| ------------------ | --------------------------------------------- |
| `sort()`           | Sorts the array elements.                     |
| `binarySearch()`   | Searches for a value in a sorted array.       |
| `equals()`         | Compares two simple arrays.                   |
| `deepEquals()`     | Compares multidimensional arrays.             |
| `fill()`           | Fills the array with a value.                 |
| `copyOf()`         | Creates a copy with a new size.               |
| `copyOfRange()`    | Copies a range from the array.                |
| `toString()`       | Converts a simple array to text.              |
| `deepToString()`   | Converts multidimensional arrays to text.     |
| `asList()`         | Creates a list based on a reference array.    |
| `stream()`         | Creates a Stream from the array.              |
| `parallelSort()`   | Sorts the array using parallel processing.    |
| `parallelPrefix()` | Applies an accumulated operation in parallel. |
| `parallelSetAll()` | Fills the array in parallel.                  |
| `setAll()`         | Fills positions using a function.             |

Example:

```java
int[] numbers = {5, 2, 9, 1};

Arrays.sort(numbers);

System.out.println(Arrays.toString(numbers));
```

---

# 🔍 `Scanner` Methods

`Scanner` allows data to be read from different sources.

| Method            | Explanation                                   |
| ----------------- | --------------------------------------------- |
| `next()`          | Reads the next token.                         |
| `nextLine()`      | Reads the complete line.                      |
| `nextInt()`       | Reads an integer.                             |
| `nextDouble()`    | Reads a `double` value.                       |
| `nextFloat()`     | Reads a `float` value.                        |
| `nextLong()`      | Reads a `long` integer.                       |
| `nextBoolean()`   | Reads a boolean value.                        |
| `nextByte()`      | Reads a `byte` value.                         |
| `hasNext()`       | Checks if another token exists.               |
| `hasNextLine()`   | Checks if another line exists.                |
| `hasNextInt()`    | Checks if the next value is an integer.       |
| `hasNextDouble()` | Checks if the next value is a decimal number. |
| `close()`         | Closes the scanner and its source.            |

Example:

```java
Scanner scanner = new Scanner(System.in);

System.out.print("Enter your age: ");

int age = scanner.nextInt();

System.out.println("Age: " + age);

scanner.close();
```

---

# 📁 File Methods

## `File` Class

| Method              | Explanation                                 |
| ------------------- | ------------------------------------------- |
| `createNewFile()`   | Creates an empty file.                      |
| `exists()`          | Checks if the path exists.                  |
| `delete()`          | Deletes the file or directory.              |
| `mkdir()`           | Creates a directory.                        |
| `mkdirs()`          | Creates directories and parent directories. |
| `isFile()`          | Checks if the path represents a file.       |
| `isDirectory()`     | Checks if the path represents a directory.  |
| `getName()`         | Returns the name of the path.               |
| `getPath()`         | Returns the specified path.                 |
| `getAbsolutePath()` | Returns the absolute path.                  |
| `length()`          | Returns the file size.                      |
| `list()`            | Returns names inside a directory.           |
| `listFiles()`       | Returns files inside a directory.           |
| `renameTo()`        | Attempts to rename or move the path.        |
| `canRead()`         | Checks if the file can be read.             |
| `canWrite()`        | Checks if the file can be modified.         |
| `canExecute()`      | Checks if the file can be executed.         |

---

## `Files` Class

The `Files` class belongs to the `java.nio.file` package.

| Method                | Explanation                           |
| --------------------- | ------------------------------------- |
| `exists()`            | Checks if the path exists.            |
| `createFile()`        | Creates an empty file.                |
| `createDirectory()`   | Creates a directory.                  |
| `createDirectories()` | Creates the required directories.     |
| `delete()`            | Deletes a file or directory.          |
| `deleteIfExists()`    | Deletes only if the path exists.      |
| `copy()`              | Copies a file or directory.           |
| `move()`              | Moves or renames a path.              |
| `readAllBytes()`      | Reads all bytes from a file.          |
| `readAllLines()`      | Reads all lines from a file.          |
| `write()`             | Writes bytes or lines to a file.      |
| `writeString()`       | Writes a `String` to a file.          |
| `readString()`        | Reads all content as a `String`.      |
| `newBufferedReader()` | Creates a buffered reader.            |
| `newBufferedWriter()` | Creates a buffered writer.            |
| `newInputStream()`    | Creates an input stream.              |
| `newOutputStream()`   | Creates an output stream.             |
| `list()`              | Lists items from a directory.         |
| `walk()`              | Walks through a path tree.            |
| `find()`              | Finds paths using a filter.           |
| `lines()`             | Reads lines as a Stream.              |
| `size()`              | Returns the file size.                |
| `isDirectory()`       | Checks if the path is a directory.    |
| `isRegularFile()`     | Checks if the path is a regular file. |

Example:

```java
Path path = Path.of("file.txt");

Files.writeString(path, "Hello, Java!");

String content = Files.readString(path);

System.out.println(content);
```

---

# 🌊 Input and Output Methods

## `InputStream`

| Method           | Explanation                               |
| ---------------- | ----------------------------------------- |
| `read()`         | Reads one byte.                           |
| `readAllBytes()` | Reads all available bytes.                |
| `readNBytes()`   | Reads a specific number of bytes.         |
| `skip()`         | Skips a specific number of bytes.         |
| `available()`    | Reports bytes available without blocking. |
| `close()`        | Closes the input stream.                  |
| `transferTo()`   | Transfers data to another stream.         |

## `OutputStream`

| Method    | Explanation                        |
| --------- | ---------------------------------- |
| `write()` | Writes bytes to the stream.        |
| `flush()` | Forces pending data to be written. |
| `close()` | Closes the output stream.          |

## `Reader`

| Method    | Explanation                                    |
| --------- | ---------------------------------------------- |
| `read()`  | Reads characters.                              |
| `skip()`  | Skips characters.                              |
| `ready()` | Checks if reading can happen without blocking. |
| `close()` | Closes the reader.                             |

## `BufferedReader`

| Method       | Explanation                    |
| ------------ | ------------------------------ |
| `readLine()` | Reads a complete line of text. |

> `readLine()` belongs to classes such as `BufferedReader`, not directly to the `Reader` class.

## `Writer`

| Method     | Explanation                    |
| ---------- | ------------------------------ |
| `write()`  | Writes characters.             |
| `append()` | Adds characters to the stream. |
| `flush()`  | Forces the data to be written. |
| `close()`  | Closes the writer.             |

---

# ⚡ Stream API Methods

## Intermediate Operations

| Method       | Explanation                                       |
| ------------ | ------------------------------------------------- |
| `filter()`   | Keeps elements that match a condition.            |
| `map()`      | Transforms each element.                          |
| `flatMap()`  | Flattens multiple Streams into a single Stream.   |
| `distinct()` | Removes duplicate elements.                       |
| `sorted()`   | Sorts the elements.                               |
| `limit()`    | Limits the number of elements.                    |
| `skip()`     | Skips the first elements.                         |
| `peek()`     | Allows elements to be observed during processing. |

## Terminal Operations

| Method             | Explanation                                        |
| ------------------ | -------------------------------------------------- |
| `forEach()`        | Performs an action for each element.               |
| `forEachOrdered()` | Performs actions while preserving encounter order. |
| `collect()`        | Collects elements into a structure or result.      |
| `toList()`         | Converts the Stream into a list.                   |
| `count()`          | Counts the elements.                               |
| `findFirst()`      | Returns the first element found.                   |
| `findAny()`        | Returns any element found.                         |
| `anyMatch()`       | Checks if any element matches a condition.         |
| `allMatch()`       | Checks if all elements match a condition.          |
| `noneMatch()`      | Checks if no elements match a condition.           |
| `reduce()`         | Combines elements into a single result.            |
| `min()`            | Returns the smallest element.                      |
| `max()`            | Returns the largest element.                       |
| `sum()`            | Adds values in primitive Streams.                  |
| `average()`        | Calculates the average in primitive Streams.       |

Example:

```java
List<Integer> numbers = List.of(1, 2, 3, 4, 5);

numbers.stream()
        .filter(n -> n % 2 == 0)
        .forEach(System.out::println);
```

Output:

```text
2
4
```

---

# 🧵 Thread-Related Methods

| Method            | Explanation                                               |
| ----------------- | --------------------------------------------------------- |
| `start()`         | Starts a new thread.                                      |
| `run()`           | Contains the code executed by the thread.                 |
| `sleep()`         | Pauses the thread for a specific amount of time.          |
| `join()`          | Waits for another thread to finish.                       |
| `interrupt()`     | Requests interruption of a thread.                        |
| `isAlive()`       | Checks if the thread is still active.                     |
| `getName()`       | Returns the thread name.                                  |
| `setName()`       | Defines the thread name.                                  |
| `getState()`      | Returns the current thread state.                         |
| `currentThread()` | Returns the currently executing thread.                   |
| `yield()`         | Suggests that the current thread give up processing time. |

Example:

```java
Thread thread = new Thread(() -> {
    System.out.println("Running in another thread.");
});

thread.start();
```

---

# ⏱️ Date and Time Methods

## `LocalDate`

| Method            | Explanation                            |
| ----------------- | -------------------------------------- |
| `now()`           | Returns the current date.              |
| `of()`            | Creates a date using specified values. |
| `parse()`         | Converts text into a date.             |
| `plusDays()`      | Adds days.                             |
| `plusMonths()`    | Adds months.                           |
| `plusYears()`     | Adds years.                            |
| `minusDays()`     | Subtracts days.                        |
| `minusMonths()`   | Subtracts months.                      |
| `minusYears()`    | Subtracts years.                       |
| `getDayOfMonth()` | Returns the day of the month.          |
| `getMonth()`      | Returns the month.                     |
| `getYear()`       | Returns the year.                      |
| `isBefore()`      | Checks if it is before another date.   |
| `isAfter()`       | Checks if it is after another date.    |
| `isEqual()`       | Checks if it is equal to another date. |

## `LocalDateTime`

| Method           | Explanation                         |
| ---------------- | ----------------------------------- |
| `now()`          | Returns the current date and time.  |
| `of()`           | Creates a specified date and time.  |
| `parse()`        | Converts text into a date and time. |
| `plusDays()`     | Adds days.                          |
| `plusHours()`    | Adds hours.                         |
| `plusMinutes()`  | Adds minutes.                       |
| `minusDays()`    | Subtracts days.                     |
| `minusHours()`   | Subtracts hours.                    |
| `minusMinutes()` | Subtracts minutes.                  |
| `toLocalDate()`  | Extracts only the date.             |
| `toLocalTime()`  | Extracts only the time.             |

---

# 🎲 `Random` Class Methods

| Method          | Explanation                           |
| --------------- | ------------------------------------- |
| `nextInt()`     | Generates a random integer.           |
| `nextLong()`    | Generates a random `long` value.      |
| `nextDouble()`  | Generates a decimal between 0 and 1.  |
| `nextFloat()`   | Generates a `float` between 0 and 1.  |
| `nextBoolean()` | Randomly generates `true` or `false`. |
| `nextBytes()`   | Fills an array with random bytes.     |

Example:

```java
Random random = new Random();

int number = random.nextInt(10);

System.out.println(number);
```

---

# 🖥️ `System` Class Methods

| Method                       | Explanation                                    |
| ---------------------------- | ---------------------------------------------- |
| `System.out.println()`       | Displays text and moves to the next line.      |
| `System.out.print()`         | Displays text without moving to the next line. |
| `System.out.printf()`        | Displays formatted text.                       |
| `System.currentTimeMillis()` | Returns the current time in milliseconds.      |
| `System.nanoTime()`          | Returns a high-resolution time value.          |
| `System.arraycopy()`         | Copies elements between arrays.                |
| `System.getProperty()`       | Gets a system property.                        |
| `System.getenv()`            | Gets an environment variable.                  |
| `System.exit()`              | Terminates the application.                    |
| `System.gc()`                | Requests execution of the garbage collector.   |

---

# 🏗️ `StringBuilder` Class Methods

| Method           | Explanation                                   |
| ---------------- | --------------------------------------------- |
| `append()`       | Adds content to the end.                      |
| `insert()`       | Inserts content at a specific position.       |
| `delete()`       | Removes a range of characters.                |
| `deleteCharAt()` | Removes a specific character.                 |
| `replace()`      | Replaces a range of characters.               |
| `reverse()`      | Reverses the sequence.                        |
| `length()`       | Returns the number of characters.             |
| `capacity()`     | Returns the current internal capacity.        |
| `charAt()`       | Returns the character at a specific position. |
| `setCharAt()`    | Replaces a character.                         |
| `substring()`    | Extracts part of the content.                 |
| `toString()`     | Converts the builder into a `String`.         |

Example:

```java
StringBuilder text = new StringBuilder();

text.append("Java");
text.append(" is powerful");

System.out.println(text);
```

---

# 🧹 Exception Methods

The `Exception` and `Throwable` classes provide methods for investigating errors.

| Method                  | Explanation                            |
| ----------------------- | -------------------------------------- |
| `getMessage()`          | Returns the exception message.         |
| `getLocalizedMessage()` | Returns a localized exception message. |
| `getCause()`            | Returns the cause of the exception.    |
| `printStackTrace()`     | Displays the error stack trace.        |
| `getStackTrace()`       | Returns the stack trace elements.      |
| `fillInStackTrace()`    | Updates the exception stack trace.     |
| `addSuppressed()`       | Adds a suppressed exception.           |
| `getSuppressed()`       | Returns the suppressed exceptions.     |

Example:

```java
try {

    int result = 10 / 0;

} catch (ArithmeticException e) {

    System.out.println(e.getMessage());

    e.printStackTrace();
}
```

---

# 🧪 Complete Example

```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        double root = Math.sqrt(25);

        System.out.println("Root: " + root);

        String language = "Java";

        System.out.println(
            "Length: " + language.length()
        );

        System.out.println(
            "Uppercase: " + language.toUpperCase()
        );

        System.out.println(
            "First character: " + language.charAt(0)
        );

        List<String> names =
            List.of("John", "Maria");

        names.forEach(System.out::println);

        Map<String, Integer> ages =
            new HashMap<>();

        ages.put("John", 20);

        System.out.println(
            "Age: " + ages.get("John")
        );

        int[] numbers = {5, 2, 9, 1};

        Arrays.sort(numbers);

        System.out.println(
            Arrays.toString(numbers)
        );

        Random random = new Random();

        System.out.println(
            "Random: " + random.nextInt(100)
        );
    }
}
```

The `.java` files included in the repository provide additional practical examples of these concepts, helping connect the explanations in this README with real Java code.

---

# 💻 Requirements

To run the practical `.java` examples, install:

* JDK 17 or newer;
* A terminal or Java-compatible IDE;
* A properly configured Java environment.

Check the installed Java version:

```bash
java -version
```

Check the compiler:

```bash
javac -version
```

---

# ▶️ How to Run

The `.java` files in this repository are used as **practical examples** of the concepts and methods explained in this README.

Each example can be compiled and executed individually.

Compile a file:

```bash
javac Main.java
```

Run the program:

```bash
java Main
```

To run it with arguments:

```bash
java Main Java 25
```

You can also open the `.java` files in a Java-compatible IDE and use the **Run** option.

These practical files make it possible to:

* Test Java methods directly;
* Understand how each method works in real code;
* Modify values and observe different results;
* Practice the concepts presented in the documentation;
* Use the repository as both theoretical and practical study material.

---

# 👨‍💻 Author

**Eduardo Fernandez Evangelista**

**GitHub:** EduardoFernandezEvangelista

---

# 📄 License

This project does not currently have a specific license.

```text
License: ``
```

---

<div align="center">

☕ **Java • Methods • Java API • Programming**

📚 **Study • Practice • Reference • Development**

</div>
