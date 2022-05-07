package neu.jia.info5100Final.question03;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        //create a hash map to store string
        Map<Character, Integer> lastOccurredCheck = new HashMap<>();

        //pointers
        int slow = 0;
        int fast = 0;
        int result = 0;

        // substring = [slow, fast];
        for (; fast < s.length(); fast++) {
            if (lastOccurredCheck.containsKey(s.charAt(fast)) && lastOccurredCheck.get(s.charAt(fast)) >= slow) {
                slow = lastOccurredCheck.get(s.charAt(fast)) + 1;
            }
            lastOccurredCheck.put(s.charAt(fast), fast);
            result = Math.max(result, fast - slow + 1);
        }
        return result;
    }
}
