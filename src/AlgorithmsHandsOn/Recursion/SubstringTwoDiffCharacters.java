package AlgorithmsHandsOn.Recursion;
import java.util.HashMap;
import java.util.Map;

public class SubstringTwoDiffCharacters {



        public static String longestSubstringWithTwoDistinctChars(String s) {
            if (s == null || s.length() == 0) {
                return "";
            }

            int start = 0;
            int maxLen = 0;
            int distinctCount = 0;
            Map<Character, Integer> charCountMap = new HashMap<>();

            for (int end = 0; end < s.length(); end++) {
                char currentChar = s.charAt(end);
                charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar, 0) + 1);

                if (charCountMap.get(currentChar) == 1) {
                    distinctCount++;
                }

                while (distinctCount > 2) {
                    char startChar = s.charAt(start);
                    charCountMap.put(startChar, charCountMap.get(startChar) - 1);

                    if (charCountMap.get(startChar) == 0) {
                        distinctCount--;
                    }

                    start++;
                }

                if (end - start + 1 > maxLen) {
                    maxLen = end - start + 1;
                }
            }

            return s.substring(start, start + maxLen);
        }

        public static void main(String[] args) {
            // Example usage
            String input = "abcabaccc";
            String result = longestSubstringWithTwoDistinctChars(input);
            System.out.println("Longest substring with at most two distinct characters: " + result);
        }
    }


