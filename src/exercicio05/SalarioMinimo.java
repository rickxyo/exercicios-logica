package exercicio05;

import java.util.Scanner;

public class SalarioMinimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario;
        double salarioMinimo = 1293.20;
        int resultado = 0;

        System.out.println("Digite o salario do usuario: ");
        salario = input.nextInt();

        if (salario > salarioMinimo) {
           for(int i = 1; salario > salarioMinimo; i++){
               salario = salario - salarioMinimo;
               resultado = i;
            }
        }
        System.out.println(resultado);
    }
}
