package RecursiveNumberTheory;
import java.util.Arrays;
import java.util.List;

public class FindMinAndMax {
    public static void main(String[] args) {
        Integer[] numbers = {5, 7, 4, -2, -1, 8};
        minMax(Arrays.asList(numbers));
    }

    static void minMax(List<Integer> list) {
        int resultMin = list.get(0);
        int resultMax = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (resultMin > list.get(i)) {
                resultMin = list.get(i);
            }
            if (resultMax < list.get(i)) {
                resultMax = list.get(i);
            }
        }
        System.out.println("Min :" + resultMin + ",index : " + list.lastIndexOf(resultMin) + " dan Max : " + resultMax + ",index :" + list.lastIndexOf(resultMax));
    }
}
