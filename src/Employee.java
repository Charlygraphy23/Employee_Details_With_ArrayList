public class Employee {

    private int empID;
    private String empName;
    private int empAge;
    private Gender empGender;
    private String empPost;

    public Employee(int empID, String empName, int empAge, Gender empGender, String empPost) {
        this.empID = empID;
        this.empName = empName;
        this.empAge = empAge;
        this.empGender = empGender;
        this.empPost = empPost;
    }


    // Generating Getter Setter


    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public Gender getEmpGender() {
        return empGender;
    }

    public void setEmpGender(Gender empGender) {
        this.empGender = empGender;
    }

    public String getEmpPost() {
        return empPost;
    }

    public void setEmpPost(String empPost) {
        this.empPost = empPost;
    }
}
