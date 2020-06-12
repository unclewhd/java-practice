import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public int[] multiply(int[] A) {

        
    }

    public static void main(String[] args) {


    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();
        
        while (n!=0) {
            arrayList.add(n%10);
            n /= 10;
        }
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arrayList.size(); i++) {
            if(map.containsKey(arrayList.get(i))) {
                continue;
            }
            map.put(arrayList.get(i),0);
            for (int j = 0; j < arrayList.size(); j++) {
                if(arrayList.get(i).equals(arrayList.get(j))){
                    map.put(arrayList.get(i),map.get(arrayList.get(i))+1);
                }
            }
        }
        for (int i = 0; i < map.size(); i++) {
            System.out.println(map.get(i));
        }

    }
}


    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[10];
        String n = in.next();
        for(int i = 0;i<n.length();i++)
            a[n.charAt(i)-'0']++;
        for(int i = 0;i<a.length;i++)
            if(a[i]!=0)
                System.out.println(i+":"+a[i]);
    }
}