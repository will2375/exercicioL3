package ExercicioL3B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumerosPositivos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite quantos numeros você quer adicionar: ");
        int x = input.nextInt();
        Integer total = 0;

        List<Integer> numero = new ArrayList<>();

        for (int i = 0; i < x; i++) {
            System.out.print("Digite um numero para adicionar: ");
            int d = input.nextInt();
            if (d > 0) {
                numero.add(d);
            }
        }
            for (Integer soma : numero)
                total += soma;
            System.out.println(total);
        }
    }