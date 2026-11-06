import java.util.*;

public class Ary {
    
    public static void main(String[] args) {
        /* 
        int num1 = 1, num2 = 2, num3 = 3, num4 = 4, num5 = 5;
        String numbers = "1 2 3 4 5", numbers2 = "";
        Scanner scan = new Scanner(numbers);
        while(scan.hasNextInt()){
            int temp = scan.nextInt();
            temp++;
            numbers2 += temp;
        }*/

        int[] nums = {1, 2, 3, 4, 5}; //this is an array
        IO.println(nums); //this will print I@55f96302 arrays are objects and this is the address
        //the location is stored in the stack but the array data is stored in the heap
        IO.println(Arrays.toString(nums)); //this is how you output what's in an array
        IO.println(nums[0]);
        IO.println(nums[4]);

        //arrays are not immutable their data can be changed

        char[] hi = {'h', 'e', 'l', 'l', 'o'};
        hi[0] = 'H';
        IO.println(Arrays.toString(hi));

        double[] x = new double[5]; //auto initialization
        IO.println(Arrays.toString(x));

        String[] y = new String[5];
        IO.println(Arrays.toString(y));

        int[][] twoD = new int[4][5];

        for (int i = 0; i < twoD.length; i++) {
            IO.println(Arrays.toString(twoD[i]));
        }

        int[] vector1 = {1, 2, 3}, vector2 = {4, 5, 6};
        //vector1 + vector2; cant add vectors with +
        //arrays can't be changed in size after it's created


        int [][][] threeD = new int[4][5][6];
        IO.println(Arrays.deepToString(threeD));
        
        
    }
}
