import org.w3c.dom.css.Rect;

import java.util.HashMap;

class Rectangle extends Point {
    private int width;
    private int height;
    private Point[] points;

    public Rectangle() {
        super(0, 0);
        width = 0;
        height = 0;
    }

    public Rectangle(Point... points) {

    }

    public Rectangle(Segment segment) {
        super();
        int minX, minY, maxX, maxY;
        Point p1 = segment.getStartPoint();
        Point p2 = segment.getEndPoint();
        minX = p1.getX() < p2.getX() ? p1.getX() : p2.getX();
        maxX = p1.getX() > p2.getX() ? p1.getX() : p2.getX();
        minY = p1.getY() < p2.getY() ? p1.getY() : p2.getY();
        maxY = p1.getY() > p2.getY() ? p1.getY() : p2.getY();
        moveTo(minX, minY);
        width = maxX - minX;
        height = maxY - minY;
    }

    public Rectangle(Point p, int newWidth, int newHeight) {
        super();
        moveTo(p.getX(), p.getY());
        width = newWidth;
        height = newHeight;
    }

    public Rectangle(Point p1, Point p2) {
        super();
        p1.moveTo(getX(), getY());
        p2.moveTo(p1.getX() + width, p1.getY() + height);

    }


    @Override
    public String toString() {

        return super.toString() + "( Widht: " + width + " , " + " Height: " + height + ")";
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;

    }

    public Point getPoint() {
        return new Point(getX(), getY());
    }

    public Point getTopLeftPoint() {
        return new Point(getX(), getY() + height);
    }

    public Point getTopRightPoint() {
        return new Point(getX() + width, getY() + height);
    }

    public Point getBottomLeftPoint() {
        return new Point(getX(), getY());
    }

    public Point getBottomRightPoint() {
        return new Point(getX() + width, getY());
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}
