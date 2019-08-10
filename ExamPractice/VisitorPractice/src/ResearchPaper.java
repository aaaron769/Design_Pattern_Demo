import java.util.Date;

public class ResearchPaper implements LibraryElement {
    private Date checkOutDate;
    private Date checkInDate;
    private String name;

    @Override
    public void accept(LibraryVisitor visitor) {
        visitor.visit(this);
    }


    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public String getName() {
        return name;
    }
}
