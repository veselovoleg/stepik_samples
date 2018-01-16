/*Реализуйте метод, возвращающий true, если среди четырех его аргументов ровно два истинны (любые).
 Во всех остальных случаях метод должен возвращать false. */

public class booleanFirst {
    public static void main(String[] args) {
        System.out.println(booleanExpression(true,false,false,true));

    }
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        int  numA = 0, numB = 0, numC = 0, numD = 0;
        if (a == true)  numA = 1;
        if (b == true)  numB = 1;
        if (c == true)  numC = 1;
        if (d == true)  numD = 1;
        if (numA + numB + numC + numD == 2) {
            return true;
        }
        else return false;
    }
/**
 *
 * не плохое решение
 int res = 0;
 if (a) res++;
 if (b) res++;
 if (c) res++;
 if (d) res++;
 if (res == 2) return true;
 return false;
 */


}
