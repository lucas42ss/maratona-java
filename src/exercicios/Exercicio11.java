package exercicios;

// 11 - Faça um algoritmo que leia quatro notas obtidas por um aluno,
// calcule a média das notas obtidas, imprima na tela o nome do aluno e
// se o aluno foi aprovado ou reprovado. Para o aluno ser considerado
// aprovado sua média final deve ser maior ou igual a 7.

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        String nome = new String("Lucas");

        Scanner next = new Scanner(System.in);
        double notaFinal = 0;

        for(int i=0; i<4; i++){
            double a = next.nextDouble();
            notaFinal += a;
        }

        if(notaFinal/4 < 7){
            System.out.println(nome + " Reprovado");

        }else{
            System.out.println(nome + " Aprovado");
        }

    }
}
