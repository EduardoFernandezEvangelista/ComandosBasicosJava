public class EstruturasRepeticaoJava {

    public static void main(String[] args) {

        System.out.println("Estruturas de repetição");

        // For
        System.out.println("\nFor:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Valor: " + i);
        }

        // For-each
        System.out.println("\nFor-each:");

        int[] numeros = {10, 20, 30, 40, 50};

        for (int numero : numeros) {
            System.out.println("Número: " + numero);
        }

        // While
        System.out.println("\nWhile:");

        int contadorWhile = 0;

        while (contadorWhile < 5) {
            System.out.println("Contador: " + contadorWhile);

            contadorWhile++;
        }

        // While true
        System.out.println("\nWhile true:");

        int contadorTrue = 0;

        while (true) {
            System.out.println("Contador: " + contadorTrue);

            contadorTrue++;

            if (contadorTrue == 5) {
                break;
            }
        }

        // Do while
        System.out.println("\nDo while:");

        int contadorDoWhile = 0;

        do {
            System.out.println("Contador: " + contadorDoWhile);

            contadorDoWhile++;

        } while (contadorDoWhile < 5);

        // Break
        System.out.println("\nBreak:");

        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                break;
            }

            System.out.println(i);
        }

        // Continue
        System.out.println("\nContinue:");

        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                continue;
            }

            System.out.println(i);
        }

        // Label
        System.out.println("\nLabel:");

        externo:
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.println(
                        "i = " + i + ", j = " + j
                );
            }
        }

        // Break com label
        System.out.println("\nBreak com label:");

        externoBreak:
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                if (i == 2 && j == 2) {
                    break externoBreak;
                }

                System.out.println(
                        "i = " + i + ", j = " + j
                );
            }
        }

        // Continue com label
        System.out.println("\nContinue com label:");

        externoContinue:
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (j == 1) {
                    continue externoContinue;
                }

                System.out.println(
                        "i = " + i + ", j = " + j
                );
            }
        }

        // For com break
        System.out.println("\nFor com break:");

        for (int i = 1; i <= 10; i++) {

            if (i > 5) {
                break;
            }

            System.out.println(i);
        }

        // For com continue
        System.out.println("\nFor com continue:");

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
                continue;
            }

            System.out.println(
                    "Número ímpar: " + i
            );
        }

        // While com break
        System.out.println("\nWhile com break:");

        int numero = 0;

        while (numero < 10) {

            numero++;

            if (numero == 6) {
                break;
            }

            System.out.println(numero);
        }

        // Do while com break
        System.out.println("\nDo while com break:");

        int valor = 0;

        do {
            valor++;

            if (valor == 4) {
                break;
            }

            System.out.println(valor);

        } while (valor < 10);

        // Loops aninhados
        System.out.println("\nLoops aninhados:");

        for (int linha = 1; linha <= 3; linha++) {

            for (int coluna = 1; coluna <= 3; coluna++) {

                System.out.println(
                        "Linha: " + linha +
                                " | Coluna: " + coluna
                );
            }
        }

        // Exemplo prático
        System.out.println("\nExemplo prático:");

        int[] valores = {5, 8, 12, 20, 25};

        for (int valorAtual : valores) {

            if (valorAtual == 20) {
                System.out.println("Valor 20 encontrado!");
                break;
            }

            if (valorAtual % 2 == 0) {
                System.out.println("Par: " + valorAtual);
                continue;
            }

            System.out.println("Ímpar: " + valorAtual);
        }
    }
}
