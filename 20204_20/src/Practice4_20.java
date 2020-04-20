class Person {
    private String name;
    private  int age;
    private  String sex;

    {
        this.name = "sidh";
        this.age = 10;
        this.sex = "man";
        System.out.println("I am instance init()!");
    }
    public Person() {
        this("bit",14,"man");

    }

    public Person(String name, int age,String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void show() {
        System.out.println(name + age + sex);
    }


}
public class Practice4_20 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.show();
        Person p2 = new Person("zhangfei",80,"nan");
        p2.show();
    }

}
