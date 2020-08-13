public class Main {
    public static void main(String[] args) {
    add(2,1);
    }

    private static int add(int A, int B) {
        if(B == 0){
            return A;
        }
        int sum = A^B;
        int jin = A&B<<1;
        return(add(sum,jin));
    }


}
