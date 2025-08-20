package exercicios;

//5 - Faça um algoritmo que leia o valor do salário mínimo
// e o valor do salário de um usuário, calcule quantos salários mínimos esse
//usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o seu salário");
        double salarioUsuario = scanner.nextDouble();
        final double SALARIO_MINIMO = 1293.20;
        salarioUsuario = salarioUsuario / SALARIO_MINIMO;

        System.out.println("Seu salário equivale à aproximadamente " + (int) salarioUsuario + " salários mínimos.");
    }
}
