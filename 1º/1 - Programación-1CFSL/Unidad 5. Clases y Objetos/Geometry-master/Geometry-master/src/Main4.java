public class Main4 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Point p1 = new Point(2, 2);
        Point p2 = new Point(5, 8);
        rectangle.setWidth(2);
        rectangle.setHeight(2);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println(p1);
        System.out.println("(X,Y)  Arriba izquierda : " + rectangle.getTopLeftPoint());
        System.out.println("(X,Y)  Arriba derecha : " + rectangle.getTopRightPoint());
        System.out.println("(X,Y)  Abajo izquierda : " + rectangle.getBottomLeftPoint());
        System.out.println("(X,Y)  abajo derecha : " + rectangle.getBottomRightPoint());
        Segment segment = new Segment(new Point(6, 8), new Point(3, 4));
        Rectangle r4 = new Rectangle(segment);
        System.out.println(r4);
    }
}
