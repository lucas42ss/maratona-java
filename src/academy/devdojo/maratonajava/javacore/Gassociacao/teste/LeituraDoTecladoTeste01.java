package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTeste01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String next = entrada.nextLine();

        System.out.println(next);

        char letra = 'A';

        while (letra != 'Z'){
            letra = entrada.next().charAt(0);
            System.out.println("Digite outra letra");
        }

    }
}
