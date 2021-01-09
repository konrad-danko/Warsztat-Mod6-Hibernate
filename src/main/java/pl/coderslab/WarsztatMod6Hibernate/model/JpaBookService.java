package pl.coderslab.WarsztatMod6Hibernate.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import pl.coderslab.WarsztatMod6Hibernate.repository.BookRepository;

import java.util.List;
import java.util.Optional;

@Primary
@Repository
public class JpaBookService implements BookService{

    private final BookRepository bookRepository;

    public JpaBookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //Pobieranie listy wszystkich książek
    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    //Pobieranie książki po wskazanym identyfikatorze
    @Override
    public Optional<Book> getBook(Long id) {
        return bookRepository.findById(id);
    }

    //Dodawanie książki
    @Override
    public void addBook(Book book) {
        bookRepository.save(book);
    }

    //Edycja książki
    @Override
    public void updateBook(Book book) {
        bookRepository.save(book);
    }

    //Usuwanie książki
    @Override
    public void removeBook(Book book) {
        bookRepository.delete(book);
    }
}
