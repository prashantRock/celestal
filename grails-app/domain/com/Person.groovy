package com

class Person {

    String name
    int age

    static constraints = {
    }

    public Person(){}

    public Person(PersonCO personCO){
        this.name = personCO.name
        this.age = personCO.age
    }
}
