package ink.czyhandsome.demo.inttoroman;

/**
 * Integer (1-3999) to Roman
 *
 * @author zycao3, 2019/2/12
 */
class Solution {
    public String intToRoman(int num) {
        int remain = num;
        int numI = remain % 10;
        remain = (remain - numI) / 10;
        int numX = remain % 10;
        remain = (remain - numX) / 10;
        int numC = remain % 10;
        remain = (remain - numC) / 10;
        int numM = remain % 10;
        return m(numM) + c(numC) + x(numX) + i(numI);
    }

    private String m(int numM) {
        return replicate('M', numM);
    }

    private String replicate(char str, int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    private String c(int numC) {
        return mkRoman(numC, 'C', 'D', 'M');
    }

    private String mkRoman(int numC, char now, char half, char big) {
        if (numC < 4) {
            return replicate(now, numC);
        } else if (numC == 4) {
            return String.valueOf(now) + half;
        } else if (numC < 9) {
            return half + replicate(now, numC - 5);
        } else if (numC == 9) {
            return String.valueOf(now) + big;
        }
        return replicate(now, numC);
    }

    private String x(int numX) {
        return mkRoman(numX, 'X', 'L', 'C');
    }

    private String i(int numI) {
        return mkRoman(numI, 'I', 'V', 'X');
    }
}
