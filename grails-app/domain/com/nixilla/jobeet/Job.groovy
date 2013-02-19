package com.nixilla.jobeet

class Job {

    String type
    String company
    String logo
    String url
    String position
    String location
    String description
    String howToApply
    String token
    Boolean isPublic = true
    Boolean isActivated = false
    String email
    Date expiresAt

    Date dateCreated
    Date lastUpdated

    static belongsTo = [ category: Category ]

    static constraints = {
        type maxSize: 255, nullable: true
        company maxSize: 255, blank: false
        logo maxSize: 255, nullable: true
        url maxSize: 255, url: true, nullable: true
        position maxSize: 255, blank: false
        location maxSize: 255, blank: false
        description maxSize: 4000, blank: false
        howToApply maxSize: 4000, blank: false
        token maxSize: 255, blank: false, unique: true
        email maxSize: 255, blank: false, email: true
    }

    static mapping = {
        table 'jobeet_job'
        version false
        dateCreated column: 'created_at'
        lastUpdated column: 'updated_at'
        howToApply column: 'how_to_apply'
        isPublic column: 'is_public'
        isActivated column: 'is_activated'
        expiresAt column: 'expires_at'
    }

    String toString()
    {
        sprintf('%1$s at %2$s (%3$s)', position, company, location);
    }
}
