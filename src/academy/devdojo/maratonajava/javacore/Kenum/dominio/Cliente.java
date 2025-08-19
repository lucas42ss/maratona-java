package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Cliente {

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;



    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento){
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome + " Tipo: " + this.tipoCliente.getRelatorio() + " Pagamento: " + this.tipoPagamento;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setTipoCliente(TipoCliente tipoCliente){
        this.tipoCliente = tipoCliente;
    }
    public TipoCliente getTipoCliente(){
        return this.tipoCliente;
    }

}
