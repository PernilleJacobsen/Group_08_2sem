package control;

import java.io.Serializable;


/**
 *
 * @author Jeanette
 */
public class ProjectDTO implements Serializable
{
    private int projectID;
    private String startDate;
    private String endDate;
    private String currency;
    private String activityDescription;
    private String comments;
    private String targetAudience;
    private String objectiveResult;
    private int PartnerID;
    private String firstname;
    private String lastname;
    private String phone;
    private int projectBudget;

    public ProjectDTO(int projectID, String startDate, String endDate, String currency, String activityDescription, String comments, String targetAudience, String objectiveResult, int PartnerID, String firstname, String lastname, String phone, int projectBudget)
    {
        this.projectID = projectID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.currency = currency;
        this.activityDescription = activityDescription;
        this.comments = comments;
        this.targetAudience = targetAudience;
        this.objectiveResult = objectiveResult;
        this.PartnerID = PartnerID;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.projectBudget = projectBudget;
    }

    public int getProjectID()
    {
        return projectID;
    }

    public String getStartDate()
    {
        return startDate;
    }

    public String getEndDate()
    {
        return endDate;
    }

    public String getCurrency()
    {
        return currency;
    }

    public String getActivityDescription()
    {
        return activityDescription;
    }

    public String getComments()
    {
        return comments;
    }

    public String getTargetAudience()
    {
        return targetAudience;
    }

    public String getObjectiveResult()
    {
        return objectiveResult;
    }

    public int getPartnerID()
    {
        return PartnerID;
    }

    public String getFirstname()
    {
        return firstname;
    }

    public String getLastname()
    {
        return lastname;
    }

    public String getPhone()
    {
        return phone;
    }

    public int getProjectBudget()
    {
        return projectBudget;
    }
    
    
    
    
    
    
    
    
}