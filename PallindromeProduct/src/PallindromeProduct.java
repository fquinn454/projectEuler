/* A palindromic number reads the same both ways.
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.*/

import java.util.LinkedList;
import java.util.Queue;

public class PallindromeProduct {

    public static boolean isPallindrome(String product){
        Queue queue = new LinkedList();
        for (int i = product.length()-1; i >=0; i--) {
            queue.add(product.charAt(i));
        }
        System.out.println(queue);
        String reverseString = "";
        System.out.println(product);
        while (!queue.isEmpty()) {
            reverseString = reverseString+queue.remove();
        }
        System.out.println(reverseString);
        if(reverseString.equals(product)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static int calculate(){
        int product = -1;
        int maxValue = -1;
        for(int k = 999; k >=1; k--){
            for(int j = 999; j >=1; j--){
                product = j * k;
                if (isPallindrome(Integer.toString(product))){
                    if (product > maxValue){
                        maxValue = product;
                    }
                }
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        System.out.println(calculate());
    }
}
