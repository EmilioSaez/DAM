public class Main2 {
    public static void main(String[] args) {
        Drum drum = new Drum(49);
        MagicTicket magic = new MagicTicket(drum);
        System.out.println(magic);
        magic.printUsedNumber();
    }
}
