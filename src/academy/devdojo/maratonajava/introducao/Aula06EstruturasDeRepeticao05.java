package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args){
        double valorCarro = 37970;
        for(int parcela=(int)valorCarro; parcela>=1; parcela--){
            double valorParcela = valorCarro/parcela;
            if(valorParcela < 1000){
                continue;
            }
            System.out.println(parcela + " " + valorParcela);
        }
    }
}
