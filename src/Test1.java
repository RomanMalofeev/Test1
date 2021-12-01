import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Ошибка: введено менее 3 значений!");
            return;
        }
        ArrayList<Double> al = new ArrayList<>();
        try {
            for (int i = 0; i < args.length - 1; i++) {
                al.add(Double.parseDouble(args[i]));
            }
        } catch (Exception ex) {
            System.out.println("Ошибка: введено некорректное значение");
            return;
        }
        Collections.sort(al, Collections.reverseOrder());
        System.out.println(al.get(0) + " " + al.get(1) + " " + al.get(2));
    }
}
