import java.util.Scanner;

public class homework {
    //Make a function to check if a number is prime or not.
    //1:

        // Function to check if a number is prime
        public static boolean isPrime(int number) {
            if (number < 1) {
                return false;
            }

            // Check for divisibility from 2 to sqrt(number)
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    return false; // If divisible, not prime
                }
            }

            return true; // If not divisible by any number, it's prime
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            if (isPrime(num)) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }
