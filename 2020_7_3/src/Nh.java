import java.util.Scanner;

public class Nh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String password = scanner.nextLine();
            if(length(password)&& charKinds(password)&&charRepeat(password)){
                System.out.println("OK");
            }else{
                System.out.println("NG");
            }
        }
    }

    private static boolean charKinds(String password) {
        return password != null && password.length() > 8;
    }

    private static boolean charRepeat(String password) {
        int Digit = 0,lowercase = 0,uppercase = 0,others = 0;
        char[] ch = password.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]>='0'&&ch[i]<='9'){
                Digit = 1;
            }else if(ch[i]>='a'&&ch[i]<='z'){
                lowercase = 1;
            }else if(ch[i]>='A'&&ch[i]<='Z'){
                uppercase = 1;
            }else{
                others = 1;
            }
        }
        int sum = Digit+lowercase+uppercase+others;
        return sum >= 3;
    }

    private static boolean length(String password) {
        for (int i = 0; i < password.length()-2; i++) {
            String substr1 = password.substring(i,i+3);
            if(password.substring(i+1).contains(substr1)){
                return false;
            }
        }
        return true;
    }


}
