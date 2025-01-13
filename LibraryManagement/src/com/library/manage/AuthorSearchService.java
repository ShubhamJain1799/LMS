package com.library.manage;

import java.util.List;
import java.util.stream.Collectors;

public class AuthorSearchService implements SearchService {
    @Override
    public List<Book> search(List<Book> books, String query) {
        return books.stream()
                .filter(book -> book.getAuthor().toLowerCase().contains(query.toLowerCase()))
                .collect(Collectors.toList());
    }
}
