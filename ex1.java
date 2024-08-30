public class ex1 {
    private static int sumOf(int n) {
        int sum = 0;
        for (int counter = 1; counter < n; counter++) {
            if (counter % 5 == 0 || counter % 7 == 0) {
                sum+=counter;
            }
        }
        return sum;
    }
   
 }
 