package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio;

public class Animal {
    private String especie;
    private int patas;
    private Habitat habitat;

    public Animal(String especie, int patas){
        this.especie = especie;
        this.patas = patas;
    }

    public Animal(String especie, int patas, Habitat habitat){
        this(especie, patas);
        this.habitat = habitat;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }
    public String getEspecie(){
        return this.especie;
    };

    public String getHabitat() {
        return habitat.getNome();
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }
}
