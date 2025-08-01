package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros(15, 50);
        calculadora.subtraiDoisNumeros(80, 42);
        calculadora.multiplicaDoisNumeros(15, 50);
        calculadora.divideDoisNumeros(1585642, -1777);
        System.out.println(calculadora.divideDoisDouble(894985.32, 88975.33212));
        calculadora.imprimeDobroSoma(98463.8948, 7879.1116511);
        int num1 = 113;
        int num2 = 5654;
        calculadora.trocaNumero(num1, num2);
        System.out.println(num1 + " " + num2);
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(calculadora.somaArray(numeros));
        System.out.println(calculadora.somaArrayVarArgs(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}
