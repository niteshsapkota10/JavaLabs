package employeeslablab2;

import employeeslablab2.Employee;

public class SalaryEmployee extends Employee {
    private double salary;

    public SalaryEmployee(int id, String name, String address, double salary) {
        super(id, name, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+"employeeslablab2.SalaryEmployee{" +
                "salary=" + salary +
                "} " ;
    }

    @Override
    public double Earning() {
//        System.out.println("Salary of employeeslablab2.Employee "+this.getName()+" is "+this.getSalary());
        return this.getSalary();
    }
}
