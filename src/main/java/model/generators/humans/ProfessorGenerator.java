package model.generators.humans;

import model.entities.humans.Professor;
import model.parsers.humans.ProfessorParser;

import java.util.ArrayList;

public class ProfessorGenerator implements HumanGenerator{

    private ArrayList<Professor> professors;

    public ArrayList<Professor> getProfessors() {
        return professors;
    }

    public ProfessorGenerator(){
        this.professors = new ArrayList<>();
    }

    @Override
    public ArrayList<String> getFirstNames(){
        return ProfessorParser.getFirstNames();
    }

    @Override
    public ArrayList<String> getLastNames(){
        return ProfessorParser.getLastNames();
    }

    @Override
    public void addNewHuman(String... names){
        getProfessors().add(new Professor(names[0], names[1], names[2]));
    }

}
