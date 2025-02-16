package exercicio03;
import java.util.Scanner;

//3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,

public class Soma2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int result = 0;

        System.out.println("Enter the first number: ");
        int firstValue = input.nextInt();
        System.out.println("Enter the second number: ");
        int secondValue = input.nextInt();

        if (firstValue == secondValue){
            result = firstValue + secondValue;
        } else {
            result = firstValue * secondValue;
        }

        System.out.println(result);

    }
}
