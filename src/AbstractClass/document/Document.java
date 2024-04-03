package AbstractClass.document;

abstract class Document {
    int pageCount;
    int documentSize;

    public Document(int pageCount, int documentSize) {
        this.pageCount = pageCount;
        this.documentSize = documentSize;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getDocumentSize() {
        return documentSize;
    }

    abstract void getDisplay();
}
