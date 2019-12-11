/* 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20? */
import java.lang.reflect.Array;

public class SmallestMultiple {
    public static int calculateSmallestMultiple() {
        boolean allDividable = false;
        int answer = 1;
        int[] divisors = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        while(!allDividable) {
            for (int i = 0; i < 20; i++) {
                if (answer % divisors[i] == 0) {
                    allDividable = true;
                }
                else {
                    allDividable = false;
                    answer += 1;
                    i = 0;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(calculateSmallestMultiple());
    }
}
