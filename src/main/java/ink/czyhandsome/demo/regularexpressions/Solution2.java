package ink.czyhandsome.demo.regularexpressions;

/**
 * Regular expression match
 *
 * @author zycao3, 2019/2/9
 */
public class Solution2 {

    private boolean isMatch(String s, String p) {
        Boolean[][] cache = new Boolean[s.length() + 1][p.length() + 1];
        return dp(s, p, 0, 0, cache);
    }

    private boolean dp(String s, String p, int i, int j, Boolean[][] cache) {
        if (cache[i][j] != null) {
            return cache[i][j];
        }
        boolean result;
        if (j == p.length()) {
            result = i == s.length();
        } else if (p.length() - j == 1) {
            result = s.length() - i == 1 && matchOne(s.charAt(i), p.charAt(j));
        } else {
            if (p.charAt(j + 1) != '*') {
                result = i < s.length() &&
                        matchOne(s.charAt(i), p.charAt(j)) && dp(s, p, i + 1, j + 1, cache);
            } else {
                result = dp(s, p, i, j + 2, cache) ||
                        i < s.length() && matchOne(s.charAt(i), p.charAt(j)) && dp(s, p, i + 1, j, cache);
            }
        }
        cache[i][j] = result;
        return result;
    }

    private boolean matchOne(char sf, char pf) {
        return pf == '.' || sf == pf;
    }

    private static final Solution2 SOLUTION_2 = new Solution2();

    private static boolean isM(String s, String p) {
        return SOLUTION_2.isMatch(s, p);
    }

    public static void main(String[] args) {
        System.out.println(!isM("aa", "a"));
        System.out.println(isM("aa", "a*"));
        System.out.println(isM("ab", ".*"));
        System.out.println(isM("aab", "c*a*b"));
        System.out.println(!isM("mississippi", "mis*is*p*"));
        System.out.println(isM("aaa", "ab*ac*a"));
        System.out.println(!isM("a", ".*..a"));
        System.out.println(isM("aaa", "ab*a*c*a"));
        System.out.println(isM("aaaaaaaaaaaaab", "a*a*a*a*a*a*a*a*a*a*a*a*b"));
    }
}
