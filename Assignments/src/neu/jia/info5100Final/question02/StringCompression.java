package neu.jia.info5100Final.question02;

import java.util.HashMap;
import java.util.Map;

public class StringCompression {
    public String compressString(String str) {
        if(str == null || str == "") return str;
        Map<Integer, Integer> countMap = getCountMap(str); //<end_idx, num>
        int newSize = getNewSize(countMap);
        char[] inputArr = getPaddedInput(str, newSize);
        return compressString(str, inputArr, countMap, str.length(), newSize);
    }

    private String compressString(String input, char[] inputArr, Map<Integer, Integer> countMap, int originLen, int newLen) {
        int slow = newLen - 1;
        int fast = originLen - 1;
        for (; fast >= 0; fast--) {
            if (countMap.containsKey(fast)) {
                char charVal = inputArr[fast];
                slow = compressCharToNumber(slow, inputArr, countMap.get(fast));
                inputArr[slow--] = input.charAt(fast);
            }
        }
        if(newLen >= input.length()) return input;
        return new String(inputArr, 0, newLen);
    }

    private int compressCharToNumber(int start, char[] input, int targetNum) {
        // 234 --> '234'
        //            s
        StringBuilder sb = new StringBuilder();
        while (targetNum != 0) {
            sb.append(targetNum % 10);
            targetNum /= 10;
        }
        // sb = '432'
        for (int i = 0; i < sb.length(); i++) {
            input[start - i] = sb.charAt(i);
        }
        return start - sb.length();
    }


    private char[] getPaddedInput(String input, int newSize) {
        int delta = newSize - input.length();
        char[] res;
        if (delta > 0) {
            res = new char[newSize];
        } else {
            res = new char[input.length()];
        }
        for (int i = 0; i < input.length(); i++) {
            res[i] = input.charAt(i);
        }
        return res;
    }

    private int getNewSize(Map<Integer, Integer> countMap) {
        int res = countMap.size();
        for (Integer value : countMap.values()) {
            int count = 0;
            while (value != 0) {
                value /= 10;
                count++;
            }
            res += count;
        }
        return res;
    }

    private Map<Integer, Integer> getCountMap(String input) {
        Map<Integer, Integer> res = new HashMap<>();
        /*
            abbcccdeee
                  f
                 s
         */
        int slow = 0;
        int count = 1;
        for (int fast = 1; fast < input.length(); fast++) {
            if (input.charAt(fast) != input.charAt(slow)) {
                slow += count;
                res.put(slow - 1, count);
                count = 1; // reset count
            } else {
                count++;
            }
        }
        res.put(input.length() - 1, count);
        return res;
    }
}
