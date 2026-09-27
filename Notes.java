public class Notes {
    void main() {
        IO.println("These are my notes"); //description of file

        IO.println("To run a program in terminal do this:");
        IO.println("first ensure the program is saved then:");
        IO.println("compile = javac <filename.java>");
        IO.println("run = java <filename.java>");

        IO.println("Algorithm = A step-by-step description of how to accomplish a task.");
        IO.println("Program = A list of instructions to be carried out by a computer.");
        //To make notes the backslash is what allows one line notes

        /* to make multiline notes this is 
        how you do it in java 
        */
       
        IO.println("\"This is how you input escape characters.\" " );
        /* the \ character can be used to input various things in strings.
         */
        IO.println("Binary is in base2 which means it's just two numbers.");
        IO.println("Compiler = A program that translates a computer program written in one language into an equivalent program in another language.");
        IO.println("This can be called going from high language to machine language.");
        /* Java compiles into Java Bytecodes so that it can be executed
        on many different types of machines then it is compiled into machinecode.
         */

        IO.println("Java Class Libraries = preexisting java code to assist in writing code.");
        IO.println("Class = a unit of code that is the basic building block of Java programs.");
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
        Below we're going to create a new method named 'method'
        */

      /*  public static void method(){
            IO.println("This is a method.");
            //methods need to be called to execute.
       }
       */

    }
}