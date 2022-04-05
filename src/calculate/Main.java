package calculate;

import java.util.Scanner;

public class Main extends Calculator {
    static char ans;

    public static void main(String[] args) {
        // Creating main method
        Main main = new Main();

        // Using do while loop
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first number");
            main.a = scanner.nextInt();
            System.out.println("Enter second number");
            main.b = scanner.nextInt();
            System.out.println("Please enter one of symbol: +, -, *, / :");
            main.symbol= scanner.next().charAt(0);
            main.calculateResult(main.a, main.b, main.symbol);
            System.out.println("Would you like to do more calculation? Please enter: Y or N");
            ans = scanner.next().toLowerCase().charAt((0));

        }while(ans == 'y');
        }
    }

