package Collections;

public class Empoyee {
    private int employeeId;
    private String fName;
    private String lName;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Empoyee{");
        sb.append("employeeId=").append(employeeId);
        sb.append(", fName='").append(fName).append('\'');
        sb.append(", lName='").append(lName).append('\'');
        sb.append(", salary=").append(salary);
        sb.append(", address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Empoyee(int employeeId, String fName, String lName, long salary, String address) {
        this.employeeId = employeeId;
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
        this.address = address;
    }

    private long salary;
    private String address;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
