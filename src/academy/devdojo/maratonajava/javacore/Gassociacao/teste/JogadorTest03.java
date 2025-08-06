package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Time time = new Time("Santa Cruz");

        Jogador jogador1 = new Jogador("Dênis Marques", time);
        Jogador jogador2 = new Jogador("Léo Gamalho", time);
        Jogador jogador3 = new Jogador("Brazão", time);
        Jogador jogador4 = new Jogador("Gilberto", time);

        Jogador[] jogadores = {jogador1, jogador2, jogador3, jogador4};

        time.setJogadores(jogadores);

        time.imprime();

    }
}
