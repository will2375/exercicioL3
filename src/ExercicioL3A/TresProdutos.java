package ExercicioL3A;


import java.util.Scanner;

public class TresProdutos {

    public static void main(String[] args) {

        String[] produtos = new String[3];
        Scanner input = new Scanner(System.in);
        double[] produto = new double[3];
        System.out.print("Digite o valor do produto 1: ");
        produto[0] = input.nextDouble();
        System.out.print("Digite o valor do produto 2: ");
        produto[1] = input.nextDouble();
        System.out.print("Digite o valor do produto 3: ");
        produto[2] = input.nextDouble();

        input.close();

        if (produto[0] < produto[1])
            if (produto[0] < produto[2]) {
                System.out.println("Levar produto 1");
            }
        if (produto[1] < produto[2])
            if (produto[1] < produto[0]) {
                System.out.println("Levar produto 2");
            }
        if (produto[2] < produto[1])
            if (produto[2] < produto[0])
                System.out.println("Levar produto 3");
        {


        }
    }
}
