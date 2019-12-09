/*
Each new term in the Fibonacci sequence is generated by adding the previous two terms.
        By starting with 1 and 2, the first 10 terms will be: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
        By considering the terms in the Fibonacci sequence whose values do not exceed four million,
        find the sum of the even-valued terms.
*/
public class EvenFibonacciNumbers {
    public static int calculateSum(int limit) {
        int sum = 0;
        int x = 1;
        int y = 2;
        int temp;
        while(y < limit){
            if (y%2 == 0){
                sum += y;
            }
            temp = x + y;
            x = y;
            y = temp;
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(calculateSum(4000000));
    }
}