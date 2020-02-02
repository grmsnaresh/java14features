package com.grms.java14.features.domain;

import java.util.Objects;

/**
 * Created by grmsnaresh on 02-02-2020.
 */
public class Customer extends User {

    private String customerId;

    public Customer(String customerId) {
        this.customerId = customerId;
    }

    public Customer() {
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Customer cust)) return false;

        return Objects.equals(customerId, cust.customerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                '}';
    }
}
