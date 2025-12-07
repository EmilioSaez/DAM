import java.util.Arrays;

public class Block {
    private final int[] numbers;

    public Block(int quantity) {
        numbers = new int[quantity];
        if (quantity <= 6) {
            quantity = 6;
        } else if (quantity >= 49) {
            quantity = 49;
        }
        generateRandomNumber(quantity);
        Arrays.sort(numbers);

    }
    public Block(int numBalls, Drum drum){
        numbers = new int[numBalls];
        for (int i = 0; i < numBalls ; i++) {
            numbers[i] = drum.extractBalls();

        }
        Arrays.sort(numbers);
    }

    private void generateRandomNumber(int quantity) {
        boolean repeated;
        int randomNumber;
        int numOfValidNumbers = 0;
        while (numOfValidNumbers < quantity) {
            randomNumber = (int) (Math.random() * 49) + 1;
            repeated = false;
            for (int i = 0; i < numOfValidNumbers; i++) {
                if (randomNumber == numbers[i]) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
                numbers[numOfValidNumbers] = randomNumber;
                numOfValidNumbers++;
            }

        }
    }

    public Block(int... numbers) {
        this.numbers = numbers;
        Arrays.sort(numbers);
    }
    @Override
    public String toString() {
        String s = "";
        for (int i = 1; i < numbers.length; i++) {
            if (i==numbers.length-1){
                s += numbers[i];
            }else {
                s += numbers[i]+",";

            }
        }
        return s;
    }

    public int[] getNumbers() {
        return numbers;
    }
}
