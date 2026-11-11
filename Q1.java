
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a capacidade do tanque em litros: ");
        double capacidade = entrada.nextDouble();

        double tempoHoras = capacidade / 1000;
        int horas = (int) tempoHoras;
        int minutos = (int) Math.round((tempoHoras - horas) * 60);

        if (minutos == 60) {
            horas++;
            minutos = 0;
        }

        System.out.printf("Tempo necessário: %d:%02d horas%n", horas, minutos);

        entrada.close();
    }
}
