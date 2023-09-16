import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String input = scanner.nextLine();

        int output = findSubstring(input);

        System.out.println("Output : " + output);
    }

    public static int findSubstring(String str) {
        int maxSubstringLength = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int start = 0;

        for (int end = 0; end < str.length(); end++) {
            char currentChar = str.charAt(end);

            if (charIndexMap.containsKey(currentChar)) {
                start = Math.max(start, charIndexMap.get(currentChar) + 1);
            }

            charIndexMap.put(currentChar, end);
            maxSubstringLength = Math.max(maxSubstringLength, end - start + 1);
        }

        return maxSubstringLength;
    }
}
