package Recursion;

//binary String 
//print the binary string which do not contain consecutive 
//one
public class Problem14 {

    public static void printBinaryString(int n, int lasrPlace, String str){
        //base cse 
        if(n==0){
            System.out.println(str);
            return;
        }
        //kam
        printBinaryString(n-1, 0, str+"0");

        if(lasrPlace == 0){
            printBinaryString(n-1, 1, str+"1");
        }

    
    }
    
   
    public static void main(String[] args) {
        printBinaryString(3, 0, "");
    }
}
