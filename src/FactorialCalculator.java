import java.math.BigInteger;

public class FactorialCalculator {


    public BigInteger calculateFactorial(long number) {

        BigInteger factorial;
        BigInteger myNumber = BigInteger.valueOf(number);

        if (number > 0) {
            factorial = myNumber.multiply(calculateFactorial(number - 1));
        } else {
            return BigInteger.ONE;
        }
        return factorial;
    }


    public BigInteger sumDigitsOfFactorial(long number) {

        BigInteger myNumber = calculateFactorial(number);
        BigInteger sum = BigInteger.ZERO;

        while (myNumber.signum() == 1) {
            sum = sum.add(myNumber.mod(BigInteger.valueOf(10)));
            myNumber = myNumber.divide(BigInteger.valueOf(10)) ;
        }
        return sum;
    }
}
