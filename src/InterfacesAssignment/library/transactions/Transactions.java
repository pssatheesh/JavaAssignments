package InterfacesAssignment.library.transactions;


public class Transactions {
    private int issueBookId;
    private String issueBookName;
    private String issueDate;
    private String returnDate;

    public int getIssueBookId() {
        return issueBookId;
    }

    public void setIssueBookId(int issueBookId) {
        this.issueBookId = issueBookId;
    }

    public String getIssueBookName() {
        return issueBookName;
    }

    public void setIssueBookName(String issueBookName) {
        this.issueBookName = issueBookName;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

}
