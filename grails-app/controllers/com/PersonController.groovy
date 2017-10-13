package com

class PersonController {

    def index() {
        render(view: '/person/person')
    }

    def savePerson(PersonCO personCO){
        Person person = new Person(personCO)
        person.save(flush: true)
        render "person details saved"
    }

    def fetchAllPerson(){
        List<Person> personList = Person.findAll()
        render(view: '/person/personDetails', model: [personList: personList])
    }
}

