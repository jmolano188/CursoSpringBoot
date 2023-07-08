package com.FlyBoot.Core.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter @Setter @NoArgsConstructor
public class Post {
    private Integer id;
    private String title;
    private String description;
    private String urlImage;
    private Date createdAt;

    public Post(Integer id, String title, String description, String urlImage) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.urlImage = urlImage;
        this.createdAt = new Date();
    }
}
