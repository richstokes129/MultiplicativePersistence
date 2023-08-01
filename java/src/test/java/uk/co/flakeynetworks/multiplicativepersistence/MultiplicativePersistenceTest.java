package uk.co.flakeynetworks.multiplicativepersistence;

import org.junit.jupiter.api.Test;

public class MultiplicativePersistenceTest {

    @Test
    public void testMultiplicativePersistence() {

        MultiplicativePersistence mp = new MultiplicativePersistence();

        long startTime = System.currentTimeMillis();

        BestSolution bestSolution = mp.start(1000000000);

        long totalTime = System.currentTimeMillis() - startTime;

        System.out.println("Best solution: " + bestSolution.number + ", " + bestSolution.iterations + " iterations");
        System.out.println("Total time: " + totalTime + " ms");
    }
}
