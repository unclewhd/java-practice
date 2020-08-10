public class Main2 {
    public static void main(String[] args) {
        int[] A = new int[0];
        int length = A.length;
        int[] B = new int[length];

        if(length!=0){
            B[0] = 1;
            for (int i = 1; i < length; i++) {
                B[i] = B[i-1] *A[i-1];
            }
            int tmp = 1;
            for (int i = length - 2; i >= 0; i--) {
                tmp *= A[i+1];
                B[i] = tmp * B[i];
            }
        }
        return B;
    }
}
