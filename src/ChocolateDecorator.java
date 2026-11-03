public class ChocolateDecorator extends BeverageDecorator {

    public ChocolateDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    protected String getExtraName() {
        return "chocolate";
    }

    @Override
    protected double getExtraCost() {
        return 2.00;
    }
}
