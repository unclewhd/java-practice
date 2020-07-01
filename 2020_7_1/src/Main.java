import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            Map<String, Integer> map = new LinkedHashMap<String, Integer>();
            for(int i=0; i<n; i++) {
                map.put(scanner.next(),0);
            }
            int voter = scanner.nextInt();
            int invalid = 0;
            for(int j=0; j<voter; j++) {
                String temp = scanner.next();
                if(map.get(temp) == null) {
                    invalid ++;
                } else {
                    map.put(temp,map.get(temp)+1);
                }
            }
            for(Entry entry : map.entrySet()) {
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
            System.out.println("Invalid : "+invalid);
            }

        /*Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int pow2 = (int)Math.pow(n,2);
            int sum = 0;
            while(n!=0){
                sum += n%10;
                n /= 10;
            }
            System.out.print(sum+" ");
            sum = 0;
            while(pow2!=0){
                sum+=pow2%10;
                pow2/=10;
            }
            System.out.println(sum);
        }*/
    }
}
