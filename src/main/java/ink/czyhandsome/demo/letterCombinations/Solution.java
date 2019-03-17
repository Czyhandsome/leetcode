package ink.czyhandsome.demo.letterCombinations;

import java.util.*;

/**
 * 电话号码可能的组合
 */
class Solution {
    private static final Map<Character, String> phone = new HashMap<Character, String>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};

    List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return Collections.emptyList();
        }
        List<String> result = new LinkedList<>();
        backTrack("", digits, result);
        return result;
    }

    private void backTrack(String combination, String nextDigits, List<String> result) {
        if (nextDigits.isEmpty()) {
            result.add(combination);
        } else {
            String nums = phone.get(nextDigits.charAt(0));
            for (int i = 0; i < nums.length(); i++) {
                backTrack(combination + nums.charAt(i), nextDigits.substring(1), result);
            }
        }
    }
}
