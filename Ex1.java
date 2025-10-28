import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> temperaturas = new ArrayList<>();
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                          "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        double soma = 0;

        for (int i = 0; i < 12; i++) {
            System.out.print("Digite a temperatura média de " + meses[i] + ": ");
            double temp = input.nextDouble();
            temperaturas.add(temp);
            soma += temp;
        }

        double mediaAnual = soma / 12;
        System.out.println("\nMédia anual: " + mediaAnual);
        System.out.println("\nMeses com temperatura acima da média anual:");

        for (int i = 0; i < temperaturas.size(); i++) {
            if (temperaturas.get(i) > mediaAnual) {
                System.out.println(meses[i] + " - " + temperaturas.get(i) + "°C");
            }
        }

        input.close();
    }
}
