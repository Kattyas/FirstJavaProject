package AnimalRescue;

public class AnimalFood {

    private String name ;
    private int price;
    private int amount;
    private int stock;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }



    public void spicy (){
        System.out.println("...hot, hot ");
    }
    public void tasty (){
        System.out.println("...yam, yam ");
    }



}
