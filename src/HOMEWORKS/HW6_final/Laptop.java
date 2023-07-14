package HOMEWORKS.HW6_final;

public class Laptop {
    String name, cpu, gpu;
    int ram, ssd, price;
    double screen;
    Color color;

    public enum Color {SILVER, BLACK, RED, BLUE}

    public Laptop(String name, String cpu, String gpu, int ram, int ssd, int price, double screen, Color color) {
        this.name = name;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.ssd = ssd;
        this.price = price;
        this.screen = screen;
        this.color = color;
    }

    @Override
    public String toString() {
        return name + "\nCPU: " + cpu + " | GPU: " + gpu + "\n" +
                ram + " GB | " + ssd + " GB ssd | " + screen + "\" | " + color + " | " + price + "руб." + "\n";
    }
}
