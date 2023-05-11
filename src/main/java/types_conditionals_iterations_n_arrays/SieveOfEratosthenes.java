package types_conditionals_iterations_n_arrays;

import java.util.ArrayList;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        runSieveOfEratosthenes(90);
        primeFinder(30).forEach(System.out::println);
    }

    static void runSieveOfEratosthenes(int n) {
        boolean[] prime = new boolean[n + 1];
        int i;
        for (i = 2; i < n; i++) {
            prime[i] = true;
        }

        /**
         * only need to go up to sqr_root of n, as we have already gone through flagging on values less than
         * has been marked "false"
         */
        for (int divisor = 2; divisor * divisor <= n; divisor++) {
            if (prime[divisor]) {
                for (i = 2 * divisor; i <= n; i += divisor) {
                    prime[i] = false;
                }
            }
        }

        for (i = 2; i <= n; i++) {
            if (prime[i]) {
                System.out.println(i);
            }
        }
        //        Note: Elements 0 & 1 never used.
    }

    //     My own function
    static ArrayList<Integer> primeFinder(Integer n) {
        ArrayList<Integer> results = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
                if (j == i - 1) {
                    results.add(i);
                }
            }
        }

        return results;
    }
}
