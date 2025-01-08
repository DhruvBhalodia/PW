public class Question6 {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        boolean[] alphabet = new boolean[26];

        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a'] = true;
            }
        }

        for (boolean b : alphabet) {
            if (!b) {
                System.out.println("Not a pangram.");
                return;
            }
        }
        System.out.println("The string is a pangram.");
    }
}
