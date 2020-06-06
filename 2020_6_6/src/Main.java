import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        while(scanner.hasNextInt()){
             arrayList.add(scanner.nextInt());
        }
        for (int i = 0; i < arrayList.size(); i++) {

        int count = 0;

            for (Integer integer : arrayList) {
                if (integer.equals(arrayList.get(i))) {
                    count++;

                }
            }
        }
    }

    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        int int3 = scanner.nextInt();
        int int4 = scanner.nextInt();

        int A,B,C;


        A = (int3 + int1) / 2 ;
        B = (int2 + int4) / 2 ;
        C = B - int2;

        if(-30 <=A - B && A - B <= 30||-30 <=B - C && B - C <= 30
        ||-30 <=A + B && A + B <= 30||
                -30 <=B + C && B + C <= 30){
            System.out.print("No");
        }
        if(A < 0 || B < 0 || C < 0 ){
            System.out.print("No");
        }else{
            System.out.print(A + " " + B + " " + C);
        }

    }
}
