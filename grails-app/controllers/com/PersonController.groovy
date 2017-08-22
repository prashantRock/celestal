package com

class PersonController {

    def index() { }

    def savePerson(){
        Person person = new Person("prashant", 10)
        person.save(flush: true)
    }

}

