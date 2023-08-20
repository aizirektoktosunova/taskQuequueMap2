public class Carsdate extends Car {
    private int graduate;
    private String model;
    private int price;
    private String color;

    public Carsdate(int id, int number) {
        super(id, number);
    }

    public Carsdate(int id, int number, int graduate, String model, int price, String color) {
        super(id, number);
        this.graduate = graduate;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public int getGraduate() {
        return graduate;
    }

    public void setGraduate(int graduate) {
        this.graduate = graduate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return " Carsdate{" +
                "graduate=" + graduate +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
