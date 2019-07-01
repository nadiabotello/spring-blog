package com.codeup.springblog;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Owner {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String name;
}
