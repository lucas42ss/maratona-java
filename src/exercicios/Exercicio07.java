package exercicios;
//7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean valor1 = scanner.nextBoolean(), valor2 = scanner.nextBoolean();

        if (valor1 && valor2){
            System.out.println("VERDADEIRO");
        }else{
            System.out.println("FALSO");
        }
    }
}
