// 672115045 Virawit Kongthong OOP Lab7 Question 2

public class main2 {
    public static void main(String[] args) {
        LibraryItem[] libraryItems = new LibraryItem[3];

        libraryItems[0] = new Book("1231", "Harry Potter and the Sorcerer Stone", 21);
        libraryItems[1] = new Audiobook("2233", "How to walk", 14);
        libraryItems[2] = new DVD("3211", "Frozen 2", 7);

        for (int i = 0; i < 3; i++) {
            System.out.print("Barcode: " + libraryItems[i].getBarCode() + ", ");
            System.out.print("Title: " + libraryItems[i].getTitle() + ", ");
            System.out.println("Loan Period: " + libraryItems[i].getLoanPeriod() + " days");
            libraryItems[i].checkout("John");
        }
        
    }

}

abstract class LibraryItem {
    private String barCode;
    private String title;
    private int loanPeriod;

    protected LibraryItem() {

    }

    protected LibraryItem(String barCode, String title, int loanPeriod) {
        this.barCode = barCode;
        this.title = title;
        this.loanPeriod = loanPeriod;
    }

    public String getBarCode() {
        return barCode;
    }

    public String getTitle() {
        return title;
    }

    public int getLoanPeriod() {
        return loanPeriod;
    }

    public void checkout(String borrowerName) {
        System.out.println(borrowerName + " has checkouted " + getBarCode() + " " + getTitle() + " " + getLoanPeriod());
    }

}

class Book extends LibraryItem {
    private String barCode;
    private String title;
    private int loanPeriod;

    public Book(String barCode, String title, int loanPeriod) {
        this.barCode = barCode;
        this.title = title;
        this.loanPeriod = loanPeriod;
    }

    @Override
    public String getBarCode() {
        return "B" + barCode;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getLoanPeriod() {
        return loanPeriod;
    }

    @Override
    public void checkout(String borrowerName) {
        System.out.println(borrowerName + " has checkouted " + getBarCode() + " " + getTitle() + " " + getLoanPeriod());
    }
}

class Audiobook extends LibraryItem {
    private String barCode;
    private String title;
    private int loanPeriod;

    public Audiobook(String barCode, String title, int loanPeriod) {
        this.barCode = barCode;
        this.title = title;
        this.loanPeriod = loanPeriod;
    }

    @Override
    public String getBarCode() {
        return "A" + barCode;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getLoanPeriod() {
        return loanPeriod;
    }

    @Override
    public void checkout(String borrowerName) {
        System.out.println(borrowerName + " has checkouted " + getBarCode() + " " + getTitle() + " " + getLoanPeriod());
    }
}

class DVD extends LibraryItem {
    private String barCode;
    private String title;
    private int loanPeriod;

    public DVD(String barCode, String title, int loanPeriod) {
        this.barCode = barCode;
        this.title = title;
        this.loanPeriod = loanPeriod;
    }

    @Override
    public String getBarCode() {
        return "D" + barCode;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getLoanPeriod() {
        return loanPeriod;
    }

    @Override
    public void checkout(String borrowerName) {
        System.out.println(borrowerName + " has checkouted " + getBarCode() + " " + getTitle() + " " + getLoanPeriod());
    }
}
