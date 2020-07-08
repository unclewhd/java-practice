import java.util.Scanner;
public class Main {
    public static void main1(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int awin = 0, alos = 0;
            int aC = 0, aJ = 0, aB = 0;
            int equ = 0;
            int N = scanner.nextInt();
            String[] array = new String[2 * N];
            for (int i = 0; i < 2 * N; i++) {
                array[i] = scanner.next();
            }
            for (int i = 1; i < N; i += 2) {
                if (array[i - 1].equals("C") && array[i].equals("J")) {
                    awin++;
                    aC++;
                } else if (array[i - 1].equals("C") && array[i].equals("B")) {
                    alos++;
                } else if (array[i - 1].equals("J") && array[i].equals("B")) {
                    awin++;
                    aJ++;
                } else if (array[i - 1].equals("J") && array[i].equals("S")) {
                    alos++;
                } else if (array[i - 1].equals("B") && array[i].equals("S")) {
                    awin++;
                    aB++;
                } else if (array[i - 1].equals("B") && array[i].equals("J")) {
                    alos++;
                } else {
                    equ++;
                }
            }
            System.out.print(awin + " " + equ + " " + alos);
            System.out.println();
            System.out.print(alos + " " + equ + " " + awin);
            System.out.println();
            if (Math.max(Math.max(aC, aJ), aB) == aC) {
                System.out.print("C" + " ");
            } else if (Math.max(Math.max(aC, aJ), aB) == aJ) {
                System.out.print("J" + " ");
            } else {
                System.out.print("B" + " ");
            }
            if (Math.min(Math.min(aC, aJ), aB) == aB) {
                System.out.println("J");
            } else if (Math.max(Math.max(aC, aJ), aB) == aJ) {
                System.out.println("S");
            } else {
                System.out.println("B");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(countWays(4));

    }
    public static int countWays(int n) {
        if(n ==1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        if(n == 3){
            return 4;
        }
        return countWays(n-1) + countWays(n-2)+countWays(n-3);
    }
}
