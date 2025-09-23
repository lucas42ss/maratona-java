package exercicios;

//22 - Faça um algoritmo que leia dois valores inteiros A e B,
//imprima na tela o quociente e o resto da divisão inteira entre eles.

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(), b = scanner.nextInt();

        System.out.println("o quociente é "+a/b+ " e o resto é " + a%b);
    }
}
