
public class AllMathMethods {
    public static void main(String[] args) {

        // 1. Absolute Value
        System.out.println("abs(-10) = " + Math.abs(-10)); // 10

        // 2. Maximum & Minimum
        System.out.println("max(5, 9) = " + Math.max(5, 9)); // 9
        System.out.println("min(5, 9) = " + Math.min(5, 9)); // 5

        // 3. Power & Square root
        System.out.println("pow(2, 3) = " + Math.pow(2, 3)); // 8.0
        System.out.println("sqrt(16) = " + Math.sqrt(16));   // 4.0

        // 4. Cube root
        System.out.println("cbrt(27) = " + Math.cbrt(27));   // 3.0

        // 5. Exponent & Logarithms
        System.out.println("exp(1) = " + Math.exp(1));       // 2.718...
        System.out.println("log(10) = " + Math.log(10));     // natural log
        System.out.println("log10(100) = " + Math.log10(100)); // 2.0

        // 6. Rounding methods
        System.out.println("ceil(4.3) = " + Math.ceil(4.3));   // 5.0
        System.out.println("floor(4.9) = " + Math.floor(4.9)); // 4.0
        System.out.println("round(4.5) = " + Math.round(4.5)); // 5 (nearest int)

        // 7. Random number (0 <= x < 1)
        System.out.println("random() = " + Math.random());

        // 8. Trigonometric functions (radians me input)
        System.out.println("sin(90°) = " + Math.sin(Math.toRadians(90))); // 1.0
        System.out.println("cos(0°) = " + Math.cos(Math.toRadians(0)));   // 1.0
        System.out.println("tan(45°) = " + Math.tan(Math.toRadians(45))); // 1.0

        // 9. Inverse Trigonometric
        System.out.println("asin(1) = " + Math.toDegrees(Math.asin(1))); // 90.0
        System.out.println("acos(0) = " + Math.toDegrees(Math.acos(0))); // 90.0
        System.out.println("atan(1) = " + Math.toDegrees(Math.atan(1))); // 45.0

        // 10. Hyperbolic functions
        System.out.println("sinh(1) = " + Math.sinh(1));
        System.out.println("cosh(1) = " + Math.cosh(1));
        System.out.println("tanh(1) = " + Math.tanh(1));

        // 11. Special values
        System.out.println("PI = " + Math.PI);
        System.out.println("E = " + Math.E);

        // 12. Copy sign
        System.out.println("copySign(5.0, -2.0) = " + Math.copySign(5.0, -2.0)); // -5.0

        // 13. Exact Arithmetic methods (avoid overflow)
        try {
            System.out.println("addExact(10, 20) = " + Math.addExact(10, 20)); // 30
            System.out.println("subtractExact(10, 20) = " + Math.subtractExact(10, 20)); // -10
            System.out.println("multiplyExact(100000, 100000) = " + Math.multiplyExact(100000, 100000));
        } catch (ArithmeticException e) {
            System.out.println("Overflow detected: " + e);
        }

        // 14. Increment & Decrement
        System.out.println("incrementExact(5) = " + Math.incrementExact(5)); // 6
        System.out.println("decrementExact(5) = " + Math.decrementExact(5)); // 4

        // 15. Negate Exact
        System.out.println("negateExact(5) = " + Math.negateExact(5)); // -5

        // 16. FloorDiv & FloorMod
        System.out.println("floorDiv(7, 3) = " + Math.floorDiv(7, 3)); // 2
        System.out.println("floorMod(7, 3) = " + Math.floorMod(7, 3)); // 1

        // 17. Hypotenuse
        System.out.println("hypot(3, 4) = " + Math.hypot(3, 4)); // 5.0 (Pythagoras)

        // 18. NextUp & NextDown
        System.out.println("nextUp(1.0) = " + Math.nextUp(1.0));
        System.out.println("nextDown(1.0) = " + Math.nextDown(1.0));

        // 19. Rint (round to nearest int as double)
        System.out.println("rint(4.6) = " + Math.rint(4.6)); // 5.0
        System.out.println("rint(4.4) = " + Math.rint(4.4)); // 4.0

        // 20. Signum (sign of number)
        System.out.println("signum(-10) = " + Math.signum(-10)); // -1.0
        System.out.println("signum(0) = " + Math.signum(0));     // 0.0
        System.out.println("signum(20) = " + Math.signum(20));   // 1.0
    }
}
