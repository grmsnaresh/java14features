package com.grms.java14.features;

import com.grms.java14.features.domain.Customer;
import com.grms.java14.features.domain.User;

public class PatternMatchingEhnancement {
    public static void main (String args[]) {
//        Object obj = new Customer("22");
        Object obj = new String("22");
        int a = switch ("xyz") {
            case "abc","xyz"-> 3;
            default -> 4;
        };
        System.out.println(a);
    }
}
