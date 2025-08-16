import java.util.Scanner;

public class estruturaIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you??");
        int idade = scan.nextInt();

        System.out.println("Do you have ID?");
        boolean hasID = scan.nextBoolean();

        if (idade >=18 && hasID == true){
            System.out.println("You can drive! ");
        } else {
            System.out.println("You can not drive!");
        }
    }
}
