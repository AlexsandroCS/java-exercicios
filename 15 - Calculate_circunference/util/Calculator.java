package util;

public class Calculator {
    public static final double PI = 3.14159;

    public static double circunferenceFunc(double radius){
        return 2.0 * PI * radius;
    }

    public static double volumeFunc(double radius){
        return 4.0 * PI * (radius*radius*radius) / 3.0;
    }
}
