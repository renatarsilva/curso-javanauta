import java.util.Scanner;

public class conversaoTipos {
    public static void main(String[] args) {


        int numero = 10; // declara variavel
        double d = numero; // muda o tipo da variavel

        double d2 = 10.5; // declarar variavel
        int int2 = (int) d2; // muda o tipo da variavel de double pra int

        Integer numeroInteger = 10;
        String numeroString = numeroInteger.toString();

        String numeroStringDois = "1234";
        Integer numeroConvertido = Integer.parseInt(numeroStringDois);
        double numeroConvertidoDouble = Double.parseDouble(numeroStringDois);
        Long numeroConvertidoLong = Long.parseLong(numeroStringDois);
        System.out.println(numeroConvertidoDouble);

        Long numerolong = 10L;
        String numeroStringLong = numerolong.toString();



        System.out.println(d);
        System.out.println(int2);
        System.out.println(numeroString);










    }
}
