package com.driver;

public class Main {
    public static void main(String[] args) {
        B objB = new B();

        // Calling the method from class A
        String resultFromA = objB.meth();
        System.out.println(resultFromA);

        // Calling the overridden method from class B
        String resultFromB = objB.meth();
        System.out.println(resultFromB);
    }
  
}