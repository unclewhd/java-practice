import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentense = scanner.nextLine();
        String[] array = sentense.split(" ");
        int right = array.length-1;
        int left = 0;
        while (left < right) {
            String tmp;
            tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right++;
        }
        System.out.println(Arrays.toString(array));

    }
}
