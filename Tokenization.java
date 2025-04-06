import java.util.*;

public class Tokenization {
    public static void main(String[] args) {
        // List of C language keywords
        Set<String> cKeywords = new HashSet<>(Arrays.asList(
            "auto", "break", "case", "char", "const", "continue", "default", "do", "double", 
            "else", "enum", "extern", "float", "for", "goto", "if", "inline", "int", "long", 
            "register", "restrict", "return", "short", "signed", "sizeof", "static", "struct", 
            "switch", "typedef", "union", "unsigned", "void", "volatile", "while", "_Alignas", 
            "_Alignof", "_Atomic", "_Bool", "_Complex", "_Generic", "_Imaginary", "_Noreturn", 
            "_Static_assert", "_Thread_local"
        ));

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a C language code snippet:");
        String input = scanner.nextLine(); // Taking input
        // Splitting the input into words (tokens)
        String[] tokens = input.split("[^a-zA-Z_]+"); // Splitting based on non-alphabetic characters

        // Map to store the frequency of keywords
        Map<String, Integer> keywordCount = new HashMap<>();

        // Checking for keywords in tokens
        for (String token : tokens) {
            if (cKeywords.contains(token)) {
                keywordCount.put(token, keywordCount.getOrDefault(token, 0) + 1);
            }
        }

        // Displaying the result
        if (keywordCount.isEmpty()) {
            System.out.println("No C keywords found in the input.");
        } else {
            System.out.println("Keyword occurrences:");
            for (Map.Entry<String, Integer> entry : keywordCount.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

        scanner.close();
    }
}