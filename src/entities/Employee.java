package entities;

import java.util.Objects;

/**
 * The `Employee` class is an abstract base class for various types of employees.
 * It contains common properties and methods that are shared among all employee types.
 */
public abstract class Employee {
    private String firstName;
    private String lastName;
    private int id;

    /**
     * Constructs an `Employee` with the specified first name, last name, and id.
     *
     * @param firstName the first name of the employee
     * @param lastName the last name of the employee
     * @param id the identification number of the employee
     */
    public Employee(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    /**
     * Constructs an `Employee` with default values.
     * Default values are "plony" for first name, "almony" for last name, and 0 for id.
     */
    public Employee() {
        this("plony", "almony", 0);
    }

    /**
     * Returns the first name of the employee.
     *
     * @return the first name of the employee
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the employee.
     *
     * @param firstName the new first name of the employee
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the last name of the employee.
     *
     * @return the last name of the employee
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the employee.
     *
     * @param lastName the new last name of the employee
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the identification number of the employee.
     *
     * @return the identification number of the employee
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the identification number of the employee.
     * The id must be positive; otherwise, an `IllegalArgumentException` is thrown.
     *
     * @param id the new identification number of the employee
     * @throws IllegalArgumentException if the id is not positive
     */
    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("id should be positive");
        }
        this.id = id;
    }

    /**
     * Compares this employee to the specified object. The result is true if and only if
     * the argument is not null and is an `Employee` object that has the same id, first name,
     * and last name as this object.
     *
     * @param o the object to compare this `Employee` against
     * @return true if the given object represents an `Employee` equivalent to this employee, false otherwise
     */

     @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employee employee)) return false;

        return id == employee.id
                    && firstName.equals(employee.firstName)
                    && lastName.equals(employee.lastName);
    }

    /**
     * Returns a hash code value for the employee. This method is supported for the benefit
     * of hash tables such as those provided by `HashMap`.
     *
     * @return a hash code value for this employee
     */
    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + id;
        return result;
    }

    /**
     * Returns a string representation of the employee. The string representation consists of
     * the first name, last name, and id of the employee.
     *
     * @return a string representation of the employee
     */
    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }

    /**
     * Abstract method to calculate the earnings of the employee.
     * Subclasses must provide an implementation for this method.
     *
     * @return the earnings of the employee
     */
    public abstract double earnings();
}