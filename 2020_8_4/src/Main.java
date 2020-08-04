import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String aaw = scanner.nextLine();
/*        String[] arr = a.split(" ");
        Arrays.sort(arr);
        System.out.println(arr[arr.length/2]);*/


        int y1 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int y3 = scanner.nextInt();
        int y4 = scanner.nextInt();
        float a = (y1+y3) / 2f;
        float b = (y3-y1) / 2f;
        float c = (y4-y2) / 2f;
        if((a - ((y1+y3)/2))!= 0){
            System.out.print("No");
            return;
        }
        if((b - ((y3-y1)/2)!=0)||b !=((y2+y4)/2)){
            System.out.println("No");
            return;
        }
        System.out.print((int) a + " "+(int)b +" "+(int)c);
    }
}
