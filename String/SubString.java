package strings;

public class SubString {

    public static void getSubString(String str , int si, int ei){
        String substr ="";
        for(int i=si ;i<ei;i++){
            substr += str.charAt(i);
        }
        System.out.println(substr);
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
       // getSubString(str, 0, 5);
       System.out.println(str.substring(0, 5)); 
    }
}
