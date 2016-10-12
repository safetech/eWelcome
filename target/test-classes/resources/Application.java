package resources;

/**
 * Created by sislam13 on 8/31/16.
 */
public class Application {

    public String getTechnicalSupport() {
        return TechnicalSupport;
    }

    public void setTechnicalSupport(String technicalSupport) {
        TechnicalSupport = technicalSupport;
    }
    
    public String getFirstName()
    {
        return FirstName;
    }
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
    
    public String getPlanInformation() {
        return PlanInformation;
    }

    public void setPlanInformation(String planInformation) {
        PlanInformation = planInformation;
    }

    public String TechnicalSupport;
    public String PlanInformation;
    public String FirstName;
    public String UserName;
    public Boolean SiverSneakers;
    public Boolean NurseHealthLine;
    public Boolean SavingsOnVisionContents;
    public Boolean Messages;

    public Boolean getMessages() {
        return Messages;
    }

    public void setMessages(Boolean messages) {
        Messages = messages;
    }

    public Boolean getSavingsOnVisionContents() {
        return SavingsOnVisionContents;
    }

    public void setSavingsOnVisionContents(Boolean savingsOnVisionContents) {
        SavingsOnVisionContents = savingsOnVisionContents;
    }

    

    public Boolean getNurseHealthLine() {
        return NurseHealthLine;
    }

    public void setNurseHealthLine(Boolean nurseHealthLine) {
        NurseHealthLine = nurseHealthLine;
    }

    public Boolean getSiverSneakers() {
        return SiverSneakers;
    }

    public void setSiverSneakers(Boolean siverSneakers) {
        SiverSneakers = siverSneakers;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }
}
