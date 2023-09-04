package OOPS;

public class SingleInheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}

//parent class
class Animal {
    String skin ;

    void eat(){
        System.out.println("Eates");
    }
    void Drink(){
        System.out.println("Drinking");
    }
}

//child class , subclass
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swimming");
    }
}
