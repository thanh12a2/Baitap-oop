public class FullTimeEmployee extends Employee{
    public int workingHours;
    public FullTimeEmployee(String name, int  paymentPerHour,int workingHours) {
        super(name,paymentPerHour);
        this.workingHours = workingHours;

    }
    public int calculateSalary() {
        return workingHours * paymentPerHour;
    }
}