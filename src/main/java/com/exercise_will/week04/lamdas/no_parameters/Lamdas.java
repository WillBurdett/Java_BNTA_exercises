package com.exercise_will.week04.lamdas.no_parameters;

public class Lamdas {
    public static void main(String[] args) {
        // can only be used with certain types of interfaces

        // interfaces are like a contract, that says any class that implements that interface
        // as to provide their own implementations of the methods provided by that interface.

        // a functional interface has 1 abstract method
        // you could even put @FunctionalInterface

        // Lamdas can ONLY be used when an interface has exactly ONE abstract method
        // SAM = single abstract method

        Cat myCat = new Cat();
        myCat.print();
        // public void print(){
        //    System.out.println("Meow");
        // }
        // or
        printThing(() -> { // we don't need a name, access modifier or return type
                    System.out.println("Meow");
                } // if you pass in one expression, you can remove the curly braces
        );

        // we can save this implementation of the method as a variable
        Printable lamdaPrintable = () -> System.out.println("Meow");
        printThing(lamdaPrintable);


        // instead of passing in an object with a specific method implementation,
        // we just pass in the implementation directly
    }

    static void printThing(Printable thing){
        thing.print();
    }
}
