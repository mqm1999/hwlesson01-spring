package entity;

public class Book {
    public int bookId;
    public String bookName;
    public int authorId;

    public Book() {
    }

    public Book(int bookId, String bookName, int authorId) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorId = authorId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }
}
