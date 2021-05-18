package List;

import java.util.ArrayList;
import java.util.List;

public class program {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2,"Marcos");
        System.out.println(list.size());

        for (String x: list){
            System.out.println(x);
        }
        System.out.println("----------------");
        list.removeIf(x -> x.charAt(0)== 'M');

        System.out.println(list);
        System.out.println("-------------------");
        String name =  list.stream()
                .filter(x -> x.charAt(0) == 'A')
                .findFirst()
                .orElse(null);
        System.out.println(name);


    }
}
