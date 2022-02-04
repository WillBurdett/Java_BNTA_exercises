package com.exercise_will.week03.day5.testing_workbook;

public class workbook {

    // TESTING


    // To create a new test after setting up Maven, right-click in class > Go To > Test
    // right-click and setup @Before each to instantiate the class

    // ---------------------------
    // There's no need to test POJO's -
    // but you must test anything with logic

    // Mocking is creating mock object within a class to test.
    // We need a way to mock, so we use dependency's.

    // Maven is a software management and comprehension tool.
    // It's based in pom.xml
    // allows us to bring in other dependencies

    // if Adib has his own random jokes generator it'd be under Adib.packages

    // unit testing would take a piece of code (e.g. a method) and test it in isolation
    // we can't test private methods in isolation as we need to access it through the class
    // private tests are not normally tested

    // you can never achieve 100% test coverage
    // e.g. static blocks and constructors

    // Maven should have root > src > main | test

    // -----------------------------------

    // MOCKING

    // so far we've been testing classes without dependencies
    // i.e. we don't pass anything into the constructor

    // our FlightService depended on our flightDao

    // FlightService NEEDS/DEPENDS on FlightDao to get flight data.
    // FlightDao NEEDS/DEPENDS on File database
    // flightService is one unit
    // flightDao is another unit

    // we can test flightDao methods in isolation.

    // however, flightService needs access to our Dao! e.g. displayAllFlights()
    // if they depended on each other, that'd be a cyclic dependency and that's a big no no

    // we want to make sure our tests are fast
    // if it takes 1 minute to read our database, our service will have to wait
    // at least 1 minute to run each test on each method.

    // as a whole this concept is called INTEGRATION TESTING
    // this is testing the whole thing

    // if there's a dependency between these 2 classes we must mock to save the minute
    // instead of going to a database, we're going to tell you what to do
    // "here is a predefined list I want you to use"
    // "if this Dao method is used, I want you to return this"

    // if we turn marcy into a mock she now doesn't know how to eat or speak.
    // this is because you haven't told her how to respond.
    // you need to do this when I say this.
    // this is an example of a mock

    // use 'mockito'
    // stub method days "when you get this, do this"

    // everytime your class under test depends on something, you always use the mock

    // Go to test, week02/day1/loops_exercises....






}
