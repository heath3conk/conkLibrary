package com.conk

class Author {

    String firstName
    String lastName

    static belongsTo = [ genre: Genre ]

    static constraints = {
    }

    String toString() {
        '${firstName} ${lastName}'
    }

}
