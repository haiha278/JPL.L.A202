package fa.training.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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
        if (email.matches("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$")) {
            return true;
        } else {
            System.out.println("Email not available");
            return false;
        }
    }
}
