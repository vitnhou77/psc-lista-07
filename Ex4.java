import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] faixas = new int[9]; // 0-7 para faixas de 200-999, 8 para 1000+

        while (true) {
            System.out.print("Digite o valor das vendas brutas do vendedor (-1 para sair): ");
            double vendas = input.nextDouble();
            if (vendas == -1) break;

            double salario = 200 + (0.09 * vendas);

            int indice = (int)(salario / 100) - 2;
            if (indice >= 0 && indice <= 7) {
                faixas[indice]++;
            } else if (indice >= 8) {
                faixas[8]++;
            }
        }

        System.out.println("\nDistribuição dos salários:");
        System.out.println("$200 - $299: " + faixas[0]);
        System.out.println("$300 - $399: " + faixas[1]);
        System.out.println("$400 - $499: " + faixas[2]);
        System.out.println("$500 - $599: " + faixas[3]);
        System.out.println("$600 - $699: " + faixas[4]);
        System.out.println("$700 - $799: " + faixas[5]);
        System.out.println("$800 - $899: " + faixas[6]);
        System.out.println("$900 - $999: " + faixas[7]);
        System.out.println("$1000 em diante: " + faixas[8]);

        input.close();
    }
}
