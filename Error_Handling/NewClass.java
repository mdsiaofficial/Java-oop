import java.util.*;
public class NewClass {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(60);
        numbers.add(50);
        numbers.add(64);
        numbers.add(19);
        while (!numbers.isEmpty()) {
            System.out.println(numbers.remove());
        }
    }
}
