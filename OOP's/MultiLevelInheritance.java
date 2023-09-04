package OOPS;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Dog bunny = new Dog();
        bunny.eat();
        bunny.legs =4;
        System.out.println(bunny.legs);
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("eatting");
    }
    void drink(){
        System.out.println("drinking");
    }
    void breath(){
        System.out.println("breathing");
    }
}
//child class
class Mammal extends Animal{
    int legs;
}
//child class
class Dog extends Mammal{
    String breed;
}
