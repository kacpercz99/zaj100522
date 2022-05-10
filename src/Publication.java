public class Publication {
    private String title;
    private String ident;
    private double price;
    private int quantity;

    public Publication(String title, String ident, double price, int quantity) {
        this.title = title;
        this.ident = ident;
        this.price = price;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void zakup(int n) {
        quantity += n;
    }

    /*
    public void buy(int n){
        if(n > quantity) {
            int x = n - quantity;
            System.out.println("Zabraklo " + x + " egzemplarzy");
            System.out.println("Kupiono tylko: " + quantity);
            quantity = 0;
        } else if(n <= 0) {
            System.out.println("Wprowadzono bledna liczbe egzemplarzy do kupna");
        } else {
            System.out.println("Zakupiono " + n + " egzemplarzy");
            quantity -= n;
            System.out.println("Zostalo " + quantity + " egzemplarzy");
        }
    }
    */
    @Override
    public String toString() {
        return "Publication{" +
                "title='" + title + '\'' +
                ", ident='" + ident + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
