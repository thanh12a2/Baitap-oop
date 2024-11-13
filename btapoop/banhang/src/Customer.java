public class Customer {
    private String address;
    private String code;
    private String name;

    public Customer(String address, String code, String name) {
        this.address = address;
        this.code = code;
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }
}
