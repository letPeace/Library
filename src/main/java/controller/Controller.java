package controller;

import model.entities.Library;
import model.entities.books.BooksNumber;
import model.entities.books.EnglishLiterature;
import model.generators.Generator;
import model.generators.books.EnglishLiteratureGenerator;
import model.generators.humans.HumanGenerator;
import model.generators.humans.StudentGenerator;
import model.parsers.Parser;

public class Controller{

    public static void main(String[] args){
        Parser parser = new Parser("D:\\_Mehi\\6sem\\java\\lab5\\src\\main\\resources\\excel\\library.xlsx");
        parser.parse();
        Generator generatorBook = new EnglishLiteratureGenerator();
        generatorBook.generate(2);
        HumanGenerator generatorHuman = new StudentGenerator();
        generatorHuman.generateWithBooks(2, 6);
        //
        Library library = new Library();
        library.setStudents(((StudentGenerator) generatorHuman).get());
        System.out.println(library.getStudents());
    }

}
