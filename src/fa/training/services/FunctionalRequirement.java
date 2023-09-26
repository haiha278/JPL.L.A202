package fa.training.services;

import fa.training.entities.Department;
import fa.training.entities.Employee;
import fa.training.entities.HourlyEmployee;
import fa.training.entities.SalariedEmployee;
import fa.training.utils.Validation;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class FunctionalRequirement {
    Validation validation = new Validation();

    public Department addEmployee() {
        Scanner sc = new Scanner(System.in);
        List<Department> departments = List.of(new Department("domA"), new Department("domB"), new Department("domC"));
        Department department = new Department();
        while (true) {
            System.out.println("Enter department name: ");
            String depName = sc.next();
            department = validation.checkDepartmentExist(depName, departments);
            if (depName.isEmpty() || department.equals(null)) {
                System.out.println("Department name not existed");
                continue;
            }
            List<Employee> employees = new ArrayList<>();

            System.out.println("Choose your type of employee:");
            System.out.println("1. Hourly Employee");
            System.out.println("2. Salaried Employee");

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
                        if (email.isEmpty() || !validation.checkEmailFormat(email)) {
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

                    while (true) {
                        try {
                            System.out.println("Enter your working hours:");
                            String working_hour = sc.next();
                            if (working_hour.isEmpty()) {
                                System.out.println("Information can not be empty");
                                continue;
                            } else {
                                hourlyEmployee.setWorkingHours(Double.parseDouble(working_hour));
                                break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Working hour must be number");
                            continue;
                        }
                    }
                    employees.add(hourlyEmployee);
                }

                if (choice == 2) {
                    SalariedEmployee salariedEmployee = new SalariedEmployee();
                    while (true) {
                        System.out.println("Enter your ssn:");
                        String ssn = sc.next();
                        if (ssn.isEmpty()) {
                            System.out.println("Information can not be empty");
                            continue;
                        }
                        salariedEmployee.setSsn(ssn);
                        break;
                    }

                    while (true) {
                        System.out.println("Enter your first name:");
                        String firstName = sc.next();
                        if (firstName.isEmpty()) {
                            System.out.println("Information can not be empty");
                            continue;
                        }
                        salariedEmployee.setFirstName(firstName);
                        break;
                    }

                    while (true) {
                        System.out.println("Enter your last name:");
                        String lastName = sc.next();
                        if (lastName.isEmpty()) {
                            System.out.println("Information can not be empty");
                            continue;
                        }
                        salariedEmployee.setLastName(lastName);
                        break;
                    }

                    while (true) {
                        System.out.println("Enter your date of birth:");
                        String date = sc.next();
                        if (!validation.checkDateFormat(date) || date.isEmpty()) {
                            continue;
                        }
                        salariedEmployee.setBirthDate(date);
                        break;
                    }

                    while (true) {
                        System.out.println("Enter your phone:");
                        String phone = sc.next();
                        if (!validation.checkPhoneFormat(phone) || phone.isEmpty()) {
                            continue;
                        }
                        salariedEmployee.setPhone(phone);
                        break;
                    }

                    while (true) {
                        System.out.println("Enter your email:");
                        String email = sc.next();
                        if (!validation.checkEmailFormat(email) || email.isEmpty()) {
                            continue;
                        }
                        salariedEmployee.setEmail(email);
                        break;
                    }

                    while (true) {
                        try {
                            System.out.println("Enter your commisstionRate:");
                            String conmmistionRate = sc.next();
                            if (conmmistionRate.isEmpty()) {
                                System.out.println("Information can not be empty");
                                continue;
                            } else {
                                salariedEmployee.setCommisstionRate(Double.parseDouble(conmmistionRate));
                                break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Comission rate must be number");
                            continue;
                        }
                    }

                    while (true) {
                        try {
                            System.out.println("Enter your grossSales:");
                            String gross_sale = sc.next();
                            if (gross_sale.isEmpty()) {
                                System.out.println("Information can not be empty");
                                continue;
                            } else {
                                salariedEmployee.setGrossSales(Double.parseDouble(gross_sale));
                                break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Gross sales must be number");
                            continue;
                        }
                    }

                    while (true) {
                        try {
                            System.out.println("Enter your basic salary:");
                            String basic_salary = sc.next();
                            if (basic_salary.isEmpty()) {
                                System.out.println("Information can not be empty");
                                continue;
                            } else {
                                salariedEmployee.setBasicSalary(Double.parseDouble(basic_salary));
                                break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Basic salary must be number");
                            continue;
                        }
                    }
                    employees.add(salariedEmployee);
                }
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Choice not valid");
            }
            department.setEmployeeList(employees);
            break;
        }
        return department;
    }

}
