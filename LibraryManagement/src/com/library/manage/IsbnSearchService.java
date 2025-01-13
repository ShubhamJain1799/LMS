package com.library.manage;

import java.util.List;
import java.util.stream.Collectors;

public class IsbnSearchService implements SearchService {
    @Override
    public List<Book> search(List<Book> books, String query) {
        return books.stream()
                .filter(book -> book.getIsbn().equals(query))
                .collect(Collectors.toList());
    }
}
