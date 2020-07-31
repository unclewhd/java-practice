import java.util.*;
public class Main {
/*    public static int total = 0;
    public static int drink(int n){
        if(n <2){
            return total;
        }
        if(n == 2){
            return ++total;
        }
        total = n/3;
        return drink((n/3+n%3));
    }*/

    public static int drink(int n){
        int total = 0;
        while(n > 2){
            total = n/3;
            n = n/3 +n%3;
        }
        if(n==2){
            return ++total;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(drink(n));
        }
    }
}
