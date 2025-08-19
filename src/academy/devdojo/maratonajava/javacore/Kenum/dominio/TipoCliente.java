package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    public final int numeracao;
    private String relatorio;

    TipoCliente(int numeracao, String relatorio) {
        this.numeracao = numeracao;
        this.relatorio = relatorio;
    }

    public String getRelatorio(){
        return this.relatorio;
    }

    public static TipoCliente retornaEnum(String tipoCliente){
        for(TipoCliente cliente:values()){
            if(cliente.getRelatorio().equals(tipoCliente)){
                return cliente;
            }
        }
        return null;
    }

}
