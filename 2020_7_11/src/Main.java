/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        HashMap<Character,Integer> map = new LinkedHashMap<>();
        for(char i = 65; i <= 90;i++){
            map.put(i,0);
        }
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str1 = sc.nextLine();
            for(int i = 0;i <str1.length();i++){
                if(str1.charAt(i)<='Z'&&str1.charAt(i)>='A'){
                    int count= map.get(str1.charAt(i));
                    count++;
                    map.replace(str1.charAt(i),count);
                }
            }
            for(char i = 65;i<=90;i++){
                System.out.print(i+":");
                System.out.println(map.get(i));
            }
        }

    }
}*/

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int sum = 0;
            int count = 1;
            String str16 = sc.nextLine();
            String[] array = str16.to;
            for(int i = array.length-1;i>=0+2;i--){
                if(array[i].equals("A")){
                    array[i] = "10";
                }else if(array[i] =="B"){
                    array[i] = 11;
                }else if(array[i] == 'C'){
                    array[i] = 12;
                }else if(array[i] == 'D'){
                    array[i] = 13;
                }else if(array[i] == 'E'){
                    array[i] = 14;
                }else if(array[i] == 'F'){
                    array[i] = 15;
                }else {
                    System.out.println(String.valueOf(array[i]));
                }

                sum+= array[i]*count;

                count*=16;
            }
            System.out.println(sum);
        }
    }
}