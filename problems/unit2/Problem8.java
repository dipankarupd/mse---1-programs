package com.raj.problems.unit2;

/*
Demonstrate multilevel inheritance of Animal->Dog->BabyDog. Each class
should have a method displaying a message specific to the animal. Create an
object of each class and invoke the all the relevant methods
 */

// parent class:
class Animal {
    void display() {
        System.out.println("This is animal type");
    }
}

class Dog extends Animal {
    void display(){
        System.out.println("This is in child class");
    }
    void show(){
        System.out.println("This is a dog");
    }
}

class MyDog extends Dog {
    void show() {
        System.out.println("This is My Dog");
    }
    int age = 5;
}
public class Problem8 {
    public static void main(String[] args) {

        // parent object:
        Animal animal = new Animal();
        animal.display();

        // Dog object:
        Dog dog = new Dog();
        dog.display();
        dog.show();

        // MyDog object:
        MyDog myDog = new MyDog();
        myDog.show();
        System.out.println(myDog.age);

    }

}
