package entities;

import java.util.Objects;

/**
 * The `CommissionEmployee` class extends the `Employee` class, representing an employee who earns a commission based on their sales.
 * It includes fields for gross sales and commission rate.
 */
public class CommissionEmployee extends Employee {
    private float grossSales;
    private int commission;

    /**
     * Constructs a `CommissionEmployee` with the specified first name, last name, id, gross sales, and commission rate.
     *
     * @param firstName the first name of the employee
     * @param lastName the last name of the employee
     * @param id the identification number of the employee
     * @param grossSales the total sales made by the employee
     * @param commission the commission rate of the employee
     */
    public CommissionEmployee(String firstName, String lastName, int id, float grossSales, int commission) {
        super(firstName, lastName, id);
        this.grossSales = grossSales;
        this.commission = commission;
    }

    /**
     * Default constructor for `CommissionEmployee`.
     * Initializes the fields with default values.
     */
    public CommissionEmployee() {
        // Default constructor
    }

    /**
     * Constructs a `CommissionEmployee` with the specified gross sales and commission rate.
     *
     * @param grossSales the total sales made by the employee
     * @param commission the commission rate of the employee
     */
    public CommissionEmployee(float grossSales, int commission) {
        this.grossSales = grossSales;
        this.commission = commission;
    }

    /**
     * Returns the gross sales made by the employee.
     *
     * @return the gross sales made by the employee
     */
    public float getGrossSales() {
        return grossSales;
    }

    /**
     * Sets the gross sales made by the employee.
     *
     * @param grossSales the new gross sales made by the employee
     */
    public void setGrossSales(float grossSales) {
        this.grossSales = grossSales;
    }

    /**
     * Returns the commission rate of the employee.
     *
     * @return the commission rate of the employee
     */
    public int getCommission() {
        return commission;
    }

    /**
     * Sets the commission rate of the employee.
     *
     * @param commission the new commission rate of the employee
     */
    public void setCommission(int commission) {
        this.commission = commission;
    }

    /**
     * Compares this `CommissionEmployee` to the specified object. The result is true if and only if
     * the argument is not null and is a `CommissionEmployee` object that has the same gross sales and commission rate
     * as this object, in addition to the fields inherited from the `Employee` class.
     *
     * @param o the object to compare this `CommissionEmployee` against
     * @return true if the given object represents a `CommissionEmployee` equivalent to this employee, false otherwise
     */
    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof CommissionEmployee that)) return false;
        if (!super.equals(o)) return false;

        return Float.compare(grossSales, that.grossSales) == 0 && commission == that.commission;
    }

    /**
     * Returns a hash code value for the `CommissionEmployee`. This method is supported for the benefit
     * of hash tables such as those provided by `HashMap`.
     *
     * @return a hash code value for this `CommissionEmployee`
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), grossSales, commission);
    }

    /**
     * Returns a string representation of the `CommissionEmployee`. The string representation consists of
     * the first name, last name, id, gross sales, and commission rate of the employee.
     *
     * @return a string representation of the `CommissionEmployee`
     */
    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", id=" + getId() +
                ", grossSales=" + grossSales +
                ", commission=" + commission +
                '}';
    }

    /**
     * Calculates the earnings of the `CommissionEmployee`.
     * This method should be implemented to return the actual earnings based on gross sales and commission rate.
     *
     * @return the earnings of the `CommissionEmployee`
     */
    @Override
    public double earnings() {
        return 0;
    }
}