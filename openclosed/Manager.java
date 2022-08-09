package openclosed;
public class Manager extends Employee{

    
    private String managerName;
    private int teamSize;

    public Manager(java.lang.String employeeId, float employeeSalary , String managerName , int teamSize) {
        super(employeeId, employeeSalary);
        this.managerName = managerName;
        this.teamSize = teamSize;
    }

    public String getManagerName() {
        return this.managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public int getTeamSize() {
        return this.teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }


    @Override
    public String toString() {
        return "{" +
            " managerName='" + getManagerName() + "'" +
            ", teamSize='" + getTeamSize() + "'" +
            "}";
    }
}
