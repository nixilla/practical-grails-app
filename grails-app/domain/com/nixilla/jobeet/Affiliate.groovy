package com.nixilla.jobeet

class Affiliate {

    String url
    String email
    String token
    Boolean isActive = false

    Date dateCreated
    Date lastUpdated

    static hasMany = [ categories: Category ]
    static belongsTo = Category

    static constraints = {
        url maxSize: 255, url: true, nullable: true
        email maxSize: 255, blank: false, email: true, unique: true
        token maxSize: 255, blank: false, unique: true
    }

    static mapping = {
        table 'jobeet_affiliate'
        version false
        dateCreated column: 'created_at'
        lastUpdated column: 'updated_at'
        isActive column: 'is_active'
    }

    String toString() { url }
}
