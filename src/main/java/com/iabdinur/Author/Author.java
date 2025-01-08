package com.iabdinur.Author;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Author(
        Integer id,
        String name
) {
    public static List<Author> authors = Arrays.asList(
            new Author(1, "Allah"),
            new Author(2, "J.K.Rowling"),
            new Author(3, "John R. R. Tolkien"),
            new Author(4, "Napoleon Hill"),
            new Author(5, "Paulo Coelho"),
            new Author(6, "John R. R. Tolkien"),
            new Author(7, "John R. R. Martin")
    );

    public static Optional<Author> getAuthorById(Integer id) {
        return authors.stream()
                .filter(a-> a.id().equals(id))
                .findFirst();
    }
}
