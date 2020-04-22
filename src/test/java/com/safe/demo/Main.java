package com.safe.demo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Main {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String s = "123456";
        String encode = encoder.encode(s);
        System.out.println(encode);
    }
}
