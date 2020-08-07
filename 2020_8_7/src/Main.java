public class Main {
    public static void main(String[] args) {
        int a = 121324100;
        int count = 0;
        char[] arr = Integer.toString(a).toCharArray();
        for (int i = arr.length-1; i>0 ; i--) {
            if(arr[i] == '0'){
                count++;
            }else{
                break;
            }
        }
        System.out.println(count);
    }
}
