import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char a = 'a';
        a += 32;
        char b = '0';
        b += 17+32;
        System.out.println((char)(b));
       /* while(scanner.hasNext()){
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            String str = new String(str1);
            for(int i = 0;i<str1.length();i++){
                if(str1.charAt(i) == 'z'){
                    str = str1.replace(str1.charAt(i),'A');
                }
                if(str1.charAt(i)<'z'&&str1.charAt(i)>='a'){
                    str=str1.replace(str1.charAt(i), (char) (str1.charAt(i)+33));
                }
                if(str1.charAt(i)<'Z'&&str1.charAt(i)>='A'){
                    str=str1.replace(str1.charAt(i), (char) (str1.charAt(i)-31));
                }
                if(str1.charAt(i) == 'A'){
                    str=str1.replace(str1.charAt(i),'z');
                }
            }
            System.out.println(str);
            for(int i = 0;i<str2.length();i++){
                if(str2.charAt(i) == 'A'){
                    str2.replace(str2.charAt(i),'z');
                }
                if(str2.charAt(i)<='Z'&&str1.charAt(i)>'A'){
                    str2.replace(str2.charAt(i), (char) (str1.charAt(i)-33));
                }
                if(str2.charAt(i)<='z'&&str1.charAt(i)>'a'){
                    str2.replace(str2.charAt(i), (char) (str1.charAt(i)+31));
                }
                if(str2.charAt(i) == 'z'){
                    str2.replace(str2.charAt(i),'A');
                }
            }
            System.out.println(str2);
        }*/
    }
}