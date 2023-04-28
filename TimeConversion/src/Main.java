import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String s = "07:05:45AM";
        System.out.println(timeConversion(s));
    }

    public static String timeConversion(String s) {
        String timeFormat = s.substring(s.length() - 2);
        if (timeFormat.equals("AM")) {
            s = s.replace("AM", "");
        }
        else {
            s = s.replace("PM", "");
        }

        StringBuilder result = new StringBuilder();
        String[] info = s.split(":");
        HashMap<String, String> hours = new HashMap<>();
        hours.put("01", "13"); hours.put("02", "14"); hours.put("03", "15"); hours.put("04", "16");
        hours.put("05", "17"); hours.put("06", "18"); hours.put("07", "19"); hours.put("08", "20");
        hours.put("09", "21"); hours.put("10", "22"); hours.put("11", "23"); hours.put("12", "00");

        if (timeFormat.equals("PM")) {
            if (info[0].equals("12")) {
                info[0] = "12";
                result.append(info[0]).append(':').append(info[1]).append(':').append(info[2]);
            }
            else {
                result.append(hours.get(info[0])).append(':').append(info[1]).append(':').append(info[2]);
            }
        }
        else {
            if (info[0].equals("12")) {
                result.append(hours.get(info[0])).append(':').append(info[1]).append(':').append(info[2]);
            }
            else {
                result.append(info[0]).append(':').append(info[1]).append(':').append(info[2]);
            }
        }
        return result.toString();
    }
}
