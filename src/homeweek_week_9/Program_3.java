package homeweek_week_9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Program_3 {
    public static void main(String[] args) {
        //Calling method
        array();

    }
    public static void array(){
        // declaring a array
        int[] a = {2022, 2007, 2005, 2010, 2013};
        System.out.println("Original array : " + Arrays.toString(a));
        // reversing the array with for loop
        for(int i = 0; i < a.length / 2 ; i++)
        { int temp = a[i];
          a[i] = a[a.length -i - 1];
          a[a.length -i -1] = temp;
        }
        System.out.println("Reverse array : "+ Arrays.toString(a));
    }
}
