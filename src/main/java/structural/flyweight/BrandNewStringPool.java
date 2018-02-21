package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BrandNewStringPool {

    private Map<String, BrandNewString> pool = new HashMap<>();

    public BrandNewString get(String value) {
        return pool.computeIfAbsent(value, BrandNewString::of);
    }

    @Override
    public String toString() {
        return pool.toString();
    }
}
