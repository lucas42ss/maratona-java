package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args){
        double valorCarro = 37970;
        for(int parcela=1; parcela<=valorCarro; parcela++){
            double valorParcela = valorCarro/parcela;
            if(valorParcela < 1000){
            break;
            }
            System.out.println(parcela + " " + valorParcela);
        }
    }
}
