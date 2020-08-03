import java.util.*;
public class Main {
    static int[] weight;
    static int N;
    static int count = 0;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            N = input.nextInt();
            weight = new int[N];

            for (int i = 1; i <= N; i++) {
                weight[i] = input.nextInt();
            }

            count(40,N);
        }
    }

    private static void count(int i, int n) {
        if(i == 0){
            count++;
            return;
        }
        if(i < 0 || i>0 && n <1){
            return;
        }else{
            count(i-weight[n-1],n);
            count(i,n-1);
        }
    }

}
