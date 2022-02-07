package com.exercise_will.week04.lamdas.with_parameter;

public class Main {
    public static void main(String[] args) {

        Printable lambdaPrintable = s -> System.out.println("Meow" + s);
        // for multiple parameters = (p,s) -> System.out.println(p + "Meow" + s);

        // if your method implementation is only one expression, java interprets that as your return value
        // Printable lambdaPrintable = s -> "Meow" + s;
        printThing(lambdaPrintable);
    }
    public static void  printThing(Printable thing){
        thing.print("!");
    }
}
