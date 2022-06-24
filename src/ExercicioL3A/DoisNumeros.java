package ExercicioL3A;

import java.util.Scanner;

public class DoisNumeros {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int a = input.nextInt();

        System.out.print("Digite outro numero: ");
        int b = input.nextInt();

        input.close();

        if ( a > b) {
            System.out.println("O numero " + a + " é maior que " + b);
        } else {
            System.out.println("O numero " + b + " é maior que " + a);
        }
    }
}
