package com.exercise_will.week03.day4.testing_workbook;

public class workbook {
    // TESTING

    // There's no need to test POJO's -
    // but you must test anything with logic

    // Mocking is creating mock object within a class to test.
    // We need a way to mock, so we use dependency's.

    // Maven is a software management and comprehension tool.
    // It's based in pom.xml

    // if Adib has his own random jokes generator it'd be under Adib.packages


    // ----------------------------------
    //            DEPENDENCY INFO

    // groupId is your package 'com.exercise_will'
    // artifactId 'flight_generator'
    // version '1' (is the first, 2 would be new and improved)

    // maven source is our version of java, compile is what you'd like it to compile to.

    // 'test' is for all the classes to follow your code
    // ------------------------------------


    // to add to an existing project, right-click root folder 'BNTA_updated'
    // then click 'Add framework support' and select maven
    // then change 'DEPENDENCY INFO'

    // manually delete 'out' folder
    // maven - clean
    // maven - package

    // now have target folder. jar is a jar with all of our classes inside
    // maven install

    // you could try 'java-faker'
    // go to maven repo
    // copy dependency into new dependencies group
    // reload maven!

    // Go to faker class to continue...

    // Junit is a platform that allows us to launch tests
    // copy junit dependencies
    // go to 'test' and in 'java' create a new java class
    // tests do not return anything so 'void'...

}
