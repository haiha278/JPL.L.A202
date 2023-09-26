package fa.training.utils;

import fa.training.entities.Department;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Validation {
    public boolean checkDateFormat(String date) {
        DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        try {
            sdf.parse(date);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    public boolean checkPhoneFormat(String phone) {
        if (phone.length() >= 7 && phone.matches("^[0-9]*$")) {
            return true;
        } else {
            System.out.println("Phone must be number and has at least 7 digit");
            return false;
        }
    }

    public boolean checkEmailFormat(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    public Department checkDepartmentExist(String depName, List<Department> departments) {
        for (Department department : departments) {
            if (department.getDepartmentName().equalsIgnoreCase(depName)) {
                return department;
            }
        }
        return null;
    }
}
