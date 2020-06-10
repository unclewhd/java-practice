import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            arrayList.add(scanner.nextInt());
        }
        int k=arrayList.remove(arrayList.size()-1);
        Collections.sort(arrayList);
        for(int i=0; i<k-1; i++){
            System.out.print(arrayList.get(i)+" ");
        }
        System.out.println(arrayList.get(k-1));
    }
    public static void main1(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            arrayList.add(i);
        }

        if(arrayList.get(arrayList.size()-1) % 3 == 2){
            System.out.println(arrayList.size() - 1);
        }else{
            int count = 0;
            System.out.println(Delectfunc(arrayList, count));
        }
        Collections.sort(arrayList);

    }

    private static int Delectfunc(ArrayList<Integer> arrayList, int count) {
        int cur = 2;
        ArrayList<Integer> arrayList2 = new ArrayList<>();


        if(arrayList.get(arrayList.size()-1) % 3 == 2){
            return count + arrayList.size() - 1;
        }

        while(arrayList.get(arrayList.size()-1) % 3 == 1 && cur < arrayList.size()){
            arrayList2.add(arrayList.get(cur));
            cur += 2;

            if(cur == arrayList.size() - 3){
                for (Integer integer : arrayList2) {
                    arrayList.remove(integer);
                    count++;
                }
                return Delectfunc(arrayList,count);
            }
        }
        while(arrayList.get(arrayList.size()-1) % 3 == 0&& cur < arrayList.size()){
            arrayList2.add(arrayList.get(cur));
            cur += 2;
            count++;
            if(cur == arrayList.size() - 2){
                for (Integer integer : arrayList2) {
                    arrayList.remove(integer);
                    count++;
                }
                return Delectfunc(arrayList,count);
            }
        }

        return count + arrayList.size() - 1;

    }


}
