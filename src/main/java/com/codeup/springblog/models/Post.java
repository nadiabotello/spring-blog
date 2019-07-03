package com.codeup.springblog.models;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name="posts")
public class Post {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
//    @NotBlank(message = "Posts must have a title")
    private String title;

    @Column(nullable = false, length = 1000)
//    @NotBlank(message = "Posts must have a description")
//    @Size(min = 10, message = "A title must be at least 10 characters.")
    private String body;

    @ManyToOne
    @JoinColumn (name = "author_id")
    private User author;


    public Post(long id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public Post() {
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
