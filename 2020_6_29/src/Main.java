import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = scanner.nextInt();
        }

        int sumxf = 0;
        for (int i = 0; i < n; i++) {
            sumxf +=arr1[i];
        }

        double[] arr3 = new double[n];
        for (int i = 0; i < n; i++) {
            if(arr2[i]>=90&&arr2[i]<=100){
                arr3[i] = 4.0;
            }else if(arr2[i]>=85&&arr2[i]<90){
                arr3[i] = 3.7;
            }else if(arr2[i]>=82&&arr2[i]<85){
                arr3[i] = 3.3;
            }else if(arr2[i]>=78&&arr2[i]<82){
                arr3[i] = 3.0;
            }else if(arr2[i]>=75&&arr2[i]<78){
                arr3[i] = 2.7;
            }else if(arr2[i]>=72&&arr2[i]<75){
                arr3[i] = 2.3;
            }else if(arr2[i]>=68&&arr2[i]<72){
                arr3[i] = 2.0;
            }else if(arr2[i]>=64&&arr2[i]<68){
                arr3[i] = 1.5;
            }else if(arr2[i]>=60&&arr2[i]<64){
                arr3[i] = 1.0;
            }else{
                arr3[i] = 0;
            }
        }
        double sumjd = 0;
        for (int i = 0; i < n; i++) {
            sumjd += arr3[i]*arr1[i];
        }

        String sum = "";
        float num = (float)sumjd/sumxf;
        System.out.printf("%.2f",num);
/*        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        sum = decimalFormat.format(num);
        System.out.println(sum);*/
    }
}
