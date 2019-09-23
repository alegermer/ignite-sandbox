package app.germer.sandbox.ignite.model;


import org.apache.ignite.cache.query.annotations.QuerySqlField;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

public class Book implements Serializable {

    @Id
    @QuerySqlField(index = true)
    private Integer id;

    @QuerySqlField(index = true)
    private String title;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
