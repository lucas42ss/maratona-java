package exercicios;

//16 - Faça um algoritmo que leia três valores que
// representam os três lados de um triângulo e verifique
// se são válidos, determine se o triângulo é
//equilátero, isósceles ou escaleno.

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(),
            b = scanner.nextInt(),
            c = scanner.nextInt();

        if(a==b && a==c){
            System.out.println("Equilátero");
        }else if(a==b || a==c || c==b){
            System.out.println("Isóceles");
        }else{
            System.out.println("Escaleno");
        }

    }
}
