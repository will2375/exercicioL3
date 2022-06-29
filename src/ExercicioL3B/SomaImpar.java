package ExercicioL3B;

import java.util.ArrayList;
import java.util.List;

public class SomaImpar {

    public static void main(String[] args) {

        Integer total = 0;
        List<Integer> numero = new ArrayList<>();
        for (int num = 1; num <= 99; num += 2) {

            Integer c = num;
            numero.add(c);
            System.out.println(numero);
        }
        for (Integer soma : numero)
            total += soma;
        System.out.println("A soma dos numeros é: "+total);
    }
}