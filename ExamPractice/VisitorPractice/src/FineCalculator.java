import java.util.List;

public class FineCalculator {
    private List<LibraryElement> items;

    public float calculateFineForStudent() {

        StudentVisitor visitor = new StudentVisitor();
        for(LibraryElement item: items) {
            item.accept(visitor);
        }
       return visitor.getTotalFine();
    }

    public float calculateFineForFaculty() {

        FacultyVisitor visitor = new FacultyVisitor();
        for(LibraryElement item: items) {
            item.accept(visitor);
        }
        return visitor.getTotalFine();
    }


}
