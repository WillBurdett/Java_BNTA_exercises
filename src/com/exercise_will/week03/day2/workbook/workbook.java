package com.exercise_will.week03.day2.workbook;

public class workbook {

    // to compare strings we use '.equals' to compare values
    // '==' compares the references / instances ('new' keyword)
    // if we don't specify the '.equals' method, it will use the superclasses / parent classes (Objects)
    // equals method which uses the '==' symbol
    // it's easier to think of 'null' as not existing, rather than empty

    // when writing methods, you can use package-protected access modifiers,
    // then when you start coding and moving classes to organised packages,
    // you will see what needs access to what.

    // Try not to use STATICS during your methods
    // static methods are very difficult to test
    // if you have an instance you can 'mock' it.
    // However, with static, inside your static class, you connect to google/api,
    // there's no way to mock the method.
    // you want to be able to test classes in isolation
    // if one is used in another, they must be tested together.
}
