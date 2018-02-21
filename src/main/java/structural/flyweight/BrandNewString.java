package structural.flyweight;

public class BrandNewString {

    private String value;

    private BrandNewString(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static BrandNewString of(String value) {
        return new BrandNewString(value);
    }
}
