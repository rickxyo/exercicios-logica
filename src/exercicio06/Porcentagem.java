package exercicio06;

import java.util.Scanner;

//6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

public class Porcentagem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double valor = input.nextInt();

        double valorReajuste = valor + (valor * 0.05);

        System.out.println(valorReajuste);
    }
}
