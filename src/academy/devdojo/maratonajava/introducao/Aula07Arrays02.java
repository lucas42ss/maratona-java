package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args){
        String[] nomes = new String[4];
        nomes[0] = "Lucas";
        nomes[1] = "Alice";
        nomes[2] = "Eva";
        nomes[3] = "Marcos";
        for(int i=0; i<nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
