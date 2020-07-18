import java.util.*;
public class SD{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String[] str = scanner.nextLine().split(" ");
            for(int i = 0;i < str.length-1;i++){
                System.out.print(str[str.length-1-i]+" ");
            }
            System.out.print(str[0]);
        }
    }
}