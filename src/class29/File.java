package class29;

public abstract class File {

    abstract void open ();

    void edit () {
        System.out.println("You can edit your file");
    }

    void close() {
        System.out.println("You can close your file");
    }

    File (int size) {

    }
}

class JavaFile extends File{
    public JavaFile(int size) {
        super(size);
    }

    @Override
    void open() {
        System.out.println("To open Java File we need notepad++");
    }
}

class WordFile extends File {
    public WordFile(int size) {
        super(size);
    }

    @Override
    void open() {
        System.out.println("To open .doc file we need Microsoft Word");
    }
}

class PdfFile extends File {
    public PdfFile(int size) {
        super(size);
    }

    @Override
    void open() {
        System.out.println("To open .pdf file we need Adobe Acrobat");
    }
}
