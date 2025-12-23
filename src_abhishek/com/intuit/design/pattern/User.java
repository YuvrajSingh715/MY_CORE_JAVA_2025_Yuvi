package com.intuit.design.pattern;

public class User {

    private String name;        // mandatory
    private String email;       // optional
    private String phone;       // optional

    private User(UserBuilder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    // Static Builder Class
    public static class UserBuilder {
        private String name;
        private String email;
        private String phone;

        public UserBuilder(String name) { // mandatory field
            this.name = name;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}

