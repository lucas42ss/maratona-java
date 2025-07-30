package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisExercicio2 {
    public static void main(String[] args) {
        int dia = 5;
        dia = (dia>7 || dia<1) ? -1 :(dia>1 && dia<6) ? 0 : 1;
        switch (dia) {
            case (0): {
                System.out.printf("Dia útil.");
                break;
            }
            case (1): {
                System.out.printf("Final de semana.");
                break;
            }
            default: {
                System.out.printf("Número inválido");
                break;
            }
        }
    }
}
