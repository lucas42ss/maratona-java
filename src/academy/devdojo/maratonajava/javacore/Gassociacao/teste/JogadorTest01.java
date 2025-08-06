package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Caça-rato");
        Jogador jogador2 = new Jogador("Fumagali");
        Jogador jogador3 = new Jogador("Carlinhos Bala");

        Jogador[] listaJogadores = {jogador1, jogador2, jogador3};

        for(Jogador jogador:listaJogadores){
            jogador.imprime();
        }

    }
}
