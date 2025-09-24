package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

import java.util.Arrays;

public class Escola {
    private String nome;
    private Professor[] professores;
    public Escola(String nome){
        this.nome = nome;
    }
    public Escola(String nome, Professor[] professores){
        this.nome = nome;
        this.professores = professores;
    }
    public void imprime(){
        System.out.println(this.nome);
        if(professores == null){
            return;
        }
        for(Professor prof:professores){
            System.out.println(prof.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProfessores(Professor[] professores){
        this.professores = professores;
    }
    
}
