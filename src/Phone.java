public class Phone {
    private String os;
    private String ram;
    private int battery;
    private double size;
    public Phone(String os, String ram, int battery, double size) {
        this.os = os;
        this.ram = ram;
        this.battery = battery;
        this.size = size;
    }
    @Override
    public String toString() {
        return "Phone [battery=" + battery + ", os=" + os + ", ram=" + ram + ", size=" + size + "]";
    }

    
}
