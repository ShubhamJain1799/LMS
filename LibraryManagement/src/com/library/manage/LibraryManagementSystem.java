package com.library.manage;


public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books
        library.addBook(new Book("The Jain Dynasty", "F. Shubham Jain", "654321", 1999));
        library.addBook(new Book("KD Joshi", "George Orwell", "654321", 1949));

        // Adding patrons
        Patron patron = new Patron("Shubham", "L001");
        library.addPatron(patron);

        // Searching books
        SearchService titleSearch = new TitleSearchService();
        System.out.println("Books with title 'KD Joshi': " + library.searchBooks(titleSearch, "KD Joshi"));
    }
}
