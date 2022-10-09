public class HighRankStaff extends Staff{
    public String officeNo;
    public String OfficeColour;


    public HighRankStaff(String staffName, String staffID, String title,Double salary, String officeNo){
        super(staffName,staffID,title,salary);
        this.officeNo=officeNo;
    }

    public void setOfficeColour() {
        String []color= {"Gray","Pastel Yellow","Light Blue","Brown","Orange"};
        //CHOOSE RANDOM COLOUR FROM THE ARRAY
        int temp=(int)Math.floor(Math.random()*(4-0+1)+0);
        OfficeColour=color[temp];
        System.out.println("Office Colour : " + OfficeColour);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Office Number : " + officeNo);
        setOfficeColour();
        System.out.println("Salary : " + "RM " +  df.format(salary));
    }
}