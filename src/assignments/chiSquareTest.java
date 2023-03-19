package src.assignments;

import java.util.Random;
// importing Random class from util to generate random numbers.
public class chiSquareTest {
    
    int roll() {
        int randomNumber = 1 + new Random().nextInt(6);
        return randomNumber;
    }
    // "Random()" is a class by which we can generate random numbers.
}

class FindingchiSquareTest {
    chiSquareTest dice1;
    chiSquareTest dice2;
    int chiSumArray[];
    int freq[];

    public FindingchiSquareTest() {
        dice1 = new chiSquareTest();
        dice2 = new chiSquareTest();
        chiSumArray = new int[1296];
        freq = new int[11];
    }

    int rollchiSquareTest() {
        return dice1.roll() + dice2.roll();
    }

    public double calculateChiSqaure() {
        double[] expected_outcome = new double[11];
        double[] probability_outcome = new double[] { 1.0/36.0, 2.0/36.0, 3.0/36.0, 4.0/36.0, 5.0/36.0, 6.0/36.0, 5.0/36.0, 4.0/36.0, 3.0/36.0,
                2.0/36.0, 1.0/36.0 };

        for (int i = 0; i < 11; i++) {
            expected_outcome[i] = (probability_outcome[i] * 1296);
        }

        double chiSquare = 0.0;
        for (int i = 0; i < 11; i++)
            chiSquare += Math.pow((freq[i] - expected_outcome[i]), 2) / expected_outcome[i];
            // this is the formula for chi square test.

        return chiSquare;
    }

    public static void main(String[] args) {
        FindingchiSquareTest chiTest = new FindingchiSquareTest();

        for (int i = 0; i < 1296; i++) {
            chiTest.chiSumArray[i] = chiTest.rollchiSquareTest();
            chiTest.freq[chiTest.chiSumArray[i] - 2]++;
        }
        // Rolling both dices and recording their sum and freq in the respective arrays.

        System.out.printf("%-4s %-10s%n", "Sum", "freq");
        for (int i = 0; i < 11; i++) {
            System.out.printf("%-4d %-10d%n", (i + 2), chiTest.freq[i]);
            // here "%-4d %-10d" is used for formatting / aligning the output to 4 digits and 10 digits
        }

        double chiSqrt = chiTest.calculateChiSqaure();
        System.out.println("Chi Square is: " + chiSqrt);

        if (chiSqrt > 18.307)
            System.out.println("chiSquareTest is biased");
        else
            System.out.println("chiSquareTest is unbiased");
    }
}