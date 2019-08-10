public interface LibraryElement {

    public static final int LOAN_PERIOD = 21;

    void accept(LibraryVisitor visitor);

}
