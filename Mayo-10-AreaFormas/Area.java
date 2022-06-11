class Area {
    public static double circleArea(float radius) {   return Math.PI * radius * radius;   }
    public static double sphereArea(float radius) {   return 4 * Math.PI * radius * radius;   }
    public static double squareArea(float side) {   return side * side;   }
    public static double cubeArea(float side) {   return 6 * side * side;   }
    public static double triangleArea(float base, float height) {   return (base * height) / 2;   }
}

class Main {
    public static void main(String[] args) {
        System.out.println(Area.circleArea(5) + " " + Area.sphereArea(5) + " " + Area.squareArea(5) + " " + Area.cubeArea(5) + " " + Area.triangleArea(5, 5));
    }
}
