package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];
        dias[0][0] = 40;
        dias[0][1] = 59;
        dias[0][2] = 21;
        dias[1][0] = 4;
        dias[1][1] = 94;
        dias[1][2] = 14;
        dias[2][0] = 29;
        dias[2][1] = 92;
        dias[2][2] = 67;
        for(int i=0; i<dias.length; i++){
           for (int j=0; j<dias[i].length; j++){
               System.out.println(dias[i][j]);
           }
        }
        System.out.println("-----------------------------------");

        for(int[] linha:dias){
            for(int coluna:linha){
                System.out.println(coluna);
            }
        }

    }
}
