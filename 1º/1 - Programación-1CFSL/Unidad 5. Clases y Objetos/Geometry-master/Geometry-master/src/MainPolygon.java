public class MainPolygon {
    public static void main(String[] args) {
        Point[] points = {new Point(4, 4), new Point(6, 5), new Point(5, 8), new Point(3, 7)};
        Polygon polygon = new Polygon(points);
        System.out.println(polygon);
        polygon.setOfsett(4, 4);
        System.out.println(polygon);
        System.out.println(polygon.getLenght());
    }
}
