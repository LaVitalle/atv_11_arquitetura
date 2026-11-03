public class CaramelDecorator extends BeverageDecorator {

    public CaramelDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    protected String getExtraName() {
        return "caramel";
    }

    @Override
    protected double getExtraCost() {
        return 1.00;
    }
}
