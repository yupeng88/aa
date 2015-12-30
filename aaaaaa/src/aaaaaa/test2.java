package aaaaaa;

import java.math.BigDecimal;

public class test2 {

    public static void main(String[] args) {
        double d = 12345678.9012D;
        boolean f = isGreatNumber(d);
        System.out.println(f);
    }

    public static boolean isGreatNumber(Double param) {
        if (param == null) {
            return false;
        }
        BigDecimal bg = new BigDecimal(param.toString());
        String str = bg.toPlainString();
        String[] length = str.split("\\.");
        System.out.println(str);

        if (length[0].length() > 32) {
            return true;
        }
        if (length.length > 1) {
            if (length[1].length() > 6) {
                return true;
            }
            if (str.length() > 38) {
                return true;
            }
        }
        return false;
    }
}
