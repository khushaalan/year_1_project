public class SalesDepartment extends LowRankStaff {
    public Double sales ;
    public Double commission=0.00;

    public SalesDepartment(String staffName, String staffID, String title, Double salary, Double sales) {
        super(staffName, staffID, title, salary);
        this.sales = sales;
    }

    //Staffs from Sales Department receives 5% commission from their total monthly Sales. ONLY IF THEY HIT THEIR SALES TARGET (RM20000)
    public void calcCommission() {
        if (sales >= 20000) {
            commission = (sales * 0.05);
            System.out.println("Commission : " + "RM" + df.format(commission));
        } else {
            System.out.println("Commission : " + "RM 0.00");
        }
    }

    @Override
    public Double getSalary() {
        return bonus + commission + salary;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        calcCommission();
        System.out.println("Salary : " + "RM " + df.format(getSalary()));
    }
}