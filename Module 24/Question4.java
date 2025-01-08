public class Question4 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int vowels = 0, consonants = 0, special = 0;

        for (char c : str.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1) vowels++;
                else consonants++;
            } else if (!Character.isWhitespace(c)) {
                special++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Special characters: " + special);
    }
}
