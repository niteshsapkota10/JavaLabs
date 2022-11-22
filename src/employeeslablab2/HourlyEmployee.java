package employeeslablab2;

import employeeslablab2.Employee;

public class HourlyEmployee extends Employee {
    private int hours;
    private double hourlyRate;

    public int getHours() {
        return hours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public HourlyEmployee(int id, String name, String address, int hours, double hourlyRate) {
        super(id, name, address);
        try{
            if(hours<0){
                throw new NegativeHoursException("Hours cannot be negative ");
            }else{
                this.hours=hours;
                this.hourlyRate = hourlyRate;
            }
        }catch (NegativeHoursException ex){
            System.out.println(ex.toString());
        }
    }

    @Override
    public double Earning() {
        return this.hourlyRate*this.hours;
    }

    @Override
    public String toString() {
        return super.toString()+"employeeslablab2.HourlyEmployee{" +
                "hours=" + hours +
                ", hourlyRate=" + hourlyRate +
                "Earning = "+this.Earning()+"} " ;
    }
}
