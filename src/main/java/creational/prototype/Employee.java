package creational.prototype;

public class Employee implements Cloneable {

    private String name;
    private Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    protected Employee clone() throws CloneNotSupportedException {

        Employee clone = (Employee) super.clone();
        clone.setAddress(new Address(clone.getAddress().getValue()));

        return clone;
    }
}
