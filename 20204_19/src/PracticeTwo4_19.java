
class Person {
    public String name = "gaobo";
    public int age = 18;
    public char ch;
    public boolean flg;
    public static int size = 1;
    public void eat() {
        int a = 10;
        System.out.println("eat()!");
    }
    public void sleep() {
        int b = 10;
        System.out.println("sleep()");
    }
    public static void func1() {
//        age = 999;
        size = 10;
    }
    public void show() {
        System.out.println("wojiao" + name + "jin nian" + age);
    }
}


public class PracticeTwo4_19 {
    public static void func() {

    }
    public void func2(){

    }
    public static void main(String[] args) {
        func();
        PracticeTwo4_19 a = new PracticeTwo4_19();
        a.func2();
        Person pe = new Person();
        System.out.println(pe.name);
        pe.name = "bit";
        System.out.println(pe.name);
        System.out.println(Person.size);
    }
}
