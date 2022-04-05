package homeweek_week_9;

import java.util.ArrayList;

public class Program_4 {
    public static void main(String[] args) {
        // Calling Instance method
        Program_4 program_4 = new Program_4();
        program_4.colours();

    }
    public void colours(){
        //Add method
        ArrayList< String > colourslist = new ArrayList();
        colourslist.add("Red");
        colourslist.add("Blue");
        colourslist.add("Green");
        colourslist.add("Purple");
        colourslist.add("Orange");
        // for each to print
        for( String colours : colourslist)
        {
            System.out.println("ArrayList: " + colours);
        }

    }
}
