public class Main {
    public static void main(String[] args) {
        System.out.println(replaceSpace("Hello  World",12));
    }
    public static String replaceSpace(String iniString, int length) {
        
        return iniString.replace(" ","%20");
    }
}




