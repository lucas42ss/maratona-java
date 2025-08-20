package exercicios;

//6 - Faça um algoritmo que leia um valor qualquer
// e imprima na tela com um reajuste de 5%.

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number*1.05);
    }
}
