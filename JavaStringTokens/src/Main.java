import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        final String regex = "([^\\!\\,\\?\\.\\_\\'\\@\\s]+)";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(s);
        int elements = 0;
        StringBuilder result = new StringBuilder();

        while (matcher.find()) {
            ++elements;
            for (int i = 1; i <= matcher.groupCount(); i++) {
                result.append("\n").append(matcher.group(i));
            }
        }
        System.out.println(elements);
        System.out.println(result.toString().trim());
        scan.close();
    }
}
