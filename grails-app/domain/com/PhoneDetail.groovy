package com

import org.bson.types.ObjectId

class PhoneDetails{

    static mapWith = "mongo"

    ObjectId id
    String name
    String phoneNumber

    static constraints = {
    }

    public PhoneDetails(){}

    public PhoneDetails(PhoneDetailsCO phoneDetailsCO){
        this.name = phoneDetailsCO.name
        this.phoneNumber = phoneDetailsCO.phoneNumber
    }
}