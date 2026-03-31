public class SkillRatingFrequency {
    public static void main(String[] args) {
        int[] ratings = {2, 3, 4, 3, 5, 3, 4, 5, 2, 2, 3, 3, 4, 5, 1, 2, 4, 1, 2, 5};
        int[] frequency = new int[6]; // indexes 1 through 5 used

        for (int rating : ratings) {
            if (rating >= 1 && rating <= 5) {
                frequency[rating]++;
            }
        }

        System.out.println("Rating frequency (highest to lowest):");
        for (int rating = 5; rating >= 1; rating--) {
            System.out.printf("Rating %d: %d student(s)%n", rating, frequency[rating]);
        }
    }
}
