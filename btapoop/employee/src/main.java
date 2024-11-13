import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        PartTimeEmployee part = new PartTimeEmployee( "Thanh", 21000, 5);
        FullTimeEmployee full= new FullTimeEmployee("Thanh",21000,8);
        System.out.println( "The part time employee's salary is: " +part.getName()+" "+part.calculateSalary() );
        System.out.println("The full time employee's salary is: " + part.getName()+" "+full.calculateSalary());
    }
}