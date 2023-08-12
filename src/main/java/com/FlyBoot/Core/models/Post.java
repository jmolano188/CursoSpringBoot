package com.FlyBoot.Core.models;

import lombok.*;

import java.util.Date;
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Post {

    private int id;
    private String titulo;
    private String descripcion;
    private String urlImg;
    private Date fechaCreacion;


}
