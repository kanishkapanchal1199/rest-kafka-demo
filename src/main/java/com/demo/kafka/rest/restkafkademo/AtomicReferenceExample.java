package com.demo.kafka.rest.restkafkademo;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceExample {
    public static void main(String[] args) {
        AtomicReference<String> atomicRef = new AtomicReference<>("Initial Value");

        String oldValue = atomicRef.get();
        System.out.println("Old Value: " + oldValue);

        String newValue = "New Value";
        atomicRef.set(newValue);

        String updatedValue = atomicRef.get();
        System.out.println("Updated Value: " + updatedValue);
        
        System.out.println(oldValue);
        
        String abc="abc";
        System.out.println(abc);
        
        abc="abcd";
        System.out.println(abc);
        
    }
}
