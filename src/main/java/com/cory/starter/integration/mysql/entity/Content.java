package com.cory.starter.integration.mysql.entity;

import javax.persistence.*;

@Entity
public class Content {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String message;

    public Content(String mesage) {
        this.message = mesage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String mesage) {
        this.message = message;
    }
}
