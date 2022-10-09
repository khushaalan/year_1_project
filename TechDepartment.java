public class TechDepartment extends LowRankStaff{
    public String teamName;

    public TechDepartment(String staffName, String staffID, String title, Double salary, String teamName){
        super(staffName,staffID,title,salary);
        this.teamName=teamName;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Salary : " + "RM " + df.format(getSalary()));
        System.out.println("Team Name : " + teamName);
    }
}