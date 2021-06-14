package srp;

import java.util.Scanner;

public class SingleResponsibilityPrincipleBefore {

    public void performActions() {
        //Stage 1: Get Information
        Scanner sc = new Scanner(System.in);
        System.out.print("first number: ");
        int a = sc.nextInt();
        System.out.print("second number: ");
        int b = sc.nextInt();
        System.out.print("action [+, -, *, /, %]: ");
        String action = sc.next();
        sc.close();

        //Stage 2: Make calculations
        int result = 0;
        switch (action.charAt(0)) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '%':
                result = a % b;
                break;
            default:
                System.err.println(action.charAt(0) + " is not a valid action!");
                return;
        }

        //Stage 3: Print result
        System.out.println("\n" + a + " " + action.charAt(0) + " " + b + " = " + result);
    }

    public static void main(String[] args) {
        SingleResponsibilityPrincipleBefore calculator = new SingleResponsibilityPrincipleBefore();
        calculator.performActions();
    }
}
