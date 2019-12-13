/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10001st prime number?
*/

public class GetPrime {
    public static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n) + 1; i = i + 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int getAnswer(int number){
        int count = 1;
        int prime = 1;
        while(count <= number) {
            prime += 1;
            if (isPrime(prime)) {
                count += 1;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        System.out.println(getAnswer(10001));
    }
}
