public class Ticket {
    protected Block[] blocks;

    public Ticket(int numOfBlocs) {
        blocks = new Block[numOfBlocs];
        for (int i = 0; i < numOfBlocs; i++) {
            blocks[i] = new Block(6);
        }
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < blocks.length; i++) {
            s += blocks[i];
            s += "\n";
        }
        return s;
    }

    public void setBlocks(Block[] blocks) {
        this.blocks = blocks;
    }

    public void printUsedNumber() {
        boolean[] printNumber = new boolean[50];

        for (int i = 0; i < printNumber.length; i++) {
            printNumber[i] = false;
        }
        for (Block block : blocks) {
            int[] numbers = block.getNumbers();
            for (int i = 0; i < numbers.length; i++) {
                int number = numbers[i];
                printNumber[number] = true;
            }
        }
        boolean first = true;
        for (int i = 0; i < printNumber.length; i++) {
            if (printNumber[i] == true) {
                if (first) {
                    System.out.print(i);
                    first = !first;
                } else {
                    System.out.print("," + i);
                }

            }
        }
    }
}
