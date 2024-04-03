package AbstractClass.document;

import AbstractClass.employee.Employee;

class PdfDocument extends Document{

    public PdfDocument(int pageCount, int documentSize) {
        super(pageCount, documentSize);
    }

    @Override
    void getDisplay() {
        System.out.println("PDF Documents are created");
        System.out.println("Document size is "+getDocumentSize()+"MB");
        System.out.println("Number of pages are "+getPageCount());
    }
}
class imageDocument extends Document{
    public imageDocument(int pageCount, int documentSize) {
        super(pageCount, documentSize);
    }

    @Override
    void getDisplay() {
        System.out.println("Image files are created");
        System.out.println("Document size is "+getDocumentSize()+"MB");
        System.out.println("Number of pages are "+getPageCount());
    }
}
class TextDocument extends Document{

    public TextDocument(int pageCount, int documentSize) {
        super(pageCount, documentSize);
    }

    @Override
    void getDisplay() {
        System.out.println("Text Documents are created");
        System.out.println("Document size is "+getDocumentSize()+"MB");
        System.out.println("Number of pages are "+getPageCount());
    }
}

public class Mainclass {
    public static void main(String[] args) {
        Document doc=new PdfDocument(100, 5);
        doc.getDisplay();
        Document image=new imageDocument(2, 10);
        image.getDisplay();
        Document text=new TextDocument(350, 10);
        text.getDisplay();
    }
}
