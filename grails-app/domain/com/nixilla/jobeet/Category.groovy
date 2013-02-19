package com.nixilla.jobeet

class Category {

    String name

    Date dateCreated
    Date lastUpdated

    static hasMany = [ jobs: Job, affiliates: Affiliate ]

    static constraints = {
        name maxSize: 255, blank: false, unique: true
    }

    static mapping = {
        table 'jobeet_category'
        version false
        dateCreated column: 'created_at'
        lastUpdated column: 'updated_at'
    }

    String toString() { name }
}
