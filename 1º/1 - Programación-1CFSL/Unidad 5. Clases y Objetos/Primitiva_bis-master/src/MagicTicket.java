public class MagicTicket extends Ticket{

    public MagicTicket(Drum drum){
        super(8);
        Block[] blocks = new Block[8];
        for (int i = 0; i < blocks.length; i++) {
            blocks[i]= new Block(6, drum);

        }
        super.blocks = blocks;
    }
}
