package com.jbc.spring.security.ldap.model;

import com.jbc.spring.security.ldap.model.base.GenericEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
public class Book implements Serializable, GenericEntity<Book> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long rid;

    private String title;

    private String author;

    @Lob
    private String description;

    private Date releaseDate;

    @Override
    public Long getId() {
        return this.rid;
    }

    @Override
    public void update(Book source) {
        this.title = source.getTitle();
        this.author = source.getAuthor();
        this.description = source.getDescription();
        this.releaseDate = source.getReleaseDate();
    }

    @Override
    public Book createNewInstance() {
        Book newInstance = new Book();
        newInstance.update(this);

        return newInstance;
    }
}
