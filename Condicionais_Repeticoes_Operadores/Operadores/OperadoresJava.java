public class OperadoresJava {

    public static void main(String[] args) {

        System.out.println("          Operadores em Java");

        // Operadores aritméticos
        int a = 10;
        int b = 3;

        System.out.println("\nOperadores aritméticos:");

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Módulo: " + (a % b));


        // Operadores relacionais
        System.out.println("\nOperadores relacionais:");

        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));


        // Operadores lógicos
        boolean condicao1 = true;
        boolean condicao2 = false;

        System.out.println("\nOperadores lógicos:");

        // E lógico
        System.out.println("condicao1 && condicao2: "
                + (condicao1 && condicao2));

        // OU lógico
        System.out.println("condicao1 || condicao2: "
                + (condicao1 || condicao2));

        // Negação lógica
        System.out.println("!condicao1: "
                + (!condicao1));


        // Operadores bit a bit
        int x = 5;
        int y = 3;

        System.out.println("\nOperadores bit a bit:");

        // AND bit a bit
        System.out.println("x & y: " + (x & y));

        // OR bit a bit
        System.out.println("x | y: " + (x | y));

        // XOR bit a bit
        System.out.println("x ^ y: " + (x ^ y));

        // NOT bit a bit
        System.out.println("~x: " + (~x));


        // Operador ternário
        int idade = 20;

        String maioridade = idade >= 18
                ? "Maior de idade"
                : "Menor de idade";

        System.out.println("\nOperador ternário:");
        System.out.println(maioridade);


        // Operadores de atribuição
        int valor = 10;

        System.out.println("\nOperadores de atribuição:");

        valor += 5;
        System.out.println("valor += 5: " + valor);

        valor -= 3;
        System.out.println("valor -= 3: " + valor);

        valor *= 2;
        System.out.println("valor *= 2: " + valor);

        valor /= 4;
        System.out.println("valor /= 4: " + valor);

        valor %= 3;
        System.out.println("valor %= 3: " + valor);


        // Incremento e decremento
        int contador = 0;

        System.out.println("\nIncremento e decremento:");

        contador++;
        System.out.println("contador++: " + contador);

        contador++;
        System.out.println("contador++: " + contador);

        contador--;
        System.out.println("contador--: " + contador);


        // Pré-incremento e pós-incremento
        int numero = 10;

        System.out.println("\nPré-incremento e pós-incremento:");

        System.out.println("Pós-incremento: " + numero++);
        System.out.println("Valor depois: " + numero);

        System.out.println("Pré-incremento: " + (++numero));
        System.out.println("Valor atual: " + numero);


        // Combinação de operadores
        int nota = 8;
        int frequencia = 90;

        boolean aprovado = nota >= 7 && frequencia >= 75;

        System.out.println("\nCombinação de operadores:");

        System.out.println("Nota: " + nota);
        System.out.println("Frequência: " + frequencia + "%");
        System.out.println("Aprovado: " + aprovado);


        // Exemplo prático
        int numero1 = 20;
        int numero2 = 10;

        boolean maiorQue = numero1 > numero2;
        boolean diferente = numero1 != numero2;
        boolean valido = numero1 >= 10 && numero2 <= 20;

        System.out.println("\nExemplo prático:");

        System.out.println("Número 1 é maior? " + maiorQue);
        System.out.println("Os números são diferentes? " + diferente);
        System.out.println("Os valores estão dentro do limite? " + valido);
    }
}
