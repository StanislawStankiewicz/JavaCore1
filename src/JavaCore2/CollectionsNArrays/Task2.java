package JavaCore2.CollectionsNArrays;

import java.util.*;

import static JavaCore2.CollectionsNArrays.Task1.lyrics;

//1. Update Task #1 to use collections to count the words.  (Put song from array to List)
//2. Remove all duplicate words from the song and print to console
//3. Sort song words by String length. "
public class Task2 {
    public static void main(String[] args) {
        List<String> words = getWordList();
        // remove all duplicate words and print to console
        LinkedHashSet<String> wordsSet = new LinkedHashSet<>(words);
        wordsSet.forEach(System.out::println);
        // sort words by string length
        List<String> sortedWords = wordsSet.stream()
                .sorted(Comparator.comparingInt(String::length))
                .toList();
        sortedWords.forEach(System.out::println);
    }

    public static List<String> getWordList() {
        String[] formattedArray = lyrics.replaceAll("[,()]", "")
                .replaceAll("\\n", " ")
                .toLowerCase()
                .split(" ");
        return new ArrayList<>(Arrays.asList(formattedArray));
    }
}