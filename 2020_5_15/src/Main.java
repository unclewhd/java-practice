import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String ,String> map = new HashMap<>();
        map.put("adawd","asda");
        System.out.println(map);

        System.out.println(map.get("adawd"));
        String s = map.getOrDefault("adawd","whd");
        System.out.println(s);
        Set<Map.Entry<String,String>> set = map.entrySet();
        for (Map.Entry<String,String> entry: set) {
            System.out.println(entry);
        }
        System.out.println(map.isEmpty());
        System.out.println(map.size());
    }
    public static void main1(String[] args) {
        Collection<String> collection = new ArrayList<>();
        Collection collection2 = new LinkedList();
        collection.add("bit");
        collection.add("java" );
        System.out.println(collection);
        System.out.println(collection.isEmpty());
        collection.remove("java");
        System.out.println(collection);
        System.out.println(collection.size());
        collection.add("whdoahwoida");
        System.out.println(Arrays.toString(collection.toArray()));


    }
}
