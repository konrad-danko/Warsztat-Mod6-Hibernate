package pl.coderslab.WarsztatMod6Hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.WarsztatMod6Hibernate.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
