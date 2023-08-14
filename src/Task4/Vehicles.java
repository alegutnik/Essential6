package Task4;

public enum Vehicles {
    BMW(1000, "black", "BMW"),

    MERCEDES(1000, "yellow", "Mercedes"),

    PORSHE(1000, "green", "PORSHE");

    int price;
    String color;
    String name;

    Vehicles(int price, String color, String name) {
        this.price = price;
        this.color = color;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

