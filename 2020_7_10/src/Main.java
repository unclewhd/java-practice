import java.util.*;
public class Main{
    private static int calculateMax(int[] prices) {
        int bool = 0;
        int sum = 0;
        int get = 0,push = 0;
        int count = 0;
        for(int i = 0;i < prices.length - 1;i++){
            if(prices[i+1] > prices[i]&&bool == 0){
                get = prices[i];
                bool = 1;
            }
            if(prices[i+1]<prices[i]&&bool == 1){
                push = prices[i];
                bool = 0;
                int dif = push - get;
                sum += dif;
                count++;
                if(count == 2){
                    bool = 0;
                    break;
                }
            }
        }
        if(bool == 1){
            sum += prices[prices.length-1]-get;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {3,8,5,1,7,8,2,9};
        System.out.println(calculateMax(arr));
    }
    public static void main1(String[] args){
        long n = 0;
        for(int i = 0;i<30;i++){
            n += (long)Math.pow(2,i);
        }
        System.out.print(10*30 + " ");
        System.out.print(n);
    }
}