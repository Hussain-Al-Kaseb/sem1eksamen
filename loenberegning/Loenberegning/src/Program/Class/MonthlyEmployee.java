package Program.Class;

import Program.Abstrakt.Employee;

public class MonthlyEmployee extends Employee {
    private float salary;


    @Override
    public float calculateSalary() {

        return salary;
    }

    public MonthlyEmployee(float salary) {
        this.salary = salary;
    }
}
