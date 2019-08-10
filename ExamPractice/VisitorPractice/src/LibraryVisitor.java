public interface LibraryVisitor {

    void visit(Book book);

    void visit(Magazine magazine);

    void visit(ResearchPaper paper);

}

