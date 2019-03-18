package ink.czyhandsome.demo.generateparentheses;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Generate Parentheses
 */
class Solution {
    List<String> generateParenthesis(int n) {
        if (n <= 0) {
            return Collections.emptyList();
        }
        List<String> result = new LinkedList<>();
        doGenerateParentheses(n, 0, 0, "", result);
        return result;
    }

    private void doGenerateParentheses(int n, int pre, int post, String str, List<String> result) {
        if (pre == n && post == n) {
            result.add(str);
        } else {
            if (pre < n) {
                doGenerateParentheses(n, pre + 1, post, str + "(", result);
            }
            if (post < pre) {
                doGenerateParentheses(n, pre, post + 1, str + ")", result);
            }
        }
    }
}


