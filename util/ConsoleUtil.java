package calculate.util;

public final class ConsoleUtil {
    public static void print(String string) {
        System.out.print(string);
    }

    public static void printFormat(String template, Object... value) {
        System.out.println(String.format(template, value));
    }
}
