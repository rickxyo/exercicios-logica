package exercicio01.test;
import exercicio01.domain.Soma;
import java.util.Scanner;

//1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

public class SomaTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Soma soma = new Soma();

        System.out.println("Digite o valor de A");
        int a = input.nextInt();

        System.out.println("Digite o valor de B");
        int b = input.nextInt();

        System.out.println("Digite o valor de C");
        int c = input.nextInt();

        int result = soma.SomaDosValores(a, b);

        if (result < c){
            System.out.println("A soma entre A e B é MENOR que C");
        }else {
            System.out.println("A soma entre A e B é MAIOR que C");
        }

    }
}
