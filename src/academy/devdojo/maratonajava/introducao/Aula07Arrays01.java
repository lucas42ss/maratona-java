package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        int[] idades = new int[3];
        idades[0] = 26;
        idades[1] = 27;
        idades[2] = 62;
        for(int i=0; i<idades.length; i++){
            System.out.println(idades[i]);
        }
    }
}
