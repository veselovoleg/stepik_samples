//Является ли заданное число по абсолютной величине результатом возведения двойки в степень

public class isPowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1024));


    }
    public static boolean isPowerOfTwo(int value) {
        double x = Math.log(Math.abs(value))/Math.log(2);
        boolean power = false;
        if (x % 1 == 0) power = true;
        return power;

        //Кайф - return Integer.bitCount(Math.abs(value))==1;
        //This method returns the number of one-bits in the two's complement binary representation of the specified int value.
        //https://www.tutorialspoint.com/java/lang/integer_bitcount.htm
    }
}
