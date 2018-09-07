package bl;

public class CalculatorImpl implements Calculator {
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }

    @Override
    public int mul(int a, int b) {
        return a*b;
    }

    @Override
    public int div(int a, int b) {
        int result = 0;
        try{
            result = a / b;
        } catch(ArithmeticException e){
            System.out.println("Divisor is 0. Division by 0 not possible");
        }
        return result;
    }
}
