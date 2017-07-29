package validator;

public class Model {
    private final String name;
    private final String address;

    public Model(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
