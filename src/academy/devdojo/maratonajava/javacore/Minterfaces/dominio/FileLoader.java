package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover{

    @Override
    public void loadData() {
        System.out.println("Carregando dados dos arquivos!");
    }

    @Override
    public void removeData() {
        System.out.println("Deletando dados dos arquivos.");
    }

    @Override
    public void permissionCheck() {
        System.out.println("Checando permissão no gerenciador de arquivos!");
    }

    public static void retriveMaxDataSize(){
        System.out.println("Dentro do retriveMaxDataSize da FileLoader");
    }
}
