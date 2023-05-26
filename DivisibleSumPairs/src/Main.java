import java.util.Scanner;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lineArr = scanner.nextLine().split(" ");
        int n = Integer.parseInt(lineArr[0]);
        int k = Integer.parseInt(lineArr[1]);
        List<Integer> arr = Stream.of(scanner.nextLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt).toList();

        int pairs = 0;
        for (int i = 0; i < n; ++i) {
            List<Integer> lst = arr.subList(i + 1, arr.size());
            for (int y = 0; y < lst.size(); ++y) {
                if ((arr.get(i) + lst.get(y)) % k == 0) {
                    ++pairs;
                }
            }
        }
        System.out.println(pairs);
    }
}
