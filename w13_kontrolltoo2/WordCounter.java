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