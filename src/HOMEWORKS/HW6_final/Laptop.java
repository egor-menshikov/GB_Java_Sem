package HOMEWORKS.HW6_final;

public class Laptop {
    private final String name;
    private final String cpu;
    private final String gpu;
    private final int ram;
    private final int ssd;
    private final int price;
    private final int screen;
    private final Color color;

    public enum Color {SILVER, BLACK, GREY, BLUE}

    public Laptop(String name, String cpu, String gpu, int ram, int ssd, int price, int screen, Color color) {
        this.name = name;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.ssd = ssd;
        this.price = price;
        this.screen = screen;
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public int getSsd() {
        return ssd;
    }

    public int getPrice() {
        return price;
    }

    public double getScreen() {
        return screen;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return name + "\nCPU: " + cpu + " | GPU: " + gpu + "\n" +
                ram + " GB | " + ssd + " GB ssd | " + screen + "\" | " + color + " | " + price + "руб." + "\n";
    }
}
