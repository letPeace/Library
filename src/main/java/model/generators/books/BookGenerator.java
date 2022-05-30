package model.generators.books;

import model.entities.books.Book;
import model.generators.Generator;
import model.generators.sub.RandomIntegerGenerator;

import java.util.ArrayList;
import java.util.HashSet;

public interface BookGenerator extends RandomIntegerGenerator, Generator{

    HashSet<Book> getBooks();

    default void generate(int booksNumber){
        for(int i=1; i<=booksNumber; i++){
            Book book = generateBook();
            addNewBook(book);
        }
    }

    String[] generateArguments();

    default void addNewBook(Book book){
        getBooks().add(book);
    }

    Book generateBook(String[] args);

    default Book generateBook(){
        return generateBook(generateArguments());
    }

    ArrayList<String> getAuthors();

    ArrayList<String> getTitles();

}
