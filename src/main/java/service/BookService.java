package service;

import dto.BookWithAuthorName;
import repository.BookRepository;

import java.sql.SQLException;
import java.util.List;

public class BookService {
    BookRepository bookRepository = new BookRepository();

    public List<BookWithAuthorName> getAllBooks() {
        try {
            return bookRepository.getAllBooks();
        } catch (Exception e) {
            System.out.println("Failed to get repo");
            return null;
        }
    }

    public boolean addBook(String nameInput, String authorInput) {
        try {
            if (bookRepository.checkAuthorExist(authorInput) && bookRepository.checkBookNameExist(nameInput)) {
                return bookRepository.addBook(nameInput, authorInput);
            } else if (!bookRepository.checkAuthorExist(authorInput)) {
                System.out.println("Author not existed");
                return false;
            } else if (!bookRepository.checkBookNameExist(nameInput)) {
                System.out.println("Book existed");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Fail");
        }
        return false;
    }

    public boolean updateBook(String oldName, String nameInput) throws SQLException {
        try {
            if(bookRepository.checkOldBookNameExist(oldName)) {
                if(bookRepository.checkBookNameExist(nameInput)){
                    return bookRepository.updateBook(oldName, nameInput);
                } else {
                    System.out.println("Duplicated");
                    return false;
                }
            } else {
                System.out.println("Book not found");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Fail");
        }
        return false;
    }

    public boolean deleteBook(String nameInput) {
        try {
            if(!bookRepository.checkBookNameExist(nameInput)) {
                return bookRepository.deleteBook(nameInput);
            } else {
                System.out.println("Book not found");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Fail");
        }
        return false;
    }
}
