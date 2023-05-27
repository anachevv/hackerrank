import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrCount = Integer.parseInt(scanner.nextLine().trim());
        List<Integer> arr = Stream.of(scanner.nextLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).toList();
        HashMap<Integer, Integer> map = mapNumbers(arr);
        Integer type = defineType(map);

        System.out.println(type);

    }

    public static HashMap<Integer, Integer> mapNumbers(List<Integer> arr) {
        HashMap<Integer, Integer> map = new HashMap<>(){{
            put(1, 0);
            put(2, 0);
            put(3, 0);
            put(4, 0);
            put(5, 0);
        }};

        for (Integer el : arr) {
            map.replace(el, map.get(el) + 1);
        }
        return map;
    }

    public static Integer defineType(HashMap<Integer, Integer> map) {
        int max = -Integer.MAX_VALUE;
        int type = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                if (type < key) {
                    type = key;
                }
            }
        }
        return type;
    }
}
