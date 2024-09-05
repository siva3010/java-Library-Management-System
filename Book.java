public class Book {
    private int id;
    private String Title;
    private String Author;
    private int Price;
    private int Quantity;
    private String  Genre;
    public Book(int id, String Title, String Author, int Price, int Quantity, String Genre) {
        this.id = id;
        this.Title = Title;
        this.Author = Author;
        this.Price = Price;
        this.Quantity = Quantity;
        this.Genre = Genre;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", Title=" + Title + ", Author=" + Author + ", Price=" + Price + ", Quantity="
                + Quantity + ", Genre=" + Genre + "]";
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() { 
        return Title;
    }
    public void setTitle(String Title) {
        this.Title = Title;
    }
    public String getAuthor() {
        return Author;
    }
    public void setAuthor(String Author) {
        this.Author = Author;
    }
    public int getPrice() {
        return Price;
    }
    public void setPrice(int Price) {
        this.Price = Price;
    }
    public int getQuantity() {
        return Quantity;
    }
    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
    public String getGenre() {
        return Genre;
   
    }
    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    
}
