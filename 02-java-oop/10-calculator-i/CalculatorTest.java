public class CalculatorTest {
    public static void main(String[] args){
        Calculator DoIt = new Calculator();

        DoIt.setOperatorOne(10);
        DoIt.setOperation('+');
        DoIt.setOperatorTwo(4);
        DoIt.performOperation();
        System.out.println(DoIt.getResults());

    }

}
