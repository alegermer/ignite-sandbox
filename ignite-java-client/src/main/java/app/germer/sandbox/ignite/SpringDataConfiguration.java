package app.germer.sandbox.ignite;

import app.germer.sandbox.ignite.model.Book;
import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;
import org.apache.ignite.cache.eviction.lru.LruEvictionPolicy;
import org.apache.ignite.configuration.CacheConfiguration;
import org.apache.ignite.configuration.IgniteConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDataConfiguration {

    @Bean
    public Ignite igniteInstance() {

        Ignition.setClientMode(true);

        IgniteConfiguration config = new IgniteConfiguration();

        CacheConfiguration cache = new CacheConfiguration("book");
        cache.setIndexedTypes(Integer.class, Book.class);
        cache.setOnheapCacheEnabled(true);
        cache.setEvictionPolicy(new LruEvictionPolicy(1000));

        config.setCacheConfiguration(cache);
        return Ignition.start(config);
    }
}