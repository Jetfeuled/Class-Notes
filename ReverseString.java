import java.util.Scanner;

public class ReverseString {
    
        public static String reverse(String input){
        String org = input;
        String rev = "";

        /*for (int i = org.length() - 1; i >= 0 ; i--) {
        
            //IO.println(org.charAt(i));
            rev += org.charAt(i);
        }*/
       for (int i = 0; i < org.length(); i++){
            rev = org.charAt(i) + rev;
       }
        return rev;

        }

    public static void main() {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        String rev = reverse(input);
        IO.println(rev);
    }
}
