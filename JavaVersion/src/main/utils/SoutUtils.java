package main.utils;

public class SoutUtils {
    private static final String tag = "Java --- ";

    public static void soutln(String content) {
        System.out.println(tag.concat(content));
    }

    public static void sout(String content) {
        System.out.print(content);
    }
}
