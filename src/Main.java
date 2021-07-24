import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> inList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> resultList = new ArrayList<>();

        for (Integer integer : inList) {
            if (integer > 0 && integer % 2 == 0) {
                resultList.add(integer);
            }
        }

        insertionSort(resultList);
        System.out.println(resultList);
    }

    public static void insertionSort(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int current = list.get(i);
            int j = i - 1;
            while (j >= 0 && current < list.get(j)) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, current);
        }
    }
}