public class SquareCalculator {

        int square = 2;


    public int sumSquareOfNumber(int number) {

        int result = 0;

        for(int i = 0; i<= number; i++){
            result += (int) Math.pow(i, square);
        }
        return result;
    }

    public int calculateSquareOfTotal(int number) {

        int result = 0;
        int total = 0;

        for(int i = 0; i<= number; i++){
            result += i;
            total = (int) Math.pow(result, square);
        }
        return total;
    }

    public int subtractSquaresTotals(int number) {
        return calculateSquareOfTotal(number) - sumSquareOfNumber(number);
    }
}
