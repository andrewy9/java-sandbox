package types_conditionals_iterations_n_arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        // Take a look at ./pascalTriangle.png
        pascalsTriangle(7);
    }

    static int[][] pascalsTriangle(int n) {
        int[][] pt = new int[n][];
        for (int i = 0; i < n; i++) {
            pt[i] = new int[i + 1];
            pt[i][0] = 1;
            for (int j = 1; j < i; j++) {
                pt[i][j] = pt[i - 1][j - 1] + pt[i - 1][j];
            }
            pt[i][i] = 1;
        }
        printPascalTriangle(pt);
        return pt;
    }

    static void printPascalTriangle(int[][] pt) {
        for (int[] el : pt) {
            StringBuilder line = new StringBuilder();
            for (int num : el) {
                line.append(num);
            }
            System.out.println(line);
        }
    }
}
