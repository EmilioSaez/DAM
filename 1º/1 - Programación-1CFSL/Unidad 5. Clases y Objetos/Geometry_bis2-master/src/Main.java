public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(3,3);
        Point p2 = new Point(3,2);
        Point p3 = new Point(3,27);
        Triangle triangle = new Triangle(p1,p2,p3);
        System.out.println(p1);
        System.out.println(triangle);
        System.out.println(triangle.printType());
    }
}
