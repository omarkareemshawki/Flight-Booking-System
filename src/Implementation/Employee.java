
package Implementation;

/**
 *
 * @author Ze2reda
 */
public class Employee extends Person {
    
    private String[] Usernames = {"Sarah", "Alia", "Majed"};
    private String[] Passwords = {"sarah123", "alia123", "majed123"};
    
    private String jobTitle;
    private double salary;
    private String department;
    private boolean isAdmin;
    private int yearsOfService;
    private String username;
    private String password;

    public Employee(String name, int age, String jobTitle, double salary, String department, boolean isAdmin, int yearsOfService, String username, String password) {
        super(name, age);
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.department = department;
        this.isAdmin = isAdmin;
        this.yearsOfService = yearsOfService;
        this.username = username;
        this.password = password;
    }
    
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean login(String enteredUsername, String enteredPassword) {
        for (int i = 0; i < this.Usernames.length; i++) {
            if (enteredUsername.equals(this.Usernames[i]) && enteredPassword.equals(this.Passwords[i])) {
                return true;
            }
        }
        return false;
    }
}
