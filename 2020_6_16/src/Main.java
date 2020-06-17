import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < num.length(); i++) {
            if(num.charAt(i) != ' '){
                arrayList.add(Integer.parseInt(String.valueOf(num.charAt(i))));
            }
        }
        int min = 9;
        int count = 0;
        for (int j = 0; j < arrayList.size(); j++) {
            if(arrayList.get(j) != 0 && arrayList.get(j)<min){
                min = arrayList.get(j);
                count = j;
            }
        }
        System.out.print(min);
        arrayList.remove(count);

        Collections.sort(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i));
        }

    }
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();

        String[] str1 = num.split(" ");

        int min = 0;

while(str1.length != 0){
    for (String s : str1) {
        if ((min >= 0) && (Integer.parseInt(s) < min)) {
            min = Integer.parseInt(s);
            String tmp = null;
            tmp = s;
            s = str1[str1.length-1];
            str1[str1.length-1] = tmp;
        }
    }
    System.out.print(min);
    String[] str2 = new String[str1.length-1];
    if (str1.length - 2 >= 0) System.arraycopy(str1, 0, str2, 0, str1.length - 2);
    str1 = str2;
}

    }
    static class SubThread extends Thread {
        @Override
        public void run() {
/*
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
            System.out.println("子线程即将退出");
*/

            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main1(String[] args) throws InterruptedException {
        Thread p = new SubThread();
        System.out.println(p.getState());
        p.start();
        System.out.println(p.getState());
        while (p.isAlive()) {
            System.out.println(p.getState());
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println(p.getState());
    }
}
