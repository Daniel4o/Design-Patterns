public class VisitorTest {

    public static void main(String[] args) {
        TaxVisitor taxCalculation = new TaxVisitor();
        TaxHolidayVisitor taxHolidayCalculation = new TaxHolidayVisitor();

        Necessity milk = new Necessity(3.47);
        Liquor vodka = new Liquor(11.99);
        Tobacco cigars = new Tobacco(19.99);

        System.out.println(milk.accept(taxCalculation) + "\n");
        System.out.println(vodka.accept(taxCalculation) + "\n");
        System.out.println(cigars.accept(taxCalculation) + "\n");

        System.out.println("TAX HOLIDAY PRICES\n");

        System.out.println(milk.accept(taxHolidayCalculation) + "\n");
        System.out.println(vodka.accept(taxHolidayCalculation) + "\n");
        System.out.println(cigars.accept(taxHolidayCalculation) + "\n");
    }

}
