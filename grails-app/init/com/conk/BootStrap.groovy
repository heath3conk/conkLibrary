package com.conk

import com.conk.Genre
import com.conk.Author
import com.conk.Book

class BootStrap {

    def init = { servletContext ->

        def mystery = new Genre(name: 'Mystery').save()
        def sciFi = new Genre(name: 'Science Fiction').save()
        def history = new Genre(name: 'History').save()

        def sayers = new Author(firstName: 'Dorothy', lastName: 'Sayers', genre: mystery).save()
        def hill = new Author(firstName: 'Reginald', lastName: 'Hill', genre: mystery).save()
        def willis = new Author(firstName: 'Connie', lastName: 'Willis', genre: sciFi).save()
        def chaikin = new Author(firstName: 'Andrew', lastName: 'Chaikin', genre: history).save()
        def ambrose = new Author(firstName: 'Stephen', lastName: 'Ambrose', genre: history).save()

        new Book(title: 'Gaudy Night', publicationYear: 1935, author: sayers, genre: mystery)
        new Book(title: 'The Wood Beyond', publicationYear: 1995, author: hill, genre: mystery)
        new Book(title: 'Passage', publicationYear: 2001, author: willis, genre: sciFi)
        new Book(title: 'A Man on the Moon', publicationYear: 1994, author: chaikin, genre: history)
        new Book(title: 'Band of Brothers', publicationYear: 1992, author: ambrose, genre: history)
    }
    def destroy = {
    }
}
