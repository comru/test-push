package com.example.demo.dto;

import com.example.demo.model.User;

import java.io.Serializable;

/**
 * A DTO for the {@link User} entity
 */
public record UserDto2(Long id, String myFullName) implements Serializable {
}