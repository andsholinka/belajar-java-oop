package programmer.zaman.now.util;

public class MathUtil {

    public static int sum(int... values){ //variable argument
        // static method
        int total = 0;
        for (var value : values){
            total += value;
        }
        return total;
    }
}
