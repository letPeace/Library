package model.entities.books;

public class RussianLiterature extends Literature{

    private final String type;

    public RussianLiterature(String author, String title, String discipline, String type){
        super(author, title, discipline);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "\n\tRussianLiterature{" +
                "author='" + getAuthor() + '\'' +
                ", title='" + getTitle() + '\'' +
                ", discipline='" + getDiscipline() + '\'' +
                ", type='" + getType() + '\'' +
                '}';
    }

}
