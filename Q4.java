
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double primeiraNota = entrada.nextDouble();

        System.out.print("Informe a segunda nota: ");
        double segundaNota = entrada.nextDouble();

        System.out.print("Informe a terceira nota: ");
        double terceiraNota = entrada.nextDouble();

        double media = (primeiraNota + segundaNota + terceiraNota) / 3;

        System.out.printf("A media das notas e: %.2f%n", media);

        entrada.close();
    }
}
