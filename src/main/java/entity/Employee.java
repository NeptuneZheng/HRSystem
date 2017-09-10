package java.entity;

/**
 * Created by Z.Neptune on 2017/9/10.
 */
public class Employee {
    private int id;
    private String name;
    private String password;
    private String level;
    private String sex;
    private String department;
    private String salary;
    private String work;
    private String report;

    public Employee() {
    }

    public Employee(int id, String name, String password, String level, String sex, String department, String salary, String work, String report) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.level = level;
        this.sex = sex;
        this.department = department;
        this.salary = salary;
        this.work = work;
        this.report = report;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
