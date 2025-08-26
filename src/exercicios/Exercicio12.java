package exercicios;

// 12 - Faça um algoritmo que leia o valor de um produto e
// determine o valor que deve ser pago, conforme a escolha da forma de pagamento
// pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os
// códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
//
// Tabela de Código de Condições de Pagamento
//
// 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
//
// 2 - À Vista no cartão de crédito, recebe 10% de desconto
//
// 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
//
// 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner next = new Scanner(System.in);
        System.out.println("Informe o valor do produto");

        double valorProduto = next.nextDouble();

        System.out.println("1 - À Vista em Dinheiro ou Pix");
        System.out.println("2 - À Vista no cartão de crédito");
        System.out.println("3 - Parcelado no cartão em duas vezes");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais");

        int opcao = next.nextInt();

        switch (opcao){
            case 1:{
                System.out.println(valorProduto*0.85);
                return;
            }
            case 2:{
                System.out.println(valorProduto*0.90);
                return;
            }
            case 3:{
                System.out.println(valorProduto);
                return;
            }
            case 4:{
                System.out.println(valorProduto*1.1);
                return;
            }
            default:{
                return;
            }
        }



    }
}
