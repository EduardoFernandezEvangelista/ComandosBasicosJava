import java.util.Arrays;

// Classe pessoa
class Pessoa {

    // Variáveis de instância
    String nome;
    int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método
    public void apresentar() {
        System.out.println(
                "Olá, meu nome é " + nome +
                        " e eu tenho " + idade + " anos."
        );
    }
}

// ENUM
// Enum: representa um conjunto de constantes nomeadas
enum DiaDaSemana {
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO,
    DOMINGO
}

//Classe principal
public class VariaveisJava {

    // Tipos de dados primitivos em Java

    // Byte: 8 bits
    byte byteValor = 0;

    // Short: 16 bits
    short shortValor = 0;

    // Int: 32 bits
    int intValor = 0;

    // Long: 64 bits
    long longValor = 0L;

    // Float: 32 bits
    float floatValor = 0.0f;

    // Double: 64 bits
    double doubleValor = 0.0;

    // Char: 16 bits
    // Representa um único caractere Unicode
    char charValor = '#';

    // Boolean:
    // Representa verdadeiro ou falso
    boolean booleanValor = false;



    // Variáveis não primitivas em Java
    // String: representa uma sequência de caracteres
    String stringValor = "Hello, World!";

    // Array: representa uma coleção de elementos do mesmo tipo
    int[] arrayValor = {1, 2, 3, 4, 5};

    // Array de String
    String[] arrayString = {
            "Java",
            "é",
            "legal"
    };

    // VARIÁVEIS QUE PODEM SER NULL
    // Variáveis primitivas não podem receber null,
    // pois são tipos de dados primitivos.

    // int numero = null; // ERRO


    // Variáveis não primitivas podem ser null,
    // pois são referências para objetos.

    String stringNula = null;
    Pessoa pessoaNula = null;
    int[] numerosNulos = null;

    // Variaveis de instância
    // São declaradas dentro de uma classe,
    // mas fora de qualquer método, construtor ou bloco.
    int variavelInstancia = 100;

    // Variaveis de estáticas
    // São declaradas com a palavra-chave static.
    // Pertencem à classe e não a uma instância específica.
    static int variavelEstatica = 200;

    // Variaveis de final
    // Uma variável final não pode ser alterada
    // depois de ser inicializada.
    final int variavelFinal = 300;

    // Variaveis de final static
    // Pertence à classe e não pode ser alterada.
    // É normalmente utilizada para representar constantes.
    static final int variavelFinalStatic = 400;

    // Modificadores de acesso
    // Privete:
    // Só pode ser acessada dentro da própria classe.
    private int variavelPrivada = 10;

    // Public:
    // Pode ser acessada de qualquer lugar,
    // desde que a classe também permita o acesso.
    public int variavelPublica = 20;

    // Protected:
    // Pode ser acessada dentro do mesmo pacote
    // e também por subclasses.
    protected int variavelProtected = 30;

    // Packege_private (default):
    // Quando nenhum modificador é declarado,
    // a variável pode ser acessada dentro do mesmo pacote.
    int variavelPacote = 40;

    // Variavel de interface
    /*
     * Variáveis declaradas dentro de uma interface
     * são implicitamente:
     *
     * public static final
     */

    interface VariavelInterface {

        int variavelInterface = 500;
    }

    // Método main
    public static void main(String[] args) {

        System.out.println(
                "=================================================="
        );

        System.out.println(
                "       VARIÁVEIS E TIPOS DE DADOS EM JAVA"
        );

        System.out.println(
                "=================================================="
        );

        // 1. Tipos primitivos
        System.out.println("\n1. TIPOS PRIMITIVOS");
        System.out.println("----------------------------------------------");

        demonstrarPrimitivos();

        // 2. Tipos não primitivos
        System.out.println("\n2. TIPOS NÃO PRIMITIVOS");
        System.out.println("----------------------------------------------");

        demonstrarNaoPrimitivos();

        // 3. Wrapper Classes
        System.out.println("\n3. WRAPPER CLASSES");
        System.out.println("----------------------------------------------");

        demonstrarWrapper();

        // 4. Variaveis de instância
        System.out.println("\n4. VARIÁVEIS DE INSTÂNCIA");
        System.out.println("----------------------------------------------");

        VariaveisJava objeto = new VariaveisJava();

        System.out.println(
                "Variável de instância: "
                        + objeto.variavelInstancia
        );

        // 5. Variaveis estáticas
        System.out.println("\n5. VARIÁVEIS ESTÁTICAS");
        System.out.println("----------------------------------------------");

        System.out.println(
                "Variável static: "
                        + variavelEstatica
        );

        System.out.println(
                "Variável final static: "
                        + variavelFinalStatic
        );

        // 6. Variaveis final
        System.out.println("\n6. VARIÁVEL FINAL");
        System.out.println("----------------------------------------------");

        System.out.println(
                "Variável final: "
                        + objeto.variavelFinal
        );

        // objeto.variavelFinal = 500;
        // ERRO: uma variável final não pode ser alterada.

        // 7. Modificadores de acesso
        System.out.println("\n7. MODIFICADORES DE ACESSO");
        System.out.println("----------------------------------------------");

        System.out.println(
                "Private: "
                        + objeto.variavelPrivada
        );

        System.out.println(
                "Public: "
                        + objeto.variavelPublica
        );

        System.out.println(
                "Protected: "
                        + objeto.variavelProtected
        );

        System.out.println(
                "Package-private: "
                        + objeto.variavelPacote
        );

        // 8. Variavel de objeto

        System.out.println("\n8. VARIÁVEIS DE OBJETO");
        System.out.println("----------------------------------------------");

        demonstrarObjeto();

        // 9. Var
        System.out.println("\n9. VAR - INFERÊNCIA DE TIPO");
        System.out.println("----------------------------------------------");

        demonstrarVar();

        // 10. ENUM
        System.out.println("\n10. ENUM");
        System.out.println("----------------------------------------------");

        DiaDaSemana dia = DiaDaSemana.SEGUNDA;

        System.out.println(
                "Dia da semana: " + dia
        );

        // 11. Variavel local
        System.out.println("\n11. VARIÁVEIS LOCAIS");
        System.out.println("----------------------------------------------");

        int variavelLocal = 999;

        System.out.println(
                "Variável local: " + variavelLocal
        );

        // 12. Variavel de parametro
        System.out.println("\n12. VARIÁVEIS DE PARÂMETRO");
        System.out.println("----------------------------------------------");

        objeto.metodoComParametro(123);

        // 13. Variavel de interface
        System.out.println("\n13. VARIÁVEL DE INTERFACE");
        System.out.println("----------------------------------------------");

        System.out.println(
                "Variável da interface: "
                        + VariavelInterface.variavelInterface
        );

        // Final
        System.out.println(
                "\n=================================================="
        );

        System.out.println(
                "              FIM DA DEMONSTRAÇÃO"
        );

        System.out.println(
                "=================================================="
        );
    }

    // Método para demonstrar tipos primitivos
    static void demonstrarPrimitivos() {

        // Byte: 8 bits
        byte Byte = 127;

        // Short: 16 bits
        short Short = 32767;

        // Int: 32 bits
        int Int = 2147483647;

        // Long: 64 bits
        long Long = 9223372036854775807L;

        // Float: 32 bits
        float Float = 3.14f;

        // Double: 64 bits
        double Double = 3.14159265359;

        // Char: 16 bits
        char Char = 'J';

        // Boolean: true ou false
        boolean Boolean = true;


        System.out.println(
                "byte    (8 bits):  " + Byte
        );

        System.out.println(
                "short   (16 bits): " + Short
        );

        System.out.println(
                "int     (32 bits): " + Int
        );

        System.out.println(
                "long    (64 bits): " + Long
        );

        System.out.println(
                "float   (32 bits): " + Float
        );

        System.out.println(
                "double  (64 bits): " + Double
        );

        System.out.println(
                "char    (16 bits): " + Char
        );

        System.out.println(
                "boolean:            " + Boolean
        );
    }

    // Método para demonstrar tipos não primitivos
    static void demonstrarNaoPrimitivos() {

        // String
        String String = "Hello, World!";

        // Array de inteiros
        int[] Array = {
                1, 2, 3, 4, 5
        };

        // Array de Strings
        String[] ArrayString = {
                "Java",
                "é",
                "legal"
        };


        System.out.println(
                "String: " + String
        );

        System.out.println(
                "Array de int: "
                        + Arrays.toString(Array)
        );

        System.out.println(
                "Array de String: "
                        + Arrays.toString(ArrayString)
        );


        // Variáveis não primitivas podem receber null
        String Null = null;

        int[] numeros = null;

        Pessoa pessoa = null;


        System.out.println(
                "String null: " + Null
        );

        System.out.println(
                "Array null: " + numeros
        );

        System.out.println(
                "Pessoa null: " + pessoa
        );
    }

    // Método para demonstrar wrappers
    static void demonstrarWrapper() {

        /*
         * Wrapper Classes representam tipos primitivos
         * como objetos.
         *
         * byte      -> Byte
         * short     -> Short
         * int       -> Integer
         * long      -> Long
         * float     -> Float
         * double    -> Double
         * char      -> Character
         * boolean   -> Boolean
         */


        Byte Byte = 127;

        Short Short = 32767;

        Integer Integer = 2147483647;

        Long Long = 9223372036854775807L;

        Float Float = 3.14f;

        Double Double = 3.14159;

        Character Character = 'J';

        Boolean Boolean = true;


        System.out.println(
                "Byte: " + Byte
        );

        System.out.println(
                "Short: " + Short
        );

        System.out.println(
                "Integer: " + Integer
        );

        System.out.println(
                "Long: " + Long
        );

        System.out.println(
                "Float: " + Float
        );

        System.out.println(
                "Double: " + Double
        );

        System.out.println(
                "Character: " + Character
        );

        System.out.println(
                "Boolean: " + Boolean
        );


        // Wrappers podem receber null
        Integer IntegerNull = null;

        System.out.println(
                "Integer null: " + IntegerNull
        );
    }

    // Método para demonstrar variáveis de objeto
    static void demonstrarObjeto() {

        /*
         * Uma variável de referência armazena
         * uma referência para um objeto.
         */

        Pessoa pessoa1 = new Pessoa(
                "João",
                30
        );

        Pessoa pessoa2 = new Pessoa(
                "Maria",
                25
        );

        Pessoa pessoaNula = null;


        pessoa1.apresentar();

        pessoa2.apresentar();

        System.out.println(
                "Pessoa nula: " + pessoaNula
        );
    }

    // Método para demonstrar var
    static void demonstrarVar() {

        /*
         * A partir do Java 10 podemos utilizar var
         * para inferência de tipo.
         *
         * O Java descobre o tipo automaticamente
         * através do valor inicial.
         */


        var variavelVar = 0;

        // int


        var variavelVar2 = "Hello";

        // String


        var variavelVar3 = 3.14;

        // double


        var variavelVar4 = new int[]{
                1, 2, 3
        };

        // int[]


        System.out.println(
                "var variavelVar: "
                        + variavelVar
        );

        System.out.println(
                "var variavelVar2: "
                        + variavelVar2
        );

        System.out.println(
                "var variavelVar3: "
                        + variavelVar3
        );

        System.out.println(
                "var variavelVar4: "
                        + Arrays.toString(variavelVar4)
        );
    }

    // Método para demonstrar variáveis de parâmetro
    /*
     * Variáveis de parâmetro são declaradas
     * dentro da lista de parâmetros de um método.
     *
     * Elas só podem ser utilizadas dentro
     * daquele método.
     */

    void metodoComParametro(int variavelParametro) {

        System.out.println(
                "Valor do parâmetro: "
                        + variavelParametro
        );
    }
}