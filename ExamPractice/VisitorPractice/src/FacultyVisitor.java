import java.util.Date;

public class FacultyVisitor implements LibraryVisitor {
    private float totalFine;


    @Override
    public void visit(Book book) {
        float bookFine = 0;
        int days = getDays(book.getCheckInDate(), book.getCheckOutDate());
        if(days > Book.LOAN_PERIOD) {
            int overdueDays = (days - 21);
            bookFine = (float) (0.10 * overdueDays);
            if(bookFine > 10) bookFine = 10; // Maximum fine is 10

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
            magazineFine = (float) (0.10 * overdueDays);
            if(magazineFine > 10) magazineFine = 10; // Maximum fine is 10

            totalFine += magazineFine;
        }

        if(magazineFine > 0)
            System.out.println("fine for " + magazine.getName() + " is: $" + magazineFine);
    }

    @Override
    public void visit(ResearchPaper researchPaper) {
        float paperFine = 0;
        int days = getDays(researchPaper.getCheckInDate(), researchPaper.getCheckOutDate());
        if(days > Book.LOAN_PERIOD) {
            int overdueDays = (days - 21);
            paperFine = (float) (0.20 * overdueDays);
            if(paperFine > 10) paperFine = 10;
            totalFine += paperFine;
        }

        if(paperFine > 0)
            System.out.println("fine for " + researchPaper.getName() + " is: $" + paperFine);
    }

    public float getTotalFine() {
        return totalFine;
    }

    private int getDays(Date checkInDate, Date checkOutDate) {
        return 0; // calculate days between two dates
    }
}
