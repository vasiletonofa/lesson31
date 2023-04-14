package comarable;

public class Automobil {

    int price;

    String model;

    public Automobil(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Automobil{" +
                "price=" + price +
                ", model='" + model + '\'' +
                '}';
    }
}
