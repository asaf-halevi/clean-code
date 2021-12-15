package srp;

import java.security.InvalidAlgorithmParameterException;
import java.util.Scanner;

public class SingleResponsibilityPrincipleAfter {

    public void performActions() {
        CalcInfo calcInfo;
        try {
            calcInfo = getInfo();
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
            return;
        }
        int result = calcResult(calcInfo);
        printResult(calcInfo, result);
    }

    private CalcInfo getInfo() throws InvalidAlgorithmParameterException {
        Scanner sc = new Scanner(System.in);
        System.out.print("first number: ");
        int a = sc.nextInt();
        System.out.print("second number: ");
        int b = sc.nextInt();
        System.out.print("action [+, -, *, /, %]: ");
        String action = sc.next();
        sc.close();

        return new CalcInfo(a, b, action.charAt(0));
    }

    protected int calcResult(CalcInfo calcInfo) {
        int result = 0;
        switch (calcInfo.getAction()) {
            case CalcInfo.ADD:
                result = add(calcInfo.getA(), calcInfo.getB());
                break;
            case CalcInfo.SUBTRACT:
                result = subtract(calcInfo.getA(), calcInfo.getB());
                break;
            case CalcInfo.MULTIPLY:
                result = multiply(calcInfo.getA(), calcInfo.getB());
                break;
            case CalcInfo.DIVIDE:
                result = divide(calcInfo.getA(), calcInfo.getB());
                break;
            case CalcInfo.MODULUS:
                result = modulus(calcInfo.getA(), calcInfo.getB());
                break;
        }
        return result;
    }

    protected int subtract(int a, int b) {
        return a - b;
    }

    protected int add(int a, int b) {
        return a + b;
    }

    protected int multiply(int a, int b) {
        return a * b;
    }

    protected int divide(int a, int b) {
        return a / b;
    }

    protected int modulus(int a, int b) {
        return a % b;
    }

    private void printResult(CalcInfo calcInfo, int result) {
        System.out.println(getResultAsString(calcInfo, result));
    }

    protected String getResultAsString(CalcInfo calcInfo, int result) {
        return "\n" + calcInfo.getA() + " " + calcInfo.getAction() + " " + calcInfo.getB() + " = " + result;
    }

    public static void main(String[] args) throws InvalidAlgorithmParameterException {
        SingleResponsibilityPrincipleAfter calculator = new SingleResponsibilityPrincipleAfter();
        calculator.performActions();
    }
}
