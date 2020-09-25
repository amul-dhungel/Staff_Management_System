
/**
 * Write a description of class Developer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Developer
{
    private String interviewerName;
    private String platform;
    private int workingHours;
    private String developerName;
    
    public Developer(String platform, String interviewerName,int workingHours){
    
        this.platform = platform;
        this.interviewerName = interviewerName;
        this.workingHours = workingHours;
        //this.developerName = "";
    }
    public void setInterviewerName(String interviewerName){
    
        this.interviewerName = interviewerName;
        
    }
    public void setPlatform(String platform){
    
        this.platform = platform;
    }
    public void setWorkingHours(int workingHours){
    
        this.workingHours = workingHours;
    }
    public void setDeveloperName(String developerName){
    
        this.developerName = developerName;
        
    }
    public String getInterviewerName(){
        
        return interviewerName;
        
    }
    public String getPlatform(){
        
        return platform;
        
    }
    public int getWorkingHours(){
        
        return workingHours;
        
    }
    public String getDeveloperName(){
    
        return developerName;
    
    }
    public void display(){
    
        System.out.println("Platform : "+getPlatform());
        System.out.println("Interviewer Name :"+getInterviewerName());
        System.out.println("Working hours :"+ getWorkingHours());
        if(!developerName.equals("")){
        
            System.out.println("Developer Name : "+ getDeveloperName());
            
        }
    
    }
    
}
