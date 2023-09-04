package OOPS;

public class HybridInheritance {
   public static void main(String[] args) {
    
   } 
}

class Animal{
    String color;
     
    void eat(){
        System.out.println("eatting ");
    }
    void drink(){
        System.out.println("drinking");
    }
    void breath(){
        System.out.println("breathing");
    }
}

//fish
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swimming");
    }
}
class Tuna extends Fish{

}
class shark extends Fish{

}

//bird
class Bird extends Animal{

}
class Peecock extends Bird{

}

//mammals
class Mammal extends Animal{

}
class Dog extends Mammal{

}
class Cat extends Mammal{

}
class Human extends Mammal{
    
}
