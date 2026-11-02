import java.io.*;
import java.util.*;
public class Files {
    
    void main()throws FileNotFoundException{ //this throws an error
        Scanner console = new Scanner(System.in);
        File students = new File("students.txt"); //ensure file is in same directory as this file
        //if the file is not in the same directory then use something like <directoryname>/students.txt if that directory was in the 
        //directory that it was in
        //if you want to go up use ../<directory>/students.txt
       /*  while(!students.canRead()/*or !students.exists()){//this is the way to handle the missing file
            IO.println("File DNE, please give new file name.");
            students = new File(console.nextLine());

        }*/
        //absolute path: complete file path use the full address
        IO.println(students);

        Scanner scan = null;
        do { 
            try { //you can have only one try per try an catch but you can have multiple catch boxes
                scan = new Scanner(students);
                //throw new ArithmeticException("Hi there.");
                throw new IllegalStateException("something");
            
            } catch (FileNotFoundException fnfe) {
                IO.println("File DNE, plz enter file name thx");
                students = new File(console.nextLine());
            } catch (ArithmeticException | IllegalStateException ae) { //this is the way to list multiple exceptions ITS NOT OR BUT IT IS KINDA
            IO.println(ae.getMessage());
            ae.printStackTrace();
            //return;
            } catch (Exception e) {
                IO.println("Well hello there");
            }
            
        } while (scan == null);
        
        File output = new File("output.txt"); //this is out to make a new file if it didn't exist.
        //if it did exist java will open the file an overwrite everything in it.
        PrintStream out = new PrintStream(output);
        out.print("message"); //this is how you can print to the file line
        

        while(scan.hasNextLine()){
            IO.println("Given:\t" + scan.next());
            IO.println("Family:\t" + scan.next());
            IO.println("Year:\t" + scan.nextInt());
            System.out.printf("Avg:\t%.2f%n%n", average(scan.nextLine())); //.trim() method removes trailing whitespace from string
            
        }
    }

    public static double average(String grades){
        Scanner scan = new Scanner(grades);
        int n = 0;
        double total = 0;

        while(scan.hasNextInt()){

            total += scan.nextInt();
            n++;
        }
        double average = total /n;
        return average; 
    
    }


}
