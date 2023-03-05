public class Notebook {
    private double price;
    private int ram;

    public Notebook(double price, int ram) {
        this.price = price;
        this.ram = ram;
    }

    public double getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    @Override
    public String toString() {
        return "price: " + price + "; RAM: " + ram + ";";
    }
}