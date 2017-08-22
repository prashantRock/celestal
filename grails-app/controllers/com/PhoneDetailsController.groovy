package com

class PhoneDetailsController {

    def index() { }

    def saveAddress(){
        PhoneDetails phoneDetails = new PhoneDetails("3232332")
        println phoneDetails = phoneDetails.save(flush: true, failOnError: true)
        render "test"
    }

    def fetchAllTransactions(){
        List<PhoneDetails> phoneDetailsList =  PhoneDetails.findAll()
        println phoneDetailsList.size()
        phoneDetailsList.each {
           println  it.address+"++++++++++++"+it.id
        }
    }
}
