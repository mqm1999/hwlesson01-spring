package dto;

import entity.Book;

public class BookWithAuthorName extends Book {
    public String authorName;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "BookWithAuthorName{" +
                "authorName='" + authorName + '\'' +
                ", bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
