# ☕ Java - Métodos

> Repositório de estudos dedicado ao aprendizado e à prática dos principais métodos da linguagem Java e de suas APIs padrão.

Este projeto reúne explicações objetivas e tabelas de consulta sobre métodos de classes como `Math`, `String`, `Object`, `Arrays`, `Collections`, `Scanner`, `Files`, `Thread`, `LocalDate`, `Random`, `System`, `StringBuilder`, `Stream` e classes relacionadas a exceções.

Também apresenta a estrutura completa do método `main` nas versões Java 17 e Java 25.

## 📚 Finalidade do Projeto

* 📚 Educação
* 💻 Prática
* 🧠 Consulta rápida
* 📖 Aprendizado da API Java
* 🚀 Evolução na programação

---

# 🎯 Introdução

Métodos são blocos de código responsáveis por executar tarefas específicas.

Eles podem:

* Receber parâmetros;
* Processar informações;
* Retornar valores;
* Alterar objetos;
* Executar ações;
* Ser reutilizados em diferentes partes do programa.

Exemplo:

```java
public static int somar(int a, int b) {
    return a + b;
}
```

Chamada:

```java
int resultado = somar(10, 20);
```

---

# 🏗️ Estrutura de um Método

A estrutura geral de um método é:

```java
modificador tipoDeRetorno nomeDoMetodo(parametros) {
    // instruções
}
```

Exemplo:

```java
public static int somar(int a, int b) {
    return a + b;
}
```

| Parte            | Explicação                             |
| ---------------- | -------------------------------------- |
| `public`         | Define o nível de acesso do método.    |
| `static`         | Indica que o método pertence à classe. |
| `int`            | Define o tipo de valor retornado.      |
| `somar`          | Nome utilizado para chamar o método.   |
| `(int a, int b)` | Parâmetros recebidos pelo método.      |
| `return`         | Retorna um valor e encerra o método.   |

Métodos que não retornam valor utilizam `void`:

```java
public void exibirMensagem() {
    System.out.println("Olá!");
}
```

---

# 🚀 Método `main` no Java 17

No Java 17, a forma tradicional do método `main` é:

```java
public static void main(String[] args) {
    System.out.println("Olá, Java!");
}
```

## Explicação completa

| Parte                  | Explicação                                                         |
| ---------------------- | ------------------------------------------------------------------ |
| `public`               | Permite que a JVM acesse o método a partir de qualquer lugar.      |
| `static`               | Permite executar o método sem criar um objeto da classe.           |
| `void`                 | Indica que o método não retorna nenhum valor.                      |
| `main`                 | Nome especial reconhecido pela JVM como ponto inicial do programa. |
| `String[]`             | Define um array de textos.                                         |
| `args`                 | Nome da variável que armazena argumentos da linha de comando.      |
| `{}`                   | Delimitam o bloco de instruções executado pelo método.             |
| `System.out.println()` | Exibe uma mensagem no console.                                     |

Exemplo com argumentos:

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

Saída aproximada:

```text
Quantidade de argumentos: 2
Java
17
```

No Java 17, o método `main` tradicional precisa ser `public`, `static` e `void`, recebendo um array `String[]`.

---

# 🚀 Método `main` no Java 25

O Java 25 mantém a forma tradicional do método `main`:

```java
public static void main(String[] args) {
    System.out.println("Olá, Java 25!");
}
```

A partir das funcionalidades de métodos `main` simplificados, também podem existir formas reduzidas em contextos compatíveis, como:

```java
void main() {
    System.out.println("Olá, Java 25!");
}
```

Ou:

```java
void main(String[] args) {
    System.out.println("Olá, Java 25!");
}
```

## Explicação da forma tradicional

| Parte           | Explicação                                              |
| --------------- | ------------------------------------------------------- |
| `public`        | Permite o acesso da JVM ao método.                      |
| `static`        | Permite iniciar o programa sem criar um objeto.         |
| `void`          | Indica que não existe valor de retorno.                 |
| `main`          | Identifica o ponto de entrada tradicional da aplicação. |
| `String[] args` | Recebe argumentos enviados pela linha de comando.       |

## Explicação da forma simplificada

| Parte                | Explicação                                                                                      |
| -------------------- | ----------------------------------------------------------------------------------------------- |
| `void`               | Define que o método não retorna valor.                                                          |
| `main`               | Identifica o método de entrada do programa.                                                     |
| `String[] args`      | Permite receber argumentos da linha de comando.                                                 |
| Ausência de `public` | O código simplificado pode utilizar regras de acesso mais flexíveis conforme o recurso adotado. |
| Ausência de `static` | O ambiente de execução pode cuidar da inicialização necessária.                                 |

A forma tradicional continua sendo a mais compatível com projetos, ferramentas, IDEs e versões anteriores do Java.

---

# 🔢 Métodos da Classe `Math`

A classe `Math` fornece operações matemáticas estáticas.

| Método ou constante | Explicação                                        |
| ------------------- | ------------------------------------------------- |
| `Math.abs()`        | Retorna o valor absoluto de um número.            |
| `Math.max()`        | Retorna o maior entre dois valores.               |
| `Math.min()`        | Retorna o menor entre dois valores.               |
| `Math.pow()`        | Calcula uma potência.                             |
| `Math.sqrt()`       | Calcula a raiz quadrada.                          |
| `Math.cbrt()`       | Calcula a raiz cúbica.                            |
| `Math.random()`     | Gera um número decimal aleatório entre zero e um. |
| `Math.round()`      | Arredonda o valor para o inteiro mais próximo.    |
| `Math.floor()`      | Arredonda o valor para baixo.                     |
| `Math.ceil()`       | Arredonda o valor para cima.                      |
| `Math.sin()`        | Calcula o seno de um ângulo em radianos.          |
| `Math.cos()`        | Calcula o cosseno de um ângulo em radianos.       |
| `Math.tan()`        | Calcula a tangente de um ângulo em radianos.      |
| `Math.log()`        | Calcula o logaritmo natural.                      |
| `Math.log10()`      | Calcula o logaritmo na base dez.                  |
| `Math.exp()`        | Calcula a exponencial de um valor.                |
| `Math.PI`           | Representa a constante matemática π.              |
| `Math.E`            | Representa a constante matemática e.              |

Exemplo:

```java
double resultado = Math.sqrt(25);

System.out.println(resultado);
```

Saída:

```text
5.0
```

---

# 🔤 Métodos da Classe `String`

A classe `String` representa textos imutáveis.

| Método                  | Explicação                                               |
| ----------------------- | -------------------------------------------------------- |
| `length()`              | Retorna a quantidade de caracteres.                      |
| `charAt()`              | Retorna o caractere de uma posição.                      |
| `substring()`           | Extrai parte do texto.                                   |
| `toUpperCase()`         | Converte o texto para letras maiúsculas.                 |
| `toLowerCase()`         | Converte o texto para letras minúsculas.                 |
| `equals()`              | Compara o conteúdo de duas strings.                      |
| `equalsIgnoreCase()`    | Compara ignorando maiúsculas e minúsculas.               |
| `contains()`            | Verifica se o texto contém uma sequência.                |
| `startsWith()`          | Verifica se o texto começa com uma sequência.            |
| `endsWith()`            | Verifica se o texto termina com uma sequência.           |
| `indexOf()`             | Retorna a primeira posição encontrada.                   |
| `lastIndexOf()`         | Retorna a última posição encontrada.                     |
| `replace()`             | Substitui caracteres ou sequências.                      |
| `replaceAll()`          | Substitui usando expressão regular.                      |
| `trim()`                | Remove espaços tradicionais nas extremidades.            |
| `strip()`               | Remove espaços Unicode nas extremidades.                 |
| `split()`               | Divide o texto usando um delimitador.                    |
| `concat()`              | Concatena outro texto.                                   |
| `isEmpty()`             | Verifica se o texto possui tamanho zero.                 |
| `isBlank()`             | Verifica se está vazio ou contém apenas espaços.         |
| `repeat()`              | Repete o texto determinada quantidade de vezes.          |
| `matches()`             | Verifica se o texto corresponde a uma expressão regular. |
| `compareTo()`           | Compara textos lexicograficamente.                       |
| `compareToIgnoreCase()` | Compara textos ignorando maiúsculas e minúsculas.        |
| `toCharArray()`         | Converte o texto em um array de caracteres.              |

Exemplo:

```java
String nome = "Java";

System.out.println(nome.length());
System.out.println(nome.toUpperCase());
System.out.println(nome.charAt(0));
```

Saída:

```text
4
JAVA
J
```

---

# 📦 Métodos da Classe `Object`

Todas as classes Java herdam direta ou indiretamente de `Object`.

| Método        | Explicação                                          |
| ------------- | --------------------------------------------------- |
| `toString()`  | Retorna uma representação textual do objeto.        |
| `equals()`    | Compara logicamente dois objetos.                   |
| `hashCode()`  | Retorna um código usado em estruturas de hash.      |
| `getClass()`  | Retorna a classe real do objeto.                    |
| `clone()`     | Cria uma cópia quando a classe permite clonagem.    |
| `finalize()`  | Método legado relacionado à finalização de objetos. |
| `wait()`      | Faz a thread aguardar uma notificação.              |
| `notify()`    | Acorda uma thread que está aguardando.              |
| `notifyAll()` | Acorda todas as threads que estão aguardando.       |

> `finalize()` é obsoleto e não deve ser utilizado em código novo.

Exemplo:

```java
Object objeto = new Object();

System.out.println(objeto.toString());
System.out.println(objeto.getClass());
```

---

# 📋 Métodos das Collections

## 📃 `List`

| Método          | Explicação                                        |
| --------------- | ------------------------------------------------- |
| `add()`         | Adiciona um elemento à lista.                     |
| `addAll()`      | Adiciona todos os elementos de outra coleção.     |
| `get()`         | Obtém um elemento pelo índice.                    |
| `set()`         | Substitui um elemento pelo índice.                |
| `remove()`      | Remove um elemento ou índice.                     |
| `clear()`       | Remove todos os elementos.                        |
| `size()`        | Retorna a quantidade de elementos.                |
| `isEmpty()`     | Verifica se a lista está vazia.                   |
| `contains()`    | Verifica se contém determinado elemento.          |
| `containsAll()` | Verifica se contém todos os elementos informados. |
| `indexOf()`     | Retorna o primeiro índice de um elemento.         |
| `lastIndexOf()` | Retorna o último índice de um elemento.           |
| `subList()`     | Retorna uma parte da lista.                       |
| `sort()`        | Ordena os elementos usando um comparador.         |
| `forEach()`     | Executa uma ação para cada elemento.              |

Exemplo:

```java
List<String> nomes = new ArrayList<>();

nomes.add("João");
nomes.add("Maria");

System.out.println(nomes.get(0));
```

---

## 🔷 `Set`

| Método        | Explicação                                          |
| ------------- | --------------------------------------------------- |
| `add()`       | Adiciona um elemento sem duplicá-lo.                |
| `remove()`    | Remove um elemento.                                 |
| `contains()`  | Verifica se contém um elemento.                     |
| `size()`      | Retorna a quantidade de elementos.                  |
| `clear()`     | Remove todos os elementos.                          |
| `isEmpty()`   | Verifica se o conjunto está vazio.                  |
| `addAll()`    | Adiciona elementos de outra coleção.                |
| `removeAll()` | Remove elementos presentes em outra coleção.        |
| `retainAll()` | Mantém apenas elementos presentes em outra coleção. |
| `forEach()`   | Executa uma ação para cada elemento.                |

---

## 🗺️ `Map`

| Método               | Explicação                                   |
| -------------------- | -------------------------------------------- |
| `put()`              | Adiciona ou substitui um par chave-valor.    |
| `putAll()`           | Adiciona todos os pares de outro mapa.       |
| `get()`              | Obtém o valor associado a uma chave.         |
| `getOrDefault()`     | Obtém o valor ou retorna um padrão.          |
| `remove()`           | Remove uma chave e seu valor.                |
| `containsKey()`      | Verifica se uma chave existe.                |
| `containsValue()`    | Verifica se um valor existe.                 |
| `keySet()`           | Retorna o conjunto de chaves.                |
| `values()`           | Retorna os valores armazenados.              |
| `entrySet()`         | Retorna os pares chave-valor.                |
| `size()`             | Retorna a quantidade de pares.               |
| `clear()`            | Remove todos os pares.                       |
| `isEmpty()`          | Verifica se o mapa está vazio.               |
| `replace()`          | Substitui o valor de uma chave.              |
| `compute()`          | Calcula um novo valor para uma chave.        |
| `computeIfAbsent()`  | Calcula valor apenas se a chave não existir. |
| `computeIfPresent()` | Calcula valor apenas se a chave existir.     |
| `merge()`            | Combina um valor com o valor existente.      |
| `forEach()`          | Executa uma ação para cada par.              |

Exemplo:

```java
Map<String, Integer> idades = new HashMap<>();

idades.put("João", 20);

System.out.println(idades.get("João"));
```

---

# 🔄 Métodos da Classe `Arrays`

A classe `Arrays` fornece operações utilitárias para arrays.

| Método             | Explicação                                        |
| ------------------ | ------------------------------------------------- |
| `sort()`           | Ordena os elementos do array.                     |
| `binarySearch()`   | Procura um valor em um array ordenado.            |
| `equals()`         | Compara dois arrays simples.                      |
| `deepEquals()`     | Compara arrays multidimensionais.                 |
| `fill()`           | Preenche o array com um valor.                    |
| `copyOf()`         | Cria uma cópia com novo tamanho.                  |
| `copyOfRange()`    | Copia um intervalo do array.                      |
| `toString()`       | Converte array simples em texto.                  |
| `deepToString()`   | Converte arrays multidimensionais em texto.       |
| `asList()`         | Cria uma lista baseada em um array de referência. |
| `stream()`         | Cria uma Stream a partir do array.                |
| `parallelSort()`   | Ordena o array usando processamento paralelo.     |
| `parallelPrefix()` | Aplica uma operação acumulada em paralelo.        |
| `parallelSetAll()` | Preenche o array em paralelo.                     |
| `setAll()`         | Preenche posições usando uma função.              |

Exemplo:

```java
int[] numeros = {5, 2, 9, 1};

Arrays.sort(numeros);

System.out.println(Arrays.toString(numeros));
```

---

# 🔍 Métodos do `Scanner`

O `Scanner` permite ler dados de diferentes fontes.

| Método            | Explicação                             |
| ----------------- | -------------------------------------- |
| `next()`          | Lê o próximo token.                    |
| `nextLine()`      | Lê a linha inteira.                    |
| `nextInt()`       | Lê um número inteiro.                  |
| `nextDouble()`    | Lê um número decimal `double`.         |
| `nextFloat()`     | Lê um número decimal `float`.          |
| `nextLong()`      | Lê um número inteiro `long`.           |
| `nextBoolean()`   | Lê um valor booleano.                  |
| `nextByte()`      | Lê um número do tipo `byte`.           |
| `hasNext()`       | Verifica se existe outro token.        |
| `hasNextLine()`   | Verifica se existe outra linha.        |
| `hasNextInt()`    | Verifica se o próximo valor é inteiro. |
| `hasNextDouble()` | Verifica se o próximo valor é decimal. |
| `close()`         | Fecha o scanner e sua fonte.           |

Exemplo:

```java
Scanner scanner = new Scanner(System.in);

System.out.print("Digite sua idade: ");

int idade = scanner.nextInt();

System.out.println("Idade: " + idade);

scanner.close();
```

---

# 📁 Métodos de Arquivos

## Classe `File`

| Método              | Explicação                                |
| ------------------- | ----------------------------------------- |
| `createNewFile()`   | Cria um arquivo vazio.                    |
| `exists()`          | Verifica se o caminho existe.             |
| `delete()`          | Exclui o arquivo ou diretório.            |
| `mkdir()`           | Cria um diretório.                        |
| `mkdirs()`          | Cria diretórios e diretórios-pai.         |
| `isFile()`          | Verifica se o caminho é arquivo.          |
| `isDirectory()`     | Verifica se o caminho é diretório.        |
| `getName()`         | Retorna o nome do caminho.                |
| `getPath()`         | Retorna o caminho informado.              |
| `getAbsolutePath()` | Retorna o caminho absoluto.               |
| `length()`          | Retorna o tamanho do arquivo.             |
| `list()`            | Retorna nomes dentro de um diretório.     |
| `listFiles()`       | Retorna arquivos dentro de um diretório.  |
| `renameTo()`        | Tenta renomear ou mover o caminho.        |
| `canRead()`         | Verifica se o arquivo pode ser lido.      |
| `canWrite()`        | Verifica se o arquivo pode ser alterado.  |
| `canExecute()`      | Verifica se o arquivo pode ser executado. |

---

## Classe `Files`

A classe `Files` pertence ao pacote `java.nio.file`.

| Método                | Explicação                          |
| --------------------- | ----------------------------------- |
| `exists()`            | Verifica se o caminho existe.       |
| `createFile()`        | Cria um arquivo vazio.              |
| `createDirectory()`   | Cria um diretório.                  |
| `createDirectories()` | Cria diretórios necessários.        |
| `delete()`            | Exclui um arquivo ou diretório.     |
| `deleteIfExists()`    | Exclui somente se existir.          |
| `copy()`              | Copia um arquivo ou diretório.      |
| `move()`              | Move ou renomeia um caminho.        |
| `readAllBytes()`      | Lê todos os bytes do arquivo.       |
| `readAllLines()`      | Lê todas as linhas do arquivo.      |
| `write()`             | Escreve bytes ou linhas no arquivo. |
| `writeString()`       | Escreve uma String no arquivo.      |
| `readString()`        | Lê todo o conteúdo como String.     |
| `newBufferedReader()` | Cria um leitor com buffer.          |
| `newBufferedWriter()` | Cria um escritor com buffer.        |
| `newInputStream()`    | Cria um fluxo de entrada.           |
| `newOutputStream()`   | Cria um fluxo de saída.             |
| `list()`              | Lista itens de um diretório.        |
| `walk()`              | Percorre uma árvore de caminhos.    |
| `find()`              | Localiza caminhos usando um filtro. |
| `lines()`             | Lê linhas como Stream.              |
| `size()`              | Retorna o tamanho do arquivo.       |
| `isDirectory()`       | Verifica se é diretório.            |
| `isRegularFile()`     | Verifica se é arquivo regular.      |

Exemplo:

```java
Path caminho = Path.of("arquivo.txt");

Files.writeString(caminho, "Olá, Java!");

String conteudo = Files.readString(caminho);

System.out.println(conteudo);
```

---

# 🌊 Métodos de Entrada e Saída

## `InputStream`

| Método           | Explicação                              |
| ---------------- | --------------------------------------- |
| `read()`         | Lê um byte.                             |
| `readAllBytes()` | Lê todos os bytes disponíveis.          |
| `readNBytes()`   | Lê uma quantidade específica de bytes.  |
| `skip()`         | Ignora determinada quantidade de bytes. |
| `available()`    | Informa bytes disponíveis sem bloqueio. |
| `close()`        | Fecha o fluxo de entrada.               |
| `transferTo()`   | Transfere dados para outro fluxo.       |

## `OutputStream`

| Método    | Explicação                         |
| --------- | ---------------------------------- |
| `write()` | Escreve bytes no fluxo.            |
| `flush()` | Força o envio dos dados pendentes. |
| `close()` | Fecha o fluxo de saída.            |

## `Reader`

| Método    | Explicação                                       |
| --------- | ------------------------------------------------ |
| `read()`  | Lê caracteres.                                   |
| `skip()`  | Ignora caracteres.                               |
| `ready()` | Verifica se a leitura pode ocorrer sem bloqueio. |
| `close()` | Fecha o leitor.                                  |

## `BufferedReader`

| Método       | Explicação                      |
| ------------ | ------------------------------- |
| `readLine()` | Lê uma linha completa de texto. |

> `readLine()` pertence a classes como `BufferedReader`, não diretamente à classe `Reader`.

## `Writer`

| Método     | Explicação                    |
| ---------- | ----------------------------- |
| `write()`  | Escreve caracteres.           |
| `append()` | Adiciona caracteres ao fluxo. |
| `flush()`  | Força a gravação dos dados.   |
| `close()`  | Fecha o escritor.             |

---

# ⚡ Métodos da Stream API

## Operações intermediárias

| Método       | Explicação                                          |
| ------------ | --------------------------------------------------- |
| `filter()`   | Mantém elementos que atendem a uma condição.        |
| `map()`      | Transforma cada elemento.                           |
| `flatMap()`  | Achata várias Streams em uma só.                    |
| `distinct()` | Remove elementos duplicados.                        |
| `sorted()`   | Ordena os elementos.                                |
| `limit()`    | Limita a quantidade de elementos.                   |
| `skip()`     | Ignora os primeiros elementos.                      |
| `peek()`     | Permite observar elementos durante o processamento. |

## Operações terminais

| Método             | Explicação                                     |
| ------------------ | ---------------------------------------------- |
| `forEach()`        | Executa uma ação para cada elemento.           |
| `forEachOrdered()` | Executa mantendo a ordem encontrada.           |
| `collect()`        | Reúne elementos em uma estrutura ou resultado. |
| `toList()`         | Converte a Stream em uma lista.                |
| `count()`          | Conta os elementos.                            |
| `findFirst()`      | Retorna o primeiro elemento encontrado.        |
| `findAny()`        | Retorna algum elemento encontrado.             |
| `anyMatch()`       | Verifica se algum elemento atende à condição.  |
| `allMatch()`       | Verifica se todos atendem à condição.          |
| `noneMatch()`      | Verifica se nenhum atende à condição.          |
| `reduce()`         | Combina elementos em um único resultado.       |
| `min()`            | Retorna o menor elemento.                      |
| `max()`            | Retorna o maior elemento.                      |
| `sum()`            | Soma valores em Streams primitivas.            |
| `average()`        | Calcula a média em Streams primitivas.         |

Exemplo:

```java
List<Integer> numeros = List.of(1, 2, 3, 4, 5);

numeros.stream()
        .filter(n -> n % 2 == 0)
        .forEach(System.out::println);
```

Saída:

```text
2
4
```

---

# 🧵 Métodos relacionados a Threads

| Método            | Explicação                                    |
| ----------------- | --------------------------------------------- |
| `start()`         | Inicia uma nova thread.                       |
| `run()`           | Contém o código executado pela thread.        |
| `sleep()`         | Pausa a thread por determinado tempo.         |
| `join()`          | Aguarda outra thread terminar.                |
| `interrupt()`     | Solicita a interrupção de uma thread.         |
| `isAlive()`       | Verifica se a thread ainda está ativa.        |
| `getName()`       | Retorna o nome da thread.                     |
| `setName()`       | Define o nome da thread.                      |
| `getState()`      | Retorna o estado atual da thread.             |
| `currentThread()` | Retorna a thread atualmente executada.        |
| `yield()`         | Sugere que a thread atual ceda processamento. |

Exemplo:

```java
Thread thread = new Thread(() -> {
    System.out.println("Executando em outra thread.");
});

thread.start();
```

---

# ⏱️ Métodos de Tempo e Datas

## `LocalDate`

| Método            | Explicação                            |
| ----------------- | ------------------------------------- |
| `now()`           | Retorna a data atual.                 |
| `of()`            | Cria uma data com valores informados. |
| `parse()`         | Converte texto em data.               |
| `plusDays()`      | Adiciona dias.                        |
| `plusMonths()`    | Adiciona meses.                       |
| `plusYears()`     | Adiciona anos.                        |
| `minusDays()`     | Subtrai dias.                         |
| `minusMonths()`   | Subtrai meses.                        |
| `minusYears()`    | Subtrai anos.                         |
| `getDayOfMonth()` | Retorna o dia do mês.                 |
| `getMonth()`      | Retorna o mês.                        |
| `getYear()`       | Retorna o ano.                        |
| `isBefore()`      | Verifica se é anterior a outra data.  |
| `isAfter()`       | Verifica se é posterior a outra data. |
| `isEqual()`       | Verifica se é igual a outra data.     |

## `LocalDateTime`

| Método           | Explicação                     |
| ---------------- | ------------------------------ |
| `now()`          | Retorna data e hora atuais.    |
| `of()`           | Cria data e hora informadas.   |
| `parse()`        | Converte texto em data e hora. |
| `plusDays()`     | Adiciona dias.                 |
| `plusHours()`    | Adiciona horas.                |
| `plusMinutes()`  | Adiciona minutos.              |
| `minusDays()`    | Subtrai dias.                  |
| `minusHours()`   | Subtrai horas.                 |
| `minusMinutes()` | Subtrai minutos.               |
| `toLocalDate()`  | Extrai somente a data.         |
| `toLocalTime()`  | Extrai somente o horário.      |

---

# 🎲 Métodos da Classe `Random`

| Método          | Explicação                              |
| --------------- | --------------------------------------- |
| `nextInt()`     | Gera um inteiro aleatório.              |
| `nextLong()`    | Gera um valor `long` aleatório.         |
| `nextDouble()`  | Gera um decimal entre zero e um.        |
| `nextFloat()`   | Gera um `float` entre zero e um.        |
| `nextBoolean()` | Gera `true` ou `false` aleatoriamente.  |
| `nextBytes()`   | Preenche um array com bytes aleatórios. |

Exemplo:

```java
Random random = new Random();

int numero = random.nextInt(10);

System.out.println(numero);
```

---

# 🖥️ Métodos da Classe `System`

| Método                       | Explicação                              |
| ---------------------------- | --------------------------------------- |
| `System.out.println()`       | Exibe texto e quebra a linha.           |
| `System.out.print()`         | Exibe texto sem quebrar a linha.        |
| `System.out.printf()`        | Exibe texto formatado.                  |
| `System.currentTimeMillis()` | Retorna o tempo atual em milissegundos. |
| `System.nanoTime()`          | Retorna um contador de alta precisão.   |
| `System.arraycopy()`         | Copia elementos entre arrays.           |
| `System.getProperty()`       | Obtém uma propriedade do sistema.       |
| `System.getenv()`            | Obtém uma variável de ambiente.         |
| `System.exit()`              | Encerra a aplicação.                    |
| `System.gc()`                | Solicita a execução do coletor de lixo. |

---

# 🏗️ Métodos da Classe `StringBuilder`

| Método           | Explicação                            |
| ---------------- | ------------------------------------- |
| `append()`       | Adiciona conteúdo ao final.           |
| `insert()`       | Insere conteúdo em uma posição.       |
| `delete()`       | Remove um intervalo de caracteres.    |
| `deleteCharAt()` | Remove um caractere específico.       |
| `replace()`      | Substitui um intervalo de caracteres. |
| `reverse()`      | Inverte a sequência.                  |
| `length()`       | Retorna a quantidade de caracteres.   |
| `capacity()`     | Retorna a capacidade interna atual.   |
| `charAt()`       | Retorna o caractere de uma posição.   |
| `setCharAt()`    | Substitui um caractere.               |
| `substring()`    | Extrai parte do conteúdo.             |
| `toString()`     | Converte o builder em `String`.       |

Exemplo:

```java
StringBuilder texto = new StringBuilder();

texto.append("Java");
texto.append(" é poderoso");

System.out.println(texto);
```

---

# 🧹 Métodos de Exceções

As classes `Exception` e `Throwable` fornecem métodos para investigar erros.

| Método                  | Explicação                                 |
| ----------------------- | ------------------------------------------ |
| `getMessage()`          | Retorna a mensagem da exceção.             |
| `getLocalizedMessage()` | Retorna uma mensagem localizada.           |
| `getCause()`            | Retorna a causa da exceção.                |
| `printStackTrace()`     | Exibe a pilha de execução do erro.         |
| `getStackTrace()`       | Retorna os elementos da pilha de execução. |
| `fillInStackTrace()`    | Atualiza a pilha de execução da exceção.   |
| `addSuppressed()`       | Adiciona uma exceção suprimida.            |
| `getSuppressed()`       | Retorna as exceções suprimidas.            |

Exemplo:

```java
try {

    int resultado = 10 / 0;

} catch (ArithmeticException e) {

    System.out.println(e.getMessage());

    e.printStackTrace();
}
```

---

# 🧪 Exemplo Completo

```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        double raiz = Math.sqrt(25);
        System.out.println("Raiz: " + raiz);

        String linguagem = "Java";

        System.out.println("Tamanho: " + linguagem.length());
        System.out.println("Maiúsculo: " + linguagem.toUpperCase());
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

        System.out.println("Aleatório: " + random.nextInt(100));
    }
}
```

---

# 💻 Pré-requisitos

Para executar os exemplos, instale:

* JDK 17 ou superior;
* Terminal ou IDE;
* Variável de ambiente Java configurada.

Verifique a versão instalada:

```bash
java -version
```

Verifique o compilador:

```bash
javac -version
```

---

# ▶️ Como Executar

Compile o arquivo:

```bash
javac Main.java
```

Execute o programa:

```bash
java Main
```

Para executar com argumentos:

```bash
java Main Java 25
```

---

# 👨‍💻 Autor

**Eduardo Fernandez Evangelista**

GitHub:

**EduardoFernandezEvangelista**

---

# 📄 Licença

Este projeto ainda não possui uma licença específica definida.

```text
Licença: [ADICIONAR LICENÇA]
```

---

<div align="center">

☕ Java • Métodos • API Java • Programação

📚 Estudo • Prática • Consulta • Evolução

</div>
