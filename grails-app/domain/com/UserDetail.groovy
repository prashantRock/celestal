package com

class UserDetail {

    String firstName
    String lastName
    String age
    String sex
    String detailType

    public UserDetail(){}

    public UserDetail(UserDetailCO userDetailCO, String detailType){
        this.age = userDetailCO.age
        this.lastName = userDetailCO.lastName
        this.firstName = userDetailCO.firstName
        this.sex = userDetailCO.sex
        this.detailType = detailType

    }

}
