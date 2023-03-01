public class TestCalculationChain {

    public static void main(String[] args) {
        Chain chainCalculation1 = new AddNumbers();
        Chain chainCalculation2 = new SubtractNumbers();
        Chain chainCalculation3 = new MultiplyNumbers();
        Chain chainCalculation4 = new DivideNumbers();

        chainCalculation1.setNextChain(chainCalculation2);
        chainCalculation2.setNextChain(chainCalculation3);
        chainCalculation3.setNextChain(chainCalculation4);

        Numbers request = new Numbers(4,2,"mult");

        chainCalculation1.calculate(request);

    }

}