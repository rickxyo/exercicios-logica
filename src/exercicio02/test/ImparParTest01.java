package exercicio02.test;

import exercicio02.domain.ImparPar;

import java.util.Scanner;

public class ImparParTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ImparPar imparPar = new ImparPar();

        System.out.println("Digite um numero");
        int result = input.nextInt();

        imparPar.verificaNumero(result);
        imparPar.verificaNumero2(result);

    }
}
