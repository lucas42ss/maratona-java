package exercicios;

//1 - Faça um algoritmo que leia os valores de A, B, C e em seguida
// imprima na tela a soma entre A e B é mostre se a soma é menor que C.


import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira 3 números.");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a + b);

        if ((a + b) < c) {
            System.out.println("Soma de A e B é menor que C");
        }else if((a+b)==c){
            System.out.println("Soma de A e B é igual que C");
        }else{
            System.out.println("Soma de A e B é maior que C");
        }
    }
}
