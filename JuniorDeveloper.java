
/**
 * Write a description of class Juniordeveloper here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JuniorDeveloper extends Developer
{
    private int salary;
    private String appointedDate;
    private String evaluationPeriod;
    private String terminationDate;
    private String specialization;
    private String appointedBy;
    private boolean joined;
    
  public JuniorDeveloper(String platform, String interviewerName, int workingHours, int salary, String appointedBy, String terminationDate){
    
      super(platform, interviewerName, workingHours);
      this.salary=salary;
      this.appointedBy=" ";
      this.terminationDate=terminationDate;
      //this.evaluationPeriod=" ";
      //this.specialization=" ";
      this.joined=false;
        
    }
  public float getSalary()
    {
        return salary;
    }
  public String getAppointedDate()
    {
        return appointedDate;
    }
  public String getEvaluationPeriod()
    {
        return evaluationPeriod;
    }
  public String getTerminationDate()
   {
        return terminationDate;
    }
  public String getSpecialization()
   {
        return specialization;
    }
  public String getAppointedBy()
   {
        return appointedBy;
    }
  public boolean getJoined()
   {
       return joined;
    }
  public void setSalary(int salary)
  {
       if(joined==false)
       {
            this.salary = salary;
            System.out.println("The salary is sucessfully set");
       }
       if(joined==true)
       {
            System.out.println("As developer has already joined.");
            System.out.println("Therefore it is not possible to change ta salary");
       } 
  }
  public void appointDeveloper(String developerName, String appointedDate, String terminationDate, String specialization)
  {
        if (joined==false)
        {
            super.setDeveloperName(developerName);
            this.appointedDate=appointedDate;
            this.terminationDate=terminationDate;
            this.specialization=specialization;
            joined=true;
        }
        else
        {
            System.out.println("The developer is already appointed.");
            System.out.println("Appointed Date: "+getAppointedDate());
        }
  }
  public void display()
  {
        super.display();
        if(joined==true)
        {
            System.out.println("Appointed Date= "+getAppointedDate());
            System.out.println("Developer Name= "+getDeveloperName());
            //System.out.println("Evaluation Period= "+getEvaluationPeriod());
            System.out.println("Termination Date= "+getTerminationDate());
            System.out.println("Developer Salary= "+getSalary());
            System.out.println("Developer Specialization= "+getSpecialization());
            System.out.println("Appointed By= "+getAppointedBy());
        }
  }
}

