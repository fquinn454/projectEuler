/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/

public class SpecialPythagoreanTriplet {
    public static long SpecialPythagoreanTriplet(){
        for(int c = 1000; c > 0; c--){
            for(int b = 1; b<1000; b++){
                for(int a = 1; a<1000; a++){
                    if(a*a+b*b==c*c && a+b+c == 1000 && a<b && b<c){
                        long product = a*b*c;
                        return product;

                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println(SpecialPythagoreanTriplet());
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Time: "+totalTime/1000000.000+"ms");
    }
}
