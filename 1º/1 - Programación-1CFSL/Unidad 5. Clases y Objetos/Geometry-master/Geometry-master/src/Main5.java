public class Main5 {
    public static void main(String[] args) {
        Point[] points;
        Rectangle[] rectangle;
        rectangle = new Rectangle[10];
        points = new Point[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(i, i);
            rectangle[i] = new Rectangle(points[i], 1, 1);
            System.out.println(rectangle[i]);
        }
    }
}
