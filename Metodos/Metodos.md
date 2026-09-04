# ☕ Java — Métodos

Métodos ajudam a organizar o código em partes menores e reutilizáveis. Neste material, você encontrará exemplos de métodos bastante usados no dia a dia com Java.

---

## Conteúdo

| Tema                 | Conteúdo                                 |
| -------------------- | ---------------------------------------- |
| Estrutura de métodos | Declaração, parâmetros, retorno e `void` |
| `main`               | Forma tradicional e simplificada         |
| `Math`               | Operações matemáticas                    |
| `String`             | Manipulação de textos                    |
| `Object`             | Métodos básicos dos objetos              |
| Collections          | `List`, `Set` e `Map`                    |
| `Arrays`             | Operações com arrays                     |
| `Scanner`            | Leitura de dados                         |
| Arquivos             | `File` e `Files`                         |
| I/O                  | Leitura e gravação de dados              |
| Stream API           | Processamento de coleções                |
| Threads              | Execução de tarefas                      |
| Datas                | `LocalDate` e `LocalDateTime`            |
| `Random`             | Geração de valores aleatórios            |
| `System`             | Recursos do sistema                      |
| `StringBuilder`      | Construção de textos                     |
| Exceções             | Informações sobre erros                  |

---

# Estrutura de um método

Um método é um bloco de código criado para realizar uma tarefa. Ele pode receber valores, processar informações, retornar um resultado ou apenas executar uma ação.

```java
modificador tipoDeRetorno nomeDoMetodo(parametros) {
    // instruções
}
```

## Método com retorno

```java
public static int somar(int primeiroNumero, int segundoNumero) {
    return primeiroNumero + segundoNumero;
}
```

Uso:

```java
int resultado = somar(10, 5);

System.out.println(resultado);
```

Saída:

```text
15
```

## Método sem retorno

Quando um método não precisa devolver um valor, usamos `void`.

```java
public static void exibirMensagem(String mensagem) {
    System.out.println(mensagem);
}
```

Uso:

```java
exibirMensagem("Olá, Java!");
```

Saída:

```text
Olá, Java!
```

## Elementos de um método

| Elemento   | Função                              |
| ---------- | ----------------------------------- |
| `public`   | Define o nível de acesso            |
| `static`   | Permite chamar o método pela classe |
| `int`      | Define o tipo do retorno            |
| `somar`    | Nome do método                      |
| Parâmetros | Valores recebidos pelo método       |
| `return`   | Retorna um valor                    |
| `void`     | Indica que não há retorno           |

---

# Método `main`

O método `main` é usado como ponto de entrada de uma aplicação Java.

## Forma tradicional

```java
public static void main(String[] args) {
    System.out.println("Olá, Java!");
}
```

| Elemento        | Função                                              |
| --------------- | --------------------------------------------------- |
| `public`        | Permite que a aplicação encontre o método           |
| `static`        | Permite a execução sem criar um objeto              |
| `void`          | Indica que o método não retorna valor               |
| `main`          | Identifica o método de entrada                      |
| `String[] args` | Armazena argumentos recebidos pela linha de comando |

Exemplo:

```java
public class Main {

    public static void main(String[] args) {
        System.out.println("Quantidade de argumentos: " + args.length);

        for (String argumento : args) {
            System.out.println(argumento);
        }
    }
}
```

Execução:

```bash
javac Main.java
java Main Java 17
```

Saída:

```text
Quantidade de argumentos: 2
Java
17
```

## Formas simplificadas

Versões recentes do Java também permitem formas simplificadas do método `main`:

```java
void main() {
    System.out.println("Olá, Java!");
}
```

```java
void main(String[] args) {
    System.out.println("Olá, Java!");
}
```

| Forma                                    | Característica                      |
| ---------------------------------------- | ----------------------------------- |
| `public static void main(String[] args)` | Forma tradicional e mais compatível |
| `void main()`                            | Forma simplificada sem argumentos   |
| `void main(String[] args)`               | Forma simplificada com argumentos   |

---

# Métodos úteis da biblioteca padrão

Além dos métodos criados pelo programador, o Java possui várias classes prontas com métodos para tarefas comuns, como trabalhar com textos, listas, arquivos, datas e números.

---

# `Math`

A classe `Math` possui métodos para realizar cálculos matemáticos.

| Método ou constante | Função                              |
| ------------------- | ----------------------------------- |
| `abs()`             | Retorna o valor absoluto            |
| `max()`             | Retorna o maior valor               |
| `min()`             | Retorna o menor valor               |
| `pow()`             | Calcula uma potência                |
| `sqrt()`            | Calcula a raiz quadrada             |
| `cbrt()`            | Calcula a raiz cúbica               |
| `random()`          | Gera um número entre `0.0` e `1.0`  |
| `round()`           | Arredonda um valor                  |
| `floor()`           | Arredonda para baixo                |
| `ceil()`            | Arredonda para cima                 |
| `sin()`             | Calcula o seno                      |
| `cos()`             | Calcula o cosseno                   |
| `tan()`             | Calcula a tangente                  |
| `log()`             | Calcula o logaritmo natural         |
| `log10()`           | Calcula o logaritmo na base 10      |
| `exp()`             | Calcula uma exponencial             |
| `PI`                | Representa a constante π            |
| `E`                 | Representa a constante matemática e |

Exemplo:

```java
double raiz = Math.sqrt(25);

System.out.println(raiz);
```

Saída:

```text
5.0
```

---

# `String`

A classe `String` representa textos. Como seus objetos são imutáveis, os métodos que modificam o texto retornam uma nova `String`.

| Método                  | Função                                          |
| ----------------------- | ----------------------------------------------- |
| `length()`              | Retorna a quantidade de caracteres              |
| `charAt()`              | Retorna o caractere de uma posição              |
| `substring()`           | Extrai parte do texto                           |
| `toUpperCase()`         | Converte o texto para maiúsculas                |
| `toLowerCase()`         | Converte o texto para minúsculas                |
| `equals()`              | Compara o conteúdo                              |
| `equalsIgnoreCase()`    | Compara ignorando maiúsculas e minúsculas       |
| `contains()`            | Verifica se contém uma sequência                |
| `startsWith()`          | Verifica o início do texto                      |
| `endsWith()`            | Verifica o final do texto                       |
| `indexOf()`             | Localiza a primeira ocorrência                  |
| `lastIndexOf()`         | Localiza a última ocorrência                    |
| `replace()`             | Substitui caracteres ou sequências              |
| `replaceAll()`          | Substitui usando expressão regular              |
| `trim()`                | Remove espaços das extremidades                 |
| `strip()`               | Remove espaços Unicode das extremidades         |
| `split()`               | Divide o texto                                  |
| `concat()`              | Concatena textos                                |
| `isEmpty()`             | Verifica se o texto está vazio                  |
| `isBlank()`             | Verifica se está vazio ou contém apenas espaços |
| `repeat()`              | Repete o texto                                  |
| `matches()`             | Verifica correspondência com expressão regular  |
| `compareTo()`           | Compara textos lexicograficamente               |
| `compareToIgnoreCase()` | Compara ignorando maiúsculas e minúsculas       |
| `toCharArray()`         | Converte o texto em um array de caracteres      |

Exemplo:

```java
String linguagem = "Java";

System.out.println(linguagem.length());
System.out.println(linguagem.toUpperCase());
System.out.println(linguagem.charAt(0));
```

Saída:

```text
4
JAVA
J
```

---

# `Object`

`Object` é a classe base de todas as classes Java.

| Método        | Função                                        |
| ------------- | --------------------------------------------- |
| `toString()`  | Retorna uma representação textual do objeto   |
| `equals()`    | Compara objetos                               |
| `hashCode()`  | Retorna um código usado em estruturas de hash |
| `getClass()`  | Retorna a classe do objeto                    |
| `clone()`     | Cria uma cópia quando permitido               |
| `wait()`      | Faz a thread aguardar                         |
| `notify()`    | Notifica uma thread em espera                 |
| `notifyAll()` | Notifica todas as threads em espera           |

> O método `finalize()` foi descontinuado e não deve ser usado em código novo.

---

# Collections

As Collections são usadas para armazenar e manipular grupos de objetos.

## `List`

`List` representa uma coleção ordenada que permite elementos duplicados.

| Método          | Função                                   |
| --------------- | ---------------------------------------- |
| `add()`         | Adiciona um elemento                     |
| `addAll()`      | Adiciona elementos de outra coleção      |
| `get()`         | Obtém um elemento pelo índice            |
| `set()`         | Substitui um elemento                    |
| `remove()`      | Remove um elemento                       |
| `clear()`       | Remove todos os elementos                |
| `size()`        | Retorna a quantidade de elementos        |
| `isEmpty()`     | Verifica se a lista está vazia           |
| `contains()`    | Verifica se contém um elemento           |
| `containsAll()` | Verifica se contém vários elementos      |
| `indexOf()`     | Retorna o primeiro índice de um elemento |
| `lastIndexOf()` | Retorna o último índice de um elemento   |
| `subList()`     | Retorna parte da lista                   |
| `sort()`        | Ordena a lista                           |
| `forEach()`     | Executa uma ação para cada elemento      |

Exemplo:

```java
List<String> nomes = new ArrayList<>();

nomes.add("João");
nomes.add("Maria");

System.out.println(nomes.get(0));
```

---

## `Set`

`Set` representa uma coleção que não permite elementos duplicados.

| Método        | Função                                             |
| ------------- | -------------------------------------------------- |
| `add()`       | Adiciona um elemento                               |
| `remove()`    | Remove um elemento                                 |
| `contains()`  | Verifica se contém um elemento                     |
| `size()`      | Retorna a quantidade de elementos                  |
| `clear()`     | Remove todos os elementos                          |
| `isEmpty()`   | Verifica se a coleção está vazia                   |
| `addAll()`    | Adiciona elementos de outra coleção                |
| `removeAll()` | Remove elementos presentes em outra coleção        |
| `retainAll()` | Mantém apenas elementos presentes em outra coleção |
| `forEach()`   | Executa uma ação para cada elemento                |

---

## `Map`

`Map` armazena dados em pares de chave e valor.

| Método               | Função                                    |
| -------------------- | ----------------------------------------- |
| `put()`              | Adiciona ou substitui um par              |
| `putAll()`           | Adiciona os pares de outro mapa           |
| `get()`              | Obtém um valor pela chave                 |
| `getOrDefault()`     | Obtém um valor ou retorna um valor padrão |
| `remove()`           | Remove uma chave                          |
| `containsKey()`      | Verifica se uma chave existe              |
| `containsValue()`    | Verifica se um valor existe               |
| `keySet()`           | Retorna o conjunto de chaves              |
| `values()`           | Retorna os valores                        |
| `entrySet()`         | Retorna os pares de chave e valor         |
| `size()`             | Retorna a quantidade de pares             |
| `clear()`            | Remove todos os pares                     |
| `isEmpty()`          | Verifica se o mapa está vazio             |
| `replace()`          | Substitui um valor                        |
| `compute()`          | Calcula um novo valor                     |
| `computeIfAbsent()`  | Calcula um valor se a chave não existir   |
| `computeIfPresent()` | Calcula um valor se a chave existir       |
| `merge()`            | Combina valores                           |
| `forEach()`          | Percorre os pares                         |

Exemplo:

```java
Map<String, Integer> idades = new HashMap<>();

idades.put("João", 20);

System.out.println(idades.get("João"));
```

---

# `Arrays`

A classe `Arrays` possui métodos para ordenar, pesquisar, copiar e comparar arrays.

| Método             | Função                                     |
| ------------------ | ------------------------------------------ |
| `sort()`           | Ordena os elementos                        |
| `binarySearch()`   | Pesquisa em um array ordenado              |
| `equals()`         | Compara arrays                             |
| `deepEquals()`     | Compara arrays multidimensionais           |
| `fill()`           | Preenche o array                           |
| `copyOf()`         | Copia o array com novo tamanho             |
| `copyOfRange()`    | Copia um intervalo do array                |
| `toString()`       | Converte o array em texto                  |
| `deepToString()`   | Converte arrays multidimensionais em texto |
| `asList()`         | Cria uma lista baseada em um array         |
| `stream()`         | Cria uma Stream a partir do array          |
| `parallelSort()`   | Ordena usando processamento paralelo       |
| `parallelPrefix()` | Aplica uma operação acumulada              |
| `parallelSetAll()` | Preenche o array em paralelo               |
| `setAll()`         | Preenche o array usando uma função         |

Exemplo:

```java
int[] numeros = {5, 2, 9, 1};

Arrays.sort(numeros);

System.out.println(Arrays.toString(numeros));
```

---

# `Scanner`

`Scanner` permite ler dados digitados pelo usuário ou obtidos de outras fontes.

| Método            | Função                                   |
| ----------------- | ---------------------------------------- |
| `next()`          | Lê o próximo token                       |
| `nextLine()`      | Lê uma linha completa                    |
| `nextInt()`       | Lê um `int`                              |
| `nextDouble()`    | Lê um `double`                           |
| `nextFloat()`     | Lê um `float`                            |
| `nextLong()`      | Lê um `long`                             |
| `nextBoolean()`   | Lê um `boolean`                          |
| `nextByte()`      | Lê um `byte`                             |
| `hasNext()`       | Verifica se existe outro token           |
| `hasNextLine()`   | Verifica se existe outra linha           |
| `hasNextInt()`    | Verifica se o próximo valor é um inteiro |
| `hasNextDouble()` | Verifica se o próximo valor é decimal    |
| `close()`         | Fecha o `Scanner`                        |

Exemplo:

```java
Scanner scanner = new Scanner(System.in);

System.out.print("Digite sua idade: ");

int idade = scanner.nextInt();

System.out.println("Idade: " + idade);

scanner.close();
```

---

# Arquivos

## `File`

`File` representa caminhos de arquivos e diretórios e permite realizar operações básicas sobre eles.

| Método              | Função                                |
| ------------------- | ------------------------------------- |
| `createNewFile()`   | Cria um arquivo vazio                 |
| `exists()`          | Verifica se o caminho existe          |
| `delete()`          | Exclui um arquivo ou diretório        |
| `mkdir()`           | Cria um diretório                     |
| `mkdirs()`          | Cria diretórios e seus diretórios-pai |
| `isFile()`          | Verifica se representa um arquivo     |
| `isDirectory()`     | Verifica se representa um diretório   |
| `getName()`         | Retorna o nome                        |
| `getPath()`         | Retorna o caminho                     |
| `getAbsolutePath()` | Retorna o caminho absoluto            |
| `length()`          | Retorna o tamanho                     |
| `list()`            | Lista os nomes de um diretório        |
| `listFiles()`       | Lista os arquivos de um diretório     |
| `renameTo()`        | Renomeia ou move                      |
| `canRead()`         | Verifica permissão de leitura         |
| `canWrite()`        | Verifica permissão de escrita         |
| `canExecute()`      | Verifica permissão de execução        |

## `Files`

`Files`, do pacote `java.nio.file`, possui métodos para trabalhar com arquivos e diretórios.

| Método                | Função                             |
| --------------------- | ---------------------------------- |
| `exists()`            | Verifica se o caminho existe       |
| `createFile()`        | Cria um arquivo                    |
| `createDirectory()`   | Cria um diretório                  |
| `createDirectories()` | Cria diretórios necessários        |
| `delete()`            | Exclui um caminho                  |
| `deleteIfExists()`    | Exclui se existir                  |
| `copy()`              | Copia um caminho                   |
| `move()`              | Move ou renomeia                   |
| `readAllBytes()`      | Lê todos os bytes                  |
| `readAllLines()`      | Lê todas as linhas                 |
| `write()`             | Escreve dados                      |
| `writeString()`       | Escreve uma `String`               |
| `readString()`        | Lê o conteúdo como `String`        |
| `newBufferedReader()` | Cria um leitor com buffer          |
| `newBufferedWriter()` | Cria um escritor com buffer        |
| `newInputStream()`    | Cria um fluxo de leitura           |
| `newOutputStream()`   | Cria um fluxo de gravação          |
| `list()`              | Lista o conteúdo de um diretório   |
| `walk()`              | Percorre uma árvore de caminhos    |
| `find()`              | Localiza caminhos usando um filtro |
| `lines()`             | Lê linhas como uma Stream          |
| `size()`              | Retorna o tamanho                  |
| `isDirectory()`       | Verifica se é um diretório         |
| `isRegularFile()`     | Verifica se é um arquivo regular   |

Exemplo:

```java
Path caminho = Path.of("arquivo.txt");

Files.writeString(caminho, "Olá, Java!");

String conteudo = Files.readString(caminho);

System.out.println(conteudo);
```

---

# I/O

As classes de I/O são usadas para ler e gravar bytes e caracteres.

## `InputStream`

| Método           | Função                                |
| ---------------- | ------------------------------------- |
| `read()`         | Lê um byte                            |
| `readAllBytes()` | Lê todos os bytes                     |
| `readNBytes()`   | Lê uma quantidade específica de bytes |
| `skip()`         | Ignora bytes                          |
| `available()`    | Retorna a quantidade disponível       |
| `close()`        | Fecha o fluxo                         |
| `transferTo()`   | Transfere dados para outro fluxo      |

## `OutputStream`

| Método    | Função                     |
| --------- | -------------------------- |
| `write()` | Grava bytes                |
| `flush()` | Força a gravação dos dados |
| `close()` | Fecha o fluxo              |

## `Reader`

| Método    | Função                                   |
| --------- | ---------------------------------------- |
| `read()`  | Lê caracteres                            |
| `skip()`  | Ignora caracteres                        |
| `ready()` | Verifica se a leitura pode ser realizada |
| `close()` | Fecha o leitor                           |

## `BufferedReader`

| Método       | Função                |
| ------------ | --------------------- |
| `readLine()` | Lê uma linha completa |

## `Writer`

| Método     | Função              |
| ---------- | ------------------- |
| `write()`  | Grava caracteres    |
| `append()` | Adiciona caracteres |
| `flush()`  | Força a gravação    |
| `close()`  | Fecha o escritor    |

---

# Stream API

A Stream API permite processar coleções de forma mais organizada, aplicando filtros, transformações e outras operações.

## Operações intermediárias

| Método       | Função                                    |
| ------------ | ----------------------------------------- |
| `filter()`   | Filtra elementos                          |
| `map()`      | Transforma elementos                      |
| `flatMap()`  | Combina Streams aninhadas                 |
| `distinct()` | Remove elementos duplicados               |
| `sorted()`   | Ordena elementos                          |
| `limit()`    | Limita a quantidade de elementos          |
| `skip()`     | Ignora elementos                          |
| `peek()`     | Observa elementos durante o processamento |

## Operações terminais

| Método             | Função                                       |
| ------------------ | -------------------------------------------- |
| `forEach()`        | Executa uma ação                             |
| `forEachOrdered()` | Executa uma ação preservando a ordem         |
| `collect()`        | Reúne os resultados                          |
| `toList()`         | Converte o resultado em uma lista            |
| `count()`          | Conta os elementos                           |
| `findFirst()`      | Retorna o primeiro elemento                  |
| `findAny()`        | Retorna qualquer elemento                    |
| `anyMatch()`       | Verifica se algum elemento atende à condição |
| `allMatch()`       | Verifica se todos atendem à condição         |
| `noneMatch()`      | Verifica se nenhum atende à condição         |
| `reduce()`         | Combina os elementos em um resultado         |
| `min()`            | Retorna o menor elemento                     |
| `max()`            | Retorna o maior elemento                     |
| `sum()`            | Soma valores em Streams primitivas           |
| `average()`        | Calcula a média em Streams primitivas        |

Exemplo:

```java
List<Integer> numeros = List.of(1, 2, 3, 4, 5);

numeros.stream()
        .filter(numero -> numero % 2 == 0)
        .forEach(System.out::println);
```

Saída:

```text
2
4
```

---

# Threads

A classe `Thread` permite executar tarefas separadamente.

| Método            | Função                              |
| ----------------- | ----------------------------------- |
| `start()`         | Inicia a thread                     |
| `run()`           | Define o código executado           |
| `sleep()`         | Suspende a execução temporariamente |
| `join()`          | Aguarda outra thread terminar       |
| `interrupt()`     | Solicita a interrupção              |
| `isAlive()`       | Verifica se a thread está ativa     |
| `getName()`       | Retorna o nome                      |
| `setName()`       | Define o nome                       |
| `getState()`      | Retorna o estado                    |
| `currentThread()` | Retorna a thread atual              |
| `yield()`         | Sugere ceder o processamento        |

Exemplo:

```java
Thread thread = new Thread(() -> {
    System.out.println("Executando em outra thread.");
});

thread.start();
```

---

# Datas e horários

## `LocalDate`

`LocalDate` representa uma data sem horário.

| Método            | Função                  |
| ----------------- | ----------------------- |
| `now()`           | Retorna a data atual    |
| `of()`            | Cria uma data           |
| `parse()`         | Converte texto em data  |
| `plusDays()`      | Adiciona dias           |
| `plusMonths()`    | Adiciona meses          |
| `plusYears()`     | Adiciona anos           |
| `minusDays()`     | Subtrai dias            |
| `minusMonths()`   | Subtrai meses           |
| `minusYears()`    | Subtrai anos            |
| `getDayOfMonth()` | Retorna o dia           |
| `getMonth()`      | Retorna o mês           |
| `getYear()`       | Retorna o ano           |
| `isBefore()`      | Verifica se é anterior  |
| `isAfter()`       | Verifica se é posterior |
| `isEqual()`       | Compara duas datas      |

## `LocalDateTime`

`LocalDateTime` representa uma data e um horário sem fuso horário.

| Método           | Função                            |
| ---------------- | --------------------------------- |
| `now()`          | Retorna a data e o horário atuais |
| `of()`           | Cria uma data e um horário        |
| `parse()`        | Converte texto                    |
| `plusDays()`     | Adiciona dias                     |
| `plusHours()`    | Adiciona horas                    |
| `plusMinutes()`  | Adiciona minutos                  |
| `minusDays()`    | Subtrai dias                      |
| `minusHours()`   | Subtrai horas                     |
| `minusMinutes()` | Subtrai minutos                   |
| `toLocalDate()`  | Retorna apenas a data             |
| `toLocalTime()`  | Retorna apenas o horário          |

---

# `Random`

A classe `Random` gera valores pseudoaleatórios.

| Método          | Função                               |
| --------------- | ------------------------------------ |
| `nextInt()`     | Gera um `int`                        |
| `nextLong()`    | Gera um `long`                       |
| `nextDouble()`  | Gera um `double` entre `0.0` e `1.0` |
| `nextFloat()`   | Gera um `float` entre `0.0` e `1.0`  |
| `nextBoolean()` | Gera `true` ou `false`               |
| `nextBytes()`   | Preenche um array com bytes          |

Exemplo:

```java
Random random = new Random();

int numero = random.nextInt(10);

System.out.println(numero);
```

---

# `System`

A classe `System` possui métodos relacionados ao ambiente de execução.

| Método                 | Função                               |
| ---------------------- | ------------------------------------ |
| `System.out.println()` | Exibe texto com quebra de linha      |
| `System.out.print()`   | Exibe texto sem quebra de linha      |
| `System.out.printf()`  | Exibe texto formatado                |
| `currentTimeMillis()`  | Retorna o tempo em milissegundos     |
| `nanoTime()`           | Retorna um contador de alta precisão |
| `arraycopy()`          | Copia elementos entre arrays         |
| `getProperty()`        | Retorna uma propriedade do sistema   |
| `getenv()`             | Retorna uma variável de ambiente     |
| `exit()`               | Encerra a aplicação                  |
| `gc()`                 | Solicita o coletor de lixo           |

---

# `StringBuilder`

`StringBuilder` permite construir e modificar textos.

| Método           | Função                   |
| ---------------- | ------------------------ |
| `append()`       | Adiciona conteúdo        |
| `insert()`       | Insere conteúdo          |
| `delete()`       | Remove um intervalo      |
| `deleteCharAt()` | Remove um caractere      |
| `replace()`      | Substitui um intervalo   |
| `reverse()`      | Inverte o conteúdo       |
| `length()`       | Retorna o tamanho        |
| `capacity()`     | Retorna a capacidade     |
| `charAt()`       | Retorna um caractere     |
| `setCharAt()`    | Altera um caractere      |
| `substring()`    | Extrai parte do conteúdo |
| `toString()`     | Converte para `String`   |

Exemplo:

```java
StringBuilder texto = new StringBuilder();

texto.append("Java");
texto.append(" é poderoso");

System.out.println(texto);
```

---

# Exceções

As classes `Exception` e `Throwable` possuem métodos para consultar informações sobre erros.

| Método                  | Função                         |
| ----------------------- | ------------------------------ |
| `getMessage()`          | Retorna a mensagem da exceção  |
| `getLocalizedMessage()` | Retorna a mensagem localizada  |
| `getCause()`            | Retorna a causa                |
| `printStackTrace()`     | Exibe a pilha de execução      |
| `getStackTrace()`       | Retorna os elementos da pilha  |
| `fillInStackTrace()`    | Atualiza a pilha de execução   |
| `addSuppressed()`       | Adiciona uma exceção suprimida |
| `getSuppressed()`       | Retorna as exceções suprimidas |

Exemplo:

```java
try {
    int resultado = 10 / 0;
} catch (ArithmeticException excecao) {
    System.out.println(excecao.getMessage());
    excecao.printStackTrace();
}
```

---

# Exemplo integrado

```java
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        double raiz = Math.sqrt(25);

        System.out.println("Raiz: " + raiz);

        String linguagem = "Java";

        System.out.println("Tamanho: " + linguagem.length());
        System.out.println("Maiúsculas: " + linguagem.toUpperCase());
        System.out.println("Primeiro caractere: " + linguagem.charAt(0));

        List<String> nomes = List.of("João", "Maria");

        nomes.forEach(System.out::println);

        Map<String, Integer> idades = new HashMap<>();

        idades.put("João", 20);

        System.out.println("Idade: " + idades.get("João"));

        int[] numeros = {5, 2, 9, 1};

        Arrays.sort(numeros);

        System.out.println(Arrays.toString(numeros));

        Random random = new Random();

        System.out.println("Número aleatório: " + random.nextInt(100));
    }
}
```

---

# Organização do material

Este conteúdo faz parte do repositório **JavaBasicCommands** e acompanha os estudos sobre variáveis, condicionais, repetições, operadores e outros fundamentos do Java.

```text
Metodos/
├── Metodos.md
├── Methods.md
└── MetodosJava.java
```

| Arquivo            | Conteúdo              |
| ------------------ | --------------------- |
| `Metodos.md`       | Conteúdo em português |
| `Methods.md`       | Conteúdo em inglês    |
| `MetodosJava.java` | Exemplos práticos     |

---

<div align="center">

☕ **Java — Métodos**

</div>
