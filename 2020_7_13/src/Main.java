import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            while(scanner.hasNext()){
                ArrayList<Integer> arrayList = new ArrayList<>();
                int n = scanner.nextInt();

                for (int i = 0; i < 2*n; i++) {
                    String a = scanner.next();
                    if(a.equals("1")){
                        arrayList.add(scanner.nextInt());
                    }else if(a.equals("2")){
                        int remove = scanner.nextInt();
                        arrayList.remove(remove);
                    }
                    Collections.sort(arrayList);
                    Object[] array = arrayList.toArray();
                    int sum = 0;
                    for (Object c:array) {
                        sum += (Integer) c;
                    }
                    if(sum-(Integer)array[array.length-1] > (Integer)array[array.length-1]){
                        System.out.println("Yes");
                    }else {
                        System.out.println("No");
                    }
                }

            }
    }
}