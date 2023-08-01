package uk.co.flakeynetworks.multiplicativepersistence;

public class MultiplicativePersistence {

    public BestSolution start(long maxNumber) {

        long currentNumber = 24L;
        int largestIterations = 0;
        long bestNumber = 0L;

        while(currentNumber <= maxNumber) {

            currentNumber++;
            int iterations = calcIterations(currentNumber);

            if(iterations > largestIterations) {
                bestNumber = currentNumber;
                largestIterations = iterations;
            }
        }

        BestSolution bestSolution = new BestSolution();
        bestSolution.iterations = largestIterations;
        bestSolution.number = bestNumber;

        return bestSolution;
    }


    public static long calcMultiplied(long number) {

        String numberString = "" + number;

        long sum = Long.parseLong("" + numberString.charAt(0));

        for(int i = 1; i < numberString.length(); i++)
            sum *= Long.parseLong("" + numberString.charAt(i));

        return sum;
    }

    public static int calcIterations(long number) {

        String numberString = "" + number;
        if(numberString.contains("0")) return 0;
        if(numberString.contains("5")) return 0;

        int counter = 1;
        long sum = calcMultiplied(number);

        while(sum > 9) {
            counter++;
            sum = calcMultiplied(sum);
        }

        return counter;
    }
}