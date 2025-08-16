import java.sql.SQLOutput;
import java.util.Scanner;

public class entradaSaidaDeDados {
    public static void main(String[] args) {
//        System.out.println("Eu faco impressão e pulo a linha");
//        System.out.print("Eu faco a impressao na mesma linha");
//        System.out.printf("Eu faco a impressao formatada");

        Scanner scanner = new Scanner(System.in); // habilita receber o dado

        System.out.println("Olá digite o seu nome: "); // imprime na tela
        String nome = scanner.nextLine(); // entrada de dado string
        System.out.println("Seu nome é: " + nome );

        System.out.println("Digite sua idade: "); // imprime na tela
        int idade = scanner.nextInt(); // entrada de dado inteiro
        System.out.println( "Sua idade é: " + idade); // imprime a saída

        System.out.println("Digite se voce esta empregado sim(true) ou nao(false)");
        boolean empregado = scanner.nextBoolean();
        System.out.println("Voce esta empregado " + empregado);
    }
}
