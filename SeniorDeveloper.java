
/**
 * Write a description of class Seniordeveloper here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SeniorDeveloper extends Developer
{
    private int salary;
    private String joiningDate;
    private String staffRoomNumber;
    private int contractPeriod;
    private int advanceSalary;
    private boolean appointed;
    private boolean terminated;
    
    public SeniorDeveloper(String platform, String interviewerName, int workingHours, int salary, int contractPeriod){
        super(platform,interviewerName,workingHours);
        this.salary = salary;
        this.contractPeriod = contractPeriod;
        this.joiningDate = "";
        this.staffRoomNumber = "";
        this.advanceSalary = 0;
        this.appointed = false;
        this.terminated = false;   
        
    }
    public void setContractPeroid(int contractPeriod){
        this.contractPeriod = contractPeriod;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getContractPeroid(){
        return contractPeriod;
    }
    public int getSalary(){
        return salary;
    }
    public String getJoiningDate(){
        return joiningDate;
    }
    public String getStaffRoomNumber(){
        return staffRoomNumber;
    }
    public int getAdvanceSalary(){
        return advanceSalary;
    }
    public boolean getAppointed(){
        return appointed;
    }
    public boolean getTerminated(){
        return terminated;
    }
    public void hireDeveloper(String developerName, String joiningDate, int advanceSalary, String staffRoomNumber){
    
        if(appointed == true){
            System.out.println("Developer is already hired.");
            System.out.println("Developer Name ="+super.getDeveloperName());
            System.out.println("Room Number:"+getStaffRoomNumber());
        }
        else{
            super.setDeveloperName(developerName);
            this.joiningDate = joiningDate;
            this.staffRoomNumber = staffRoomNumber;
            this.advanceSalary = advanceSalary;
            appointed = true;
            terminated = false;
            System.out.println("The developer is hired");
        }
        
    }
      public void termination()
    {
        if(terminated==true)
        {
            System.out.println("Developer is already terminated.");
            System.out.println("You can hire new developer now.");
        }
        else
        {
            setDeveloperName(" ");
            joiningDate=" ";
            advanceSalary=0;
            terminated=true;
            appointed=false;
        }
    }
    public void print()
    {
       
        System.out.println("Platform="+getPlatform());
        System.out.println("Interviewer Name="+getInterviewerName());
        System.out.println("Developer Salary="+getSalary()); 
    }
    public void display()
    {
        super.display();
        if(appointed==true)
        {
            System.out.println("Staff Room Number= "+getStaffRoomNumber());
            System.out.println("Join Date= "+getJoiningDate());
            System.out.println("Advance Salary= "+getAdvanceSalary());
            System.out.println("The Senior developer has been hired");
        }
    }
}
