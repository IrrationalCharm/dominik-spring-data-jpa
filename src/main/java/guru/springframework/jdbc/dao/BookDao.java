package guru.springframework.jdbc.dao;

import guru.springframework.jdbc.domain.Book;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BookDao {

    Book getById(Long id);

    Book findBookByTitle(String title);

    List<Book> findAllBooks(Pageable pageable);

    List<Book> findAllBooksSortByTitle(Pageable pageable);

    Book saveNewBook(Book book);

    Book updateBook(Book book);

    void deleteBookById(Long id);
}
