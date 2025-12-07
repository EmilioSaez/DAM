public class Polygon {
    private Point[] points;

    public Polygon(Point... points) {
        this.points = points;
    }

    public Polygon() {
        points = null;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < points.length; i++) {
            s += points[i];
            s += " - ";
        }
        s += points[0];
        return s;
    }

    public double getLenght() {
        double lenght = 0;
        Segment segment;
        for (int i = 0; i < points.length - 1; i++) {
            segment = new Segment(points[i], points[i + 1]);
            lenght += segment.getModule();
        }
        segment = new Segment(points[points.length - 1], points[0]);
        lenght += segment.getModule();
        return lenght;
    }

    public void setOfsett(int offX, int offY) {
        for (int i = 0; i < points.length; i++) {
            points[i].setOffset(offX, offY);

        }


    }
}
