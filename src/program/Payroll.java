package program;
import entities.*;

public class Payroll {
    public static void main(String[] args) {
        System.out.println("Hell Oh world");

        Employee[] employees = new Employee[]{new HourlyEmployee(), new CommissionEmployee()};
        for (var item: employees) {
            System.out.println("employee = " + item);
        }
        System.out.println("zil gmor !!");
    }
}
