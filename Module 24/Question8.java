import java.util.HashMap;

public class Question8 {
    public static void main(String[] args) {
        String str = "sampleprogram";
        HashMap<Character, Integer> charCount = new HashMap<>();
        char maxChar = ' ';
        int maxCount = 0;

        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            if (charCount.get(c) > maxCount) {
                maxCount = charCount.get(c);
                maxChar = c;
            }
        }

        System.out.println("Maximum occurring character: " + maxChar + " (occurs " + maxCount + " times)");
    }
}
