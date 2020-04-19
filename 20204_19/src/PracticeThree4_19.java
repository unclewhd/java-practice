class Student {
    private String Myname;
    public int age;

    public String getMyname() {
        return Myname;
    }

    public void setMyname(String myname) {
        Myname = myname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Myname='" + Myname + '\'' +
                ", age=" + age +
                '}';
    }
/*    public String getMyname() {
        return Myname;
    }

    public void setMyname(String Myname) {
        this.Myname = Myname;
    }*/
}

public class PracticeThree4_19 {

    public static void main(String[] args) {
        Student a = new Student();
        a.setMyname("whd");
/*        System.out.println(a.getMyname());*/
        System.out.println(a);
    }
}
