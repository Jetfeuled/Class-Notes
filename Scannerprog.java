import java.util.Scanner; // java library where Scanner exists

public class Scannerprog {
    void main(){
        Scanner console = new Scanner(System.in);
        example(console);
        //String input = console.next();
        String input = console.nextLine(); //the reason it will auto input the second word if there was multiple words given on input
        IO.println(input); //scanner delimits on whitespace this is why you should use .nextLine insted of next
    }

    public static void example(Scanner scan){
        IO.println("got here: " + scan.next());
    }
}
