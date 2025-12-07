public class Card {
    private int[][] numbers;
    private boolean[][] markNumbers;
    public static final int ROW = 3;
    public static final int COL = 5;

    public Card(CardsGenerator cardsGenerator) {
        numbers = new int[ROW][COL];
        markNumbers = new boolean[ROW][COL];
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                markNumbers[i][j]=false;
            }
        }
        for (int i = 0; i < ROW; i++) {
            numbers[i]=cardsGenerator.getNumbersInRow();
        }
    }
    @Override
    public String toString() {
        boolean first = true;
        String s = "";
        for (int i = 0; i < ROW; i++) {
            first = true;
            for (int j = 0; j < COL; j++) {
                if (first){
                    first=false;
                }else {
                    s += ",";
                }
                if (markNumbers[i][j]){
                    s += "["+numbers[i][j]+"]";
                }else {
                    s += numbers[i][j];
                }

            }
            s += "\n";
        }
        return s;
    }
    public void markNumber(int ball){
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (numbers[i][j]==ball){
                    markNumbers[i][j]=true;
                }
            }
        }
    }
    public boolean isLine(){
        int contWin = 0;
        for (int row = 0; row < 3; row++) {
            contWin=0;
            for (int col = 0; col < 5; col++) {
                if (markNumbers[row][col]){
                    contWin++;
                }
            }
            if (contWin == 5) {
                return true;
            }
        }
        return false;
    }
    public boolean isBingo(){
        int contWin = 0;
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (markNumbers[i][j]){
                    contWin++;
                }
            }
        }
        if (contWin==15){
            return true;
        }else {
            return false;
        }
    }
}
