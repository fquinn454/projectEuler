/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
The sum of these multiples is 23.  Find the sum of all the multiples of 3 or 5 below 1000.
*/

public class MultiplesOf3And5 {
    public static int calculateSum(int limit){
        int sum = 0;
        for(int i = 0; i < limit; i++){
            if (i%3==0 || i%5==0){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println(calculateSum(1000));
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Time: "+totalTime/1000000.000+"ms");
    }
}
