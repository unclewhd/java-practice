import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        ArrayList<Character> arr = new ArrayList<>();

        for (int i = 0; i < str1.toCharArray().length; i++) {
            for (int j = 0; j < str2.toCharArray().length; j++) {
                if(str2.toCharArray()[j] != str1.toCharArray()[i]){

                    if(j == str2.toCharArray().length - 1) {
                        arr.add(str1.charAt(i)) ;
                    }
                }else{
                    break;
                }
            }

        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
        }

    }
}
