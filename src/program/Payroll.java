package program;

import entities.*;

/**
 * The `Payroll` class is a simple Java program that demonstrates the use of polymorphism with the `Employee` class and its subclasses.
 * The `main` method is the entry point of the program.
 */
public class Payroll {

    /**
     * The main method is the entry point of the program.
     * It demonstrates polymorphism by creating an array of `Employee` objects, which includes instances of `HourlyEmployee` and `CommissionEmployee`.
     * It then prints each employee object and a closing message to the console.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Hell Oh world");

        Employee[] employees = new Employee[]{new HourlyEmployee(), new CommissionEmployee()};
        for (var item: employees) {
            System.out.println("employee = " + item);
        }
        System.out.println("zil gmor !!");
    }
}