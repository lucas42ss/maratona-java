package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Animal;
import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Habitat;

public class AnimalTest01 {
    public static void main(String[] args){
        Animal animal1 = new Animal("mamífero", 4);
        Habitat habitat1 = new Habitat("Floresta Amazônica","Densa");

        animal1.setHabitat(habitat1);

        System.out.println(animal1.getHabitat());
    }
}
