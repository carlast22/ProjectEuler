import java.util.ArrayList;
import java.util.List;

public class FactorialCalculator {


    public int calculateFactorial(int number) {

        int factorial;

        if(number > 0){
            factorial = number * calculateFactorial(number-1);
        }else{
            return 1;
        }
        return factorial;
    }


    public int sumDigitsOfFactorial(int number) {

        number = calculateFactorial(number);
        int sum = 0;

        while (number > 0) {
            sum += (number%10);
            number/=10;
        }
        return sum;
    }
}
