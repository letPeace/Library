package model.generators.books;

import model.entities.books.RussianLiterature;
import model.parsers.books.RussianLiteratureParser;

import java.util.ArrayList;

public class RussianLiteratureGenerator implements BookGenerator{

    private ArrayList<RussianLiterature> russianLiteratures;

    public ArrayList<RussianLiterature> getRussianLiteratures() {
        return russianLiteratures;
    }

    public RussianLiteratureGenerator(){
        this.russianLiteratures = new ArrayList<>();
    }

    @Override
    public String[] generateArguments(){
        ArrayList<String> authors = getAuthors();
        ArrayList<String> titles = getTitles();
        ArrayList<String> disciplines = getDisciplines();
        ArrayList<String> types = getTypes();
        // all indexes are random comparing to each other
        String author = authors.get(getRandomIndex(authors));
        String title = titles.get(getRandomIndex(titles));
        String discipline = disciplines.get(getRandomIndex(disciplines));
        String type = types.get(getRandomIndex(types));
        return new String[]{author, title, discipline, type};
    }

    @Override
    public void addNewBook(String[] args){
        getRussianLiteratures().add(new RussianLiterature(args[0], args[1], args[2], args[3]));
    }

    public ArrayList<String> getAuthors(){
        return RussianLiteratureParser.getAuthors();
    }

    public ArrayList<String> getTitles(){
        return RussianLiteratureParser.getTitles();
    }

    public ArrayList<String> getDisciplines(){
        return RussianLiteratureParser.getDisciplines();
    }

    public ArrayList<String> getTypes(){
        return RussianLiteratureParser.getTypes();
    }

}
