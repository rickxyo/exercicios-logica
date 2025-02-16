package exercicio04;
import java.util.Scanner;

//4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

public class AntecessorSucessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = input.nextInt();

        System.out.println(number - 1);
        System.out.println(number + 1);

    }
}
