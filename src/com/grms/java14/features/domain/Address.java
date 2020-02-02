package com.grms.java14.features.domain;

/**
 * Created by grmsnaresh on 02-02-2020.
 */
public class Address {
    public enum Country {
        INDIA, USA, UK, CANADA, SRILANKA, PAKISTAN
    }
    private String hno;
    private String street;
    private String city;
    private String state;
    private Country country;

    public String getHno() {
        return hno;
    }

    public void setHno(String hno) {
        this.hno = hno;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
