package programmer.zaman.now.data;

public class Application {

    public static final int PROCESSORS;

    static {
        // static block
        System.out.println("Mengakses class Application");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
