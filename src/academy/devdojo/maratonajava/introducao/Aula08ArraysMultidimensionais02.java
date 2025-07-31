package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] numeros = new int[3][];
        numeros[0] = new int[1];
        numeros[1] = new int[5];
        numeros[2] = new int[3];

        numeros[0] = new int[]{16};
        numeros[1] = new int[]{56, 39, 28, 19, 74};
        numeros[2] = new int[]{95, 83,78};

        for (int[] linha:numeros){
            for (int coluna:linha){
                System.out.println(coluna);
            }
            System.out.println("-------------------------");
        }

    }
}
