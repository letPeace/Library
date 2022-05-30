package model.entities.humans;

public class Professor extends Human{

    private final String secondName;

    public Professor(String firstName, String secondName, String lastName){
        super(firstName, lastName);
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public String toString(){
        return "\nProfessor{" +
                "firstName='" + getFirstName() + '\'' +
                ", secondName='" + getSecondName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", \n\tbooks=" + getBooks() +
                '}';
    }

}
