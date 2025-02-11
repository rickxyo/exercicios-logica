package exercicio02.domain;

//2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

public class ImparPar {

   public int verificaNumero(int a){
       if (a % 2 == 0){
           System.out.println("Par");
       } else {
           System.out.println("Impar");
       }
       return a;
   }

   public int verificaNumero2(int a){
       if (a < 0){
           System.out.println("Negativo");
       } else {
           System.out.println("Positivo");
       }
       return a;
   }
}
