package Epam.streams;
import java.util.*;

public class AvgDemo {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<10;i++) {
            arr.add(in.nextInt());
        }
        System.out.println(arr.stream().mapToInt(Integer::intValue).average());
        in.close();
    }
}