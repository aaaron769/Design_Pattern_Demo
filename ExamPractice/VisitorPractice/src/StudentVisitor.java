import java.util.Date;

public class StudentVisitor implements LibraryVisitor {
    private float totalFine;

    @Override
    public void visit(Book book) {
        float bookFine = 0;
        int days = getDays(book.getCheckInDate(), book.getCheckOutDate());
        if(days > Book.LOAN_PERIOD) {
            int overdueDays = (days - 21);
            bookFine = (float) (0.10 * overdueDays);
            if(bookFine > 5) bookFine = 5; // Maximum fine is 5

            totalFine += bookFine;
        }

        if(bookFine > 0)
            System.out.println("fine for " + book.getName() + " is: $" + bookFine);

    }

    @Override
    public void visit(Magazine magazine) {
        float magazineFine = 0;
        int days = getDays(magazine.getCheckInDate(), magazine.getCheckOutDate());
        if(days > Book.LOAN_PERIOD) {
            int overdueDays = (days - 21);
            magazineFine = (float) (0.5 * overdueDays);
            if(magazineFine > 5) magazineFine = 5; // Maximum fine is 5

            totalFine += magazineFine;
        }

        if(magazineFine > 0)
            System.out.println("fine for " + magazine.getName() + " is: $" + magazineFine);
    }

    @Override
    public void visit(ResearchPaper researchPaper) {
        System.out.println("No fines for research paper");
    }

    public float getTotalFine() {
        return totalFine;
    }

    private int getDays(Date checkInDate, Date checkOutDate) {
        return 0; // calculate days between two dates
    }
}
