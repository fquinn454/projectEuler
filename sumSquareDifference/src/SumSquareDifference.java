/*
The sum of the squares of the first ten natural numbers is,
12 + 22 + ... + 102 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)2 = 552 = 3025

Hence the difference between the sum of the squares of the first ten
natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one
hundred natural numbers and the square of the sum.
*/

public class SumSquareDifference {
    public static int getSumOfSquares(){
        int sum = 0;
        for(int i = 1; i<=100; i++){
            sum += i*i;
        }
        return sum;
    }

    public static int getSquareOfTheSum(){
        int sum = 0;
        for(int i = 1; i<=100; i++){
            sum += i;
        }
        return sum*sum;
    }

    public static int getdifference(){
        return getSquareOfTheSum() - getSumOfSquares();
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println(getdifference());
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Time: "+totalTime/1000000.000+"ms");
    }
}
