package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String tipo;
    private int episodios;

    public void setTipo(String tipo){
        this.tipo = tipo;
    };
    public void setEpisodios(int episodios){
        if (episodios<0) {
            System.out.println("Número inválido");
            return;
        };
        this.episodios = episodios;
    };

    public String getTipo(){
        return this.tipo;
    }
    public int getEpisodios(){
        return this.episodios;
    }

}
