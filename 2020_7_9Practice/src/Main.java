import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            double x = scanner.nextInt();
            double y = scanner.nextInt();
            double h = scanner.nextInt();
            double x1 = scanner.nextInt();
            double y1 = scanner.nextInt();
            double h1 = scanner.nextInt();
            double r = Math.sqrt(((x1-x)*(x1-x)) + ((y1-y)*(y1-y))+((h-h1)*(h-h1)));

            System.out.print(String.format("%.3f",r) + " ");

            double V = 4*Math.acos(-1)*Math.pow(r,3)/3;
            System.out.println(String.format("%.3f",V));
        }
    }
    public static void main1(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str2 = sc.next().toUpperCase();
            String str1 = sc.next().toUpperCase();
            LinkedHashSet<Character> set = new LinkedHashSet<>();
            char[] chars = str2.toCharArray();
            for(int i = 0;i < chars.length;i++){
                if(!str1.contains(String.valueOf(chars[i]))){
                    set.add(chars[i]);
                }
            }
            Object[] array = set.toArray();
            for (Object a:array) {
                System.out.print(a);
            }
        }
    }
}