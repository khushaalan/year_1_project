import java.text.DecimalFormat;

public class Staff extends OfficeApp{
    public String staffName;
    public String staffID;
    public String title;
    public Double salary;
    DecimalFormat df = new DecimalFormat("0.00");
    
    public Staff(String staffName,String staffID,String title,Double salary){
        this.staffName=staffName;
        this.staffID=staffID;
        this.title=title;
        this.salary=salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void displayInfo(){
        System.out.println("Name   : " + staffName) ;
        System.out.println("ID     : " + staffID);
        System.out.println("Title  : " + title);
    }
}