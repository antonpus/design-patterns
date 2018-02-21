package structural.flyweight;

import org.junit.Test;

import static org.junit.Assert.*;

public class BrandNewStringPoolTest {

    @Test
    public void flyweightApi() {
        BrandNewStringPool pool = new BrandNewStringPool();

        pool.get("1");
        pool.get("2");
        pool.get("3");

        pool.get("1");

        System.out.println(pool);
    }
}