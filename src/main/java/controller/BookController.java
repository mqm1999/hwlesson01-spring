package controller;

import dto.BookWithAuthorName;
import service.BookService;

import java.sql.SQLException;
import java.util.List;

public class BookController {
    private static BookController instance;

    public static BookController getInstance() {
        if (instance == null) {
            instance = new BookController();
        }
        return instance;
    }

    private BookController() {

    }

    BookService bookService = new BookService();


    public List<BookWithAuthorName> getAllBooks() {
        return bookService.getAllBooks();
    }

    public boolean addBook(String nameInput, String authorInput) {
        return bookService.addBook(nameInput, authorInput);
    }

    public boolean updateBook(String oldName, String nameInput) throws SQLException {
        return bookService.updateBook(oldName, nameInput);
    }

    public boolean deleteBook(String nameInput) {
        return bookService.deleteBook(nameInput);
    }
}
