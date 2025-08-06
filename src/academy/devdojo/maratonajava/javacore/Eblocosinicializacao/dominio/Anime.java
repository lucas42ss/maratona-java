package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios = {};

    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime() {

        for (int ep : episodios) {
            System.out.println(ep);
        }
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
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
