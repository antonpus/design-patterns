package creational.prototype;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class EmployeeTest {

    @Test
    public void clone_ShouldReturnNewOneObject_WhenInvokeClone() throws CloneNotSupportedException {

        Address address = new Address("Address where Alex lives");
        Employee alex = new Employee("Alex", address);

        Employee anton = alex.clone();

        assertFalse(anton == alex);
    }

    @Test
    public void clone_ShouldPerformDeepCloning_WhenInvokeClone() throws CloneNotSupportedException {

        Address address = new Address("Address where Alex lives");
        Employee alex = new Employee("Alex", address);

        Employee anton = alex.clone();
        anton.setName("Anton");

        assertFalse(alex.getAddress() == anton.getAddress());
    }
}