package com.kodilla.testing.library;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {
    @Mock
    private LibraryDatabase libraryDatabaseMock;

    @Nested
    @DisplayName("Tests from submodule 6.6")
    class SubmoduleTests {
        @Test
        void testListBooksWithConditionsReturnList() {
            // Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOfBooks = new ArrayList<>();
            Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
            Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
            Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
            Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
            resultListOfBooks.add(book1);
            resultListOfBooks.add(book2);
            resultListOfBooks.add(book3);
            resultListOfBooks.add(book4);
            when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

            // When
            List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

            // Then
            assertEquals(4, theListOfBooks.size());
        }

        private List<Book> generateListOfNBooks(int booksQuantity) {
            List<Book> resultList = new ArrayList<>();
            for (int n = 1; n <= booksQuantity; n++) {
                Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
                resultList.add(theBook);
            }
            return resultList;
        }

        @Test
        void testListBooksWithConditionMoreThan20() {
            // Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOf0Books = new ArrayList<Book>();
            List<Book> resultListOf15Books = generateListOfNBooks(15);
            List<Book> resultListOf40Books = generateListOfNBooks(40);
            when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                    .thenReturn(resultListOf15Books);                                             // [6]
            when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))                    // [7]
                    .thenReturn(resultListOf0Books);                                              // [8]
            when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))                   // [9]
                    .thenReturn(resultListOf40Books);                                             // [10]

            // When
            List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");    // [11]
            List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");   // [12]
            List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");  // [13]
            // Then

            assertEquals(0, theListOfBooks0.size());                                         // [14]
            assertEquals(15, theListOfBooks15.size());                                       // [15]
            assertEquals(0, theListOfBooks40.size());
        }

        @Test
        void testListBooksWithConditionFragmentShorterThan3() {
            // Given
            LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

            // When
            List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

            // Then
            assertEquals(0, theListOfBooks10.size());
            verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
        }
    }

    @Nested
    @DisplayName("(6.6) Zadanie: rozbudowa BookLibrary")
    class MainTests {

        @Test
        void testListBooksInHandsOfConditionNoneBooks() {
            // Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultInHandsOfBookList = new ArrayList<>();
            LibraryUser user1 = new LibraryUser("John", "Doe", "51254125447");

            when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(resultInHandsOfBookList);

            // When
            List<Book> theListOfInHandsOfBooks
                    = bookLibrary.listBooksInHandsOf(user1);

            // Then
            assertEquals(0, theListOfInHandsOfBooks.size());
        }

        @Test
        void testListBooksInHandsOfCondition1Book() {
            // Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultInHandsOfBookList = new ArrayList<>();
            LibraryUser user1 = new LibraryUser("John", "Doe", "51254125447");

            Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);

            resultInHandsOfBookList.add(book1);

            when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(resultInHandsOfBookList);

            // When
            List<Book> theListOfInHandsOfBooks
                    = bookLibrary.listBooksInHandsOf(user1);

            // Then
            assertEquals(1, theListOfInHandsOfBooks.size());
        }

        @Test
        void testlistBooksInHandsOfCondition5Books() {
            // Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultInHandsOfBookList = new ArrayList<>();
            LibraryUser user1 = new LibraryUser("John", "Doe", "51254125447");

            Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
            Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
            Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
            Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
            Book book5 = new Book("Secrets of something", "Gal Anonim", 2015);

            resultInHandsOfBookList.add(book1);
            resultInHandsOfBookList.add(book2);
            resultInHandsOfBookList.add(book3);
            resultInHandsOfBookList.add(book4);
            resultInHandsOfBookList.add(book5);

            when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(resultInHandsOfBookList);

            // When
            List<Book> theListOfInHandsOfBooks
                    = bookLibrary.listBooksInHandsOf(user1);

            // Then
            assertEquals(5, theListOfInHandsOfBooks.size());
        }
    }
}