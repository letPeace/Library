package model.generators.books;

import model.entities.books.EnglishLiterature;
import model.parsers.books.EnglishLiteratureParser;

import java.util.ArrayList;

public class EnglishLiteratureGenerator implements BookGenerator{

    private ArrayList<EnglishLiterature> englishLiteratures;

    public ArrayList<EnglishLiterature> getEnglishLiteratures() {
        return englishLiteratures;
    }

    public EnglishLiteratureGenerator(){
        this.englishLiteratures = new ArrayList<>();
    }

    @Override
    public String[] generateArguments(){
        ArrayList<String> authors = getAuthors();
        ArrayList<String> titles = getTitles();
        ArrayList<String> disciplines = getDisciplines();
        ArrayList<String> levels = getLevels();
        ArrayList<String> universities = getUniversities();
        // all indexes are random comparing to each other
        String author = authors.get(getRandomIndex(authors));
        String title = titles.get(getRandomIndex(titles));
        String discipline = disciplines.get(getRandomIndex(disciplines));
        String level = levels.get(getRandomIndex(levels));
        String university = universities.get(getRandomIndex(universities));
        return new String[]{author, title, discipline, level, university};
    }

    @Override
    public void addNewBook(String[] args){
        getEnglishLiteratures().add(new EnglishLiterature(args[0], args[1], args[2], args[3], args[4]));
    }

    public ArrayList<String> getAuthors(){
        return EnglishLiteratureParser.getAuthors();
    }

    public ArrayList<String> getTitles(){
        return EnglishLiteratureParser.getTitles();
    }

    public ArrayList<String> getDisciplines(){
        return EnglishLiteratureParser.getDisciplines();
    }

    public ArrayList<String> getLevels(){
        return EnglishLiteratureParser.getLevels();
    }

    public ArrayList<String> getUniversities(){
        return EnglishLiteratureParser.getUniversities();
    }

}
