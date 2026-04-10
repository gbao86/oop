package thuchanh2;

// Bài 4: Hiện thực các lớp quản lý theo thiết kế Project: Student, Book, LibraryCard
public class Bai4 {
    public static void main(String[] args) {
        LibraryCard card = new LibraryCard(202601, "Trinh Gia Bao", 0);
        card.checkOut(3);
        System.out.println(card.toString());
    }
}

class Student {
    private String stID, stName, stClass;

    public Student() {}
    public Student(String stID, String stName, String stClass) {
        this.stID = stID;
        this.stName = stName;
        this.stClass = stClass;
    }
    public Student(Student st) {
        this.stID = st.stID;
        this.stName = st.stName;
        this.stClass = st.stClass;
    }

    public String getStID() { return stID; }
    public void setStID(String id) { this.stID = id; }
    public String getStName() { return stName; }
    public void setStName(String name) { this.stName = name; }
    public String getStClass() { return stClass; }
    public void setStClass(String className) { this.stClass = className; }

    @Override
    public String toString() {
        return "Student ID: " + stID + ", Name: " + stName + ", Class: " + stClass;
    }
}

class Book {
    private String boCode, boTitle, boAuthor;

    public Book() {}
    public Book(String code, String title, String author) {
        this.boCode = code;
        this.boTitle = title;
        this.boAuthor = author;
    }
    public Book(Book bo) {
        this.boCode = bo.boCode;
        this.boTitle = bo.boTitle;
        this.boAuthor = bo.boAuthor;
    }

    public String getBoCode() { return boCode; }
    public void setBoCode(String code) { this.boCode = code; }
    public String getBoTitle() { return boTitle; }
    public void setBoTitle(String title) { this.boTitle = title; }
    public String getBoAuthor() { return boAuthor; }
    public void setBoAuthor(String author) { this.boAuthor = author; }

    @Override
    public String toString() {
        return "Book Code: " + boCode + ", Title: " + boTitle + ", Author: " + boAuthor;
    }
}

class LibraryCard {
    private long lbCode; 
    private String owner;
    private int borrowCount;

    public LibraryCard() {}
    public LibraryCard(long lbCode, String owner, int borrowCount) {
        this.lbCode = lbCode;
        this.owner = owner;
        this.borrowCount = borrowCount;
    }

    public long getLbCode() { return lbCode; }
    public void setLbCode(long code) { this.lbCode = code; }
    public String getOwner() { return owner; }
    public void setOwner(String owner) { this.owner = owner; }
    public int getBorrowCount() { return borrowCount; }

    public void checkOut(int num) {
        this.borrowCount += num;
    }

    @Override
    public String toString() {
        return "LibraryCard [ID=" + lbCode + ", Owner=" + owner + ", Borrowed=" + borrowCount + "]";
    }
}