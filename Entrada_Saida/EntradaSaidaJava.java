//importamos o Scanner
import java.util.Scanner;

public class EntradaSaidaJava {

    public static void main(String[] args) {

        // Declaramos o Scanner como função "scanner"
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        // A variavel nome recebe o nome do usuario
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        // A variavel idade recebe a idade do usuario
        int idade = scanner.nextInt();

        if (idade < 0) {
            System.err.println("Erro: idade inválida!");
        } else {
            System.out.println("Olá, " + nome + "!");
            System.out.println("Você tem " + idade + " anos.");
        }

        // Paramos de usar o scanner e fechamos ele
        scanner.close();
    }
}
