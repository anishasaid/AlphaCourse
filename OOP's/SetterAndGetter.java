package OOPS;


public class SetterAndGetter {
    public static void main(String[] args) {
       
        Pen p = new Pen();
        p.setColor("Orange");
        p.setPrice(5);
        
        System.out.println(p.getColor());
    }
}

class Pen{
    String color ;
    int tip ;
    int price ;

    Pen(){
        System.out.println();
    }

    //setters
    public void setColor(String newColor){
        color = newColor;
    }
    public void setTip(int newTip){
        tip = newTip;
    }
    public void setPrice(int newPrice){
        price = newPrice;
    }

    //getters
    public String getColor(){
        return color;
    }
    public int getTip(){
        return tip;
    }
    public int getPrice(){
        return price;
    }
}