package Exercicio14;
import java.util.Scanner;

//14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.

public class TrocaValor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor A: ");
        int a = input.nextInt();

        System.out.println("Digite o valor B: ");
        int b = input.nextInt();

        int valorA = b;
        int valorB = a;

        System.out.println("O valor de A é: ");
        System.out.println(valorA);

        System.out.println("O valor de B é: ");
        System.out.println(valorB);




    }
}
