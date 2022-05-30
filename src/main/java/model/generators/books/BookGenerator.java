package model.generators.books;

import model.generators.sub.RandomIntegerGenerator;

import java.util.ArrayList;

public interface BookGenerator extends RandomIntegerGenerator{

    default void generate(int booksNumber){
        for(int i=1; i<=booksNumber; i++){
            addNewBook(generateArguments());
        }
    }

    String[] generateArguments();

    void addNewBook(String[] args);

    ArrayList<String> getAuthors();

    ArrayList<String> getTitles();

}
