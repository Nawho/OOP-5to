public class Area {
    public static double circle(double r) { return Math.PI * Math.pow(r, 2); }
    public static double sphere(double r) { return 4 * Math.PI * Math.pow(r, 2); }
    public static double square(double side) { return Math.pow(side, 2); }
    public static double cube(double side) { return 6 * Math.pow(side, 2); }
    public static double triangle(double b, double h) { return (b*h) / 2;}
}
