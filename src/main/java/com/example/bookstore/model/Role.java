package com.example.bookstore.model;

public enum Role {
    ADMIN("Manager"),
    USER("Shopper");
    private final String value;

    Role(String value) {
        this.value = value;
    }
}
