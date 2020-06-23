package Epam.streams;
import java.util.*;

public class StringDemo {
    public static void main(String args[]) {
        List<String> list = Arrays.asList("app", "are", "ant","get");
        list.stream().filter(n->(n.length()==3)).filter(n->(n.charAt(0)=='a')).filter(n->(Character.isLowerCase(n.charAt(0)))).filter(n->(n.charAt(0)=='a')).forEach(System.out::println); 
    }
}