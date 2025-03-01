package Exercicio11;

import java.util.Scanner;

public class MediaAluno2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nomeDoAluno = input.nextLine();

        System.out.println("Digite a nota 1: ");
        double nota1 = input.nextDouble();

        System.out.println("Digite a nota 2: ");
        double nota2 = input.nextDouble();

        System.out.println("Digite a nota 3: ");
        double nota3 = input.nextDouble();

        System.out.println("Digite a nota 4: ");
        double nota4 = input.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println(nomeDoAluno + " foi aprovado com a média "+ media);
        } else {
            System.out.println("REPROVADO");
        }


    }
}
