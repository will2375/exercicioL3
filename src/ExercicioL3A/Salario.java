package ExercicioL3A;

import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do salario: ");
        double valor = input.nextDouble();

        input.close();

        double aumentoa = (valor * 0.2);
        double aumentob = (valor * 0.15);
        double aumentoc = (valor * 0.10);
        double aumentod = (valor * 0.05);

        if (valor < 280) {
            System.out.println(aumentoa + valor);
        } else if (valor > 280 && valor < 700) {
            System.out.println(aumentob + valor);
        } else if (valor >= 700 && valor < 1500) {
            System.out.println(aumentoc + valor);
        } else {
            System.out.println(aumentod + valor);

        }
    }
}
