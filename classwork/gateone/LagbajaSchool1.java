import java.util.Arrays;
import java.util.Scanner;

public class LagbajaSchool1 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students in your class:");
        int numberOfStudent = sc.nextInt();
        System.out.println("Saving >>>>>>>>>>>>>>");
        System.out.println("Saved Successfully");

        System.out.println("Enter the number of subjects done by each student:");
        int numberOfSubject = sc.nextInt();
        System.out.println("Saving >>>>>>>>>>>>>>");
        System.out.println("Saved Successfully");

        int[][] reportSheet = new int[numberOfStudent][numberOfSubject];
        int[] total = new int[numberOfStudent];

        for (int index = 0; index < numberOfStudent; index++) {
            System.out.printf("Enter the scores for student %d:%n", index + 1);
            for (int counter = 0; counter < numberOfSubject; counter++) {
                System.out.printf("Enter the score for subject %d: ", counter + 1);
                reportSheet[index][counter] = sc.nextInt();
                total[index] += reportSheet[index][counter];
            }
        }

      
        int[] sortedTotal = total.clone();
        Arrays.sort(sortedTotal);
        int[] positions = new int[numberOfStudent];

        
        for (int count = 0; count < numberOfStudent; count++) {
            int position = 1;
            for (int loop = numberOfStudent - 1; loop >= 0; loop--) {
                if (total[count] < sortedTotal[loop]) {
                    position++;
                }
            }
            positions[count] = position;
        }

        
        System.out.printf("%-10s", "Student");
        for (int count = 1; count <= numberOfSubject; count++) {
            System.out.printf("%-10s", "Subject " + count);
        }
        System.out.printf("%-10s%-10s%-10s%n", "Total", "Average", "Position");

        for (int index = 0; index < numberOfStudent; index++) {
            System.out.printf("%-10d", index + 1);
            for (int counter = 0; counter < numberOfSubject; counter++) {
                System.out.printf("%-10d", reportSheet[index][counter]);
            }

            double average = (double) total[index] / numberOfSubject;
            System.out.printf("%-10d%-10.2f%-10d%n", total[index], average, positions[index]);
        }

        
    }
}