package com.example.redischatting.core.security;

public interface AuthToken<T> {
    boolean validate();
    T getData();
}