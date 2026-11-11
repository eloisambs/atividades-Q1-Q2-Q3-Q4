
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o valor da compra: ");
        double valorCompra = entrada.nextDouble();

        System.out.print("Informe a porcentagem de desconto: ");
        double percentualDesconto = entrada.nextDouble();

        double valorDesconto = valorCompra * percentualDesconto / 100;
        double valorFinal = valorCompra - valorDesconto;

        System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Valor final da compra: R$ %.2f%n", valorFinal);

        entrada.close();
    }
}
