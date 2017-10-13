package com

class PhoneDetailsController {

    def index() {
        render(view: '/phoneDetails/phoneDetails')
    }

    def savePhoneDetails(PhoneDetailsCO phoneDetailsCO){
        PhoneDetail phoneDetails = new PhoneDetail(phoneDetailsCO)
        phoneDetails.save(flush: true, failOnError: true)
        render "save phone details"
    }

    def fetchAllPhoneDetails(){
        List<PhoneDetail> phoneDetailsList =  PhoneDetail.findAll()
        render(view: '/phoneDetails/phoneDetailsResult', model: [phoneDetailsList: phoneDetailsList])
    }
}