public abstract class BeverageDecorator implements Beverage {

    protected final Beverage beverage;

    protected BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + getExtraName();
    }

    @Override
    public double getCost() {
        return beverage.getCost() + getExtraCost();
    }

    protected abstract String getExtraName();

    protected abstract double getExtraCost();
}
