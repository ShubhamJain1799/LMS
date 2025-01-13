package com.library.manage;

import com.library.manage.Book;
import com.library.manage.SearchService;

import java.util.List;
import java.util.stream.Collectors;

public class TitleSearchService implements SearchService {
    @Override
    public List<Book> search(List<Book> books, String query) {
        return books.stream()
                .filter(book -> book.getTitle().toLowerCase().contains(query.toLowerCase()))
                .collect(Collectors.toList());
    }
}
