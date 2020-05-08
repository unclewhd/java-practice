package com.bit.www;

import java.awt.*;
import java.util.Arrays;

/*class Animal {
    public String name;

    public Animal(String name){
        this.name = name;
    }
    public void eat(String food){
        System.out.println(this.name + "正在吃" + food);
    }
    public void fly(){
        System.out.println(this.name + "正在");
    }
}*/

/*class Cat extends Animal {
    public Cat(String name){
        super(name);
    }
    public void fly(){
        System.out.println(this.name + "正在");
    }
}*/

class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

/*    @Override*/
    public void eat(String food) {
   /*     super.eat(food);*/
    }

    public void fly(){
        System.out.println(this.name + "正在飞");
    }
}

abstract class Shape {
    public String name;

    public Shape(String name ){
        this.name = name;
    }
}

interface IShape {
    void draw();
}

class Cycle implements IShape{
    @Override
    public void draw() {
        System.out.println("o");
    }
}

class Ret extends Shape implements IShape{
    public Ret(String name){
        super(name);
    }

    @Override
    public void draw() {

    }
}
class Animal{
    protected String name;

    public Animal(String name){
        this.name = name;
    }

}
interface IRunning{
    void run();
}

class Cat extends Animal implements IRunning{
    public Cat(String name){
        super(name);
    }

    @Override

    public void run(){
        System.out.println(this.name + "pao");
    }



}
class Robot implements IRunning{
    private String name;
    public Robot(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name + "jiqipao");
    }
}

public class Practice5_8 {
    public static void walk(IRunning running){
        System.out.println("I walk");
        running.run();
    }
    public static void main(String[] args) {

        Bird bird = new Bird("miaomiao");
        bird.eat("maoliang");
        Animal bird2 = new Bird("yuanyuan");
        Animal bird3 = new Animal("yuanyuan");
      /*  bird2.fly();*/
        /*bird.fly();*/
        IShape shape = new Cycle();
        shape.draw();
        Cat cat = new Cat("xiaomao");
        walk(cat);
        Robot robot = new Robot("jiqiren");
        walk(robot);

    }
}
