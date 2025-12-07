public class Point {
    private int x;
    private int y;

    public Point() {
        y = 0;
        x = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + " ," + y + ")";
    }

    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setOffset(int offX, int offY) {
        x = x + offX;
        y = y + offY;
    }

}
