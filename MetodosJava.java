import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MetodosJava {

    // Scanner utilizado para receber dados digitados pelo usuário.
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao;

        // O programa continua executando até o usuário escolher a opção 0.
        do {

            exibirCabecalho();
            exibirMenu();

            opcao = lerInteiro("Escolha uma opção: ");

            // Executa uma funcionalidade diferente conforme a opção escolhida.
            switch (opcao) {

                case 1:
                    executarOperacoesAritmeticas();
                    break;

                case 2:
                    executarOperacoesArrays();
                    break;

                case 3:
                    executarOperacoesString();
                    break;

                case 4:
                    executarMetodosMath();
                    break;

                case 5:
                    executarDataHora();
                    break;

                case 6:
                    executarCollections();
                    break;

                case 7:
                    executarRecursividade();
                    break;

                case 8:
                    demonstrarMetodosPersonalizados();
                    break;

                case 0:
                    System.out.println("\nEncerrando o programa...");
                    break;

                default:
                    System.out.println("\nOpção inválida!");
            }

            // Pausa o programa antes de voltar ao menu.
            if (opcao != 0) {
                pausar();
            }

        } while (opcao != 0);

        // Fecha o Scanner quando o programa termina.
        scanner.close();
    }

    // Exibe o título do programa.
    public static void exibirCabecalho() {

        System.out.println("\nEstudo de Métodos em Java");
    }

    // Exibe as opções disponíveis para o usuário.
    public static void exibirMenu() {

        System.out.println("1 - Operadores Aritméticos");
        System.out.println("2 - Métodos da classe Arrays");
        System.out.println("3 - Métodos da classe String");
        System.out.println("4 - Métodos da classe Math");
        System.out.println("5 - Data e Hora");
        System.out.println("6 - Collections");
        System.out.println("7 - Recursividade");
        System.out.println("8 - Métodos personalizados");
        System.out.println("0 - Sair");

        System.out.println();
    }

    // Lê um número inteiro e valida a entrada do usuário.
    public static int lerInteiro(String mensagem) {

        System.out.print(mensagem);

        // Continua solicitando um valor enquanto a entrada não for um inteiro.
        while (!scanner.hasNextInt()) {

            System.out.println("Digite um número inteiro válido.");

            // Descarta a entrada inválida.
            scanner.next();

            System.out.print(mensagem);
        }

        int numero = scanner.nextInt();

        // Consome a quebra de linha deixada pelo nextInt().
        scanner.nextLine();

        return numero;
    }


    // Lê um número decimal e valida a entrada.
    public static double lerDouble(String mensagem) {

        System.out.print(mensagem);

        while (!scanner.hasNextDouble()) {

            System.out.println("Digite um número válido.");

            scanner.next();

            System.out.print(mensagem);
        }

        double numero = scanner.nextDouble();

        // Consome a quebra de linha.
        scanner.nextLine();

        return numero;
    }


    // Lê uma linha completa de texto.
    public static String lerTexto(String mensagem) {

        System.out.print(mensagem);

        return scanner.nextLine();
    }


    // Demonstra os principais operadores aritméticos.
    public static void executarOperacoesAritmeticas() {

        System.out.println("\nOperadores Aritméticos");

        double numero1 = lerDouble("Digite o primeiro número: ");
        double numero2 = lerDouble("Digite o segundo número: ");

        // Operadores aritméticos básicos.
        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;

        System.out.println("\nSoma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);

        // Evita uma divisão por zero.
        if (numero2 != 0) {

            double divisao = numero1 / numero2;
            double resto = numero1 % numero2;

            System.out.println("Divisão: " + divisao);
            System.out.println("Resto: " + resto);

        } else {

            System.out.println("Não é possível dividir por zero.");
        }
    }


    // Demonstra alguns métodos importantes da classe Arrays.
    public static void executarOperacoesArrays() {

        System.out.println("\nMétodos da classe Arrays");

        int quantidade = lerInteiro(
                "Quantos números deseja cadastrar? "
        );

        // Cria um array com a quantidade informada pelo usuário.
        int[] numeros = new int[quantidade];

        // Preenche o array utilizando um laço de repetição.
        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = lerInteiro(
                    "Digite o número da posição " + i + ": "
            );
        }

        // Converte o array para texto para facilitar sua visualização.
        System.out.println("\nArray original:");
        System.out.println(Arrays.toString(numeros));

        // Cria uma cópia para manter o array original inalterado.
        int[] copia = Arrays.copyOf(
                numeros,
                numeros.length
        );

        // Ordena a cópia em ordem crescente.
        Arrays.sort(copia);

        System.out.println("\nArray ordenado:");
        System.out.println(Arrays.toString(copia));

        // Após ordenar, o primeiro elemento é o menor.
        System.out.println(
                "\nMenor número: " + copia[0]
        );

        // O último elemento é o maior.
        System.out.println(
                "Maior número: " +
                        copia[copia.length - 1]
        );

        int numeroBusca = lerInteiro(
                "\nDigite um número para buscar: "
        );

        // binarySearch deve ser utilizado em um array ordenado.
        int posicao = Arrays.binarySearch(
                copia,
                numeroBusca
        );

        if (posicao >= 0) {

            System.out.println(
                    "Número encontrado na posição: " +
                            posicao
            );

        } else {

            System.out.println(
                    "Número não encontrado."
            );
        }
    }


    // Demonstra métodos importantes da classe String.
    public static void executarOperacoesString() {

        System.out.println("\nMétodos da classe String");

        String texto = lerTexto(
                "Digite um texto: "
        );

        System.out.println(
                "\nQuantidade de caracteres: " +
                        texto.length()
        );

        System.out.println(
                "Maiúsculo: " +
                        texto.toUpperCase()
        );

        System.out.println(
                "Minúsculo: " +
                        texto.toLowerCase()
        );

        System.out.println(
                "Texto contém 'Java'? " +
                        texto.contains("Java")
        );

        System.out.println(
                "Texto vazio? " +
                        texto.isEmpty()
        );

        System.out.println(
                "Texto em branco? " +
                        texto.isBlank()
        );
    }


    // Demonstra métodos matemáticos da classe Math.
    public static void executarMetodosMath() {

        System.out.println("\nMétodos da classe Math");

        double numero = lerDouble(
                "Digite um número: "
        );

        System.out.println(
                "\nValor absoluto: " +
                        Math.abs(numero)
        );

        System.out.println(
                "Raiz quadrada: " +
                        Math.sqrt(numero)
        );

        System.out.println(
                "Número arredondado: " +
                        Math.round(numero)
        );

        System.out.println(
                "Floor: " +
                        Math.floor(numero)
        );

        System.out.println(
                "Ceil: " +
                        Math.ceil(numero)
        );

        System.out.println(
                "Número ao quadrado: " +
                        Math.pow(numero, 2)
        );

        System.out.println(
                "Número aleatório: " +
                        Math.random()
        );
    }


    // Demonstra métodos relacionados à data e hora.
    public static void executarDataHora() {

        System.out.println("\nData e Hora");

        // Obtém a data e hora atual.
        LocalDateTime agora = LocalDateTime.now();

        // Define como a data será exibida.
        DateTimeFormatter formato =
                DateTimeFormatter.ofPattern(
                        "dd/MM/yyyy HH:mm:ss"
                );

        System.out.println("\nData e hora atual:");

        System.out.println(
                agora.format(formato)
        );

        // Cria uma nova data adicionando sete dias.
        System.out.println("\nDaqui a 7 dias:");

        System.out.println(
                agora.plusDays(7)
                        .format(formato)
        );

        // Cria uma nova data subtraindo trinta dias.
        System.out.println("\nHá 30 dias:");

        System.out.println(
                agora.minusDays(30)
                        .format(formato)
        );
    }


    // Demonstra métodos básicos de uma Collection do tipo List.
    public static void executarCollections() {

        System.out.println("\nCollections");

        // Cria uma lista que pode ser alterada.
        List<String> nomes = new ArrayList<>();

        // Adiciona elementos.
        nomes.add("Eduardo");
        nomes.add("Java");
        nomes.add("Programação");

        System.out.println("\nLista:");

        // Executa uma ação para cada elemento.
        nomes.forEach(System.out::println);

        System.out.println(
                "\nQuantidade: " +
                        nomes.size()
        );

        System.out.println(
                "\nContém Java? " +
                        nomes.contains("Java")
        );

        // Remove um elemento da lista.
        nomes.remove("Programação");

        System.out.println(
                "\nLista após remover:"
        );

        System.out.println(nomes);
    }


    // Demonstra um método recursivo utilizando o cálculo do fatorial.
    public static void executarRecursividade() {

        System.out.println("\nRecursividade");

        int numero = lerInteiro(
                "Digite um número para calcular o fatorial: "
        );

        // Valida se o número informado é negativo.
        if (numero < 0) {

            System.out.println(
                    "Não é possível calcular fatorial negativo."
            );

            return;
        }

        long resultado = calcularFatorial(numero);

        System.out.println(
                "\nFatorial de " +
                        numero +
                        " = " +
                        resultado
        );
    }


    // Calcula o fatorial de forma recursiva.
    public static long calcularFatorial(int numero) {

        // Caso base: encerra a recursão.
        if (numero <= 1) {
            return 1;
        }

        // Chamada recursiva.
        return numero * calcularFatorial(numero - 1);
    }


    // Demonstra métodos criados pelo próprio programador.
    public static void demonstrarMetodosPersonalizados() {

        System.out.println(
                "\nMétodos Personalizados"
        );

        String nome = lerTexto(
                "Digite seu nome: "
        );

        int idade = lerInteiro(
                "Digite sua idade: "
        );

        // Chama um método void.
        apresentarPessoa(nome, idade);

        // Chama um método que retorna boolean.
        boolean maior = ehMaiorDeIdade(idade);

        System.out.println(
                "\nMaior de idade? " +
                        maior
        );

        // Chama um método que retorna String.
        String categoria =
                obterCategoriaIdade(idade);

        System.out.println(
                "Categoria: " +
                        categoria
        );

        int numero1 = lerInteiro(
                "\nDigite um número: "
        );

        int numero2 = lerInteiro(
                "Digite outro número: "
        );

        // Utiliza um método criado para realizar a soma.
        System.out.println(
                "\nSoma utilizando método: " +
                        somar(numero1, numero2)
        );

        // Utiliza um método que internamente usa Math.max().
        System.out.println(
                "Maior número: " +
                        maiorNumero(numero1, numero2)
        );
    }


    // Método void: executa uma ação, mas não retorna valor.
    public static void apresentarPessoa(
            String nome,
            int idade
    ) {

        System.out.println(
                "\nNome: " +
                        nome
        );

        System.out.println(
                "Idade: " +
                        idade
        );
    }


    // Retorna true caso a idade seja maior ou igual a 18.
    public static boolean ehMaiorDeIdade(int idade) {

        return idade >= 18;
    }


    // Retorna uma categoria de acordo com a idade recebida.
    public static String obterCategoriaIdade(int idade) {

        if (idade < 0) {
            return "Idade inválida";
        }

        if (idade < 12) {
            return "Criança";
        }

        if (idade < 18) {
            return "Adolescente";
        }

        if (idade < 60) {
            return "Adulto";
        }

        return "Idoso";
    }


    // Retorna a soma de dois números inteiros.
    public static int somar(
            int numero1,
            int numero2
    ) {

        return numero1 + numero2;
    }


    // Utiliza Math.max() para retornar o maior número.
    public static int maiorNumero(
            int numero1,
            int numero2
    ) {

        return Math.max(
                numero1,
                numero2
        );
    }


    // Aguarda o usuário pressionar ENTER antes de continuar.
    public static void pausar() {

        System.out.println(
                "\nPressione ENTER para continuar..."
        );

        scanner.nextLine();
    }
}