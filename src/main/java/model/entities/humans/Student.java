package model.entities.humans;

public class Student extends Human{

    public Student(String firstName, String lastName){
        super(firstName, lastName);
    }

    @Override
    public String toString(){
        return "\nStudent{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", \n\tbooks=" + getBooks() +
                '}';
    }

}
