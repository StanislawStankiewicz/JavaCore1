package JavaCore2.CollectionsNArrays;

import java.util.HashMap;

//1. Find in Google song ""beatles yellow submarine""
//2. Save this song as String
//3. Remove all "","" , ""\n "" and convert all words to lowercase (Programmatically!)
//4. Make an array[] (not a List) from the string (array of words)
//5. Print to console word and how many times it appeared in the array"
public class Task1 {
    public static String lyrics = """
                In the town where I was born
                Lived a man who sailed to sea
                And he told us of his life
                In the land of submarines
                So we sailed on to the sun
                'Til we found a sea of green
                And we lived beneath the waves
                In our yellow submarine
                We all live in a yellow submarine
                Yellow submarine, yellow submarine
                We all live in a yellow submarine
                Yellow submarine, yellow submarine
                And our friends are all aboard
                Many more of them live next door
                And the band begins to play
                We all live in a yellow submarine
                Yellow submarine, yellow submarine
                We all live in a yellow submarine
                Yellow submarine, yellow submarine
                Full steam ahead, Mister Boatswain, full steam ahead
                Full steam ahead it is, Sergeant
                (Cut the cable, drop the cable)
                Aye-aye, sir, aye-aye
                Captain, captain
                As we live a life of ease (a life of ease)
                Every one of us (every one of us)
                Has all we need (has all we need)
                Sky of blue (sky of blue)
                And sea of green (sea of green)
                In our yellow (in our yellow)
                Submarine (submarine, aha)
                We all live in a yellow submarine
                A yellow submarine, yellow submarine
                We all live in a yellow submarine
                A yellow submarine, yellow submarine
                We all live in a yellow submarine
                Yellow submarine, yellow submarine
                We all live in a yellow submarine
                Yellow submarine, yellow submarine
                """;

    public static void main(String[] args) {
        String formatted = lyrics.replaceAll("[,()]", "")
                .replaceAll("\\n", " ")
                .toLowerCase();
        String[] words = formatted.split(" ");
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        for (HashMap.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " appears " + entry.getValue()
                    + (entry.getValue() == 1 ? " time" : " times"));
        }
    }
}