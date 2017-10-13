package com.api

import com.UserDetail
import com.UserDetailCO
import grails.converters.JSON

class InsuranceController {


    def applicantDetail(UserDetailCO userDetailCO){
        // we can also check API key is coming and is valid or not
        HashMap<String , String> result = new HashMap<>()
        if(userDetailCO.age.trim().equals("") || userDetailCO.firstName.trim().equals("") || userDetailCO.lastName.trim().equals("") || userDetailCO.sex.trim().equals(""))
        {
            result.code = "400"
            result.message = "Please add all details"
            println "<========= Invalid Details ==============>"
        }else {
            UserDetail userDetail = new UserDetail(userDetailCO, "APPLICANT_DETAIL")
            userDetail.save(flush: true)
            println "<========= Data saved successfully ==============>"
            result.code = "200"
            result.message = "Your Details saved successfully"
        }
        render result as JSON
    }

    def nomineeDetail(UserDetailCO userDetailCO){
        // we can also check API key is coming and is valid or not
        HashMap<String , String> result = new HashMap<>()
        if(userDetailCO.age.trim().equals("") || userDetailCO.firstName.trim().equals("") || userDetailCO.lastName.trim().equals("") || userDetailCO.sex.trim().equals(""))
        {
            result.code = "400"
            result.message = "Please add all details"
            println "<========= Invalid Details ==============>"
        }
        else {
            UserDetail userDetail = new UserDetail(userDetailCO, "NOMINEE_DETAIL")
            userDetail.save(flush: true)
            println "<========= Data saved successfully ==============>"
            result.code = "200"
            result.message = "Your Details saved successfully"
        }
        render result as JSON
    }
}
