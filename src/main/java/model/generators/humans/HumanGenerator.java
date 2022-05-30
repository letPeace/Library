package model.generators.humans;

import model.entities.humans.Human;
import model.generators.sub.RandomIntegerGenerator;

import java.util.ArrayList;

public interface HumanGenerator extends RandomIntegerGenerator{

    default void generate(int humansNumber){
        ArrayList<String> firstNames = getFirstNames();
        ArrayList<String> lastNames = getLastNames();
        for(int i=1; i<=humansNumber; i++){
            String firstName = firstNames.get(getRandomIndex(firstNames));
            String lastName = getCorrectLastName(firstName, lastNames.get(getRandomIndex(lastNames)));
            if(this instanceof ProfessorGenerator){
                String secondName = getSecondName(firstName);
                addNewHuman(firstName, secondName, lastName);
            }
            else addNewHuman(firstName, lastName);
        }
    }

    void addNewHuman(String... names);

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
