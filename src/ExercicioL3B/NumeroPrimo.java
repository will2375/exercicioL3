package ExercicioL3B;

import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Veja se o numero é primo: ");
        int numero = input.nextInt();
        ;
        int a = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                a++;
            }
        }
        if (a == 2) {
            System.out.println(" é primo");
        } else {
            System.out.println(" Não é primo");
        }
    }
}