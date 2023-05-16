package src.assignments.cat2.multithreading;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FacultyDataGenerator {
    private static final String FILE_NAME = "Salary.txt";
    private static final int NUM_FACULTY = 100;

    private static final String[] FIRST_NAMES = {"FirstName1", "FirstName2", "FirstName3"};
    private static final String[] LAST_NAMES = {"LastName1", "LastName2", "LastName3"};

    private static final String[] RANKS = {"assistant", "associate", "full"};
    private static final double[] SALARY_MIN = {50000.0, 60000.0, 75000.0};
    private static final double[] SALARY_MAX = {80000.0, 110000.0, 130000.0};

    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\kusht\\OneDrive\\Documents\\WorkSpace\\MY-JAVA-PROGRAMS\\src\\file_handling\\doc\\"+FILE_NAME);

            for (int i = 0; i < NUM_FACULTY; i++) {
                String firstName = FIRST_NAMES[i % FIRST_NAMES.length];
                String lastName = LAST_NAMES[i % LAST_NAMES.length];
                String rank = RANKS[new Random().nextInt(RANKS.length)];
                double salary = SALARY_MIN[getIndex(rank)] + (SALARY_MAX[getIndex(rank)] - SALARY_MIN[getIndex(rank)]) * new Random().nextDouble();
                salary = Math.round(salary * 100.0) / 100.0; // round to two decimal places

                String line = firstName + "," + lastName + "," + rank + "," + salary + "\n";
                fileWriter.write(line);
            }

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int getIndex(String rank) {
        switch (rank) {
            case "assistant":
                return 0;
            case "associate":
                return 1;
            case "full":
                return 2;
            default:
                return -1;
        }
    }
}
