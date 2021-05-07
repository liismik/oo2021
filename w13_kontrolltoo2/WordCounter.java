import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WordCounter {

    List<String> files;
    private static final String FILE_PATH = "src/Words.txt";

    public static void main(String[] args) {
        WordCounter abc = new WordCounter();
        abc.FileReader();
        System.out.println(abc.getFiles());
    }

    public void FileReader() {
        try {
            this.files = Files.readAllLines(Path.of(FILE_PATH));
        } catch (Exception e) {
            throw new RuntimeException("Something went wrong: " + e);
        }
    }

    public List<String> getFiles() {
        return this.files;
    }
}