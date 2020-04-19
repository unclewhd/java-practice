import java.util.Arrays;

public class Practice4_19 {
    public static void main(String[] args) {
        int[] array ={1,2,4,1,4};
        int ret = 0;
        for (int i = 0; i < array.length; i++) {
            ret ^= array[i] ;
        }
    }
    public static void main3(String[] args) {
        int[][] array = new int[2][];
        array[0] = new int[] {1,2,3};
        array[1] = new int[] {4,5};
    }

    public static void main2(String[] args) {
        int [][] array = {{1,2,3},{4,5,6}};
        for (int[] tmp:array) {
            for (int x:tmp) {
                System.out.print(x);
            }
        }
        /*for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }*/
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.deepToString(array));
    }
    public static void main1(String[] args) {
        int[][] array = {{1,2,3},{4,5,6,}};
        int[][] array1 = new int[][] {{1,2,3},{4,5,6}};
        int[][] array2 = new int[2][3] ;

    }
}
