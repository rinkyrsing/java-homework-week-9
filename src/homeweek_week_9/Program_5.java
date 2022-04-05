package homeweek_week_9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Program_5 {


    public static void main(String[] args) {
        //Calling static method
        iterate();

    }
    public static void iterate(){
     // array list using Iterator.
        ArrayList< Integer> num =  new ArrayList();
        num.add(204);
        num.add(319);
        num.add(103);
        num.add(931);
        num.add(548);
        System.out.println("ArrayList: " + num);
        //Iterate the number
        ListIterator<Integer> iterator = num.listIterator();
        System.out.println("Iterating over Arraylist: ");
        while (iterator.hasNext())
        {
            System.out.println(iterator.next() + ",");
        }

    }


}
