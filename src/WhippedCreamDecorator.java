public class WhippedCreamDecorator extends BeverageDecorator {

    public WhippedCreamDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    protected String getExtraName() {
        return "whipped cream";
    }

    @Override
    protected double getExtraCost() {
        return 2.50;
    }
}
