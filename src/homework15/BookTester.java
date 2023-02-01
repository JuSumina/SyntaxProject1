package homework15;

public class BookTester {

    public static void main(String[] args) {

        Book book11=new Book("'1984'", "George Orwell");
        Book book12=new Book(1949, 328);

        book11.bookInfo1();
        book12.bookInfo2();
    }
}
