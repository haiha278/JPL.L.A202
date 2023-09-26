package fa.training.entities;

import java.util.List;

public class Department {
    private String departmentName;
    private List<Employee> employeeList;

    public Department() {
    }

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public Department(String departmentName, List<Employee> employeeList) {
        this.departmentName = departmentName;
        this.employeeList = employeeList;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
