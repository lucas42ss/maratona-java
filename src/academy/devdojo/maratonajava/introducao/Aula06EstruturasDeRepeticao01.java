package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for
        int count = 0;
        while(count < 15){
            ++count;
            System.out.println(count);
        }
        count = 0;
        do{
            count++;
            System.out.println(count);
        }while(count < 30);
        for(int i=0; i<count; i++){
            System.out.println(i);
        }
    }
}
