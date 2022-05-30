package model.generators.humans;

import model.entities.humans.Student;
import model.parsers.humans.StudentParser;

import java.util.ArrayList;

public class StudentGenerator implements HumanGenerator{

    private ArrayList<Student> students;

    public ArrayList<Student> getStudents() {
        return students;
    }

    public StudentGenerator(){
        this.students = new ArrayList<>();
    }

    @Override
    public ArrayList<String> getFirstNames(){
        return StudentParser.getFirstNames();
    }

    @Override
    public ArrayList<String> getLastNames(){
        return StudentParser.getLastNames();
    }

    @Override
    public void addNewHuman(String... names){
        getStudents().add(new Student(names[0], names[1]));
    }

}
