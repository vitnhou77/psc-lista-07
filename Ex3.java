import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        double soma = 0;

        while (true) {
            System.out.print("Digite uma nota (-1 para encerrar): ");
            double nota = input.nextDouble();
            if (nota == -1) break;
            notas.add(nota);
            soma += nota;
        }

        int quantidade = notas.size();
        if (quantidade == 0) {
            System.out.println("Nenhuma nota foi inserida.");
            return;
        }

        double media = soma / quantidade;

        System.out.println("\nQuantidade de notas lidas: " + quantidade);

        System.out.print("Notas na ordem informada: ");
        for (double n : notas) System.out.print(n + " ");

        System.out.println("\n\nNotas na ordem inversa:");
        for (int i = notas.size() - 1; i >= 0; i--) System.out.println(notas.get(i));

        System.out.println("\nSoma das notas: " + soma);
        System.out.println("Média das notas: " + media);

        int acimaMedia = 0;
        int abaixoDeSete = 0;
        for (double n : notas) {
            if (n > media) acimaMedia++;
            if (n < 7) abaixoDeSete++;
        }

        System.out.println("\nNotas acima da média: " + acimaMedia);
        System.out.println("Notas abaixo de 7: " + abaixoDeSete);
        System.out.println("\nPrograma encerrado. Obrigado!");

        input.close();
    }
}
