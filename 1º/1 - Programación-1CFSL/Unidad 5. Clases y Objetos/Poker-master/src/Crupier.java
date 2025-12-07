public class Crupier extends Player{
    public Crupier(){
        super("Crupier");
    }

    public boolean canPlayCard(){
        if (this.getPunctuation()<=16){
            return true;
        }else {
            return false;
        }
    }

}
