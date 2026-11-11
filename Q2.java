
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double precoLitro = 6.69;

        System.out.print("Informe o valor do abastecimento: R$ ");
        double valorAbastecimento = entrada.nextDouble();

        double litros = valorAbastecimento / precoLitro;

        System.out.printf("Litros abastecidos: %.4f litros%n", litros);

        entrada.close();
    }
}
