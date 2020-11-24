public class BinaryToString {
    public String getBinary1(double num) {
        if (num >= 1 || num <= 0) {
            return "ERROR";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(".");
        while (num > 0) {
            if (sb.length() >= 32) {
                return "ERROR";
            }
            double update = num * 2;
            if (update >= 1) {
                sb.append("1");
                num = update - 1;
            } else {
                sb.append("0");
                num = update;
            }
        }
        return sb.toString();
    }

    public String getBinary2(double num) {
        if (num >= 1 || num <= 0) {
            return "ERROR";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(".");
        double frac = 0.5;
        while (num > 0) {
            if (sb.length() >= 32) {
                return "ERROR";
            }
            if (num >= frac) {
                sb.append("1");
                num -= frac;
            } else {
                sb.append("0");
            }
            frac /= 2;
        }
        return sb.toString();
    }
}
