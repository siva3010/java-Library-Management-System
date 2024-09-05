import java.util.Date;
public class Transaction {
    private int id;
    private Member member;
    private Book book;

    private Type type;
    private Date date;


    public Transaction(int id, Member member,  Book book, Type type, Date date) {
        this.id = id;
        this.member = member;
        this.book = book;
        this.type = type;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction [id=" + id + ", member=" + member + ", Book=" + book + ", type=" + type + ", date="
                + date + "]";
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Member getMember() {
        return member;
    }
    public void setMember(Member member) {
        this.member = member;
    }

    public Book getBook() {
        return book;
    }
    public void setBook(Book Book) {
        this.book = Book;
    }

    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public Type getTransactionType(){
        return type;
    }
    public void setTransactionType(Type type){
         this.type = type;
    }


    
}
