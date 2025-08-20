package exercicios;

//3 - Faça um algoritmo que leia dois valores inteiros A e B, se
// os valores de A e B forem iguais, deverá somar os dois valores,
// caso contrário devera multiplicar A por B. Ao final de qualquer um
// dos cálculos deve-se atribuir o resultado a uma variável C e
//imprimir seu valor na tela.


import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();
        if (a == b){
            int c = a+b;
            System.out.println(c);
        }else{
            int c = a*b;
            System.out.println(c);
        }
    }
}
