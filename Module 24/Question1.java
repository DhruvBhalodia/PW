import java.util.HashSet;

public class Question1 {
    public static void main(String[] args) {
        String str = "programming";
        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (!seen.contains(c)) {
                result.append(c);
                seen.add(c);
            }
        }
        System.out.println("String after removing duplicates: " + result);
    }
}
