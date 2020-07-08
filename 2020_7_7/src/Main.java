import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str2 = scanner.next();
            String str1 = scanner.next();
            String[] string1 = str1.split("\\.");
            String[] string2 = str2.split("\\.");
            int pay = calculate(string1);
            int collect = calculate(string2);
            int change = pay - collect;
            if(pay < collect){
                System.out.print("-");
                System.out.println(changeMoney(-change));
            }else{
                System.out.println(changeMoney(change));
            }
        }
    }

    private static String changeMoney(int change) {
        int one;
        int ten = 0;
        int hundr = 0;
        if(change >= 29){
            ten += change/29;
            change -= 29*ten;
        }
        if(ten >= 17){
            hundr += ten/17;
            ten -= 17*hundr;
        }
        one = change;

        return hundr+"."+ten+"."+one;
    }

    private static int calculate(String[] string1) {
        int add = 0;
        add += Integer.parseInt(string1[0])*17*29;
        add += Integer.parseInt(string1[1])*29;
        add += Integer.parseInt(string1[2]);
        return add;
    }
}
