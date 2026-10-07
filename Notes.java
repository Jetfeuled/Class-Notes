public class Notes {
    public static int global = 25;    
    public static void method(){
            IO.println("This is a method.");
            
       }

    public static void yes(int size){
        IO.println(size);
    }

    public static void yes(){
        IO.println("This one has no input.");
    }

    public static void c_squared(){

        double c2 = a_squared(2) + b_squared(2);
        IO.println(c2);

    }

    public static double a_squared(double a){
        a = a * a;
        return a;
    }

    public static double b_squared(double b){
        b = b * b;
        return b;
    }

    public static void pythag(double a, double b) {
        double cSquared = Math.pow(a, 2) + Math.pow(b, 2);
        double c = Math.sqrt(cSquared);
        IO.println(c);
        IO.println(cSquared);
    }

    public static double lawCOS(double a, double b, double degrees){
        return Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(degrees)));

    }

    public static double loc(int a, int b, int theta){
        return lawCOS((double)a, (double)b, (double)theta);
    }

    void main() {
        IO.println("These are my notes"); //description of file\
        IO.println("------------------");


        IO.println("To run a program in terminal do this:");
        IO.println("first ensure the program is saved then:");
        IO.println("compile = javac <filename.java>");
        IO.println("run = java <filename.java>");
        IO.println("------------------");
        IO.println("Algorithm = A step-by-step description of how to accomplish a task.");
        IO.println("Program = A list of instructions to be carried out by a computer.");
        //To make notes the backslash is what allows one line notes

        /* to make multiline notes this is 
        how you do it in java 
        */
        IO.println("------------------");
        IO.println("\"This is how you input escape characters.\" " );
        /* the \ character can be used to input various things in strings.
        Common escape Sequences:
        \t  =  tab character
        \n  =  newline character
        \"  =  quotation mark
        \\  =  backslash character
        */
        IO.println("This\nproduces 3 lines\nof output.");
        IO.println("------------------");
        IO.println("Binary is in base2 which means it's just two numbers.");
        IO.println("Compiler = A program that translates a computer program written in one language into an equivalent program in another language.");
        IO.println("This can be called going from high language to machine language.");
        /* Java compiles into Java Bytecodes so that it can be executed
        on many different types of machines then it is compiled into machinecode.
         */
         IO.println("------------------");

        IO.println("Java Class Libraries = preexisting java code to assist in writing code.");
        IO.println("Class = a unit of code that is the basic building block of Java programs.");
         IO.println("------------------");
        /* A basic way of creating a java program is as follows:

            public class <name> {
                <method>
                <method>
                ...
                <method>            
            }
        This is a sytax template or how a program is grammatically correct.
        <public> in the header indicates that this clas is available to anyone to use.
        <method> is the smallest form of a program. Basically its an algorithm.
        Using methods you can run various things and reference the method multiple times while
        writing the program once instead of over and over again.
        Below we're going to call a new method named 'method'
        */
        method();
        //methods need to be called to execute.
        //methods have to be made outside of main.

        IO.println("------------------");
        IO.println("Types of Errors:");
        IO.println("Syntax errors occur when you cause bad grammar.");
        IO.println("Logic errors occur when code doesn't do what it's supposed to.");
        IO.print("Runtime errors are logic errors that are so severe");
        IO.println(" that java stops your program from executing.");
//28SEP26
        IO.println("Number Magic");
        IO.println("------------");

        int number = 10 / 3;
        int modulus_number = 10 % 3;

        IO.println(number);
        IO.println(modulus_number);
        /* modulus is the remainder left after dividing ints.
         */

        double exponent_number = Math.pow(2,3);
        IO.println(exponent_number);
        //string binary = Integer.toBinaryString(14); 
        //IO.println(binary);

        int big_boi = Integer.MAX_VALUE;
        IO.println(big_boi);

        int carosel_boi = Integer.MAX_VALUE + 1;
        IO.println(carosel_boi);

        long bigger_boi = Long.MAX_VALUE;
        IO.println(bigger_boi);

        double biggest_boi = Double.MAX_VALUE; //floats are doubles
        IO.println(biggest_boi);

        //default floats are doubles and default ints are ints not longs.
        
//30SEP26
        IO.println(big_boi);
        long large_boi = Integer.MAX_VALUE + 1L; //this changes the integer into a long because of the 1L as well as it's type long in the variable
        IO.println(large_boi);

        int x = 42;
        IO.println(x);
        x = x + 1;
        IO.println(x); //x is stored initially as 42 then is updated on previous line to then be stored again.

        int y = (int)42.0; //how to convert other data to other types like double to int in this case
        IO.println(y);

        x = 42;
        y = 9001;
        x = y;
        IO.println(x);
        IO.println(y); //this is not how to swap variables.

        x = 42;
        y = 9001;
        int z = x;
        int w = y;
        y = x;
        x = w;
        IO.println(x);
        IO.println(y); // this is how to swap variables.

        /*
        type = size (bytes)
        boolean = 1/8th (a bit)
        byte = 1
        short = 2 
        float/int = 4
        double/long = 8
         */

        String s = "well hello there";
        IO.println(s);
        s = s.toUpperCase();
        IO.println(s); // ******* string objects are immutable ******
        /*  what this means is that when modifying a string to a new value you're not
         modifying you're creating a new string object the old object exists still till 
         garbage collector gets it
        */

        for(int i = 0; i < 10; i++){
            IO.println("yes");
         }

        /*
             1) Initialization     2) conditional     4) update
        for ( int i=0;              i < 10;           i++){


                3) body
                IO.println(i);
        }
        Variables made outside the for loop can be used in the body of the for loop but variables created inside the for loop it cannot be used outside the for loop.
        This is called Scope.
        Scope is the lifetime of the variable. It's life is closed at the next closed }.
        */
       
//02OCT26

        //out of memory overflow
        //check out the loops.java file for notes for today
        //checkout righttriangle.java for notes for that day

//05OCT26

        final int SIZE = 20;
       // SIZE++; if you try to change the variable size when it is final'd it cant change somewhere else other than the original line.
       //Go read above main for global variable example
       //Go read file Example.java for example on public static methods
       //public means that anyone can access it 
       //static means you can call the method after the class name ex: Notes.method(); calls the method from this file into Example.java or any
       //other program that is in the same directory.

        yes(6);
        //go to the top an see how this method is called here in main
        // overloading is if you call a method with an input then it will call the method with an input but if you don't put an input then it will default to another method
        //of the same name but with no parameters within ()

        yes();

        c_squared();

        //another way to do above is like this in a single method

        pythag(2, 2);

        double cosine = lawCOS(2, 2, 60);

        IO.println(cosine);


//07OCT26

         int u = 0;
         u = u++;
         u = ++u;
         IO.println(u);

         loc(2, 3, 4);

        // Scanner console = new Scanner(System.in );
        //go look at this file

        }
}