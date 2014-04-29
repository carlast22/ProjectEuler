public class MultipleChecker {

    public boolean checkIfNumberIsMultipleOfThreeOrFive(int number) {

         if(number % 3 == 0){
             return true;
         } else if (number % 5 == 0){
             return true;
         }
        return false;
    }

    public int sumMultiplesOfThreeAndFive(int number) {

        int i;
        int sumAll = 0;
        for(i=1;i<number; i=i+1){
            if (checkIfNumberIsMultipleOfThreeOrFive(i)) {
                sumAll = sumAll +i;
            }
        }
        return sumAll;
    }
}
