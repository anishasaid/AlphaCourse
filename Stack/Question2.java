package Stack;
import java.util.*;

// Reverse a String Using Stack
public class Question2 {
   
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int ind = 0;
        while(ind < str.length()){
            s.push(str.charAt(ind));
            ind++;
        }

        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }

        return result.toString();
    }
    public static void main(String[] args) {
        String str = "World Cup";
        String result = reverseString(str);
        System.out.println(result);
    }

}
