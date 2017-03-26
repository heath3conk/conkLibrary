package com.conk

class Book {

    Integer publicationYear
    String title
    Author author
    Genre genre

    static constraints = {
        title maxSize: 255
        publicationYear min: 1439
    }
}
