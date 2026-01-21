package com.intuit.interview.sorbyfirstnameandcountry;

class Employee {
    private String firstName;
    private String country;

    public Employee(String firstName, String country) {
        this.firstName = firstName;
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return firstName + " (" + country + ")";
    }
}



