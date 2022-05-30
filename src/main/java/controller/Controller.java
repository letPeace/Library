package controller;

import model.entities.Library;
import model.generators.Generator;
import model.parsers.Parser;

public class Controller{

    public static void main(String[] args){
        Parser parser = new Parser("D:\\_Mehi\\6sem\\java\\lab5\\src\\main\\resources\\excel\\library.xlsx");
        parser.parse();
        Library library = new Library();
        library.setStudents(Generator.generateStudentsWithBooks(3, 0, 2, 0));
        library.setProfessors(Generator.generateProfessorsWithBooks(2, 0, 2, 0));
        System.out.println(library.getStudents());
//        System.out.println(library.getProfessors());
        library.addProfessor(Generator.generateProfessorWithBooks(0, 2, 2));
        System.out.println(library.getProfessors());
    }

}
