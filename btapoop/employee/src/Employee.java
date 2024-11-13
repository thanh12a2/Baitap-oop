
public class Employee implements iEmployee {
    private String name;
    public int paymentPerHour;

    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public String getName() {
        return name;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    @Override
    public int calculateSalary() {
        return 0;
    }
}