import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> arr = Stream.of(scanner.nextLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt).toList();
        int day = Integer.parseInt(scanner.next());
        int month = Integer.parseInt(scanner.next());

        int ways = 0;
        for (int i = 0; i < n; ++i) {
            if (i + month <= n) {
                List<Integer> lst = arr.subList(i,  i + month);
                int sum = 0;
                for (int num = 0; num < lst.size(); ++num) {
                    sum += lst.get(num);
                }
                if (sum == day) {
                    ++ways;
                }
            }
        }
        System.out.println(ways);
    }
}