/*
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
*/

public class LargestPrimeNumber {
    public static long calculatePrime(long number){
        long prime = 2;
        while(number > 1) {
            if (number % prime == 0) {
                number /= prime;
            }
            else{
                prime += 1;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println(calculatePrime(600851475143L));
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Time: "+totalTime/1000000.000+"ms");

    }

}
