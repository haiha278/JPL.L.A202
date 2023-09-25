package fa.training.services;

import fa.training.entities.Department;
import fa.training.entities.Employee;
import fa.training.entities.HourlyEmployee;
import fa.training.utils.Validation;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class FunctionalRequirement {
    Validation validation = new Validation();

    public Department addEmployee() {
        List<Employee> employees = new ArrayList<>();
        System.out.println("Choose your type of employee:");
        System.out.println("1. Hourly Employee");
        System.out.println("2. Salaried Employee");
        Scanner sc = new Scanner(System.in);
        int choice;
        try {
            choice = sc.nextInt();
            if (choice == 1) {
                HourlyEmployee hourlyEmployee = new HourlyEmployee();
                while (true) {
                    System.out.println("Enter your ssn:");
                    String ssn = sc.next();
                    if (ssn.isEmpty()) {
                        System.out.println("Information can not be empty");
                        continue;
                    }
                    hourlyEmployee.setSsn(ssn);
                    break;
                }

                while (true) {
                    System.out.println("Enter your first name:");
                    String firstName = sc.next();
                    if (firstName.isEmpty()) {
                        System.out.println("Information can not be empty");
                        continue;
                    }
                    hourlyEmployee.setFirstName(firstName);
                    break;
                }

                while (true) {
                    System.out.println("Enter your last name:");
                    String lastName = sc.next();
                    if (lastName.isEmpty()) {
                        System.out.println("Information can not be empty");
                        continue;
                    }
                    hourlyEmployee.setLastName(lastName);
                    break;
                }

                while (true) {
                    System.out.println("Enter your date of birth:");
                    String date = sc.next();
                    if (!validation.checkDateFormat(date) || date.isEmpty()) {
                        continue;
                    }
                    hourlyEmployee.setBirthDate(date);
                    break;
                }

                while (true) {
                    System.out.println("Enter your phone:");
                    String phone = sc.next();
                    if (!validation.checkPhoneFormat(phone) || phone.isEmpty()) {
                        continue;
                    }
                    hourlyEmployee.setPhone(phone);
                    break;
                }

                while (true) {
                    System.out.println("Enter your email:");
                    String email = sc.next();
                    if (!validation.checkEmailFormat(email) || email.isEmpty()) {
                        continue;
                    }
                    hourlyEmployee.setEmail(email);
                    break;
                }

                while (true) {
                    try {
                        System.out.println("Enter your wage:");
                        String wage = sc.next();
                        if (wage.isEmpty()) {
                            System.out.println("Information can not be empty");
                            continue;
                        } else {
                            hourlyEmployee.setWage(Double.parseDouble(wage));
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("wage must be number");
                        continue;
                    }
                }
                employees.add(hourlyEmployee);
            }
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Choice not valid");
        }

        return null;
    }

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                String a = sc.next();
                double b = Double.parseDouble(a);
            } catch (NumberFormatException e) {
                System.out.println("Error");
                continue;
            }
        }

    }
}
