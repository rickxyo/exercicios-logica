package exercicio07;
import java.util.Scanner;

//7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

public class Booleano {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        boolean x;

        System.out.println("Enter number 1: ");
        number1 = input.nextInt();

        System.out.println("Enter number 2: ");
        number2 = input.nextInt();

        if (number1 > 10 && (number2 > 10)){
            System.out.println("Os valores são verdadeiros");
        } else if (number1 > 10 && (number2 < 10)){
            System.out.println("O valor 1 é verdadeiro");
            System.out.println("O valor 2 é falso");
        } else if (number2 > 10 && (number1 < 10)) {
            System.out.println("O valor 2 é verdadeiro");
            System.out.println("O valor 1 é falso");
        } else {
            System.out.println("Ambos os valores são falsos");
        }

    }
}
