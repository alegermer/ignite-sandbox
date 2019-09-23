package app.germer.sandbox.webflux;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@Configuration
@EnableReactiveMongoRepositories(basePackages = "app.germer.sandbox.webflux.repository")
public class MongoConfiguration extends AbstractReactiveMongoConfiguration {

    public static final int MONGO_PORT = 27017;

    @Override
    public MongoClient reactiveMongoClient() {
        return MongoClients.create(String.format("mongodb://localhost:%d", MONGO_PORT));
    }

    @Override
    protected String getDatabaseName() {
        return "book-base";
    }
}
