package ExercicioL3B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MediaNumeros {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite quantos numeros você quer dividir: ");
        int valor = input.nextInt();
        List<Integer> numeros = new ArrayList<>(valor);
        for (int i = 0; i < valor; i++) {

            System.out.print("Digite um numero numero: ");
            numeros.add(input.nextInt());

            double soma = 0;
            for (int s =0; s < numeros.size(); s++ ) {
                soma += numeros.size();
            }
            System.out.println("A media dos numeros digitados são: " + soma  / valor);


        }
    }
}
