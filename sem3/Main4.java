import java.util.*;

public class Main4 {

    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
    
        numbers.removeIf( number -> number%2 == 0 );
         
        System.out.println(numbers);
    }
}
