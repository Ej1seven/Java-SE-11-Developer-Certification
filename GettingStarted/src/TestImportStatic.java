import static java.lang.Math.PI;
import static java.lang.Math.sqrt;
// A static-import on demand declaration for static variable
// import static java.lang.Math.*;

public class TestImportStatic {
    public static void main(String[] args) {
        int radius = 2;

        //We can use a static class variable on the Math class
        //get the value PI
        double circumference = 2 * PI * radius;
        System.out.println("circumference = " + circumference);

        //We can use a static class method on the Math class to
        //get the square root of a number
        double sqrt81 = sqrt(81);
        System.out.println("sqrt = " + sqrt81);
    }
}
