package homeweek_week_9;

import java.util.HashMap;
import java.util.Map;

public class Program_9 {

    public static void main(String[] args) {
    // Calling static method
        hashmap();
    }

    public static void hashmap(){
        //Hash Map declaration
        HashMap<String,Integer> student = new HashMap();
        student.put("RINKY ", 101);
        student.put("Riya ", 102);
        student.put("Deepmala ", 103);
        student.put("Nirali ", 104);
        student.put("Beena ", 105);

       // System.out.println("HashMap" + student);
        //for each to iterate
        for(Map.Entry<String,Integer> stud : student.entrySet() )
        {
            System.out.println(stud);
        }

    }
}

//  Create a HashMap object called people that will store String keys and Integer
 //       values: And use for each loop to iterate the value from Map