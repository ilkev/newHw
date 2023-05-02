package fBigHw;

public class Book {
    private String title;
    private String Author;
    private int yearOfPublication;


    public Book(String title, String author, int yearOfPublication) {
        this.title = title;
        Author = author;
        this.yearOfPublication = yearOfPublication;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return Author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
