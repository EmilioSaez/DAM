public class Main {
    public static void main(String[] args) {
        System.out.println("With quantity");
        Block block1 = new Block(32);
        System.out.println(block1);
        System.out.println("\n");
        System.out.println("Choosing");
        Block block2 = new Block(1,2,3,4,5,6,7,8,9,10,11,12,13,14);
        System.out.println(block2);
        System.out.println("\n");

        System.out.println("Ticket");
        Ticket t = new Ticket(6);
        System.out.println(t);
        System.out.println("-------------------------------");
        t.printUsedNumber();
    }
}
