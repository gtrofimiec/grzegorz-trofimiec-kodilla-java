package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {

        //Give
        Library library = new Library("Library 1");
        Book book1 = new Book("Book 1","Author 1", LocalDate.of(1985,5,21) );
        Book book2 = new Book("Book 2","Author 2", LocalDate.of(1993,1,1));
        Book book3 = new Book("Book 3","Author 3", LocalDate.of(2011,12,14));

        library.books.add(book1);
        library.books.add(book2);
        library.books.add(book3);

        //When
        library.getBooks();
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        deepClonedLibrary.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(3, library.books.size());
        assertEquals(3, clonedLibrary.books.size());
        assertEquals(2, deepClonedLibrary.books.size());
    }
}