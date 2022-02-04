package neu.jia.assignment01;

import java.util.HashMap;

//Question 4: Write a program to check if two strings are anagrams.
// Anagrams are strings which can be made by rearranging characters in string.
public class StringAnagrams {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        for (char c : t.toCharArray()) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) - 1);
            }
        }

        for (Character c : charCount.keySet()) {
            if (charCount.get(c) != 0) {
                return false;
            }
        }
        return true;
    }
}
