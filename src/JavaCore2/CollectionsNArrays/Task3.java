package JavaCore2.CollectionsNArrays;

import java.util.List;

import static JavaCore2.CollectionsNArrays.Task2.getWordList;

//1. Take List<String> of song from task1
//2. Remove all world ""yellow"" and ""submarine""
//3. Print the result.
public class Task3 {
    public static void main(String[] args) {
        List<String> words = getWordList();
        words = words.stream()
                .filter((word) -> !word.equals("yellow") && !word.equals("submarine"))
                .toList();
        words.forEach(System.out::println);
    }
}
