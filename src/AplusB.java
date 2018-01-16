public class AplusB {
    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs((a+b)-c) < (1E-4) ; // Допустимая погрешность – 0.0001 (1E-4)
    }
}
