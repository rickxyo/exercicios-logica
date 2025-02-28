package exercicio10;
import java.util.Scanner;

// 10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

public class MediaAluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = input.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = input.nextDouble();

        double media = nota1 + nota2 + nota3 / 3;

        System.out.println(media);
    }
}
