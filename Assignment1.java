# JAVA
class Member {
    String name;
    String[] borrowedBooks;
    int bookCount;

  
    Member(String name, int maxBooks) {
        this.name = name;
        borrowedBooks = new String[maxBooks];
        bookCount = 0;
    }

    
    void borrowBook(String bookName) {
        if (bookCount < borrowedBooks.length) {
            borrowedBooks[bookCount] = bookName;
            bookCount++;
        } else {
            System.out.println("Cannot borrow more books. Limit reached!");
        }
    }

  
    int countBorrowedBooks() {
        return bookCount;
    }
}

public class MemberTest {
    public static void main(String[] args) {
        Member m1 = new Member("Rushi", 5);

        m1.borrowBook("Java");
        m1.borrowBook("DBMS");
        m1.borrowBook("Networks");

        System.out.println("Total borrowed books: " + m1.countBorrowedBooks());
    }
}
