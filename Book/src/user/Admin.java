package user;

import operation.*;

import java.util.Scanner;

public class Admin extends User {
    public Admin(String name) {
        super(name);
        this.operations = new IOperation[]{
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation(),
                new ExitOperation(),
        };
    }

    @Override
    public int menu() {
        System.out.println("======================");
        System.out.println("hello " + this.name + "welcome");
        System.out.println("1.find");
        System.out.println("2.jieyue");
        System.out.println("3.xinzeng");
        System.out.println("4.tuichu");
        System.out.println("5.shanchu");
        System.out.println("========================");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
