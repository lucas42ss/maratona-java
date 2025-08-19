package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoPagamento {
    DEBITO {
        @Override
        public double desconto(double valor) {
            return valor * 0.1;
        }
    },
    CREDITO {
        @Override
        public double desconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double desconto(double valor);

}