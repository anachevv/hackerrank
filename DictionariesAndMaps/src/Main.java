import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        HashMap<String, String> info = new HashMap<>();

        for (int i = 0; i < n; ++i) {
            String[] curr = scanner.nextLine().split(" ");
            String name = curr[0];
            String phone = curr[1];
            info.put(name, phone);
        }
        while (scanner.hasNext()) {
            String s = scanner.next();
            if (info.containsKey(s)) {
                System.out.println(s + "=" + info.get(s));
            }
            else {
                System.out.println("Not found");
            }
        }
        scanner.close();
    }
}
