class Money implements Cloneable{
    double money = 12.5 ;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Person implements Cloneable{
    public int age;

    Money m = new Money();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        Person p = (Person)super.clone();
        p.m = (Money) this.m.clone();
        return p;
    }
}

public class Practice5_9 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person();
        Person person2 = (Person)person1.clone();
        System.out.println(person1.m.money);
        System.out.println(person2.m.money);
        System.out.println("================");
        person2.m.money = 99.9;
        System.out.println(person1.m.money);
        System.out.println(person2.m.money);
    }
    public static void main1(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person();
        Person person2 = (Person)person1.clone();
        System.out.println(person1.age);
        System.out.println(person2.age);
        System.out.println("=========");
        person2.age = 99;
        System.out.println(person1.age);
        System.out.println(person2.age);
    }
}
