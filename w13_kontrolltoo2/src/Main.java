public class Main {

    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter("src/Words.txt", 1);
        wordCounter.FileReader();
        wordCounter.graph.GraphCreator();
    }
}
