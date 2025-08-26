package exercicios;

// 13 - Faça algoritmo que leia o nome e a idade de uma pessoa
// e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner next = new Scanner(System.in);
        System.out.println("Informe seu nome e idade");

        String nome = next.next();
        int idade = next.nextInt();

        if(idade < 18){
            System.out.println(nome + " é menor de idade.");
        }else{
            System.out.println(nome + " é maior de idade.");
        }

    }
}
