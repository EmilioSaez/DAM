class Book  {
    private String title;
    private Author author;
    private Double price;
    private int qtyInStock;

    public Book (String title, Author author, Double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        qtyInStock = 0;
    }
    public Book (String title, Author author, double price, int qtyInStock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public Double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
    public String getAuthorName(){
        return author.getName();
    }
    public String getAuthorEmail(){
        return author.getEmail();
    }
    public char getAuthorGender(){
        return author.getGender();
    }


    public String toString(){
        return getTitle()+ " by " + author.toString();
    }
}
