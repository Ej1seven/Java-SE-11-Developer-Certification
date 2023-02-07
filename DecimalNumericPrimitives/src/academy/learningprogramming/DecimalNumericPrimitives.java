package academy.learningprogramming;

public class DecimalNumericPrimitives {
    public static void main(String[] args) {
//         double before = 10_.25; // does not compile
//        double after = 10._25; // does not compile
//        double before = _10.25; // does not compile
//        double after = 10.25_; // does not compile

        double myDouble = 2.54;
        double myDouble2 = 2.54F;
        double anotherDouble = 2.45D; // D can be used for double it is optional


        double scientific = 5.000125E03;
        double scientific3 = 5.000125E3;
        double myDouble3 = 5000.125;

        System.out.println("scientific=" + scientific);
        System.out.println("scientific3=" + scientific3);
        System.out.println("myDouble3=" + myDouble3);

        double hexPi = 0x1.91eb851eb851fp1; // p indicates hexadecimal floating point number

        System.out.println("hexPi=" + hexPi);
    }
}
