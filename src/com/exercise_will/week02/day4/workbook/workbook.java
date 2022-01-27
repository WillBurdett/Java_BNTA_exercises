package com.exercise_will.week02.day4.workbook;

public class workbook {
    public static void main(String[] args) {

        // exit code 1 means our program exited unsuccessfully
        // to see the previous exit code in bash (terminal) ' echo "$?" '

        String number = "10x";
        try{
            int result = Integer.parseInt(number);
            System.out.println("foobar"); // will not be executed as the parsing above failed
        } catch (Exception e){ // this will catch all. the "parent" of all exceptions
            System.out.println("oops failed to parse " + number);
        }
        System.out.println("foo");

        // checked exceptions represent errors outside the control of the program
        // e.g. reading a file
        // IDE warns that you haven't handled a potential error. Won't even compile!
        // Throws any subclass of Exception, except those that are a subclass of RuntimeException

        // Unchecked exceptions represent an error inside the program logic
        // e.g. arithmetic exception
        // Will compile then run! But will stop run and throw an error if error is found and unhandled
        // These are RuntimeExceptions
    }

    // if you don't want to deal with the exception (try/catch)
    // you can 'throw' the exception


}

