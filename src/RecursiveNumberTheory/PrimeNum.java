package RecursiveNumberTheory;
import java.util.ArrayList;
import java.util.List;

public class PrimeNum {

    public static void main(String[] args) {
        primaKeN(1);
        //primaKeN(5);
    }

    static void primaKeN(int number) {
        int limit = number > 1 ? (int) Math.pow(number, 2) : number * 2;
        List<Integer> result = new ArrayList<>(number);
        for (int i = 2; i <= limit; i++) {
            result.add(i);
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    result.remove(result.lastIndexOf(i));
                    break;
                }
            }
            if (result.size() == number) {
                System.out.println(result.get(number - 1));
                break;
            }
        }

    }
}
