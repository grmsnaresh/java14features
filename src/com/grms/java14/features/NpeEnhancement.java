package com.grms.java14.features;

import com.grms.java14.features.domain.Address;
import com.grms.java14.features.domain.Customer;
import com.grms.java14.features.domain.User;

public class NpeEnhancement {

    public static void main(String args[]) {
        User user = new Customer("32");
        Address.Country country = getCountry(user);
        System.out.println(country);

    }
    public static Address.Country getCountry(User user) {
        return  user.getAddress().getCountry();
    }

}
