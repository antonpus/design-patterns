package creational.singleton;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FileManagerTest {

    @Test
    public void singletonApi() {
        FileManager fileManager1 = FileManager.INSTANCE;
        FileManager fileManager2 = FileManager.INSTANCE;

        assertTrue(fileManager1 == fileManager2);
    }
}