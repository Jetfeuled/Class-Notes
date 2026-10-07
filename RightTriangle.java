public class RightTriangle {
    void main(){

        triangle();

    }

    public static void triangle(){

        IO.print("    ");
        sides();
        bottom();
        IO.println(" ");

    }

    public static void sides(){

        String vertical = "|";
        String slant = "/";
        for(i = 0; i < 5; i++){
            String space = " ";
        }

        IO.println(slant+ space + vertical);

        

        /*for(int i = 0; i < 2; i++ )
            IO.print(vertical);
            for (int i = 0; i < 2;i++) {
                IO.print(" ");
            }
            IO.print(slant);
            */

    }

    public static void bottom(){

        for (int i = 0; i < 5; i++) {
            IO.print('_');
            
        }

    }

}
