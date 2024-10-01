package JavaCore1;

//Write 3 implementations (or more) for reversing a string.
//        Input:
//String stringToRevers = "I'm going to go to school today morning."
//Output:
//        ".gninrom yadot loohcs ot og ot gniog m'I"
public class Task2 {
    public static void main(String[] args) {
        System.out.println(reverseString1("abc"));
        System.out.println(reverseString2("abc"));
        System.out.println(reverseString3("abc"));
    }

    static String reverseString1(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    static String reverseString2(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    static String reverseString3(String s) {
        StringBuffer sbuf = new StringBuffer(s);
        return sbuf.reverse().toString();
    }
}
