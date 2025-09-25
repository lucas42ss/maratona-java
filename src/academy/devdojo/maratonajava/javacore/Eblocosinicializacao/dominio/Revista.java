package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Revista {
    private String nome;
    private int[] edicoes;

    {
        edicoes = new int[3];
        for (int i = 0; i<3; i++){
            edicoes[i] = i+1;
        }
        System.out.println("Dentro do bloco de inicialização");
    }
    public Revista(String nome){
        this.nome = nome;
        System.out.println("Dentro do construtor");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEdicoes() {
        return edicoes;
    }
}
