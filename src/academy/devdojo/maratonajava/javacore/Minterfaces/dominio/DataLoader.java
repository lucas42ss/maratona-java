package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    public abstract void loadData();
    default void permissionCheck(){
        System.out.println("Checando permissão na interface!");
    }
    public static final int MAX_DATA_SIZE = 50;

    public static void retriveMaxDataSize(){
        System.out.println("Dentro do retriveMaxDataSize da interface");
    }
}
