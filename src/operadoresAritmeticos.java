public class operadoresAritmeticos {
    public static void main(String[] args) {
        double pao = 10.50;
        double queijo = 7.00;
        double acucar = 1.00;
        double desconto = 5.00;
        int totalDiasMes = 30;

        double valorDiario = pao+queijo+acucar;
        double valorDiarioComDesconto = valorDiario - desconto;
        double valorTotalMensal = valorDiarioComDesconto * totalDiasMes;
        System.out.println("Valor total: " + valorDiarioComDesconto);
        System.out.println("Valor Total por mês: " + valorTotalMensal);

    }
}
