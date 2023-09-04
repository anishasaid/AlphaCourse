package OOPS;

public class AbstractClass {
    public static void main(String[]args){
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}

abstract class Animal{
    //non - abstract method
    void eat(){
        System.out.println("Animal eats");
    }
    //abstract method 
    abstract void walk(); 
}

class Horse extends Animal{
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {
    void walk(){
        System.out.println("walks on 2 legs");
    }
}


//huming bird 