public class Practice4_14 {
    public static void move(char pos1,char pos2) {
        System.out.print(pos1+"->"+pos2+" ");
    }
    public static void hanoi(int n,char pos1,char pos2,char pos3) {
        if (n == 1) {
            move(pos1,pos3);
        }else{
            hanoi(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            hanoi(n-1,pos2,pos1,pos3);
        }
    }
    public static void main(String[] args) {
        //1 A -> C
        //2 A -> B A -> C B -> C
        //3 A -> C A -> B C -> B A -> C B -> A B -> C A -> C

        hanoi(3,'a','b','c');
    }
}
