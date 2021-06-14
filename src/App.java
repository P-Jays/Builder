public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Phone p = new Phone("Android", "12gb", 4200, 5.8);
        System.out.println(p);

        // it is not to good, what if we dont want to declare the ram or battery, but we
        // just want to declare the os
        // this is where builder design pattern come to action

        PhoneBuilder pb = new PhoneBuilder();
        Phone newPhone = pb.setOs("Android").getPhone();
        Phone newPhone2 = pb.setOs("Android").setBattery(4200).getPhone();
        System.out.println(newPhone);
        System.out.println(newPhone2);

        // with phone builder we can create an object without need to define like line 4
    }
}
