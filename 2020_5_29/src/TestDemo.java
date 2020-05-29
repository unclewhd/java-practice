import java.util.*;

public class TestDemo {
    class X{
        Y y=new Y();
        public X(){
            System.out.print("X");
        }
    }
    class Y{
        public Y(){
            System.out.print("Y");
        }
    }
    public class Z extends X {
        Y y = new Y();

        public Z() {
            System.out.print("Z");
        }
    }
        public static void main(String[] args) {
            new Z();
        }

    public static int singleNumber(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for (Integer value:
             nums) {
            if(set.contains(value)){
                set.remove(value);
            }else{
                set.add(value);
            }
        }
        System.out.println(set);
        Iterator<Integer> it = set.iterator();
        return it.next();
    }
    public static void main4(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10_0000; i++) {
            list.add(random.nextInt(6000));
        }
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (Integer key:
             list) {
            if(map.get(key)==null){
                map.put(key,1);
            }else{
                Integer val = map.get(key);
                map.put(key,val+1);
            }
        }
    }
    public static void main2(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10_0000; i++) {
            list.add(random.nextInt(6000));
        }
        HashSet<Integer> set = new HashSet<>(list);
    }
    public static void main1(String[] args) {
/*        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10_0000; i++) {
            list.add(random.nextInt(6000));
        }
        Set<Integer> set = new HashSet<>();

        for (Integer value:list) {
            if(set.contains(value)){
                System.out.println("bad");
                return;
            }else{
                set.add(value);
            }
        }*/
/*int[] array = {1,2,3,4,54};
        System.out.println(array);*/


    }
}
