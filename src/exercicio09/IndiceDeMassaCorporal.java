package exercicio09;
import java.util.Scanner;

//9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição

public class IndiceDeMassaCorporal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o peso: ");
        double peso = input.nextDouble();

        System.out.println("Digite a altura: ");
        double altura = input.nextDouble();


        double calculoImc = peso / Math.pow(altura, 2);
        System.out.println(calculoImc);


        if (calculoImc < 18.5){
            System.out.println("Abaixo do peso");
        } else if (calculoImc >= 18.6 && (calculoImc <= 24.9)) {
            System.out.println("Peso ideal (parabéns)");
        } else if (calculoImc >= 25.0 && (calculoImc <= 29.9)) {
            System.out.println("Levemente acima do peso");
        } else if (calculoImc >= 30.6 && (calculoImc <= 34.9)) {
            System.out.println("Obesidade grau I");
        } else if (calculoImc >= 35.0 && (calculoImc <= 39.9)) {
            System.out.println("Obesidade grau II (severa)");
        } else {
            System.out.println("Obesidade grau III (mórbida");
        }


    }
}
