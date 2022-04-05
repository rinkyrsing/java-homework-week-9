package homeweek_week_9;

import java.util.ArrayList;

public class Program_7 {
    public static void main(String[] args) {
        //Calling static method
        empty();
    }

    public static void empty() {
        ArrayList< String> animal = new ArrayList();
        animal.add("Lion");
        animal.add("Leopard");
        animal.add("Tiger");
        animal.add("Tiger");
        animal.add("Koala");
        animal.add("Giraffe");
        System.out.println("ArrayList: " + animal);
        //Check array list is empty or not
        System.out.println("Checking array list is empty or not! " + animal.isEmpty());
        animal.removeAll(animal);
        System.out.println("After removing of array list!: " + animal);
        System.out.println(animal.isEmpty());
    }
}
