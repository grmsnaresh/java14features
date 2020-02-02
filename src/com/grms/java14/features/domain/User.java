package com.grms.java14.features.domain;


/**
 * Created by grmsnaresh on 02-02-2020.
 */
public class User {
    private enum Gender {
        MALE, FEMALE, NOT_SPECIFIED
    }
    private String name;
    private Address address;
    private Gender gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
