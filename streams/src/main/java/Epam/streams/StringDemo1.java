package Epam.streams;
import java.util.*;

public class StringDemo1 {
    public static void main(String args[]) {
        List<String> list = Arrays.asList("Ada", "aaaa", "ant","get");
        list.stream().filter(n->(n.toLowerCase().equals(new StringBuilder(n).reverse().toString().toLowerCase())))
        .forEach(System.out::println); 
    
}
}