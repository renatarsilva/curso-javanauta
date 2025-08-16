import java.util.Scanner;

public class ternario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");
        int idade = scan.nextInt();

        String permission = (idade >=18) ? "You can drive" : "You can not drive";
        System.out.println(permission);



    }
}
