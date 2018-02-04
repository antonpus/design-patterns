package structural.simplefactory;

public class Device implements Product {

    private String id;

    public Device(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }
}
