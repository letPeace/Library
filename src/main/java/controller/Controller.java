package controller;

import model.entities.Library;
import model.generators.Generator;
import model.generators.books.EnglishLiteratureGenerator;
import model.generators.humans.HumanGenerator;
import model.generators.humans.ProfessorGenerator;
import model.generators.humans.StudentGenerator;
import model.parsers.Parser;

public class Controller{

    public static void main(String[] args){
        Parser parser = new Parser("D:\\_Mehi\\6sem\\java\\lab5\\src\\main\\resources\\excel\\library.xlsx");
        parser.parse();
        //
        Generator generatorBook = new EnglishLiteratureGenerator();
        generatorBook.generate(2);
        HumanGenerator generatorStudent = new StudentGenerator();
        generatorStudent.generateWithBooks(2, 6);
        HumanGenerator generatorProfessor = new ProfessorGenerator();
        generatorProfessor.generateWithBooks(3, 3);
        //
        Library library = new Library();
        library.setStudents(generatorStudent.convert());
        library.setProfessors(generatorProfessor.convert());
        System.out.println(library);
    }

}
