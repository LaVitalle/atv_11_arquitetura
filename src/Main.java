public class Main {

    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        print(coffee);

        Beverage coffeeWithMilkAndChocolate = new ChocolateDecorator(new MilkDecorator(new Coffee()));
        print(coffeeWithMilkAndChocolate);

        Beverage teaWithMilk = new MilkDecorator(new Tea());
        print(teaWithMilk);

        Beverage doubleWhippedCream = new WhippedCreamDecorator(new WhippedCreamDecorator(new Coffee()));
        print(doubleWhippedCream);

        System.out.println("=== New extra: caramel ===");
        Beverage withCaramel = new CaramelDecorator(new ChocolateDecorator(new MilkDecorator(new Coffee())));
        print(withCaramel);
    }

    private static void print(Beverage beverage) {
        System.out.println(beverage.getDescription());
        System.out.println(String.format("Total: R$ %.2f%n", beverage.getCost()));
    }
}
