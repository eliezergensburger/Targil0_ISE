package entities;

import java.util.Objects;

public class CommissionEmployee extends Employee{
    private float grossSales;
    private int commission;

    public CommissionEmployee(String firstName, String lastName, int id, float grossSales, int commission) {
        super(firstName, lastName, id);
        this.grossSales = grossSales;
        this.commission = commission;
    }
    public CommissionEmployee(){
        this.grossSales = 0;
        this.commission = 0;
    }
    public CommissionEmployee(float grossSales, int commission) {
        this.grossSales = grossSales;
        this.commission = commission;
    }

    public float getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(float grossSales) {
        this.grossSales = grossSales;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CommissionEmployee that = (CommissionEmployee) o;
        return Float.compare(that.grossSales, grossSales) == 0 && commission == that.commission;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), grossSales, commission);
    }

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

    @Override
    public double earnings() {
        return 0;
    }
}
