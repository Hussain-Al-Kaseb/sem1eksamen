package Application;

import Program.Abstrakt.Employee;
import Program.Class.CommissionEmployee;
import Program.Class.HourlyEmployee;
import Program.Class.MonthlyEmployee;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        CommissionEmployee commissionEmployee = new CommissionEmployee(10000.73F, 5, 0.20F);
        MonthlyEmployee monthlyEmployee = new MonthlyEmployee(20000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee(37, 134.98F);
        employees.add(commissionEmployee);
        employees.add(hourlyEmployee);
        employees.add(monthlyEmployee);


        for(Employee e : employees) {
            System.out.println(e.calculateSalary());
        }
    }
}
