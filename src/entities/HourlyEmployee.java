package entities;

import java.util.Objects;

/**
 * The `HourlyEmployee` class extends the `Employee` class, representing an employee who is paid based on the number of hours worked and their hourly wage.
 * It includes fields for hours worked and hourly wage rate.
 */
public class HourlyEmployee extends Employee {
    private int hours;
    private float wage;

    /**
     * Constructs an `HourlyEmployee` with the specified first name, last name, id, hours worked, and hourly wage rate.
     *
     * @param firstName the first name of the employee
     * @param lastName the last name of the employee
     * @param id the identification number of the employee
     * @param hours the number of hours worked by the employee
     * @param wage the hourly wage rate of the employee
     */
    public HourlyEmployee(String firstName, String lastName, int id, int hours, float wage) {
        super(firstName, lastName, id);
        this.hours = hours;
        this.wage = wage;
    }

    /**
     * Default constructor for `HourlyEmployee`.
     * Initializes the fields with default values.
     */
    public HourlyEmployee() {
        // Default constructor
    }

    /**
     * Constructs an `HourlyEmployee` with the specified hours worked and hourly wage rate.
     *
     * @param hours the number of hours worked by the employee
     * @param wage the hourly wage rate of the employee
     */
    public HourlyEmployee(int hours, float wage) {
        this.hours = hours;
        this.wage = wage;
    }

    /**
     * Returns the number of hours worked by the employee.
     *
     * @return the number of hours worked by the employee
     */
    public int getHours() {
        return hours;
    }

    /**
     * Sets the number of hours worked by the employee.
     *
     * @param hours the new number of hours worked by the employee
     */
    public void setHours(int hours) {
        this.hours = hours;
    }

    /**
     * Returns the hourly wage rate of the employee.
     *
     * @return the hourly wage rate of the employee
     */
    public float getWage() {
        return wage;
    }

    /**
     * Sets the hourly wage rate of the employee.
     *
     * @param wage the new hourly wage rate of the employee
     */
    public void setWage(float wage) {
        this.wage = wage;
    }

    /**
     * Compares this `HourlyEmployee` to the specified object. The result is true if and only if
     * the argument is not null and is an `HourlyEmployee` object that has the same hours worked and hourly wage rate
     * as this object, in addition to the fields inherited from the `Employee` class.
     *
     * @param o the object to compare this `HourlyEmployee` against
     * @return true if the given object represents an `HourlyEmployee` equivalent to this employee, false otherwise
     */
    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof HourlyEmployee that)) return false;
        if (!super.equals(o)) return false;

        return hours == that.hours && Float.compare(wage, that.wage) == 0;
    }

    /**
     * Returns a hash code value for the `HourlyEmployee`. This method is supported for the benefit
     * of hash tables such as those provided by `HashMap`.
     *
     * @return a hash code value for this `HourlyEmployee`
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hours, wage);
    }

    /**
     * Returns a string representation of the `HourlyEmployee`. The string representation consists of
     * the first name, last name, id, hours worked, and hourly wage rate of the employee.
     *
     * @return a string representation of the `HourlyEmployee`
     */
    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", id=" + getId() +
                ", hours=" + hours +
                ", wage=" + wage +
                '}';
    }

    /**
     * Calculates the earnings of the `HourlyEmployee`.
     * This method returns the earnings based on the number of hours worked and the hourly wage rate.
     *
     * @return the earnings of the `HourlyEmployee`
     */
    @Override
    public double earnings() {
        return hours * wage;
    }
}