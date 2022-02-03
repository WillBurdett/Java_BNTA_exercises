package com.exercise_will;

import com.github.javafaker.Faker;

public class FakerExample {
    public static void main(String[] args) {
        Faker faker = new Faker();
        System.out.println(faker.pokemon().name()); // no to string method :(
        System.out.println(faker.superhero().power()); // no to string method :(
        System.out.println(faker.food().ingredient()); // no to string method :(
    }
}
