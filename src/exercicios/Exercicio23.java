package exercicios;

//23 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor.
//As informações fornecidas serão: valor da hora aula, número de aulas lecionadas no
//mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.

public class Exercicio23 {
    public static void main(String[] args) {
        double horaAula = 35.80;
        int aulas = 20;

        double salario = (double)(aulas * 45/60) *horaAula * 0.92;

        System.out.println("O salário é R$ " + salario);

    }
}
