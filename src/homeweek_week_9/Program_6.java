package homeweek_week_9;

import java.util.ArrayList;

public class Program_6 {
    public static void main(String[] args) {


        Program_6 program_6 = new Program_6();
          program_6.retrieve();

    }
    public void retrieve(){
        // Array to retrieve an element at specific index
        ArrayList<String > eName = new ArrayList<>();
        eName.add("Tom");
        eName.add("Amy");
        eName.add("John");
        eName.add("Maggi");
        eName.add("Lola");

        //Calling John
        System.out.println("The element at index 2 in the ArrayList is: " + eName.get(2));



    }

    
}
