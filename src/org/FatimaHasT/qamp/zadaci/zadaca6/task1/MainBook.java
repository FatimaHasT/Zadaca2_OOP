package org.FatimaHasT.qamp.zadaci.zadaca6.task1;

public class MainBook {

    public static void main(String[] args) {

        final Book book1 = new Book("Na Drini ćuprija", 9789958300092L, "Ivo Andrić");
        final Book book2 = new Book("Znakovi pored puta", 9789958693928L, "Ivo Andrić");
        final Book book3 = new Book("Sjećanja, sećanja", 9788617111863L, "Aleksa Šantić");
        final Book book4 = new Book("Legenda o Ali-paši", 9788610001317L, "Enver Čolaković");

        Bookshelf bookshelf = new Bookshelf();
        bookshelf.addBook(book1);
        bookshelf.addBook(book2);
        bookshelf.addBook(book3);
        bookshelf.addBook(book4);

        System.out.println(bookshelf.containsBook("Na Drini ćuprija"));
        System.out.println(bookshelf.containsBook("Gospođica"));
        System.out.println(bookshelf.containsBook(9789958693928L));
        System.out.println(bookshelf.containsBook(9788679340036L));

        System.out.println("\nPrinting the bookshelf:");
        bookshelf.printBookshelf();

    }
}
