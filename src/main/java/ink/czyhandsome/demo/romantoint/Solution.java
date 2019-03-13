package ink.czyhandsome.demo.romantoint;

/**
 * 罗马数字转整数
 *
 * @author 曹子钰, 2019-03-13
 */
class Solution {
    public int romanToInt(String s) {
        int num = 0;
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            switch (c) {
                case ('I'):
                    if (i + 1 >= s.length()) {
                        ++i;
                        num += 1;
                    } else if (s.charAt(i + 1) == 'V') {
                        i += 2;
                        num += 4;
                    } else if (s.charAt(i + 1) == 'X') {
                        i += 2;
                        num += 9;
                    } else {
                        ++i;
                        num += 1;
                    }
                    break;
                case 'X':
                    if (i + 1 >= s.length()) {
                        ++i;
                        num += 10;
                    } else if (s.charAt(i + 1) == 'L') {
                        i += 2;
                        num += 40;
                    } else if (s.charAt(i + 1) == 'C') {
                        i += 2;
                        num += 90;
                    } else {
                        ++i;
                        num += 10;
                    }
                    break;
                case 'C':
                    if (i + 1 >= s.length()) {
                        ++i;
                        num += 100;
                    } else if (s.charAt(i + 1) == 'D') {
                        i += 2;
                        num += 400;
                    } else if (s.charAt(i + 1) == 'M') {
                        i += 2;
                        num += 900;
                    } else {
                        ++i;
                        num += 100;
                    }
                    break;
                case 'V':
                    num += 5;
                    ++i;
                    break;
                case 'L':
                    num += 50;
                    ++i;
                    break;
                case 'D':
                    num += 500;
                    ++i;
                    break;
                case 'M':
                    num += 1000;
                    ++i;
                    break;
                default:
                    System.err.println("Error!");
            }
        }
        return num;
    }
}
