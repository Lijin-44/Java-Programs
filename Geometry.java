class Geometry {

    int area(int side) {
        return side * side;
    }

    int area(int l, int b) {
        return l * b;
    }

    double area(double r) {
        return 3.14 * r * r;
    }

    public static void main(String[] args) {
        Geometry g = new Geometry();

        System.out.println("Area of Square: " + g.area(5));
        System.out.println("Area of Rectangle: " + g.area(4, 6));
        System.out.println("Area of Circle: " + g.area(3.5));
    }
}
