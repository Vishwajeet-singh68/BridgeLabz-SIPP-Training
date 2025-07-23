public class RemoveDuplicatesFromString {
    public static String removeDuplicates(String input) {
        StringBuilder sb = new StringBuilder();
        boolean[] seen = new boolean[256]; // Assuming ASCII characters
        for (char c : input.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "programming";
        System.out.println("Original: " + input);
        System.out.println("Without duplicates: " + removeDuplicates(input));
    }
} 