package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args){
        //+ - / *
        int number1 = 97;
        int number2 = 27;
        float number3 = 2.5F;
        float number4 = 250.0F;
        int number5 = 2;
        int soma = number1+number2;
        int subtracao = number1-number2;
        float divisao = number4/number3;
        int multiplicacao = number1 * number2;
        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(divisao);
        System.out.println(multiplicacao);
        //%
        int resto = number2%number5;
        System.out.println(resto);
        //++ --
        int contador = 5;
        System.out.println(--contador);
        //< > <= >= == !=
        boolean isGreaterThan = number4 >= number1;
        boolean isLessThan = number4 < number1;
        boolean isEqual = 'a' == number1;
        boolean isDifferent = number4 != number1;
        System.out.println(isGreaterThan);
        System.out.println(isLessThan);
        System.out.println(isEqual);
        System.out.println(isDifferent);
        //&& (AND) || (OR) !(NOT)
        boolean test = (number1 > number2 && number3 == number4) || !(number5 < number1);
        System.out.println(test);
        //= += -= *= /= %=
        int bonus = 1000;
        int resultado = bonus %= number1;
        int resultado2 = bonus /= number5;
        System.out.println(resultado);
        System.out.println(resultado2);

    }
}
