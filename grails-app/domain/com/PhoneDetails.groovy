package com

import org.bson.types.ObjectId

class PhoneDetails implements Serializable{

    static mapWith = "mongo"

    ObjectId id
    String address

    static constraints = {
    }

    public PhoneDetails(){}

    public PhoneDetails(String address){
        this.address = address
    }
}