import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int count = 0;
            int tmp = n;
            while(tmp!= 0){
                tmp /= 10;
                count++;
            }
            if(Math.pow(n,2)%Math.pow(10,count)==n){
                System.out.println("Yes!");
            }else{
                System.out.println("No!");
            }
        }
    }
}
