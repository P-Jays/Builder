public class PhoneBuilder {
    private String os;
    private String ram;
    private int battery;
    private double size;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setSize(double size) {
        this.size = size;
        return this;
    }

    public Phone getPhone(){
        return new Phone(os, ram, battery, size);
    }

}
