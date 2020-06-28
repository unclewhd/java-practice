import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            String b = scanner.nextLine();
            String[] bi = b.split(" ");

            for (int i = 0; i < n; i++) {
                if(Integer.parseInt(bi[i].trim()) < a){
                    a += Integer.parseInt(bi[i]);
                }else{
                    int tmp = Math.max(Integer.parseInt(bi[i]),a)/
                            Math.min(Integer.parseInt(bi[i]),a);
                    int y =Math.max(Integer.parseInt(bi[i]),a)/tmp;
                    a += y;
                }
            }
            System.out.println(a);
        }
    }
}
