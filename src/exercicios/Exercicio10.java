package exercicios;

// 10 - Faça um algoritmo que leia três notas obtidas
// por um aluno, e imprima na tela a média das notas.

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner next = new Scanner(System.in);
        double notaFinal = 0;

        for(int i=0; i<3; i++){
            double a = next.nextDouble();
            notaFinal += a;
        }

        System.out.println(notaFinal/3);
    }
}
