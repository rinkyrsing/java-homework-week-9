package calculate;

public class Calculator {
    char symbol;
    int a, b;
    int result;

    public void addition(int a, int b) {
        this.a = a;
        this.b = b;
        result = a + b;
        System.out.println("Addition of " + a + " and " + b + " is: " + result);
    }

    public void subtraction(int a, int b) {
        this.a = a;
        this.b = b;
        result = a - b;
        System.out.println("Subtraction of " + a + " and " + b + " is:" + result);
    }

    public void division(int a, int b) {
        this.a = a;
        this.b = b;
        result = a / b;
        System.out.println("Division of " + a + " and " + b + " is:" + result);
    }

    public void multiplication(int a, int b) {
        this.a = a;
        this.b = b;
        result = a * b;
        System.out.println("Multiplication of " + a + "and " + b + " is:" + result);
    }

    public void calculateResult(int a, int b, char symbol) {
        // using switch

        switch (symbol) {
            case '+':
                addition(a, b);
                break;
            case '-':
                subtraction(a, b);
                break;
            case '/':
                division(a, b);
                break;
            case '*':
                multiplication(a, b);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}

