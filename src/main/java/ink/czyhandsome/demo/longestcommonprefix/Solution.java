package ink.czyhandsome.demo.longestcommonprefix;

/**
 * 最长的共通前缀
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean allMatch = true;
        for (int i = 0; i < strs[0].length(); ++i) {
            // 读取str[0]的第i个字符
            char c = strs[0].charAt(i);
            // 查看其他str, 第i个字符是否存在且等于c
            for (int s = 1; s < strs.length; ++s) {
                String str = strs[s];
                if (str.length() <= i) {
                    allMatch = false;
                    break;
                }
                if (str.charAt(i) != c) {
                    allMatch = false;
                    break;
                }
            }
            // 根据是否全部匹配进行判断
            if (!allMatch) {
                break;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
