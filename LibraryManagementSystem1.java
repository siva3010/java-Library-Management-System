import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class LibraryManagementSystem1 {
    ArrayList<Book> Book = new ArrayList<>();
    ArrayList<Transaction> transactions = new ArrayList<>();
    ArrayList<Member> members = new ArrayList<>();
    public static int counter = 1;

    public void run() {


        System.out.println("Welcome to the Library Management System");
        
        while (true) {
            System.out.println("1. Add book");
            System.out.println("2. Add Member");
            System.out.println("3. Display All Books");
            System.out.println("4. Display All Members");
            System.out.println("5. Search Book by Title");
            System.out.println("6. Search Member by Name");
            System.out.println("7. Borrow Book");
            System.out.println("8. Return Book");
            System.out.println("9. Display Transaction History");
            System.out.println("10. Exit");

            System.out.println("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            
            
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    addMember();
                    break;
                case 3:
                    displayAllBooks();
                    break;
                case 4:
                    displayAllMembers();
                    break;
                case 5:
                    searchBookByTitle();
                    break;
                case 6:
                    searchMemberByName();
                    break;
                case 7:
                    borrowBook();
                    break;
                case 8:
                    returnBook();
                    break;
                case 9:
                    displayAllTransactions();
                    break;
                case 10:
                    exit();
                    break;
            }
        }
    }

    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book ID :");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter book title :");
        String title = scanner.nextLine();
        System.out.println("Enter book author :");
        String author = scanner.nextLine();
        System.out.println("Enter book price :");
        int price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter book quantity :");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter book genre :");
        String genre = scanner.nextLine();
        Book book = new Book(id, title, author, price, quantity, genre);
        Book.add(book);
    }

    public void addMember() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter member Id :");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter member name :");
        String name = scanner.nextLine();
        System.out.println("Enter member email :");
        String email = scanner.nextLine();
        Member member = new Member(id, name, email);
        members.add(member);
    }

    public void displayAllBooks() {
        if (Book.isEmpty()) {
            System.out.println("No books found");
        } else {
            for (Book book : Book) {
                System.out.println(book);
            }
        }
    }

    public void displayAllMembers() {
        if (members.isEmpty()) {
            System.out.println("No members found");
        } else {
            for (Member member : members) {
                System.out.println(member);
            }
        }
    }

    public void searchBookByTitle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book title");
        String title = scanner.nextLine();
        for (Book book : Book) {
            if (book.getTitle().equals(title)) {
                System.out.println(book);
                return;
            }
        }
        System.out.println("Book not found");
    }

    public void searchMemberByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter member name");
        String name = scanner.nextLine();
        for (Member member : members) {
            if (member.getName().equals(name)) {
                System.out.println(member);
                return;
            }
        }
        System.out.println("Member not found");
    }

    public void borrowBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter member Id");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter book title");
        String title = scanner.nextLine();
        
        for (Member member : members) {
            if (member.getId() == id) {
                for (Book book : Book) {
                    if (book.getTitle().equals(title)) {
                        if (book.getQuantity() > 0) {
                            book.setQuantity(book.getQuantity() - 1);
                            transactions.add(new Transaction(++counter, member, book, Type.BORROW, new Date()));
                            System.out.println("Book borrowed successfully");
                            return;
                        } else {
                            System.out.println("Book not available");
                            return;
                        }
                    }
                }
                System.out.println("Book not found");
                return;
            }
        }
        System.out.println("Member not found");
    }

    public void returnBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter member Id");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter book title");
        String title = scanner.nextLine();
        
        for (Member member : members) {
            if (member.getId() == id) {
                for (Book book : Book) {
                    if (book.getTitle().equals(title)) {
                        book.setQuantity(book.getQuantity() + 1);
                        transactions.add(new Transaction(++counter, member, book, Type.RETURN, new Date()));
                        System.out.println("Book returned successfully");
                        return;
                    }
                }
                System.out.println("Book not found");
                return;
            }
        }
        System.out.println("Member not found");
    }

    public void displayAllTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions found");
        } else {
            for (Transaction transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }

    public void exit() {
        System.exit(0);
    }

    public static void main(String[] args) {
        LibraryManagementSystem1 library = new LibraryManagementSystem1();
        library.run();
    }
}
