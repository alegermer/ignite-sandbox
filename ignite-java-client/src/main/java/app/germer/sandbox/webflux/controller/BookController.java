package app.germer.sandbox.webflux.controller;

import app.germer.sandbox.webflux.model.Book;
import app.germer.sandbox.webflux.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @PutMapping()
    public Mono<Book> save(@RequestBody Book book) {

        return bookRepository.save(book);
    }

    @GetMapping("search")
    public Flux<Book> search(@RequestParam(required = false) String title) {

        return bookRepository.findAllByTitle(title);
    }

}
