public class RightTriangle {
    void main(){

        triangle();

    }

    public static void triangle(){

        sides();
        bottom();
        IO.println(" ");

    }

    public static void sides(){

        char vertical = '|';
        char slant = '\\';

        IO.println(vertical + slant);

        for(int i = 0; i < 2; i++ )
            IO.print(vertical);
            for (int i = 0; i < 2;i++) {
                IO.print(" ");
            }
            IO.print(slant);

    }

    public static void bottom(){

        for (int i = 0; i < 10; i++) {
            IO.print('_');
            
        }

    }

}
