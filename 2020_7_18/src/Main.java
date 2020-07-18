import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str1 = scanner.nextLine();
            StringBuffer str = new StringBuffer(str1);
            String str2 = scanner.nextLine();
            for(int i = 0;i < str.length()-1;i++){
                for (int j = 0; j < str2.length(); j++) {
                    if(str1.contains(str2.substring(j,j))){
                        str.delete(i,i+1);
                    }
                }
            }
            System.out.println(str);
        }

    }
}
