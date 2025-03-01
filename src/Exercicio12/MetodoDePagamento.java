package Exercicio12;
import java.util.Scanner;

//12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
//pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.

//Tabela de Código de Condições de Pagamento
//
// 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
// 2 - À Vista no cartão de crédito, recebe 10% de desconto
// 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
// 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%

public class MetodoDePagamento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double valorDoProduto = input.nextDouble();

        System.out.println("Digite o metodo de pagamento: ");
        System.out.println("1 - À vista em Dinheiro ou Pix");
        System.out.println("2 - À vista no cartão de Crédito");
        System.out.println("3 - Parcelar em 2x");
        System.out.println("4 - Parcelar em 3x ou mais");

        int metodoDePagamento = input.nextInt();

        switch (metodoDePagamento) {
            case 1:
                double valorFinal = valorDoProduto * (1 - 15.0 / 100);
                System.out.println("O produto ficará em R$" + valorFinal);
                break;
            case 2:
                double valorFinal2 = valorDoProduto * (1 - 10.0 / 100);
                System.out.println("O produto ficará em R$" + valorFinal2);
                break;
            case 3:
                System.out.println("O produto ficará em R$" + valorDoProduto);
                break;
            case 4:
                double valorFinal3 = valorDoProduto * (1 + 10.0 / 100);
                System.out.println("O produto ficará em R$"+ valorFinal3);
                break;
            default:
                System.out.println("Opção invalida");
        }
    }
}
