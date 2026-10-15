
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


    public static void printIsPalindrome(String original){

        String rev = reverse(original);
        //IO.println(original == rev);
        IO.println(original.equalsIgnoreCase(rev)); // original.equals(rev) also works but if you're trying to compare letters where case matters use ignorecase

    }

    public static String filter(String original, char remove){
        String filtered = "";

        for (int i = 0; i <= original.length() - 1; i++) {
            if (original.charAt(i) != remove){
            filtered = filtered + original.charAt(i);
            }
        }

        return filtered;
    }

    public static void main() {
        //Scanner scan = new Scanner(System.in);
        //String input = scan.next();
        //String rev = reverse(input);
        //IO.println(rev);

        printIsPalindrome("ABBA");
        printIsPalindrome("racecar");
        printIsPalindrome("ACDC");

        //this doesnt work because the == operators doesn't work with objects
        //make sure to use the equals method

        IO.print(filter("A man, a plan, a canal, Panama!", ','));

        
        
    }
}
