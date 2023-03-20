package programmer.zaman.now.application;

import programmer.zaman.now.data.Customer;
import programmer.zaman.now.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Budi");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDesc());

        // enum to string
        String levelName = Level.VIP.name();
        System.out.println(levelName);

        // string to enum
        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        // available enum level
        System.out.println("Print Level");
        for (var value : Level.values()){
            System.out.println(value);
        }
    }
}
