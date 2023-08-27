package strings;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class InputOutput {
    public static void main(String[] args) {
        
        char ch[] = {'a','b','c','d'};
        String str = "a b c d";
        String str2 = new String(" Anisha");
    
        //now take input from the user 
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
    }
    
    
}
