package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(int a, int b) {
        System.out.println(a + b);
    }

    public void subtraiDoisNumeros(int a, int b) {
        System.out.println(a - b);
    }

    public void multiplicaDoisNumeros(int a, int b) {
        System.out.println(a * b);
    }

    public void divideDoisNumeros(int a, int b) {
        System.out.println(a / b);
    }

    public double divideDoisDouble(double num1, double num2) {
        if (num2 != 0) return num1/num2;
        return 0;
    }
    public void imprimeDobroSoma(double num1, double num2){
        if(num2 == 0){
            System.out.println("Neste caso, não pode somar 0");
            return;
        }
        System.out.println((num1+num2) * 2);
    }
    public void trocaNumero(int num1, int num2){
        num1=40;
        num2=30;
        return;
    }
    public int somaArray(int[] numeros){
        int soma = 0;
        for(int num:numeros){
            soma += num;
        }
        return soma;
    }
    public int somaArrayVarArgs(int... numeros){
        int soma = 0;
        for(int num:numeros){
            soma += num;
        }
        return soma;
    }
}
