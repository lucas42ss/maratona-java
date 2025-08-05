package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    public Anime(String nome, String tipo, int episodios, String genero){
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }
    public Anime(String nome, String tipo, int episodios, String genero, String estudio){
        this(nome, tipo, episodios, genero);
        this.estudio = estudio;
    }
    public Anime(){
        System.out.println("teste");
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    };

    public void setEpisodios(int episodios) {
        if (episodios < 0) {
            System.out.println("Número inválido");
            return;
        };
        this.episodios = episodios;
    };

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTipo() {
        return this.tipo;
    }
    public int getEpisodios() {
        return this.episodios;
    }
    public String getNome(){
        return this.nome;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
    }

}
