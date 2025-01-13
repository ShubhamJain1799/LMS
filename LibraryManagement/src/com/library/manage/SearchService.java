package com.library.manage;

import java.util.List;

public interface SearchService {
    List<Book> search(List<Book> books, String query);
}

