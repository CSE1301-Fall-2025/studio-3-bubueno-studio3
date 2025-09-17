import java.util.Scanner;

public class Sieve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter highest number: ");
        int n = input.nextInt();
        int[] sieve = new int[n-1];

        for (int i = 2; i <= n; i++) {
            sieve[i-2]=i;
        }

        for (int i = 0; i < sieve.length; i++) {
            if (sieve[i] != 0) {
                int value = sieve[i];
                double valueDub = value;

                for (int j = 0; j < sieve.length; j++) {
                    double sieveDub = sieve[j];

                    if (sieve[j] > value) {
                        if (sieve[j]/value == sieveDub/valueDub) {
                            sieve[j] = 0;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < sieve.length; i++) {
            if (sieve[i] != 0) {
                System.out.println(sieve[i]);
            }
        }
    }
}
