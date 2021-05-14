import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WordCounter {

    List<String> files;
    private static String FILE_PATH;
    private int wordLength;
    public int wordLengthLetterWordCounter = 0;
    public int otherLetterWordCounter = 0;
    public Graph graph;

    public WordCounter(String file_path, int wordLength) {
        FILE_PATH = file_path;
        graph = new Graph("Ülejäänud sõnad", wordLength + " tähelised sõnad");
        this.wordLength = wordLength;
    }

    public void FileReader() {
        try {
            this.files = Files.readAllLines(Path.of(FILE_PATH));
            for (String line : this.files) {
                line.split(" ");
                for (String word : line.split((" "))) {
                    stringValidation(word);
                }
            }
            System.out.println(wordLength + " letter words total: " + wordLengthLetterWordCounter);
            System.out.println("Other letter words total: " + otherLetterWordCounter);
        } catch (Exception e) {
            throw new RuntimeException("Something went wrong: " + e);
        }
    }

    public void stringValidation(String word) {
        if (word.length() < 1) {
            return;
        }
        char[] chararray = word.toCharArray();
        int letterCounter = 0;
        for (char Char : chararray) {
            if (Character.isLetter(Char)) {
                letterCounter++;
            }
        }
        if (letterCounter == wordLength) {
            wordLengthLetterWordCounter++;
        } else {
            otherLetterWordCounter++;
        }
        graph.addValues(otherLetterWordCounter, wordLengthLetterWordCounter);
    }

    public List<String> getFiles() {
        return this.files;
    }
}
