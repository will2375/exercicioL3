package ExercicioL3B;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero e veja seu fatorial:  ");
        int numero = input.nextInt();

        int fat = 1;

        for(int i = 2; i <= numero; i++ )
        {
            fat *= i;
        }

        System.out.println( "O fatorial de " + numero + " é igual a " + fat );
    }
}
