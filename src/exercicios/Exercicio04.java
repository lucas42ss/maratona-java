package exercicios;

//4 - Faça um algoritmo que receba um número inteiro
//e imprima na tela o seu antecessor e o seu sucessor.

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(--a);
        System.out.println(a+2);
    }
}
