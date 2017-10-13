package com

import org.bson.types.ObjectId

class PhoneDetail {

    static mapWith = "mongo"

    ObjectId id
    String name
    String phoneNumber

    static constraints = {
    }

    public PhoneDetail(){}

    public PhoneDetail(PhoneDetailsCO phoneDetailsCO){
        this.name = phoneDetailsCO.name
        this.phoneNumber = phoneDetailsCO.phoneNumber
    }
}