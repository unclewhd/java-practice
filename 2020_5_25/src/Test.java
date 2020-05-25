import java.util.Arrays;

public class Test {
}
int[] array = {1,23,43,1,23,4};
public void insertSort(int[] array){
    int tmp;
    for (int i = 1; i < array.length; i++) {
        tmp = array[i];
        for (int j = i-1; j >= 0 ; j--) {
            if(tmp < array[j]){
                array[j+1] = array[j];
            }else{
                break;
            }
            array[j] = tmp;
        }
    }
}
