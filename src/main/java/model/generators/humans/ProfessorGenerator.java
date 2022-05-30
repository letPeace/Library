package model.generators.humans;

import model.entities.books.Book;
import model.entities.humans.Human;
import model.entities.humans.Professor;
import model.entities.humans.Student;
import model.parsers.humans.ProfessorParser;

import java.util.ArrayList;
import java.util.HashSet;

public class ProfessorGenerator implements HumanGenerator{

    private HashSet<Human> professors;

    public HashSet<Human> get() {
        return professors;
    }

    public ProfessorGenerator(){
        this.professors = new HashSet<>();
    }

    @Override
    public String[] generateArguments(){
        ArrayList<String> firstNames = getFirstNames();
        ArrayList<String> lastNames = getLastNames();
        // all indexes are random comparing to each other
        String firstName = firstNames.get(getRandomIndex(firstNames));
        String lastName = getCorrectLastName(firstName, lastNames.get(getRandomIndex(lastNames)));
        String secondName = getSecondName(firstName);
        return new String[]{firstName, lastName, secondName};
    }

    @Override
    public void addNewHuman(Human human){
        get().add(human);
    }

    @Override
    public Human generateHuman(String[] args){
        return new Professor(args[0], args[1], args[2]);
    }

    @Override
    public ArrayList<String> getFirstNames(){
        return ProfessorParser.getFirstNames();
    }

    @Override
    public ArrayList<String> getLastNames(){
        return ProfessorParser.getLastNames();
    }

}
