package exercicios;

//15 - Faça um algoritmo que leia o ano em que
// uma pessoa nasceu, imprima na tela quantos anos,
// meses e dias essa pessoa já viveu. Leve em
//consideração o ano com 365 dias e o mês com 30 dias.
//
//(Ex: 5 anos, 2 meses e 15 dias de vida)


import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        int[] dataHoje = new int[]{22, 9, 2025};
        Scanner next = new Scanner(System.in);
        int[] dataAnivesario = new int[3];

        int[] idade = new int[3];

        for(int i=0; i<3; i++){
            dataAnivesario[i] = next.nextInt();
            idade[i] = dataHoje[i] - dataAnivesario[i];
        }

        if ((idade[0] < 0 && idade[1] < 0) || (idade[0] < 0)){
            idade[0] += 30;
            idade[1] += 11;
        }else if(idade[1]<0){
            idade[1] += 12;
            idade[2]--;
        }

        System.out.println(idade[2] + " anos, " + idade[1] + " meses e "+idade[0]+" dias de vida");

    }
}
