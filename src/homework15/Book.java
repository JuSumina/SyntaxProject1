package homework15;

public class Book {

    String name;
    String author;
    int year;
    int length;

    Book(String bookName, String bookAuthor) {
        name=bookName;
        author=bookAuthor;
    }

    Book (int bookYear, int bookLength) {
        year=bookYear;
        length=bookLength;
    }

    void bookInfo1 () {

        System.out.println("The author of "+name+" is "+author+". ");
    }

    void bookInfo2 () {
        System.out.println("This book was published in "+year+", and it is "+length+" pages long.");
    }
}
