package homeweek_week_9;

import java.util.HashSet;

public class Program_8 {

    public static void main(String[] args) {
        //Calling static method
       hashSet();
    }
    public static void hashSet(){
        //Declaring HashSet integer
        HashSet<Integer> num = new HashSet();
        num.add(4);
        num.add(7);
        num.add(8);

        //for Numbers between 1 to 10 using for loop
        for(int i =1; i <= 10; i++ ){
            if(num.contains(i))
            {
                System.out.println( i + " Number found in the set.");
            }else
            {
                System.out.println(i + " Number not found in the set.");
            }
        }

    }
}






//Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
//Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
//and if else)