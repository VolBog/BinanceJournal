package com.traider.journal.Models;

import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Entity
@Table
public class Symbol {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
