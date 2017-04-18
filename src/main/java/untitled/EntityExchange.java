package main.java.untitled;

public class EntityExchange {
    private String name;
    private double price;
    private String dateString;

    public String getName() {
        return String.valueOf(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDateString() {
        return dateString;
    }

    public void setDateString(String dateString) {
        this.dateString = dateString;
    }
}
