package app.germer.sandbox.ignite.controller;

import app.germer.sandbox.ignite.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

  /*  @PutMapping()
    public Mono<Book> save(@RequestBody Book book) {

        return bookMongoRepository.save(book);
    }

    @GetMapping("search")
    public Flux<Book> search(@RequestParam(required = false) String title) {

        return bookMongoRepository.findAllByTitle(title);
    }*/

}
