package exercicio08;
import java.util.Scanner;

//8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

public class Decrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[100];
        int count = 0;

        System.out.println("Digite números (digite um valor não numérico para parar):");

        // Lendo os números do usuário
        while (scanner.hasNextInt()) {
            if (count < numeros.length) {
                numeros[count] = scanner.nextInt();
                count++;
            } else {
                System.out.println("Limite de números atingido.");
                break;
            }
        }

        scanner.close();

        // Ordenação manual em ordem decrescente
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (numeros[j] < numeros[j + 1]) { // Troca os números se estiverem fora de ordem
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("Números em ordem decrescente:");
        for (int i = 0; i < count; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
