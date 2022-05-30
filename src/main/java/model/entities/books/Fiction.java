package model.entities.books;

public class Fiction extends Book{

    public Fiction(String author, String title){
        super(author, title);
    }

    @Override
    public String toString() {
        return "\n\tFiction{" +
                "author='" + getAuthor() + '\'' +
                ", title='" + getTitle() + '\'' +
                '}';
    }
}
