package com.todocodeacademy.InyeccionDeDependenciasAutowired.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Post {
    private long id;
    private String title;
    private String author;

    public Post() {
    }

    public Post(long id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
}
