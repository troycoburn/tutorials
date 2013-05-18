package org.baeldung.spring.persistence.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Owner implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    public Owner() {
        super();
    }

    // API

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

}
