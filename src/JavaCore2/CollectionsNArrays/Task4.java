package JavaCore2.CollectionsNArrays;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static JavaCore2.CollectionsNArrays.Task1.lyrics;

//1. Save song ""beatles yellow submarine"" to txt file
//2. Read song from file (serialization, use a try with resources)
//3. Define a custom exception : BeatlesException extending Exception, add a ""Beatles"" to a caught exception message
//4. Create a method which verifies if some random string (ex: ""Show must go on!"") can be found in song above
//5. Throw BeatlesException defined above if a given random string is not found in your song text."
public class Task4 {
    static Path filePath = Path.of("lyrics.txt");

    public static void main(String[] args) throws IOException {
        // write to txt
        Files.writeString(filePath, lyrics);
        // read from txt
        String readString = Files.readString(filePath);
        // test read txt
        System.out.println(readString.equals(lyrics));
        // test beatles exception
        try {
            isSequenceInString("beatles", readString);
        } catch (BeatlesException e) {
            System.out.println("Sequence not in string");
        }
    }

    private static boolean isSequenceInString(String sequence, String s) throws BeatlesException {
        if (!s.contains(sequence)) {
            throw new BeatlesException();
        }
        return true;
    }

    public static class BeatlesException extends Exception {
    }
}
