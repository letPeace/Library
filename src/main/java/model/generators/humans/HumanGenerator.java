package model.generators.humans;

import model.entities.books.Book;
import model.entities.books.BooksNumber;
import model.entities.books.BooksNumber;
import model.entities.humans.Human;
import model.generators.Generator;
import model.generators.books.EnglishLiteratureGenerator;
import model.generators.books.FictionGenerator;
import model.generators.books.RussianLiteratureGenerator;
import model.generators.sub.RandomIntegerGenerator;

import java.util.ArrayList;
import java.util.HashSet;

public interface HumanGenerator extends RandomIntegerGenerator, Generator{

    HashSet<Human> get();

    default void generate(int humansNumber){
        generateWithBooks(humansNumber, new BooksNumber(0,0,0));
    }

    default void generateWithBooks(int humansNumber, BooksNumber booksNumber){
        for(int i=1; i<=humansNumber; i++){
            generateWithBooks(booksNumber);
        }
    }

    default void generateWithBooks(BooksNumber booksNumber){
        Human human = generateHuman();
        addNewHuman(human);
        //
        FictionGenerator fictionGenerator = new FictionGenerator();
        RussianLiteratureGenerator russianLiteratureGenerator = new RussianLiteratureGenerator();
        EnglishLiteratureGenerator englishLiteratureGenerator = new EnglishLiteratureGenerator();
        //
        fictionGenerator.generate(booksNumber.getFictions());
        russianLiteratureGenerator.generate(booksNumber.getRussianLiteratures());
        englishLiteratureGenerator.generate(booksNumber.getEnglishLiteratures());
        //
        HashSet<Book> fictions = fictionGenerator.getBooks();
        HashSet<Book> russianLiteratures = russianLiteratureGenerator.getBooks();
        HashSet<Book> englishLiteratures = englishLiteratureGenerator.getBooks();
        //
        human.addBooks(fictions);
        human.addBooks(russianLiteratures);
        human.addBooks(englishLiteratures);
    }

    default void generateWithBooks(int humansNumber, int booksNumber){
        for(int i=1; i<=humansNumber; i++){
            int fictionsNumber = getRandomInteger(booksNumber);
            int russianLiteraturesNumber = getRandomInteger(booksNumber-fictionsNumber);
            int englishLiteraturesNumber = getRandomInteger(booksNumber-(fictionsNumber+russianLiteraturesNumber));
            generateWithBooks(new BooksNumber(fictionsNumber, russianLiteraturesNumber, englishLiteraturesNumber));
        }
    }

    String[] generateArguments();

    Human generateHuman(String[] args);

    default Human generateHuman(){
        return generateHuman(generateArguments());
    }

    void addNewHuman(Human human);

    ArrayList<String> getFirstNames();

    ArrayList<String> getLastNames();

    default String getCorrectLastName(String firstName, String lastName){
        if(!isMale(firstName)) return lastName+"а";
        return lastName;
    }

    default String getSecondName(String firstName){
        String secondName = getRandomMaleName();
        if(secondName.endsWith("й")) secondName = secondName.substring(0, secondName.length()-1)+"е";
        else secondName += "о";
        if(isMale(firstName)) secondName += "вич";
        else secondName += "вна";
        return secondName;
    }

    default String getRandomMaleName(){
        ArrayList<String> firstNames = getFirstNames();
        while(true){
            String firstName = firstNames.get((int)(Math.random()*firstNames.size()));
            if(isMale(firstName)) return firstName;
        }
    }

    default boolean isMale(String firstName){
        return Human.isMale(firstName);
    }

}
