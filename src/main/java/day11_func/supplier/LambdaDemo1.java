package day11_func.supplier;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Supplier;

/*
@FunctionalInterface
public interface Supplier<T> {

    T get();
}
 */

public class LambdaDemo1 {
    public static void main(String[] args) {
        Supplier<Date> today = () -> new Date();
        System.out.println(today.getClass());
        
        // 格式化 yyyy-MM-dd a hh:mm:ss E
        Supplier<String> today2 = () -> {
            String fomatString = "yyyy-MM-dd a hh:mm:ss E";
            SimpleDateFormat sdf = new SimpleDateFormat(fomatString);
            return sdf.format(today.get());
            //return sdf.format(new Date());
        };
        System.out.println(today2.get());
    }

}
