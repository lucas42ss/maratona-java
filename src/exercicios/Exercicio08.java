package exercicios;
//8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[3];
        for (int i=0; i<numeros.length; i++){
            numeros[i] = scanner.nextInt();
        }
        for (int i=0; i<numeros.length; i++){
            int a;
            for (int k=i+1; k<numeros.length; k++) {
                if (numeros[i] > numeros[k]) {
                    a = numeros[i];
                    numeros[i] = numeros[k];
                    numeros[k] = a;
                }
            }
        }
        for (int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
}
