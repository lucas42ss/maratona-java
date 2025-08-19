package academy.devdojo.maratonajava.javacore.Minterfaces.teste;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DataBaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] Args) {
        DataBaseLoader carregadorBD = new DataBaseLoader();
        FileLoader carregadorArquivo = new FileLoader();

        carregadorBD.loadData();
        carregadorArquivo.loadData();
        System.out.println("--------------");
        carregadorBD.removeData();
        carregadorArquivo.removeData();
        System.out.println("--------------");
        carregadorBD.permissionCheck();
        carregadorArquivo.permissionCheck();
        System.out.println("--------------");
        DataLoader.retriveMaxDataSize();
        carregadorArquivo.retriveMaxDataSize();

    }
}
