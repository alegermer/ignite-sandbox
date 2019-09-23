package app.germer.sandbox.webflux.repository;

import app.germer.sandbox.webflux.model.Book;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface BookRepository extends ReactiveMongoRepository<Book, String> {

    Flux<Book> findAllByTitle(String value);

}
