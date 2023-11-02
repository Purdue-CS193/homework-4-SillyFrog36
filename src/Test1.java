import java.util.*;

enum Operation
{
    ADD, SUBTRACT, MULTIPLY, DIVIDE
}
public class Test1 {

    public static double basicCalculator(Operation operation, int num1, int num2){
        double result = 0;

        if (operation.compareTo(Operation.ADD) == 0) {
            result = num1 + num2;
        }else if (operation.compareTo(Operation.SUBTRACT) == 0) {
            result = num1 - num2;
        } else if (operation.compareTo(Operation.MULTIPLY) == 0) {
            result = num1 * num2;
        } else if (operation.compareTo(Operation.DIVIDE) == 0) {
            result = num1 / ((double)num2);
        } 

        return result;
    }

    public static void main(final String[] args) {
        System.out.println(basicCalculator(Operation.DIVIDE, 1, 2));
    }
}
