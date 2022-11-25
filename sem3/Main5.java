import java.util.*;

public class Main5 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, -6));
        System.out.println(Collections.min(numbers));
        System.out.println(Collections.max(numbers));
        System.out.println(sumAverage(numbers));
    }

    private static double sumAverage(ArrayList<Integer> numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        {
            return sum/numbers.size();
        }
    }
}
