import java.util.Scanner;

public class Player {
    private String name;
    private boolean aI;
    private String symbol;

    public Player(String name, boolean aI, String symbol) {
        this.name = name;
        this.aI = aI;
        this.symbol = symbol;
    }

    public boolean isaI() {
        return aI;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }


}
