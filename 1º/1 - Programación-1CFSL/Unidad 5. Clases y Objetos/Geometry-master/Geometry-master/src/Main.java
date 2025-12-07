public class Main {
    public static void main(String[] args) {
        Point p = new Point(3, 4);
        p.moveTo(8, 9);
        Point p2 = new Point(6, 8);
        System.out.println(p.toString()); // (8 ,9)
        System.out.println(p2);
        int x = p.getX();

    }
}
