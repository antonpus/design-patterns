package creational.abstractfactory;

public class SubscriptionFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new Subscription();
    }

    @Override
    public PriceList createPriceList() {
        return new RecurringPriceList();
    }
}
