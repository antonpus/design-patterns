package creational.abstractfactory;

public class Subscription implements Product {
    @Override
    public String getType() {
        return Subscription.class.getSimpleName();
    }
}
