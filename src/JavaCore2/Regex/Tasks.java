package JavaCore2.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tasks {
    public static void main(String[] args) {
        System.out.println(Task1());
        System.out.println(Task2());
        System.out.println(Task3());
        System.out.println(Task4());
        Task5().forEach(System.out::println);
    }

    // Find and return true or false if String contains orderUUID
    private static boolean Task1() {
        String s = "app=edi_adapter_converter wingtipsTrace=8faeae6709355291 INFO  OrderCreateClient - action=EDIOrderSent originalFilename=Integration_test_Contract customerName=0005084863 orderUUID=d34149d8-88ab-4791-bb0a-46c96e034200 poNum=Test_TS5155079515 lineCount=3";
        Pattern pattern = Pattern.compile("orderUUID");
        return isPatternInString(pattern, s);
    }

    // Find and return orderUUID substring from string
    private static String Task2() {
        String s = "app=edi_adapter_converter wingtipsTrace=8faeae6709355291 INFO  OrderCreateClient - action=EDIOrderSent originalFilename=Integration_test_Contract customerName=0005084863 orderUUID=d34149d8-88ab-4791-bb0a-46c96e034200 poNum=Test_TS5155079515 lineCount=3";
        Pattern pattern = Pattern.compile("orderUUID=([a-fA-F0-9-]+)");
        return getPatternFromString(pattern, s);
    }

    // Find and return user email from string
    private static String Task3() {
        String s = "test 2667843 (test_email@griddynamics.com) test 67483 some string";
        Pattern pattern = Pattern.compile("([\\w-._]*@[a-z]*.[a-z]*)");
        return getPatternFromString(pattern, s);
    }

    // find and return how many orders were created from this string
    private static int Task4() {
        String s = "app=edi_adapter_splitter wingtipsTrace=225debfbe6e5fac7 poiFileName=Integration_test_Contract INFO  LogUtils - POI file name: [Integration_test_Contract], " +
                "total number of orders successfully processed: [2]";
        Pattern pattern = Pattern.compile("total number of orders successfully processed: \\[(\\d*)]");
        return Integer.parseInt(getPatternFromString(pattern, s));
    }

    // Print to console all the words that start on 'de'.
    private static List<String> Task5() {
        String textToSearch = "When you first start to evaluate a cloud migration, the decisions to be made, stakeholders who need to be involved, it can sometimes feel overwhelming – and with good reason. A move to the cloud can take time, resources, and manpower, and while companies are nearly universally glad they made those investments, that doesn't cancel out the fact that they take strategic planning and up-front work."
                + "What do you need to plan for? Who needs to be involved (and when)? What roles and responsibilities need to be divided up? The answers vary a bit depending on your company size, the scope of your migration, and whether you have the budget (or need) for a migration partner."
                + "Below are the typical roles and responsibilities we see from successful migrations – and some tips to prepare your team for success. Because without the right team in place, missed deadlines, duplicative work, and post-migration workflow issues become much greater risks.";
        Pattern pattern = Pattern.compile("\\bde\\w*\\b");
        Matcher matcher = pattern.matcher(textToSearch);
        List<String> matchedWords = new ArrayList<>();
        while (matcher.find()) {
            matchedWords.add(matcher.group());
        }
        return matchedWords;
    }

    private static String getPatternFromString(Pattern pattern, String s) {
        Matcher matcher = pattern.matcher(s);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return "";
    }

    private static boolean isPatternInString(Pattern pattern, String s) {
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }
}
