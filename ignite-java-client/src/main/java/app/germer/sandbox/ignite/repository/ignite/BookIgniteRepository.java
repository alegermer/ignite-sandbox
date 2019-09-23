package app.germer.sandbox.ignite.repository.ignite;

import app.germer.sandbox.ignite.model.Book;
import org.apache.ignite.springdata.repository.IgniteRepository;
import org.apache.ignite.springdata.repository.config.RepositoryConfig;

@RepositoryConfig(cacheName = "book")
public interface BookIgniteRepository extends IgniteRepository<Book, Integer> {


    Book getBookById(Integer id);

    Book getBookByTitle(String title);

}
