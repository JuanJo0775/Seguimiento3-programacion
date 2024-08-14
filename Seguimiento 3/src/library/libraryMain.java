package library;

import java.util.Date;

public class libraryMain {
    public static void main(String[] args) {
        book book1 = new book("9786287611924", "The King's Perfume", "Karine Bernal", 2023, "Editorial Planeta", 608, "Romantic Fantasy");
        book book2 = new book("9789585531956", "From Blood and Ash", "Jennifer L. Armentrout", 2022, "Puck", 667, "Young Adult Romance");
        book book3 = new book("9798400137259", "Damian: A Dark and Twisted Secret", "Alex Mirez", 2022, "Independent", 472, "Thriller");

        user user1 = new user("Robert Downey Jr.", "3000458962", "555-1234");
        user user2 = new user("Sabrina Carpenter", "4578952185", "555-4789");

        loan[] loans = new loan[2];
        loans[0] = new loan(book1.getIsbn(), user1.getIdentification(), new Date(), null);
        loans[1] = new loan(book2.getIsbn(), user2.getIdentification(), new Date(), null);

        for (int i = 0; i < loans.length; i++) {
            System.out.println("Book ISBN: " + loans[i].getBookIsbn());
            System.out.println("User ID: " + loans[i].getUserIdentification());
            System.out.println("Loan Date: " + loans[i].getLoanDate());
            System.out.println("Return Date: " + loans[i].getReturnDate());
        }
    }
}
