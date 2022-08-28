package ProblemSolvingParadigm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MoneyChange {
    public static void main(String[] args) {
        Integer[] pecahanUang = {1, 10, 20, 50, 100, 200, 500, 1000, 2000, 5000, 10000};
        Arrays.sort(pecahanUang, Collections.reverseOrder());
        tukarUang(Arrays.asList(pecahanUang), 150);
    }

    static void tukarUang(List<Integer> pecahanUang, int money) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < pecahanUang.size(); i++) {
            if (money >= pecahanUang.get(i)) {
                result.add(pecahanUang.get(i));
                double cnt = Math.floor(money / pecahanUang.get(i));
                if ((int) cnt > 1) {
                    for (int j = 1; j < cnt; j++) {
                        result.add(pecahanUang.get(i));
                    }
                }
                money = money - ((int) cnt * pecahanUang.get(i));

            }
        }
        System.out.println(result);
    }
}
