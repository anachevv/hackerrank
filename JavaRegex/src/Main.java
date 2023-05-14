import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String regex = "^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3}).(\\d{1,3})$";

        String line = scanner.nextLine();
        while (!line.isEmpty()) {
            Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
            Matcher matcher = pattern.matcher(line);

            System.out.println(isValid(matcher));

            if (scanner.hasNextLine()) {
                line = scanner.nextLine();
            }
            else {
                break;
            }
        }
    }

    public static boolean isValid(Matcher matcher) {
        boolean flag = false;

        while (matcher.find()) {
            flag = true;
            for (int i = 1; i <= matcher.groupCount(); ++i) {
                int num = Integer.parseInt(matcher.group(i));
                if (num < 0 || num > 255) {
                    return false;
                }
            }
        }
        return flag;
    }
}
