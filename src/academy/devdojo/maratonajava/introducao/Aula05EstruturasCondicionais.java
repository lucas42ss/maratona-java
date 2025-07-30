package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args){
        int idade = 18;
        boolean chavesMentira = true;
        boolean resultado = false;
        resultado = (idade >= 18 || !chavesMentira) ? !resultado : !!resultado;
        System.out.println(resultado);
        if(idade >= 18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
    }
}
