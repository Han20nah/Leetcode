package exercise1;

public class Solution {
    /**
     * Topic:Valid Palindrome
     * Determines whether the given string is a palindrome (reads the same forward and backward).
     * Considers only alphanumeric characters and ignores other characters.
     *
     * @param s The given string
     * @return true if it's a palindrome, false otherwise
     */
    public boolean isPalindrome(String s) {
        // If the string is empty, it's considered a palindrome
        if (s.isEmpty()) {
            return true;
        }

        // Initialize start and last indices
        int start = 0;
        int last = s.length() - 1;

        // Loop to check palindrome conditions
        while (start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);

            // If the starting character is not alphanumeric, move the start index forward
            if (!Character.isLetterOrDigit(currFirst)) {
                start++;
            }
            // If the ending character is not alphanumeric, move the last index backward
            else if (!Character.isLetterOrDigit(currLast)) {
                last--;
            }
            // If both starting and ending characters are alphanumeric
            else {
                // Compare lowercase characters for case-insensitive check
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    // If not equal, it's not a palindrome
                    return false;
                }
                // Move start index forward and last index backward
                start++;
                last--;
            }
        }

        // If the loop completes, it's a palindrome
        return true;
    }
}
