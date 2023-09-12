package org.example.Model;

public class BaseEntity {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BaseEntity(Long id) {
        this.id = id;
    }

    public BaseEntity(){};
}
