package com.library.manage;


public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456", 1925));
        library.addBook(new Book("1984", "George Orwell", "654321", 1949));

        // Adding patrons
        Patron patron = new Patron("Alice", "P001");
        library.addPatron(patron);

        // Searching books
        SearchService titleSearch = new TitleSearchService();
        System.out.println("Books with title '1984': " + library.searchBooks(titleSearch, "1984"));
    }
}
