import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,-6));
        System.out.println(Collections.min(numbers));
        System.out.println(Collections.max(numbers));

        IntSummaryStatistics statistics = numbers.stream().mapToInt(num -> num).summaryStatistics();
        System.out.println(statistics.getAverage());
    }
}
