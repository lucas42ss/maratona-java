package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover{

    @Override
    public void loadData(){
        System.out.println("Carregando no banco de dados!");
    }


    @Override
    public void removeData() {
        System.out.println("Removendo do banco de dados.");
    }
}
