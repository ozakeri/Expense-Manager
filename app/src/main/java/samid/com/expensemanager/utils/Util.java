package samid.com.expensemanager.utils;

public class Util {


    private static String[] faNumbers = new String[]{"۰","۱","۲","۳","۴","۵","۶","۷","۸","۹"};

    public static String convert(String text) {
        if (text.length() == 0) {
            return "";
        }
        String out = "";
        int length = text.length();
        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            if ('0' <= c && c <= '9') {
                int number = Integer.parseInt(String.valueOf(c));
                out += faNumbers[number];
            } else if (c == '٫' || c == ',') {
                out += '،';
            } else {
                out += c;
            }
        }
        return out;
    }

    public static String latinNumberToPersian(String input) {
        String output = input.replaceAll("0", "٠");
        output = output.replaceAll("1", "١");
        output = output.replaceAll("2", "٢");
        output = output.replaceAll("3", "٣");
        output = output.replaceAll("4", "۴");
        output = output.replaceAll("5", "۵");
        output = output.replaceAll("6", "۶");
        output = output.replaceAll("7", "٧");
        output = output.replaceAll("8", "٨");
        output = output.replaceAll("9", "٩");
        return output;
    }

    public static Long latinNumberToPersianLong(String input) {
        String output = input.replaceAll("0", "٠");
        output = output.replaceAll("1", "١");
        output = output.replaceAll("2", "٢");
        output = output.replaceAll("3", "٣");
        output = output.replaceAll("4", "۴");
        output = output.replaceAll("5", "۵");
        output = output.replaceAll("6", "۶");
        output = output.replaceAll("7", "٧");
        output = output.replaceAll("8", "٨");
        output = output.replaceAll("9", "٩");
        return Long.valueOf(output);
    }
}
