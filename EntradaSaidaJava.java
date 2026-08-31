import java.util.Scanner;

public class EntradaSaidaJava {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 0) {
            System.err.println("Erro: idade inválida!");
        } else {
            System.out.println("Olá, " + nome + "!");
            System.out.println("Você tem " + idade + " anos.");
        }

        scanner.close();
    }
}
