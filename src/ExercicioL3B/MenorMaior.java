package ExercicioL3B;
import java.util.Scanner;

public class MenorMaior {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];
            System.out.print("Digite o primeiro numero: ");
            numeros[0] = input.nextInt();
        System.out.print("Digite o segundo numero: ");
        numeros[1] = input.nextInt();
        System.out.print("Digite o terceiro numero: ");
        numeros[2] = input.nextInt();
        System.out.print("Digite o quarto numero: ");
        numeros[3] = input.nextInt();
        System.out.print("Digite o quinto numero: ");
        numeros[4] = input.nextInt();
        System.out.print("Digite o sexto numero: ");
        numeros[5] = input.nextInt();
        System.out.print("Digite o setimo numero: ");
        numeros[6] = input.nextInt();
        System.out.print("Digite o primeiro numero: ");
        numeros[7] = input.nextInt();
        System.out.print("Digite o primeiro numero: ");
        numeros[8] = input.nextInt();
        System.out.print("Digite o primeiro numero: ");
        numeros[9] = input.nextInt();
            int menor= numeros[0];
            int maior= numeros[0];
        for (int soma : numeros) {
            if (menor > soma) menor = soma;
            if (maior < soma) maior = soma;

        }
            System.out.println("O Menor numero digitado é: " + menor +", "+ "O Maior numero digitado é: " + maior);
        }

    }