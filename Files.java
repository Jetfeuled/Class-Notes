import java.io.*;
import java.util.*;
public class Files {
    
    void main()throws FileNotFoundException{
        File students = new File("students.txt"); //ensure file is in same directory as this file
        //if the file is not in the same directory then use something like <directoryname>/students.txt if that directory was in the 
        //directory that it was in
        //if you want to go up use ../<directory>/students.txt

        //absolute path: complete file path use the full address
        IO.println(students);
        Scanner scan = new Scanner(students);

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
