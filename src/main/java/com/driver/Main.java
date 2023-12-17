package com.driver;

public class Main {
    public static class A {
        String meth() {
            return "Invoking method from class A";
        }
    }
    public static class B extends A {
        // Overriding the meth() method
        @Override
        String meth() {
            return "Method is overridden in Extendend class B";
        }
    }
    public static void main(String[] args) {
        // Creating an object of class B
        B objB = new B();

        // Calling the method from class A using the object of class B
        String resultFromA = objB.meth();
        System.out.println(resultFromA);

        // Calling the overridden method from class B
        String resultFromB = objB.meth();
        System.out.println(resultFromB);
    }
  
}