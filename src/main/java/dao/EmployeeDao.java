package java.dao;

import java.entity.Employee;

/**
 * Created by Z.Neptune on 2017/9/10.
 */
public interface EmployeeDao {
    public Employee viewInfor();
    public Employee updateInfor();
    public String viewWork();
    public void viewLevel();
    public boolean submitReport();
    public String viewReport();
}
