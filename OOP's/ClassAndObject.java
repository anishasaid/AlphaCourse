package OOPS;

public class ClassAndObject {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.setColor("red");
        System.out.println(p.color);

        p.setTip(57);
        System.out.println(p.tip);
    }
}

class Pen{
    String color =  "blue" ;
    int tip = 5;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip (int newTip){
        tip = newTip;
    }
   
}
