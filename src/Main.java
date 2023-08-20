import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Carsdate> map = new HashMap<>();
        map.put("Tayota avensis", new Carsdate(1, 6065, 1996, "Tayota avensis", 1500000, "black"));
        map.put("Tayota Carolla", new Carsdate(2, 1998, 2000, "Tayota Carolla", 5300000, "white"));
        map.put("BMW", new Carsdate(3, 1001, 1998, "BMW", 50000000, "green"));
        System.out.println(map.entrySet());
    }
}