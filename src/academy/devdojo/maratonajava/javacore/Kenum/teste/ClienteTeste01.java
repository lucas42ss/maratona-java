package academy.devdojo.maratonajava.javacore.Kenum.teste;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;


public class ClienteTeste01 {
    public static void main(String[] args){
        Cliente cliente = new Cliente("Lucas", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Alice", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente.toString());


        System.out.println(cliente2.getTipoCliente().getRelatorio());

        TipoCliente tipoCliente = TipoCliente.retornaEnum("Pessoa Jurídica");

        System.out.println(tipoCliente);

    }
}
