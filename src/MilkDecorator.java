public class MilkDecorator extends BeverageDecorator {

    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    protected String getExtraName() {
        return "milk";
    }

    @Override
    protected double getExtraCost() {
        return 1.50;
    }
}
