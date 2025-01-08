import java.util.HashSet;

public class Question7 {
    public static void main(String[] args) {
        String str = "abcdefg";
        HashSet<Character> set = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (set.contains(c)) {
                System.out.println("String does not contain unique characters.");
                return;
            }
            set.add(c);
        }
        System.out.println("String contains all unique characters.");
    }
}
