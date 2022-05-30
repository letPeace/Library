package model.entities;

import model.entities.humans.Professor;
import model.entities.humans.Student;

import java.util.HashSet;

public class Library{

    private HashSet<Student> students;
    private HashSet<Professor> professors;

    public Library(){
        this.students = new HashSet<>();
        this.professors = new HashSet<>();
    }

    public HashSet<Student> getStudents() {
        return students;
    }

    public void setStudents(HashSet<Student> students) {
        this.students = students;
    }

    public HashSet<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(HashSet<Professor> professors) {
        this.professors = professors;
    }

    //

    public void addStudent(Student student){
        getStudents().add(student);
    }

    public void addProfessor(Professor professor){
        getProfessors().add(professor);
    }

    //

    public void removeStudent(Student student){
        getStudents().remove(student);
    }

    public void removeProfessor(Professor professor){
        getProfessors().remove(professor);
    }

}
