package Exercism;

public class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        try {
            int result = 0;
            switch (operation) {
                case "+":
                    result = operand1 + operand2;
                    return operand1 + " " + operation + " " + operand2 + " = " + result;
                case "*":
                    result = operand1 * operand2;
                    return operand1 + " " + operation + " " + operand2 + " = " + result;
                case "/":
                    result = operand1 / operand2;
                    return operand1 + " " + operation + " " + operand2 + " = " + result;
                case null:
                    throw new IllegalArgumentException("Operation cannot be null");
                case "":
                    throw new IllegalArgumentException("Operation cannot be empty");
                default: //throw new IllegalOperationException("Operation '" +operation+ "' does not exist");
            }
        } catch (ArithmeticException e) {
            //throw new IllegalOperationException("Division by zero is not allowed", e);
        }
        return " ";
    }
}
