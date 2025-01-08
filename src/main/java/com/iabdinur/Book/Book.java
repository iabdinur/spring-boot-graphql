package com.iabdinur.Book;

import com.iabdinur.Author.Author;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Book(
        Integer Id,
        String name,
        Integer pageCount,
        Integer authorId
) {
    public static List<Book> books= Arrays.asList(

            new Book(2,"Harry Potter",320, 2),
            new Book(3,"The Hobbit",322, 3),
            new Book(3,"The Holy Quran",604, 1),
            new Book(4,"Think and grow rich",242, 4),
            new Book(5,"The Alchemist",400, 5),
            new Book(6,"A Game of Thrones",600, 7),
            new Book(7,"The Lord of the Rings",560, 6)


    );

    public static Optional<Book> getBookById(Integer id) {
        return books.stream()
                .filter(b -> b.authorId.equals(id))
                .findFirst();
    }
}
