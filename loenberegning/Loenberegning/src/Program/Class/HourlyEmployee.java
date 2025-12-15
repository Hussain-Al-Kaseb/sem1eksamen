package Program.Class;

import Program.Abstrakt.Employee;

public class HourlyEmployee extends Employee {

    private int numberOfHours;
    private float payPrHour;


    @Override
    public float calculateSalary() {
        return numberOfHours*payPrHour;
    }

    public HourlyEmployee(int numberOfHours, float payPrHour) {
        this.numberOfHours = numberOfHours;
        this.payPrHour = payPrHour;
    }
}
