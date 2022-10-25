package com.example.demo.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.example.demo.model.User} entity
 */
public class UserPojoDto implements Serializable {
    private final Long id;
    private final String myFullName;

    public UserPojoDto(Long id, String fullName) {
        this.id = id;
        this.myFullName = fullName;
    }

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return myFullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserPojoDto entity = (UserPojoDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.myFullName, entity.myFullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, myFullName);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "fullName = " + myFullName + ")";
    }
}