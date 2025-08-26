package exercicios;

//14 - Faça um algoritmo que receba um valor A e B,
// e troque o valor de A por B e o valor de B por A
// e imprima na tela os valores.

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe dois números:");

        int a = scanner.nextInt(),
            b = scanner.nextInt(),
            c;

        c=a;
        a=b;
        b=c;

        System.out.println(a + " " + b);


    }

}
