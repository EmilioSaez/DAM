public class Card {
    private int number;
    private String Palo;
    public static final String[] PALO = {"Oro", "Copa", "Espada", "Basto"};
    public Card(int number, String Palo){
        this.number = number;
        this.Palo = Palo;
    }

    public String getPalo() {
        return Palo;
    }

    public int getNumber() {
        return number;
    }

    public String toString(){
        String s = "";
        if (number<=9 && number>1) {
            s += number;

        }
        else if (number==1) {
            s += "AS";
        }
        else if (number==10) {
            s += "Sota";
        } else if (number==11) {
            s += "Caballo";
        } else if (number==12) {
            s += "Rey";
        }
        return s+" de "+ Palo;
    }
}
