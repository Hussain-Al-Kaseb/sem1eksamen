package Program.Class;

import Program.Abstrakt.Employee;

public class CommissionEmployee extends Employee {
    private float baseSalary;
    private int salesAmount;
    private float commissionPercentage;


    @Override
    public float calculateSalary() {
        return baseSalary+(salesAmount*commissionPercentage);
    }

    public CommissionEmployee(float baseSalary, int salesAmount, float commissionPercentage) {
        this.baseSalary = baseSalary;
        this.salesAmount = salesAmount;
        this.commissionPercentage = commissionPercentage;
    }


}
