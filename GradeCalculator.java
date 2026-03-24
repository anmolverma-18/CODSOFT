import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Subjects: ");
        int n = sc.nextInt();

        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Marks: ");
            total += sc.nextInt();
        }

        double avg = total / (double) n;

        System.out.println("Avg: " + avg);

        if (avg >= 90) {
            System.out.println("A");
        } else if (avg >= 75) {
            System.out.println("B");
        } else if (avg >= 50) {
            System.out.println("C");
        } else {
            System.out.println("Fail");
        }
    }
}