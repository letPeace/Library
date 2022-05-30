package model.generators.books;

import model.entities.books.Fiction;
import model.parsers.books.FictionParser;

import java.util.ArrayList;

public class FictionGenerator implements BookGenerator{

    private ArrayList<Fiction> fictions;

    public ArrayList<Fiction> getFictions() {
        return fictions;
    }

    public FictionGenerator() {
        this.fictions = new ArrayList<>();
    }

    @Override
    public String[] generateArguments(){
        ArrayList<String> authors = getAuthors();
        ArrayList<String> titles = getTitles();
        // using the same index for "author" and "title" -> to implement the functionality of "different generation"
        int fictionIndex = getRandomIndex(authors);
        return new String[]{authors.get(fictionIndex), titles.get(fictionIndex)};
    }

    @Override
    public void addNewBook(String[] args){
        getFictions().add(new Fiction(args[0], args[1]));
    }

    public ArrayList<String> getAuthors(){
        return FictionParser.getAuthors();
    }

    public ArrayList<String> getTitles(){
        return FictionParser.getTitles();
    }

}
