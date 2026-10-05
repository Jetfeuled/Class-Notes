public class Loops {

    void main() {
        /*
        This was my code
        IO.println("");
        IO.print(" ");
        for (int i = 0; i < 10; i++) {
            IO.print("-");
        }
        IO.println("");
        for (int i = 0; i < 10; i++) {
            IO.println("|          |");
        }
        IO.print(" ");
        for (int i = 0; i < 10; i++) {
            IO.print("-");
        }
        IO.println("");
    }
        */
       //This below is the code he made in class
        box();
}

public static void box(){
       dashes();
       sides();
       dashes();
}

public static void sides(){
    for (int i = 0; i < 5; i++) {
        IO.print('|');
        for (int j = 0; j < 17; j++) {
            IO.print(' ');
        }
        IO.println('|');
    }
}

public static void dashes(){
    for (int i = 0; i < 19; i++) {
        IO.print('-');
    }
    IO.println();
}
}