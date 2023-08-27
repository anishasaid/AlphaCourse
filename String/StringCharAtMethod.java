package strings;

public class StringCharAtMethod {
    public static void  printletters(String str ){
        for(int i=0 ;i<str.length();i++){
            System.out.print(str.charAt(i));

        }
        System.out.println();
    }
    public static void main(String [] args){
        String firstName = " Anisha";
        String lastName = "Said";
        String fullName = firstName + lastName;
        System.out.println(fullName.charAt(0));

        printletters(fullName);
    }
}
