package ExercicioL3A;

import java.util.Scanner;

public class MediaAluno {

    public static void main(String[] args) {

        String[] media = new String[2];
        Scanner input = new Scanner(System.in);
        double[] notas = new double[2];
        System.out.print("Digite a nota 1: ");
        notas[0] = input.nextDouble();
        System.out.print("Digite a nota 2: ");
        notas[1] = input.nextDouble();

        input.close();

        double calculo = ((notas[0] + notas[1]) / 2);

        if (calculo >= 7) {
            System.out.println("Aprovado");
        }
        if (calculo < 7) {
            System.out.println("reprovado");
        }
        if (calculo == 10) {
            System.out.println("Aprovado Com Distinção");
        }
    }
}
