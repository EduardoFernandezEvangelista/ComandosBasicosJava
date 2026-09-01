import java.util.Scanner;

public class CondicionaisJava {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("        EXEMPLOS DE CONDICIONAIS");

        // If
        int idade = 20;

        if (idade >= 18) {
            System.out.println("\nIf:");
            System.out.println("Maior de idade.");
        }

        // If / Else
        int numero = 10;

        System.out.println("\nIf /else:");

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        // Else if
        double nota = 8.5;

        System.out.println("\nElse if:");

        if (nota >= 9) {
            System.out.println("Excelente!");
        } else if (nota >= 7) {
            System.out.println("Bom!");
        } else if (nota >= 5) {
            System.out.println("Regular.");
        } else {
            System.out.println("Reprovado.");
        }

        // If aninhado
        int idadeUsuario = 20;
        boolean possuiDocumento = true;

        System.out.println("\nIf aninhado:");

        if (idadeUsuario >= 18) {

            System.out.println("Usuário é maior de idade.");

            if (possuiDocumento) {
                System.out.println("Documento confirmado.");
                System.out.println("Entrada permitida.");
            } else {
                System.out.println("Documento não encontrado.");
            }

        } else {
            System.out.println("Usuário menor de idade.");
        }

        // Switch / Case / Default
        int opcao = 2;

        System.out.println("\nSwitch / Case:");

        switch (opcao) {

            case 1:
                System.out.println("Você escolheu a opção 1.");
                break;

            case 2:
                System.out.println("Você escolheu a opção 2.");
                break;

            case 3:
                System.out.println("Você escolheu a opção 3.");
                break;

            default:
                System.out.println("Opção inválida.");
        }

        // Switch Expression
        int dia = 3;

        String nomeDia = switch (dia) {

            case 1 -> "Domingo";
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            case 7 -> "Sábado";

            default -> "Dia inválido";
        };

        System.out.println("\nSwitch Expression:");
        System.out.println("Dia: " + nomeDia);

        // Switch Expression com Yield
        int numeroMes = 2;

        String resultadoMes = switch (numeroMes) {

            case 1:
                yield "Janeiro";

            case 2:
                yield "Fevereiro";

            case 3:
                yield "Março";

            default:
                yield "Mês inválido";
        };

        System.out.println("\nSwitch com Yield:");
        System.out.println("Mês: " + resultadoMes);

        // Operador ternario
        int idadeTernario = 18;

        String resultado = idadeTernario >= 18
                ? "Maior de idade"
                : "Menor de idade";

        System.out.println("\nOperador ternario:");
        System.out.println(resultado);

        // Exemplo pratico com verificação de usuario
        System.out.println("Verificação de usuario");

        System.out.print("Digite sua idade: ");
        int idadeEntrada = scanner.nextInt();

        if (idadeEntrada < 0) {

            System.out.println("Idade inválida.");

        } else if (idadeEntrada < 12) {

            System.out.println("Você é uma criança.");

        } else if (idadeEntrada < 18) {

            System.out.println("Você é adolescente.");

        } else {

            System.out.println("Você é adulto.");
        }

        scanner.close();
    }
}
