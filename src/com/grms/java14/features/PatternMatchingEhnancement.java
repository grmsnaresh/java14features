package com.grms.java14.features;

import com.grms.java14.features.domain.Customer;
import com.grms.java14.features.domain.Employee;
import com.grms.java14.features.domain.User;

public class PatternMatchingEhnancement {

    public static String getUserDetailsOldApproach(User user) {
        if (user instanceof Customer) {
            Customer customer = (Customer) user;
            return customer.getCustomerDetails();
        } else if (user instanceof Employee) {
            Employee employee = (Employee)user;
            return employee.getEmployeeDetails();
        }
        return "";
    }
    public static String getUserDetailsNewApproach(User user) {
        if (user instanceof Customer customer) {
            return customer.getCustomerDetails();
        } else if (user instanceof  Employee employee) {
            return employee.getEmployeeDetails();
        }
        return "";
    }
    public static String getUserDetailsNewApproachPractice(User user) {
        if (!(user instanceof Customer customer) ) {
            if ( (user instanceof Employee employee)) {
                return employee.getEmployeeDetails();
            }

        } else {
            return customer.getCustomerDetails();
        }
        return "";
    }
    public static void main (String args[]) {
        User user = new Customer("33");
//        String details = getUserDetailsOldApproach(user);
//        String details = getUserDetailsNewApproach(user);
        String details = getUserDetailsNewApproachPractice(user);
        System.out.println(details);

    }
}
