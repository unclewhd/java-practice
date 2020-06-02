import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (scanner.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String a = scanner.nextLine();
            String b = scanner.nextLine();

            StringBuffer d = new StringBuffer();
            d.append(b);
            for (int i = 0; i < a.toCharArray().length; i++) {
                StringBuffer c = d.insert(i,b);
                    if(reverse(c)){
                        count++;
                    }
            }
            System.out.println(count);
        }

        
    }

    private static boolean reverse(StringBuffer a) {
        for (int i = 0; i < a.toString().toCharArray().length; i++) {
            if(a.toString().toCharArray()[i] != a.toString().toCharArray()[a.toString().toCharArray().length-1-i]){
                return false;
            }
        }
        return true;

    }

}

