package employeeslablab2;

public class BasicPlusCommission extends CommissionEmployee {
    private double basicSalary;
    public BasicPlusCommission(int id, String name, String address, int sales, double rate, double basicSalary) {
        super(id, name, address, sales, rate);
        this.basicSalary = basicSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public double Earning() {
        return super.Earning()+this.getBasicSalary();
    }
}
