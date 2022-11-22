package employeeslablab2;

import employeeslablab2.Employee;

public class CommissionEmployee extends Employee {
    private int sales;

    public CommissionEmployee(int id, String name, String address, int sales, double rate) {
        super(id, name, address);
        this.sales = sales;
        this.rate = rate;
    }

    private double rate;

    private double totalearn;


    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        try{
            if(sales<0){
                throw new NegativeSalesException("Sales cannot be negative !!!...");
            }
        }catch (NegativeSalesException exception){
            System.out.println(exception.toString());
        }
        if(sales<1000){
            this.setRate(5.0);
        }else{
            this.setRate(10.0);
        }
        this.sales = sales;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double setTotalearn(){
        return this.sales*this.rate;
    }


    @Override
    public String toString() {
        return super.toString()+"employeeslablab2.CommissionEmployee{" +
                "sales=" + sales +
                ", rate=" + rate +
                ", totalearn=" + totalearn +
                "} ";
    }

    @Override
    public double Earning() {
//            System.out.println(this);
        return this.setTotalearn();
    }
}
