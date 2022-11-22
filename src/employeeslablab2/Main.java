package employeeslablab2;

import employeeslablab2.CommissionEmployee;
import employeeslablab2.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Employee> employeeArrayList=new ArrayList<>();
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int status=1;
        while(status!=-1) {
            System.out.println("Menu Choose ::");
            System.out.println("1. To create a employeeslablab2.SalaryEmployee");
            System.out.println("2. To create a Commission employeeslablab2.Employee");
            System.out.println("3. To create a BasicPlusSalary employeeslablab2.Employee");
            System.out.println("4. To create an Hourly employeeslablab2.Employee");
            System.out.println("5. Display all employees :: ");
            System.out.println(" -1 To exit ");
            status = sc.nextInt();
            switch (status) {
                case 1:
                    addSalaryEmployee();
                    break;
                case 2:
                    addCommissionEmployee();
                    break;
                case 5:
                    displayAllEmployees();
                    break;
                default:
                    System.out.println("Invalid Option Choose:");
            }
        }
    }
    public static void addSalaryEmployee(){
        System.out.println("Enter id, name , address and salary :");
        int id=sc.nextInt();
        String name=sc.next();
        String address=sc.next();
        double salary=sc.nextDouble();
        SalaryEmployee salaryEmployee=new SalaryEmployee(id,name,address,salary);
        employeeArrayList.add(salaryEmployee);
    }
    public static void addCommissionEmployee(){
        System.out.println("Enter id, name , address ,sales and rate:");
        int id=sc.nextInt();
        String name=sc.next();
        String address=sc.next();
        int sales=sc.nextInt();
        double rate=sc.nextDouble();
        CommissionEmployee commissionEmployee=new CommissionEmployee(id,name,address,sales,rate);
        employeeArrayList.add(commissionEmployee);
    }
    public static void addBasicPlusEmployee(){
        System.out.println("Enter id, name , address ,sales and rate:");
        int id=sc.nextInt();
        String name=sc.next();
        String address=sc.next();
        int sales=sc.nextInt();
        double rate=sc.nextDouble();
        CommissionEmployee commissionEmployee=new CommissionEmployee(id,name,address,sales,rate);
        employeeArrayList.add(commissionEmployee);
    }
    public static void displayAllEmployees(){
        for(Employee e:employeeArrayList){
            System.out.println(e);
        }
    }
}
