import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    private static Map<Integer, String> task = new LinkedHashMap<>();
    public static void main(String[] args) {
        task.put(12, "1");
        task.put(222, "2");
        task.put(34, "3");
        task.put(34, "3");
        task.put(40, "4");
        task.put(5, "5");
        task.put(62, "6");
        task.put(7, "7");
        task.put(81, "8");
        task.put(902, "9");
        task.put(10, "10");
        System.out.println(task);


    }
}