package exercicios;

//2 - Faça um algoritmo que calcule a quantidade de litros de combustível gastos
// em uma viagem, sabendo que o carro faz 12km com um litro. Deve-se fornecer ao
// usuário o tempo que será gasto na viagem a sua velocidade média, distância
// percorrida e a quantidade de litros utilizados para fazer a viagem.
//
//Fórmula: distância = tempo x velocidade.
//
//            litros usados = distância / 12.


public class Exercicio24 {
    public static void main(String[] args) {

        double velocidade = 120, tempo = 2;

        double distancia = velocidade * tempo;

        double litros = distancia / 12;

        System.out.println("Distancia " + distancia + "km " + litros+ " e litros de combustível ");

    }
}
