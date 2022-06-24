package ExercicioL3A;

import java.util.Scanner;

public class Semana {
    public static void main(String[] args) {

        String[] diaDaSemana = new String[7];
        diaDaSemana[0] = "1-Domingo";
        diaDaSemana[1] = "2-Segunda";
        diaDaSemana[2] = "3-Terça";
        diaDaSemana[3] = "3-Quarta";
        diaDaSemana[4] = "5-Quinta";
        diaDaSemana[5] = "6-sexta";
        diaDaSemana[6] = "7-sabado";

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o dia da semana desejado: ");
        int dia = input.nextInt();
        input.close();

        if (dia == 1) {
            System.out.println(diaDaSemana[0]);
        }
        if (dia == 2) {
            System.out.println(diaDaSemana[1]);
        }
        if (dia == 3) {
            System.out.println(diaDaSemana[2]);
        }
        if (dia == 4) {
            System.out.println(diaDaSemana[3]);
        }
        if (dia == 5) {
            System.out.println(diaDaSemana[4]);
        }
        if (dia == 6) {
            System.out.println(diaDaSemana[5]);
        }
        if (dia == 7) {
            System.out.println(diaDaSemana[6]);
        }
    }
}
