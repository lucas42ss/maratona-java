package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisExercicio {
    public static void main(String[] args){
        float salario = 13350F;
        if((salario*12 >= 0) && (salario*12 <= 34712)){
            System.out.println("O imposto é 9,70% no valor de " + salario* 0.097);
        }else if((salario*12 > 34712) && (salario*12 <= 68507)){
            System.out.println("O imposto é  37,35% no valor de " + salario*0.3735);
        }else{
            System.out.println("O imposto é  49,50% no valor de " + salario*0.4950);
        }
    }
}
