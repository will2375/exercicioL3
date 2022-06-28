package ExercicioL3B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumerosPositivos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite quantos numeros você quer adicionar: ");
        int x = input.nextInt();
            {
                List<Integer> numero = new ArrayList<>(x);

                for (int i = 0; i < x; i++) {

                    System.out.print("Digite um numero para adicionar: ");
                    numero.add(input.nextInt());

                    System.out.println("A media dos numeros digitados são: " + numero);

                }
                {
                }
            }
        }
    }