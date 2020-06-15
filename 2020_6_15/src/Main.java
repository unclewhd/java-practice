import java.util.Scanner;


public class Main{

    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        System.out.println(AddLongInteger(a,b));
    }
    public static String AddLongInteger(String addend, String augend){
        long a = Long.parseLong(addend);
        long b = Long.parseLong(augend);

        long c = a + b;

        return String.valueOf(c);
    }
}




    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        long nu = Long.parseLong(a);
        String[] n = a.split(" ");
        int num = Integer.parseInt(n[0]);
        char c = n[1].charAt(0);

        int wad = 199;
        String v = String.valueOf(wad);
        for (int i = 0; i < num; i++) {
            System.out.print(c);
        }
        System.out.println();
        for (int i = 0; i < (num+1)/2 - 2; i++) {
            System.out.print(c);
            for (int j = 0; j < num-2; j++) {
                System.out.print(" ");
            }
            System.out.println(c);
        }
        for (int i = 0; i < num; i++) {
            System.out.print(c);
        }

    }
    static class SubThread extends Thread{
        @Override
        public void run(){
            printFields();
        }
    }
    public static void main1(String[] args) {
        Thread thread = new SubThread();
        thread.start();

        printFields();


    }

    private static void printFields() {
        Thread t = Thread.currentThread();
        long id = t.getId();
        System.out.println(id+t.getName());
        System.out.println(id+"     "+t.getPriority());
    }
}
