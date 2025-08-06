package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios = {};

    //0 - Bloco de inicialização é executado quando JVM carregar classe
    //1 - Alocado espaço em memória pro objeto
    //2 - Cada atributo de classe é criado e inicializado com valores default ou setado.
    //3 - Bloco de inicialização é executado.
    //4 - Construtor é executado.
    static {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime() {

        for (int ep : Anime.episodios) {
            System.out.print(ep + " ");
        }
        System.out.println();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public String getNome() {
        return nome;
    }
}
