package model.generators;

import model.entities.books.Book;
import model.entities.humans.Professor;
import model.entities.humans.Student;
import model.generators.books.EnglishLiteratureGenerator;
import model.generators.books.FictionGenerator;
import model.generators.books.RussianLiteratureGenerator;
import model.generators.humans.ProfessorGenerator;
import model.generators.humans.StudentGenerator;

import java.util.ArrayList;
import java.util.HashSet;

public class GeneratorClass{

    /*public static HashSet<Student> generateStudentsWithBooks(int studentsNumber,
                                                             int fictionsNumber,
                                                             int russianLiteraturesNumber,
                                                             int englishLiteraturesNumber){
        HashSet<Student> students = new HashSet<>();
        StudentGenerator studentGenerator = new StudentGenerator();
        studentGenerator.generate(studentsNumber);
        for(Student student : studentGenerator.getStudents()){
            student.addBooks(generateFictions(fictionsNumber));
            student.addBooks(generateRussianLiteratures(russianLiteraturesNumber));
            student.addBooks(generateEnglishLiteratures(englishLiteraturesNumber));
            students.add(student);
        }
        return students;
    }

    public static Student generateStudentWithBooks(int fictionsNumber,
                                                   int russianLiteraturesNumber,
                                                   int englishLiteraturesNumber){
        return generateStudentsWithBooks(1,
                fictionsNumber,
                russianLiteraturesNumber,
                englishLiteraturesNumber).iterator().next();
    }

    public static HashSet<Professor> generateProfessorsWithBooks(int professorsNumber,
                                                                 int fictionsNumber,
                                                                 int russianLiteraturesNumber,
                                                                 int englishLiteraturesNumber){
        HashSet<Professor> professors = new HashSet<>();
        ProfessorGenerator professorGenerator = new ProfessorGenerator();
        professorGenerator.generate(professorsNumber);
        for(Professor professor : professorGenerator.getProfessors()){
            professor.addBooks(generateFictions(fictionsNumber));
            professor.addBooks(generateRussianLiteratures(russianLiteraturesNumber));
            professor.addBooks(generateEnglishLiteratures(englishLiteraturesNumber));
            professors.add(professor);
        }
        return professors;
    }

    public static Professor generateProfessorWithBooks(int fictionsNumber,
                                                   int russianLiteraturesNumber,
                                                   int englishLiteraturesNumber){
        return generateProfessorsWithBooks(1,
                fictionsNumber,
                russianLiteraturesNumber,
                englishLiteraturesNumber).iterator().next();
    }

    public static ArrayList<Book> generateFictions(int fictionsNumber){
        FictionGenerator fictionGenerator = new FictionGenerator();
        fictionGenerator.generate(fictionsNumber);
        return new ArrayList<>(fictionGenerator.getFictions());
    }

    public static ArrayList<Book> generateRussianLiteratures(int russianLiteraturesNumber){
        RussianLiteratureGenerator russianLiteratureGenerator = new RussianLiteratureGenerator();
        russianLiteratureGenerator.generate(russianLiteraturesNumber);
        return new ArrayList<>(russianLiteratureGenerator.getRussianLiteratures());
    }

    public static ArrayList<Book> generateEnglishLiteratures(int englishLiteraturesNumber){
        EnglishLiteratureGenerator englishLiteratureGenerator = new EnglishLiteratureGenerator();
        englishLiteratureGenerator.generate(englishLiteraturesNumber);
        return new ArrayList<>(englishLiteratureGenerator.getEnglishLiteratures());
    }
*/
}
