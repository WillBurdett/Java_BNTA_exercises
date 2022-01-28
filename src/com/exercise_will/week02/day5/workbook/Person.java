package com.exercise_will.week02.day5.workbook;

public class Person {
    private String name;
    private int age;
    private SkinColour skinColour;

    // you can later add properties by right-clicking, context-actions and adding

    // Referred to as POJO's (plain old java object)

    public Person(){}

    public Person(String name,
                  int age,
                  SkinColour skinColour){
        this.name = name;
        this.age = age;
        this.skinColour = skinColour;
    }

    // getters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public SkinColour getSkinColour() {
        return skinColour;
    }


    // setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSkinColour(SkinColour skinColour) {
        this.skinColour = skinColour;
    }

    @Override // we are overriding the method from the parent
    // the annotation doesn't DO anything, it's just for readability
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", skinColour=" + skinColour +
                '}';
    }

    @Override // once again, now an 'equals' method has been written,
    // it will override the Parents default 'equals' method
    public boolean equals(Object o){
        return false;
    }
}
