/*
Salvesta uurimiseks vähemalt paarileheküljeline tekst.
* Koosta programm, mis loeks kokku, mitu kolmetähelist sõna on tekstis.
* Koosta graafik, kus ühel teljel on teksti algusest sinnamaani esinenud kolmetäheliste sõnade arv ning teisel teljel 
  selleks ajaks leitud kolmetäheliste erinevate sõnade arv.
* Võta uuringuks tunduvalt pikem tekst. Kuva joonisele sarnased graafikud 1-10 tähe pikkuste sõnade kohta. Mummukestega 
  tähista joonistele kohad, kus on läbitud veerand, pool ja kolmveerand tekstist.
*/


import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WordCounter {

    List<String> files;
    private static final String FILE_PATH = "Words.txt";
    public int threeLetterWordCounter = 0;
    public int otherLetterWordCounter = 0;

    public static void main(String[] args) {
        WordCounter abc = new WordCounter();
        abc.FileReader();
        System.out.println(abc.getFiles());
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
            System.out.println("Three letter words: " + threeLetterWordCounter);
            System.out.println("Other letter words: " + otherLetterWordCounter);
        } catch (Exception e) {
            throw new RuntimeException("Something went wrong: " + e);
        }
    }

    public boolean stringValidation(String word) {
        System.out.println(word);
        if (word.length() < 1) {
            return false;
        }
        char[] chararray = word.toCharArray();
        if (Character.isLetter(chararray[chararray.length - 1])) {
            if (word.length() == 3) {
                threeLetterWordCounter++;
            } else {
                otherLetterWordCounter++;
            }
            return word.matches("^[a-zA-Z]*$");
        }
        String wordSymbolsRemoved = new String(chararray);
        wordSymbolsRemoved = wordSymbolsRemoved.substring(0, wordSymbolsRemoved.length() - 1);
        if (wordSymbolsRemoved.length() == 3) {
            threeLetterWordCounter++;
        } else {
            otherLetterWordCounter++;
        }
        return wordSymbolsRemoved.matches("^[a-zA-Z]*$");
    }

    public List<String> getFiles() {
        return this.files;
    }
}