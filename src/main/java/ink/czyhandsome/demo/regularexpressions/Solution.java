package ink.czyhandsome.demo.regularexpressions;

/**
 * Regular expression match - Recursive
 *
 * @author zycao3, 2019/2/11
 */
public class Solution {
    public boolean isMatch(String s, String p) {
        // 检测空字符串的情况
        if (p.isEmpty()) {
            return s.isEmpty();
        }
        // 读取模板第一个字符
        char pf = p.charAt(0);
        // 根据模板长度检测
        if (p.length() == 1) {
            return s.length() == 1 && matchOne(s.charAt(0), pf);
        } else {
            if (p.charAt(1) == '*') {
                return isMatch(s, p.substring(2)) ||
                        (s.length() > 0 && matchOne(s.charAt(0), pf) && isMatch(s.substring(1), p));
            } else {
                return !s.isEmpty() && matchOne(s.charAt(0), pf) && isMatch(s.substring(1), p.substring(1));
            }
        }
    }

    private boolean matchOne(char sf, char pf) {
        return pf == '.' || sf == pf;
    }
}

