import java.util.Scanner;

public class MSdwdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String s = scanner.next();
            char[] array = s.toCharArray();
            for (char c:s.toCharArray()) {
                String s1 = Integer.toBinaryString(c);
                String s2 = String.format("%07d",Integer.parseInt(s1));
                int count = 0;
                for (int i = 0; i < 7; i++) {
                    if(s2.charAt(i)=='1'){
                        count++;
                    }
                }
                System.out.println(count%2==0?"1"+s2:"0"+s2);
            }
        }
    }
}
