public class LowRankStaff extends Staff{
    public Double bonus;

    public LowRankStaff(String staffName, String staffID, String title,Double salary){
        super(staffName,staffID,title,salary);
    }

   
    public void setBonus() {
        bonus = salary*0.1;
        System.out.println("Bonus : " + "RM " + df.format(bonus));
    }

    @Override
    public Double getSalary() {
        return (bonus+salary);
    }

    public void setOfficeTableNo() {
        System.out.println("Table Number : " + (int)Math.floor(Math.random()*(100-1+1)+1));
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        setOfficeTableNo();
        setBonus();
    }
}