package library;

import java.util.Date;

public class loan {
    private String bookIsbn;
    private String userIdentification;
    private Date loanDate;
    private Date returnDate;

    public loan(String bookIsbn, String userIdentification, Date loanDate, Date returnDate) {
        this.bookIsbn = bookIsbn;
        this.userIdentification = userIdentification;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }

    public String getUserIdentification() {
        return userIdentification;
    }

    public void setUserIdentification(String userIdentification) {
        this.userIdentification = userIdentification;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}
