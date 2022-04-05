package homeweek_week_9;

import org.omg.CORBA.DynAnyPackage.Invalid;

import java.util.Scanner;

public class Program_2 {
   // int sum;
    public static void main(String[] args) {
        // Calling scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter Student Name   \t\t:\t");
        String name = scanner.nextLine();
        System.out.println("\nEnter Roll No     \t\t:\t");
        int rollNo = scanner.nextInt();
        System.out.println("\nEnter Math Marks   \t\t:\t");
        int math = scanner.nextInt();
        if(math < 0 || math > 100) {
            System.out.println("Invalid Marks, please enter number between  to 100");
            math =scanner.nextInt();
        }
        System.out.println("\nEnter Science Marks    \t\t:\t");
        int science = scanner.nextInt();
        if(science < 0 || science > 100){
            System.out.println("Invalid Marks, please enter number between  to 100");
            science = scanner.nextInt();
        }
        System.out.println("\nEnter English Marks    \t\t:\t");
        int english = scanner.nextInt();
        if(english < 0 || english > 100){
            System.out.println("Invalid Marks, please enter number between  to 100");
            english = scanner.nextInt();
        }
        // Calculating total marks of the subjects]
        int total = sum(math, science, english);
        int percentage = (total * 100) / 300;
        String result = result1(math,science,english);
        String grade = grade1(percentage,result);
        markSheet(name, rollNo, math, science, english, total, percentage, result, grade);
        scanner.close();
    }
    // calculating the sum
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
    // Calculating the result
    public static String result1(int math, int science, int english){
        if(math < 35 || science < 35 || english <35 ){
            return "Fail";
        }else {
            return "Pass";
        }
    }
    //Calculating the grade on percentage and result
    public static  String grade1(int percentage, String result){
        String  grade = null;
        if(result.equalsIgnoreCase("Pass")){
            if( percentage >= 80){
                grade = "A+";
            }else if(percentage >= 60){
                grade = "A";
            }else if(percentage >= 50){
                grade = "A";
            }else if(percentage >= 35){
                grade = "C";
            }

        }else {
            grade = "-";
        }
        return grade;
    }
public static void markSheet(String name, int rollno, int math, int science, int english, double total,
                             double percentage, String result, String grade ){
    System.out.println("---------------------------------------");
    System.out.println("|                                     |");
    System.out.println("|   Mark Sheet                        |");
    System.out.println("|-------------------------------------|");
    System.out.println("|  Name:"    + name +"                |");
    System.out.println("|  Roll No: "+ rollno + "             |");
    System.out.println("|-------------------------------------|");
    System.out.println("|  Subjects:   Marks                  |");
    System.out.println("|-------------------------------------|");
    System.out.println("|  Math: "+ math +"                   |");
    System.out.println("|  Science: "+science + "             |");
    System.out.println("|  English: "+english +"              |");
    System.out.println("|-------------------------------------|");
    System.out.println("|  Total: "+ total +"                 |");
    System.out.println("|-------------------------------------|");
    System.out.println("|  Percentage: "+ percentage + "      |");
    System.out.println("|  Result: "+result+ "                |");
    System.out.println("|  Grade: " +grade+ "                 |");
    System.out.println("|-------------------------------------|");

}

}
