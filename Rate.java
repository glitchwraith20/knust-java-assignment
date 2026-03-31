import java.util.*;

public class Rate {
    public static void main(String[] args) {
        
        final int[] rate = {2,3,4,3,5,3,4,5,2,2,3,3,4,5,1,2,4,1,2,5};
        int a = 0, b = 0, c = 0, d = 0, e = 0, i;

        for (i = 0; i < rate.length; i++) {
            if (rate[i] == 1) {
                a = a + 1;
            }
            else if (rate[i] == 2) {
                b = b + 1;
            }
            else if (rate[i] == 3) {
                c = c + 1;
            }
            else if (rate[i] == 4) {
                d = d + 1;
            }
            else if (rate[i] == 5) {
                e = e + 1;
            }
        }

        System.out.println("=== Rating Summary ===");
        System.out.printf("1 appears: %d\n", a);
        System.out.printf("2 appears: %d\n", b);
        System.out.printf("3 appears: %d\n", c);
        System.out.printf("4 appears: %d\n", d);
        System.out.printf("5 appears: %d\n", e);

        System.out.println("\n=== Ranking Summary ===");

        List<Integer> sortedRatings = new ArrayList<>();
        for(int j=1; j<=5; j++) sortedRatings.add(j);
        int[] counts = {a, b, c, d, e};
        sortedRatings.sort((r1, r2) -> Integer.compare(counts[r2-1], counts[r1-1]));
        for(int rating : sortedRatings) {
            System.out.printf("%d appears: %d\n", rating, counts[rating-1]);
        }

    }
}
