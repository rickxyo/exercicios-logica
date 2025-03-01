package Exercicio13;
import java.util.Scanner;

// 13 - Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa e se ela é maior ou menor de idade. 

public class MaiorOuMenorDeIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = input.nextInt();

        if (idade >= 18) {
            System.out.println(nome + " é maior de idade");
        } else {
            System.out.println(nome + " é menor de idade");
        }
    }
}
