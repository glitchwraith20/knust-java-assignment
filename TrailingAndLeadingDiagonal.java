import java.util.Arrays;

public class TrailingAndLeadingDiagonal {
    public static void main(String[] args){

        int[][] K = {
            {2,3,4}, 
            {5,6,7}, 
            {8,9,1}
        };

        int[][] J = {
            {3,4,5}, 
            {7,8,9}, 
            {2,1,3}
        };

        int productK = 1, productJ = 1, difference, result, finalResult, tempK, tempJ, n = 3;

        //Trailing diagonal = [i][i]
        for (int i = 0; i < n; i++){
            productK *= K[i][i];
            productJ *= J[i][i];
        }

        // Product of Trailing Diagonal
        finalResult = productK * productJ;
        System.out.println("Result for the product of the trailing diagonal: " + finalResult); 

        productK = 1;
        productJ = 1;

        //Leading diagonal = [i][n-1-i]        
        for (int i = 0; i < n; i++){
            productK *= K[i][n - 1 - i];
            productJ *= J[i][n - 1 - i];
        }

        // Product of Leading Diagonal
        result = productK * productJ;
        System.out.println("Result for the product of the leading diagonal: " + result);


        // DIFFERENCE BETWEEN EACH DIAGONAL
        difference = result - finalResult;
        System.out.println("Difference between both diagonals is " + difference);


        // SWAP THE VALUES OF BOTH TABLES
        for (int i = 0; i < n ; i++){
            tempK = K[i][i];
            K[i][i] = K[i][n - 1 - i];
            K[i][n - 1 - i] = tempK;

            tempJ = J[i][i];
            J[i][i] = J[i][n - 1 - i];
            J[i][n - 1 - i] = tempJ;
        }

        System.out.println("The swapped content of table K is ");
        for (int[] row : K) System.out.println(Arrays.toString(row));
        System.out.println("The swapped content of table J is ");
        for (int[] row : J) System.out.println(Arrays.toString(row));

        double sumK = 0;
        double sumJ = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sumK += K[i][j];
                sumJ += J[i][j];
            }
        }
        double averageK = sumK / (n * n);
        double averageJ = sumJ / (n * n);
        double meanOfAverages = (averageK + averageJ) / 2;

        System.out.printf("Average of table K: %.2f%n", averageK);
        System.out.printf("Average of table J: %.2f%n", averageJ);
        System.out.printf("Mean of the averages of table K and table J: %.2f%n", meanOfAverages);
    }
}