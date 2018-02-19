package creational.singleton;

public class FileManager {

    public static final FileManager INSTANCE = new FileManager();

    private FileManager() {
    }
}
