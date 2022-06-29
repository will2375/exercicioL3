package ExercicioL3B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o numero impar inicial:  ");
        int a = input.nextInt();
        System.out.print("Digite o numero impar final:  ");
        int b = input.nextInt();
        if (b < a){
            System.out.println("numero Invalido, Digite um numero maior que o anterior ");
        }
        Integer total = 0;

        List<Integer> numero = new ArrayList<>();
        for (int i = a; i <= b; i += 2) {
            Integer c = i;
            numero.add(c);
        }
        for (Integer soma : numero)
            total += soma;
        System.out.println(total);
    }
}