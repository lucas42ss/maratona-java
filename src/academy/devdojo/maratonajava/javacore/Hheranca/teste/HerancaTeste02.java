package academy.devdojo.maratonajava.javacore.Hheranca.teste;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

    //0 - Bloco de inicialização static da superclasse é executado quando JVM carregar classe
    //1 - Bloco de inicialização static da subclasse é executado quando JVM carregar classe
    //2 - Alocado espaço em memória para o objeto superclasse
    //3 - Cada atributo de superclasse é criado e inicializado com valores default ou setado.
    //4 - Bloco de inicialização da superclasse é executado quando JVM carregar classe
    //5 - Construtor da superclasse é executado
    //6 - Alocado espaço em memória para subclasse
    //7 - Cada atributo de subclasse é criado e inicializado com valores default ou setado.
    //8 - Bloco de inicialização da subclasse é executado quando JVM carregar classe.
    //9 - Construtor da subclasse é executado.


public class HerancaTeste02 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Koroviev", 500, 5000);
    }
}
