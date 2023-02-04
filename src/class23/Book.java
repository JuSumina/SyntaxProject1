package class23;

public class Book {

    String name;
    String author;
    int year;
    int length;

    Book(String name, String author) {
        this.name=name;
        this.author=author;
    }

    Book (String name, String author, int year, int length) {
        this(name, author);
        this.year=year;
        this.length=length;
    }



    void bookInfo () {
        if (year==0 && length==0) {
            System.out.println("The author of '"+name+"' is "+author);
        } else {
            System.out.println("The author of '"+name+"' is "+author+". It was published in "+year+", and it is "+length+" pages long.");
        }

    }

    public static void main(String[] args) {

        Book book1=new Book("Fahrenheit 451", "Ray Bradbury");
        book1.bookInfo();

        Book book2=new Book("1984", "George Orwell", 1949, 328);
        book2.bookInfo();

        new StringBuilder();
        new StringBuilder("hello");


    }
}
