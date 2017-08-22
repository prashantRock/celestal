package com

class Person {

    String name
    int age

    static constraints = {
    }

    public Person(){}

    public Person(String name, int age){
        this.name = name
        this.age = age
    }
}
