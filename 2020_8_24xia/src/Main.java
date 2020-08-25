import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"hello");
        map.put(1,"Hellp");
        map.put(3,"java");
        map.put(2,"Bit");
        System.out.println(map);
        for (Map.Entry<Integer,String> entry:map.entrySet()) {
            System.out.println(entry);
        }

        Set<String> set = new HashSet<>();
        set.add("123");
        set.add("123");
        set.add("123134");
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
