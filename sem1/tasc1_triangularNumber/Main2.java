import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        try (Scanner n = new Scanner(System.in)) {
            int end = n.nextInt();
            int result = 0;
            
            for ( int i = 1; i <= end; i++ ) {
                result += i;
            }
            System.out.println(result);
        }
    }
}
