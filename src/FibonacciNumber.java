import java.util.ArrayList;
import java.util.List;

public class FibonacciNumber {

    public boolean checkIsEvenFibonacciNumber(int number) {

        if (number % 2 == 0){
            return true;
        }
        return false;
    }

    public List<Integer> getFibonacciSequenceBelowLimit(int limit) {

        List<Integer> fibonacciNumbers = new ArrayList<Integer>();

        int actual = 2;
        int anterior = 1;

        for(int i = 1; i<=limit; i++) {

            if(i <=2){
                fibonacciNumbers.add(i);
            }else{
                int temporal;
                temporal = actual + anterior;

                fibonacciNumbers.add(temporal);

                anterior = actual;
                actual = temporal;
            }

            if(actual + anterior >= limit){
                break;
            }
        }
        return fibonacciNumbers;
    }

    public int sumAllEvenFibonacci(int number) {

        List<Integer> sumEvenFibonacci = getFibonacciSequenceBelowLimit(number);

        int result = 0;

        for(int evenFibonacci : sumEvenFibonacci){

            if(checkIsEvenFibonacciNumber(evenFibonacci)){

                result = result + evenFibonacci ;
            }
        }
        return result;
    }
}
