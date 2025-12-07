public class Main3 {
    public static void main(String[] args) {
        Point point1 = new Point(4, 5);
        Point point2 = new Point(6, 8);
        Segment segment1 = new Segment(point1, point2);
        segment1.setOffset(4, 4);
        System.out.println("cardinalities of the segment " + segment1);
        System.out.println("The segment module is: " + segment1.getModule());

    }
}
