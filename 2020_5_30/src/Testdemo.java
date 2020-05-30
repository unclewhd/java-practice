import java.util.HashSet;

class Solution{
    public int numJewelsInStone(String J,String s){
        HashSet<Character> set = new HashSet<>();
        for (char j:J.toCharArray()) {
            set.add(j);
        }
        int a = 0;
        for (char S:s.toCharArray()) {
            if(set.contains(s)){
                a++;
            }
        }
      return a;
    }

    public void ain(){
        String excepted = "121313";
        String actual = "1212";
        HashSet<Character> setActual = new HashSet<>();
        for (char s:actual.toUpperCase().toCharArray()) {
            setActual.add(s);
        }
        HashSet<Character> BrokeActual = new HashSet<>();
        for (char e:excepted.toUpperCase().toCharArray()) {
            if(setActual.contains(e) && !BrokeActual.contains(e)){
                System.out.println(e);
                BrokeActual.add(e);
            }
        }
    }
}

public class Testdemo {
    public static void main1(String[] args) {
        String s1="abc"+"def";//1
        String s2=new String(s1);//2
        if(s1.equals(s2))//3
            System.out.println(".equals succeeded");//4
        if(s1==s2)//5
            System.out.println("==succeeded");//6
    }
}
